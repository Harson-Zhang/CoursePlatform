package cn.young.util;

import cn.young.manager.pojo.Course;
import cn.young.manager.utils.SerializeUtil;

import java.io.*;
import java.text.DecimalFormat;

/**
 * @author Harson
 * @version 1.0
 * @date 2019/9/11 14:41
 */
public class TestSerialize {
    public static void main(String[] args) {

        //使用Java自带的序列化与反序列化方法
        System.out.println("===== 自带字节数组序列化 =====");
        Original original = new Original();
        original.runTest();

        //使用自定义序列化与反序列化方法
        System.out.println("===== 自定义序列化工具 =====");
        MyUtil myUtil = new MyUtil();
        myUtil.runTest();
    }
}

abstract class TestTemplate {
    private static final int TIMES = 10000;

    void runTest(){
        Course course = new Course();
        course.setCid(1l);
        course.setSchName("东南大学");
        course.setCourseCode("A012321");
        course.setCourseName("机器学习");
        course.setCourseSelectnum(121);
        course.setCourseImage("img/01.jpg");

        long start = System.currentTimeMillis();
        for(int i=0; i<TIMES; i++){
            byte[] write = writeObject(course);
            if (i == 0){
                System.out.println(String.format("耗费空间：%d字节",write.length));
            }
            Course read = readObject(write);
        }
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println(String.format("运行%d次耗时: %sms", TIMES, format.format((System.currentTimeMillis()-start)*1.0/1000)));
    }

    abstract byte [] writeObject(Course course);

    abstract Course readObject(byte [] bytes);
}

class Original extends TestTemplate {

    @Override
    byte[] writeObject(Course course) {
        ByteArrayOutputStream outputStream =new ByteArrayOutputStream();
        ObjectOutputStream stream;
        try {
            stream = new ObjectOutputStream(outputStream);
            stream.writeObject(course);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return outputStream.toByteArray();
    }

    @Override
    Course readObject(byte[] bytes) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream stream;
        Course course = null;
        try {
            stream = new ObjectInputStream(inputStream);
            course = (Course) stream.readObject();
            stream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return course;
    }
}

class MyUtil extends TestTemplate {

    @Override
    byte[] writeObject(Course course) {
        return SerializeUtil.writeCourseObject(course).getBytes();
    }

    @Override
    Course readObject(byte[] bytes) {
        return SerializeUtil.readCourseObject(new String(bytes));
    }
}