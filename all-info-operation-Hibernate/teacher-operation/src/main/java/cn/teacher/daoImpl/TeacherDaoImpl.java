package cn.teacher.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.teacher.pojo.Teacher;
import cn.teacher.utils.TeacherUtils;
import cn.teacherMaker.dao.TeacherDao;

/*
 * 作者:付全镇
 * 类名:TeacherDaoImpl
 * 作用:teacher表的增删查改
 * 日期:2019/06/21
 */

public class TeacherDaoImpl implements TeacherDao {

	// 查询
	public void findTeacher() {
		// TODO Auto-generated method stub

	}

	// 删除
	public void deleteTeacher() {
		// TODO Auto-generated method stub

	}

	// 插入
	public void insertTeacher(Teacher teacher) {
		// 开启连接
		Session session = TeacherUtils.openSession();
		// 开启事务
		Transaction tx = session.beginTransaction();
		// 插入
		session.save(teacher);
		// 提交事务
		tx.commit();
		// 关闭连接
		session.close();
	}

	// 更新
	public void updateTeacher() {
		// TODO Auto-generated method stub

	}

}
