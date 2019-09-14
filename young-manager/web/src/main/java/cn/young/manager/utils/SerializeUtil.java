package cn.young.manager.utils;

import cn.young.manager.pojo.Course;

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
