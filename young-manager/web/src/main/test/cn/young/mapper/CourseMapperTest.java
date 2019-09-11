package cn.young.mapper;

import cn.young.manager.mapper.CourseMapper;
import cn.young.manager.pojo.Course;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml", "classpath:spring/spring.xml"})
public class CourseMapperTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        SqlSessionFactory factory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        //获得会话对象
        SqlSession session = factory.openSession(true);
        try {
            CourseMapper courseMapper = session.getMapper(CourseMapper.class);
            List<Course> allHotCourse = courseMapper.findAllHotCourse();
            System.out.println(allHotCourse.toString());

        } finally {
            session.close();
        }
    }
}