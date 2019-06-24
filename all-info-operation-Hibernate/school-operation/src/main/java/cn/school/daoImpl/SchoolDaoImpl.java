package cn.school.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.school.pojo.School;
import cn.school.utils.SchoolUtils;
import cn.schoolMaker.dao.SchoolDao;

/*
 * 作者:付全镇
 * 类名:SchoolDaoImpl
 * 作用:执行学校的增删查改操作
 * 日期:2019/0621
 */

public class SchoolDaoImpl implements SchoolDao {

	// 查询
	public void findSchool() {

	}

	// 删除
	public void deleteSchool() {
		// TODO Auto-generated method stub

	}

	// 插入
	public void insertSchool(School school) {
		// 获取连接
		Session session = SchoolUtils.openSession();
		// 开启事务
		Transaction tx = session.beginTransaction();
		// 插入数据
		session.save(school);
		// 事务提交
		tx.commit();
		// 关闭连接
		session.close();
	}

	// 更新
	public void updateSchool() {
		// TODO Auto-generated method stub

	}

}
