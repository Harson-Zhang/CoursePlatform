package cn.young.service;

import cn.young.manager.mapper.HotCourseMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml", "classpath:spring/spring.xml"})
public class HotCourseServiceTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        SqlSessionFactory factory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        //获得会话对象
        SqlSession session = factory.openSession(true);
        try {
            HotCourseMapper hotCourseMapper = session.getMapper(HotCourseMapper.class);
//            List<Course> recommendList = hotCourseMapper.getRecommendCourse();
//            for (Course course:recommendList){
//                System.out.println(course.getCid());
//            }

//            for(CourseSelected ele:courseSelectedList){
//                System.out.println(ele.getContent());
//            }
        } finally {
            session.close();
        }
    }
}