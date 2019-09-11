package cn.young.manager.service.Impl;


import cn.young.manager.pojo.Course;
import cn.young.manager.pojo.HotCourse;
import cn.young.manager.service.HotCourseService;
import cn.young.mapper.CourseMapper;
import cn.young.mapper.HotCourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotCourseServiceImpl implements HotCourseService {
	@Autowired
	private HotCourseMapper dao;
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<HotCourse> findAllHotCourse() {
		return dao.findAllHotCourse();
	}

	/**
	 * 首页推荐课程
	 *
	 * @return
	 */
	@Override
	public List<Course> getRecommendCourse() {
		return courseMapper.getRecommendCourse();
	}
}

