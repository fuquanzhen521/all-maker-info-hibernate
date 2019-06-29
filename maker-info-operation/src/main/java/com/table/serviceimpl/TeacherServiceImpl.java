package com.table.serviceimpl;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.table.dao.TeacherDao;
import com.table.pojo.Teacher;
import com.table.service.CourseService;
import com.table.service.TeacherService;

/*
 * 作者:付全镇
 * 类名:TeacherServiceImpl
 * 作用:teacher表的增删查改的具体实现
 * 日期:2019/6/28
 */
public class TeacherServiceImpl implements TeacherService {

	// 无参构造器
	public TeacherServiceImpl() {
	}

	// 插入
	public void insertTeacher() throws IOException {
		// 创建Teacher对象
		Teacher teacher = new Teacher();
		// 加载spring配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化TeacherDao对象
		TeacherDao teacherDao = (TeacherDao) context.getBean("teacherDaoImpl");
		// 实例化CourseService对象
		CourseService courseService = (CourseService) context.getBean("courseServiceImpl");
		// 查询出course表的id
		List<Long> courseIdList = courseService.selectCourse();
		// 打乱course表的id集合
		Collections.shuffle(courseIdList);
		// 存入一些姓氏数组元素
		String x[] = { "赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈" };
		// 存入一些名字数组元素
		String m[] = { "华", "夏", "雷", "锋", "好", "榜", "样", "学", "习", "好" };
		for (long courseId : courseIdList) {
			// 随机取得数组x的下标值
			int a = (int) Math.abs(x.length * Math.random());
			// 随机取得数组m的下标值
			int b = (int) Math.abs(m.length * Math.random());
			// 取得姓名
			String name = x[a] + m[b];
			// 传入姓名
			teacher.setName(name);
			// 传入课程id
			teacher.setCid(courseId);
			// 插入
			teacherDao.insertTeacher(teacher);
		}
	}

	// 查询
	public List<Teacher> selectTeacher() throws IOException {
		// 加载spring配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化TeacherDao对象
		TeacherDao teacherDao = (TeacherDao) context.getBean("teacherDaoImpl");
		// 查询
		List<Teacher> teacherList = teacherDao.selectTeacher();
		// 返回集合
		return teacherList;
	}

}
