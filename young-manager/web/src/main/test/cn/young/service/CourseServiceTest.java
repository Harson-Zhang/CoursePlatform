package cn.young.service;

import cn.young.manager.impl.CourseImpl;
import cn.young.manager.mapper.CourseMapper;
import cn.young.manager.pojo.Course;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml", "classpath:spring/spring.xml"})
public class CourseServiceTest {

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    CourseImpl courseImpl;

    @Test
    public void testCourse(){
        courseImpl.findAllHotCourse();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
        SqlSessionFactory factory = (SqlSessionFactory) context.getBean("sqlSessionFactory");
        //获得会话对象
        SqlSession session = factory.openSession(true);
        try {
            CourseMapper courseMapper = session.getMapper(CourseMapper.class);


        } finally {
            session.close();
        }
    }
}