<!-- GFM-TOC -->
* [介绍](#介绍)
* [系统架构图](#系统架构图)
* [负责模块](#负责模块)
* [涉及技术](#涉及技术)
* [具体功能](#具体功能)
	* [首页模块](#首页模块)
	* [用户模块](#用户模块)
	* [课程模块](#课程模块)
	* [院校模块](#院校模块)
	* [后台模块](#后台模块)
* [性能优化](#性能优化)
* [性能测试](#性能测试)
<!-- GFM-TOC -->


# 介绍

为学生提供苏州独墅湖高教区的公共课程信息，学生可以在上面选课，并根据课程信息前往对应院校参与课程

在线演示: <http://zhx2019.cn/young2> 

# 系统架构图

![course系统架构图.jpg](https://i.loli.net/2019/09/14/9SrWxzVXf3NbYZK.jpg)



# 负责模块

> 5人团队，按模块分工，分为首页、院校、用户信息、课程、后台模块
> 我作为产品负责人和前后端开发者，负责：

- 需求分析
  - 产品代办列表+用例图
  - 参与数据库的设计
- 课程模块
  - 课程详情页面、选课列表、课程评价的前后端
- PPT制作与发布会展示
- 其他
  - 爬虫数据清洗
  - 性能优化

# 涉及技术

- 项目管理：Maven, Git
- 数据库：MySQL
- 后端：SSM框架
- 前端：Jsp+JQuery+LayUI
- 中间件：Redis, Nginx

# 具体功能

> 加粗部分为本人负责/参与的部分

### 首页模块

-  **首页推荐课程** （参与SQL语句书写）
- 首页热门课程
- 课程搜索
- 合作院校展示
- 首页轮播图
- 首页顶栏
- 首页底栏

### 用户模块

- 注册
- 登录
- 找回密码
- 注销
- 个人信息认证
- 我的专属推荐
- 修改密码

### 课程模块

-  **课程介绍** 
-  **选课列表** 
-  **评价列表** 
-  **选择课程** 
-  **退出课程** 
-  **课程评价** 

### 院校模块

- 院校列表
- 院校信息

### 后台模块

- 管理员登录
- 用户管理
- 课程管理
- 课程评价管理
- 选课信息管理

# 性能优化
为了提升网站首页的访问速度和并发量，本人在项目后期进行了如下优化：
1.  **引入Redis缓存分担MySQL压力** 
    逻辑：每次查询热点数据时，先在Redis中查询是否具有当前数据（缓存命中），如果没有则从数据库中查出来并放入Redis中，设置过期时间以保证数据时效性。一段时间内该数据的查询无需数据库MySQL的参与，将大大提升系统并发量。

  网站首页的热门课程和推荐课程处，使用Redis的Map结构缓存课程数据。其中key为两个自定义标识符，filed为每门课程的id，val为相关数据，代码如下：
```java
public List<Course> findAllHotCourse() {
    // 引入Redis，设置过期时间10分钟
    List<String> hotCourseList = null;
    List<Course> courses = null;
    try (Jedis jedis = RedisPool.getResource()) {
        hotCourseList = jedis.hvals(HOT_PREFIX);
        if (hotCourseList == null || hotCourseList.size()==0){
            List<Course> hotCourses = courseMapper.findAllHotCourse();
            for (Course course: hotCourses){
                String s = SerializeUtil.writeCourseObject(course);
                jedis.hset(HOT_PREFIX, course.getCid()+"", s);
            }
            jedis.expire(HOT_PREFIX, 600); //设置10分钟更新一次数据
            hotCourseList = jedis.hvals(HOT_PREFIX);
        }
        courses = hotCourseList.stream().map(SerializeUtil::readCourseObject).collect(Collectors.toList());
    }
    return courses;
}
```

2.  **优化Redis序列化与反序列化的方式** 

在实现 Redis 缓存功能时， Java 自带的序列化方式会将一个对象转换成字节数组然后存储，这种方式并不高效，序列化得到的内容有很多是类定义的内容，而且网站首页用到的数据也只是Course对象中的部分字段。我们只需要将几个关键字段拼接成字符串存储即可，实现代码如下，此处参考了[CYC](https://github.com/CyC2018/MBlog#序列化方式的选择)大大的思路：

```java
public class SerializeUtil {
    private static final String separator = "/////";    
    
    public static String writeCourseObject(Course course) {        
        StringBuilder s = new StringBuilder();        
        s.append(course.getCid()).append(separator);        
        s.append(course.getSchName()).append(separator);        
        s.append(course.getCourseCode()).append(separator);       
        s.append(course.getCourseName()).append(separator);       
        s.append(course.getCourseSelectnum()).append(separator);       
        s.append(course.getCourseImage());        
        return s.toString();    
    }    
    
    public static Course readCourseObject(String s) {
        Course course = new Course();       
        String[] token = s.split(separator);        
        course.setCid(Long.valueOf(token[0]));        
        course.setSchName(token[1]);        
        course.setCourseCode(token[2]);        
        course.setCourseName(token[3]);       
        course.setCourseSelectnum(Integer.valueOf(token[4]));       
        course.setCourseImage(token[5]);        
        return course;    
    }
}
```

运行/young-manager/web/src/main/test/cn/young/util/TestSerialize.java进行性能测试，得到结果如下：

> ===== 自带字节数组序列化 =====
> 耗费空间：462字节
> 运行10000次耗时: 0.61ms
> ===== 自定义序列化工具 =====
> 耗费空间：70字节
> 运行10000次耗时: 0.08ms

可见优化的效果相当明显。

3.  **使用图片服务器加载图片** 

使用七牛云服务器的对象存储功能，将网站的大部分图像转移到图片服务器上，减轻网站的IO压力。

4.  **Nginx缓存页面文件** 

当启用了Nginx的缓存功能时，Nginx会将后端服务的响应保存在本地磁盘上。后续的请求只要满足条件就会命中缓存，Nginx就不会将请求转发到后端的服务上。开启Nginx缓存同样能减轻服务器压力。

部分相关配置如下：

```shell
http {
	...
	#Cache
	proxy_cache_path /tmp/cache levels=1:2 keys_zone=my_cache:10m max_size=1g inactive=60m 
    use_temp_path=off;
    
    server {
    	...
    	
    	location /young {
			proxy_cache my_cache;
			proxy_cache_methods GET HEAD POST;
			proxy_cache_use_stale error timeout http_500 http_502 http_503 http_504;
			proxy_cache_lock on;
			
			...
			add_header X-Cache-Status $upstream_cache_status;
		}
    }
}
```

其中，各参数的含义如下：

**proxy_cache_path /tmp/cache**  	用于缓存的本地磁盘目录
**levels=1:2**  	在缓存磁盘目录下设置了一个两级层次结构的目录
**keys_zone=my_cache:10m** 	设置一个共享内存区my_cache来存储缓存键和元数据，大小10M
**max_size=1g** 	缓存上限1g
**inactive=60m** 	项目在不被访问的情况下能够在内存中保持的时间，60分钟
**use_temp_path=off** 	nginx最初会将即将写入缓存的文件先放入一个临时存储区域，禁用后将去除该步骤

**proxy_cache my_cache** 	有两个参数`zone`和`off`， `zone`的取值是`proxy_cache_path`指令中指定的共享内存区域名称的值（上例中的my_cache）， 如果取值为`off`则表示禁用缓存功能（注意限制范围）
**proxy_cache_methods GET HEAD POST**  	配置可以存储什么方法的请求
**proxy_cache_use_stale error timeout http_500 http_502 http_503 http_504** 		当无法从原始服务器获取最新的内容时（比如服务器宕机、繁忙），nginx可以分发缓存中的”过期“内容
**proxy_cache_lock on** 	当多个客户端请求一个缓存中不存在的文件时，只有第一个能被发到服务器。其他请求要么在第一个请求获取文件成功后从缓存中获取文件，要么永远获取不到文件
**add_header X-Cache-Status $upstream_cache_status** 	添加用来标识缓存状态的请求头，upstream_cache_status有多种状态，其中部分参数：

- HIT —— 响应包含来自缓存的最新有效的内容。 
- MISS —— 响应在缓存中找不到，所以需要在服务器中取得
- EXPIRED —— 缓存中的某一项过期了，来自原始服务器的响应包含最新的内容

Nginx配置完成后，在Chrome浏览器打开“检查 - Network”，尝试多次加载后，查看网页页面的响应头，得到结果如下：

> HTTP/1.1 200 OK
> Server: nginx/1.10.3 (Ubuntu)
> Content-Type: text/html;charset=utf-8
> Transfer-Encoding: chunked
> Connection: keep-alive
> Content-Language: zh-CN
>  **X-Cache-Status: HIT** 
> Content-Encoding: gzip

代表Nginx缓存启动成功。

# 性能测试
一开始我尝试使用JMeter和阿里云PTS进行测试，对比一番后发现相同并发量下，JMeter测试时服务器CPU使用率比PTS低几十个百分点，私以为JMeter模拟的并发不够真实，遂弃之。
由于经费有限，只购买了100并发量的压测套餐，且只能走公网测试。为了尽量减少网速波动的影响，选用相同时间段先后对优化前后的网站进行测试，起始并发量10，最终并发量100，持续时长6分钟。相关参数与结果如下：

**服务器配置** ：

| CPU                                 | 内存 | 带宽       | 系统盘  | 系统镜像     |
| ----------------------------------- | ---- | ---------- | ------- | ------------ |
| Xeon Platinum 8163 CPU 2.50GHz 单核 | 2G   | 弹性峰值5M | SSD 40G | Ubuntu 16.04 |

**压测结果** ：

| --     | 总请求数 | 平均TPS | 请求成功率        | 平均响应时间/ms |
| ------ | -------- | ------- | ----------------- | --------------- |
| 原网站 | 8992     | 24.98   | 36.94%(3322/5670) | 2273.95         |
| 现网站 | 8177     | 22.71   | 89.48%(7317/860)  | 2449.45         |

**全场景视图** ：

- 原网站

![原网站压测.jpg](https://i.loli.net/2019/09/14/pZB7dOLo6wuS3Tr.jpg)

- 现网站

![现网站压测.jpg](https://i.loli.net/2019/09/14/rywIXQia4pLBxcf.jpg)

原有网站在并发数达到70时，请求失败率激增，并发数90时基本无成功请求；而优化后的现网站在并发100时，仍能保持80%左右的请求成功率，可见优化效果显著！

报告链接：[原网站](http://pxkc6qwb1.bkt.clouddn.com/pdf/young/%E5%8E%8B%E6%B5%8B%20-%20%E5%8E%9F%E7%BD%91%E7%AB%99.pdf)、[现网站](http://pxkc6qwb1.bkt.clouddn.com/pdf/young/%E5%8E%8B%E6%B5%8B%20-%20%E7%8E%B0%E7%BD%91%E7%AB%99.pdf)
