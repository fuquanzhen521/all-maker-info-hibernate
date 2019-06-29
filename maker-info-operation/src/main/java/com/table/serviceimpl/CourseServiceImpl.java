package com.table.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.table.dao.CourseDao;
import com.table.pojo.Course;
import com.table.service.CourseService;

/*
 * 作者:付全镇
 * 类名:CourseServiceImpl
 * 作用:course表的增删查改的具体实现
 * 日期:2019/6/28
 */
public class CourseServiceImpl implements CourseService {

	// 无参构造器
	public CourseServiceImpl() {
	}

	public void insertCourse(Integer size) throws IOException {
		// 创建Course对象
		Course course = new Course();
		// 加载spring的xml文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化CourseDaoImpl对象
		CourseDao courseDao = (CourseDao) context.getBean("courseDaoImpl");
		// 遍历传入的课程数
		for (int i = 1; i <= size; i++) {
			// 生成课程名字
			String name = "第" + i + "课程";
			// 传入name
			course.setName(name);
			// 插入课程信息
			courseDao.insertCourse(course);
		}
	}

	// 查询
	public List<Long> selectCourse() throws IOException {
		// 加载spring的xml文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化CourseDaoImpl对象
		CourseDao courseDao = (CourseDao) context.getBean("courseDaoImpl");
		// 查询
		List<Long> courseIdList = courseDao.selectCourse();
		// 返回集合
		return courseIdList;
	}

}
