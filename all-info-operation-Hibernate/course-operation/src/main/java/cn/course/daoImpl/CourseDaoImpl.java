package cn.course.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.course.pojo.Course;
import cn.course.utils.CourseUtils;
import cn.courseMaker.dao.CourseDao;

/*
 * 作者:付全镇
 * 类名:CourseDaoImpl
 * 作用:课程表的增删查改
 * 日期:2019/06/21
 */

public class CourseDaoImpl implements CourseDao {

	// 查询
	public void findCourse() {
		// TODO Auto-generated method stub

	}

	// 删除
	public void deleteCourse() {
		// TODO Auto-generated method stub

	}

	// 插入
	public void insertCourse(Course course) {
		// 获取连接
		Session session = CourseUtils.openSession();
		// 开启事务
		Transaction tx = session.beginTransaction();
		// 插入
		session.save(course);
		// 提交事务
		tx.commit();
		// 关闭连接
		session.close();
	}

	// 更新
	public void updateCourse() {
		// TODO Auto-generated method stub

	}

}
