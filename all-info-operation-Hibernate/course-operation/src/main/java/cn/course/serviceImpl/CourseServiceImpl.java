package cn.course.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import cn.course.daoImpl.CourseDaoImpl;
import cn.course.pojo.Course;
import cn.course.service.CourseService;

/*
 * 作者:付全镇
 * 类名:CourseServiceImpl
 * 作用:增删查改的具体操作
 * 日期:2019/06/21
 */

public class CourseServiceImpl implements CourseService {

	// 插入
	public List<Long> insertCourse(Integer size) {
		// 创建一个Long类型集合
		List<Long> idList = new ArrayList<Long>();
		// 创建CourseDaoImpl对象
		CourseDaoImpl courseDaoImpl = new CourseDaoImpl();
		// 创建Course对象
		Course course = new Course();
		for (int i = 1; i <= size; i++) {
			// 生成课程姓名
			String name = "第" + i + "课程";
			course.setName(name);
			// 调用dao层的insertCourse方法
			courseDaoImpl.insertCourse(course);
			// 获取id
			long id = course.getId();
			// 把id存入集合
			idList.add(id);
		}
		// 返回集合
		return idList;
	}

}
