package cn.young.service;

import cn.young.manager.pojo.Course;
import cn.young.mapper.CourseMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml", "classpath:spring/springmvc.xml"})
public class CourseServiceTest {

    @Autowired
    CourseMapper courseMapper;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        SqlSessionFactory factory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        //获得会话对象
        SqlSession session = factory.openSession(true);
        try {
            CourseMapper courseMapper = session.getMapper(CourseMapper.class);
            List<Course> courseList = courseMapper.getAllCourse();
            for (Course course:courseList){
                String course_info = course.getCourseInfo();
                if (course_info != null){
                    String res1 = course_info.replaceAll("\\s:", " 周");
                    courseMapper.updateCourseInfoByCid(course.getCid(), res1);
                }
            }

        } finally {
            session.close();
        }
    }
}