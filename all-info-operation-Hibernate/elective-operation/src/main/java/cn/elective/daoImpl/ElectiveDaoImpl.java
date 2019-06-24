package cn.elective.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.elective.pojo.Elective;
import cn.elective.utils.ElectiveUtils;
import cn.electiveMaker.dao.ElectiveDao;

/*
 * 作者:付全镇
 * 类名:ElectiveDaoImpl
 * 作用:选修课表的增删查改
 * 日期:2019/06/21
 */

public class ElectiveDaoImpl implements ElectiveDao {

	// 查询
	public void findElective() {
		// TODO Auto-generated method stub

	}

	// 删除
	public void deleteElective() {
		// TODO Auto-generated method stub

	}

	// 插入
	public void insertElective(Elective elective) {
		// 开启连接
		Session session = ElectiveUtils.openSession();
		// 开启事务
		Transaction tx = session.beginTransaction();
		// 插入
		session.save(elective);
		// 提交
		tx.commit();
		// 关闭连接
		session.close();
	}

	// 更新
	public void updateElective() {
		// TODO Auto-generated method stub

	}

}
