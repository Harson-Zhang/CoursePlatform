<!-- GFM-TOC -->
* [����](#����)
* [ϵͳ�ܹ�ͼ](#ϵͳ�ܹ�ͼ)
* [����ģ��](#����ģ��)
* [�漰����](#�漰����)
* [���幦��](#���幦��)
        * [��ҳģ��](#��ҳģ��)
        * [�û�ģ��](#�û�ģ��)
        * [�γ�ģ��](#�γ�ģ��)
        * [ԺУģ��](#ԺУģ��)
        * [��̨ģ��](#��̨ģ��)
* [�����Ż�](#�����Ż�)
* [���ܲ���](#���ܲ���)
<!-- GFM-TOC -->


# ����

Ϊѧ���ṩ���ݶ������߽����Ĺ����γ���Ϣ��ѧ������������ѡ�Σ������ݿγ���Ϣǰ����ӦԺУ����γ�

������ʾ: <http://zhx2019.cn/young> 

# ϵͳ�ܹ�ͼ

![courseϵͳ�ܹ�ͼ.jpg](https://i.loli.net/2019/09/14/9SrWxzVXf3NbYZK.jpg)



# ����ģ��

> 5���Ŷӣ���ģ��ֹ�����Ϊ��ҳ��ԺУ���û���Ϣ���γ̡���̨ģ��
> ����Ϊ��Ʒ�����˺�ǰ��˿����ߣ�����

- �������
  - ��Ʒ�����б�+����ͼ
  - �������ݿ�����
- �γ�ģ��
  - �γ�����ҳ�桢ѡ���б��γ����۵�ǰ���
- PPT�����뷢����չʾ
- ����
  - ����������ϴ
  - �����Ż�

# �漰����

- ��Ŀ����Maven, Git
- ���ݿ⣺MySQL
- ��ˣ�SSM���
- ǰ�ˣ�Jsp+JQuery+LayUI
- �м����Redis, Nginx

# ���幦��

> �Ӵֲ���Ϊ���˸���/����Ĳ���

### ��ҳģ��

-  **��ҳ�Ƽ��γ�** ������SQL�����д��
- ��ҳ���ſγ�
- �γ�����
- ����ԺУչʾ
- ��ҳ�ֲ�ͼ
- ��ҳ����
- ��ҳ����

### �û�ģ��

- ע��
- ��¼
- �һ�����
- ע��
- ������Ϣ��֤
- �ҵ�ר���Ƽ�
- �޸�����

### �γ�ģ��

-  **�γ̽���** 
-  **ѡ���б�** 
-  **�����б�** 
-  **ѡ��γ�** 
-  **�˳��γ�** 
-  **�γ�����** 

### ԺУģ��

- ԺУ�б�
- ԺУ��Ϣ

### ��̨ģ��

- ����Ա��¼
- �û�����
- �γ̹���
- �γ����۹���
- ѡ����Ϣ����

# �����Ż�
Ϊ��������վ��ҳ�ķ����ٶȺͲ���������������Ŀ���ڽ����������Ż���
1.  **����Redis����ֵ�MySQLѹ��** 
    �߼���ÿ�β�ѯ�ȵ�����ʱ������Redis�в�ѯ�Ƿ���е�ǰ���ݣ��������У������û��������ݿ��в����������Redis�У����ù���ʱ���Ա�֤����ʱЧ�ԡ�һ��ʱ���ڸ����ݵĲ�ѯ�������ݿ�MySQL�Ĳ��룬���������ϵͳ��������

  ��վ��ҳ�����ſγ̺��Ƽ��γ̴���ʹ��Redis��Map�ṹ����γ����ݡ�����keyΪ�����Զ����ʶ����filedΪÿ�ſγ̵�id��valΪ������ݣ��������£�
```java
public List<Course> findAllHotCourse() {
    // ����Redis�����ù���ʱ��10����
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
            jedis.expire(HOT_PREFIX, 600); //����10���Ӹ���һ������
            hotCourseList = jedis.hvals(HOT_PREFIX);
        }
        courses = hotCourseList.stream().map(SerializeUtil::readCourseObject).collect(Collectors.toList());
    }
    return courses;
}
```

2.  **�Ż�Redis���л��뷴���л��ķ�ʽ** 

��ʵ�� Redis ���湦��ʱ�� Java �Դ������л���ʽ�Ὣһ������ת�����ֽ�����Ȼ��洢�����ַ�ʽ������Ч�����л��õ��������кܶ����ඨ������ݣ�������վ��ҳ�õ�������Ҳֻ��Course�����еĲ����ֶΡ�����ֻ��Ҫ�������ؼ��ֶ�ƴ�ӳ��ַ����洢���ɣ�ʵ�ִ������£��˴��ο���[CYC](https://github.com/CyC2018/MBlog#���л���ʽ��ѡ��)����˼·��

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

����/young-manager/web/src/main/test/cn/young/util/TestSerialize.java�������ܲ��ԣ��õ�������£�

> ===== �Դ��ֽ��������л� =====
> �ķѿռ䣺462�ֽ�
> ����10000�κ�ʱ: 0.61ms
> ===== �Զ������л����� =====
> �ķѿռ䣺70�ֽ�
> ����10000�κ�ʱ: 0.08ms

�ɼ��Ż���Ч���൱���ԡ�

3.  **ʹ��ͼƬ����������ͼƬ** 

ʹ����ţ�Ʒ������Ķ���洢���ܣ�����վ�Ĵ󲿷�ͼ��ת�Ƶ�ͼƬ�������ϣ�������վ��IOѹ����

4.  **Nginx����ҳ���ļ�** 

��������Nginx�Ļ��湦��ʱ��Nginx�Ὣ��˷������Ӧ�����ڱ��ش����ϡ�����������ֻҪ���������ͻ����л��棬Nginx�Ͳ��Ὣ����ת������˵ķ����ϡ�����Nginx����ͬ���ܼ��������ѹ����

��������������£�

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

���У��������ĺ������£�

**proxy_cache_path /tmp/cache**  	���ڻ���ı��ش���Ŀ¼
**levels=1:2**  	�ڻ������Ŀ¼��������һ��������νṹ��Ŀ¼
**keys_zone=my_cache:10m** 	����һ�������ڴ���my_cache���洢�������Ԫ���ݣ���С10M
**max_size=1g** 	��������1g
**inactive=60m** 	��Ŀ�ڲ������ʵ�������ܹ����ڴ��б��ֵ�ʱ�䣬60����
**use_temp_path=off** 	nginx����Ὣ����д�뻺����ļ��ȷ���һ����ʱ�洢���򣬽��ú�ȥ���ò���

**proxy_cache my_cache** 	����������`zone`��`off`�� `zone`��ȡֵ��`proxy_cache_path`ָ����ָ���Ĺ����ڴ��������Ƶ�ֵ�������е�my_cache���� ���ȡֵΪ`off`���ʾ���û��湦�ܣ�ע�����Ʒ�Χ��
**proxy_cache_methods GET HEAD POST**  	���ÿ��Դ洢ʲô����������
**proxy_cache_use_stale error timeout http_500 http_502 http_503 http_504** 		���޷���ԭʼ��������ȡ���µ�����ʱ�����������崻�����æ����nginx���Էַ������еġ����ڡ�����
**proxy_cache_lock on** 	������ͻ�������һ�������в����ڵ��ļ�ʱ��ֻ�е�һ���ܱ���������������������Ҫô�ڵ�һ�������ȡ�ļ��ɹ���ӻ����л�ȡ�ļ���Ҫô��Զ��ȡ�����ļ�
**add_header X-Cache-Status $upstream_cache_status** 	���������ʶ����״̬������ͷ��upstream_cache_status�ж���״̬�����в��ֲ�����

- HIT ���� ��Ӧ�������Ի����������Ч�����ݡ� 
- MISS ���� ��Ӧ�ڻ������Ҳ�����������Ҫ�ڷ�������ȡ��
- EXPIRED ���� �����е�ĳһ������ˣ�����ԭʼ����������Ӧ�������µ�����

Nginx������ɺ���Chrome������򿪡���� - Network�������Զ�μ��غ󣬲鿴��ҳҳ�����Ӧͷ���õ�������£�

> HTTP/1.1 200 OK
> Server: nginx/1.10.3 (Ubuntu)
> Content-Type: text/html;charset=utf-8
> Transfer-Encoding: chunked
> Connection: keep-alive
> Content-Language: zh-CN
>  **X-Cache-Status: HIT** 
> Content-Encoding: gzip

����Nginx���������ɹ���

# ���ܲ���
һ��ʼ�ҳ���ʹ��JMeter�Ͱ�����PTS���в��ԣ��Ա�һ��������ͬ�������£�JMeter����ʱ������CPUʹ���ʱ�PTS�ͼ�ʮ���ٷֵ㣬˽��ΪJMeterģ��Ĳ���������ʵ������֮��
���ھ������ޣ�ֻ������100��������ѹ���ײͣ���ֻ���߹������ԡ�Ϊ�˾����������ٲ�����Ӱ�죬ѡ����ͬʱ����Ⱥ���Ż�ǰ�����վ���в��ԣ���ʼ������10�����ղ�����100������ʱ��6���ӡ���ز����������£�

**����������** ��

| CPU                                 | �ڴ� | ����       | ϵͳ��  | ϵͳ����     |
| ----------------------------------- | ---- | ---------- | ------- | ------------ |
| Xeon Platinum 8163 CPU 2.50GHz ���� | 2G   | ���Է�ֵ5M | SSD 40G | Ubuntu 16.04 |

**ѹ����** ��

| --     | �������� | ƽ��TPS | ����ɹ���        | ƽ����Ӧʱ��/ms |
| ------ | -------- | ------- | ----------------- | --------------- |
| ԭ��վ | 8992     | 24.98   | 36.94%(3322/5670) | 2273.95         |
| ����վ | 8177     | 22.71   | 89.48%(7317/860)  | 2449.45         |

**ȫ������ͼ** ��

- ԭ��վ

![ԭ��վѹ��.jpg](https://i.loli.net/2019/09/14/pZB7dOLo6wuS3Tr.jpg)

- ����վ

![����վѹ��.jpg](https://i.loli.net/2019/09/14/rywIXQia4pLBxcf.jpg)

ԭ����վ�ڲ������ﵽ70ʱ������ʧ���ʼ�����������90ʱ�����޳ɹ����󣻶��Ż��������վ�ڲ���100ʱ�����ܱ���80%���ҵ�����ɹ��ʣ��ɼ��Ż�Ч��������

�������ӣ�[ԭ��վ](http://pxkc6qwb1.bkt.clouddn.com/pdf/young/%E5%8E%8B%E6%B5%8B%20-%20%E5%8E%9F%E7%BD%91%E7%AB%99.pdf)��[����վ](http://pxkc6qwb1.bkt.clouddn.com/pdf/young/%E5%8E%8B%E6%B5%8B%20-%20%E7%8E%B0%E7%BD%91%E7%AB%99.pdf)
