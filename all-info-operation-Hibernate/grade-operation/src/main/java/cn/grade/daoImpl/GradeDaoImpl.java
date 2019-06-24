package cn.grade.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.grade.pojo.Grade;
import cn.grade.utils.GradeUtils;
import cn.gradeMaker.dao.GradeDao;

/*
 * 作者:付全镇
 * 类名:GradeDaoImpl
 * 作用:grade表的增删查改
 * 日期:2019/06/21
 */

public class GradeDaoImpl implements GradeDao {

	// 查询
	public void findGrade() {
		// TODO Auto-generated method stub

	}

	// 删除
	public void deleteGrade() {
		// TODO Auto-generated method stub

	}

	// 插入
	public void insertGrade(Grade grade) {
		// 开启连接
		Session session = GradeUtils.openSession();
		// 开启事务
		Transaction tx = session.beginTransaction();
		// 插入
		session.save(grade);
		// 提交事务
		tx.commit();
		// 关闭连接
		session.close();
	}

	// 更新
	public void updateGrade() {
		// TODO Auto-generated method stub

	}

}
