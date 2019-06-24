package cn.student.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.student.pojo.Student;
import cn.student.utils.StudentUtils;
import cn.studentMaker.dao.StudentDao;

/*
 * 作者:付全镇
 * 类名:StudentDaoImpl
 * 作用:学生表的增删查改
 * 日期:2019/06/21
 */

public class StudentDaoImpl implements StudentDao {

	// 查询
	public void findStudent() {
		// TODO Auto-generated method stub

	}

	// 删除
	public void deleteStudent() {
		// TODO Auto-generated method stub

	}

	// 插入
	public void insertStudent(Student student) {
		// 开启连接
		Session session = StudentUtils.openSession();
		// 开启事务
		Transaction tx = session.beginTransaction();
		// 插入
		session.save(student);
		// 提交事务
		tx.commit();
		// 关闭连接
		session.close();
	}

	// 更新
	public void updateStudent() {
		// TODO Auto-generated method stub

	}

}
