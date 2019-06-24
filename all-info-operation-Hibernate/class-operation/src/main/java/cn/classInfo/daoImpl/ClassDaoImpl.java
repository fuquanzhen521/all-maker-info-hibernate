package cn.classInfo.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.classInfo.utils.ClassUtils;
import cn.classMaker.dao.ClassDao;
import cn.classMaker.pojo.ClassInfo;

/*
 * 作者:付全镇
 * 类名:ClassDaoImpl
 * 作用:班级表的增删查改
 * 日期:2019/06/21
 */

public class ClassDaoImpl implements ClassDao {

	// 查询
	public void findClass() {
		// TODO Auto-generated method stub

	}

	// 删除
	public void deleteClass() {
		// TODO Auto-generated method stub

	}

	// 插入
	public void insertClass(ClassInfo classInfo) {
		// 开启连接
		Session session = ClassUtils.openSession();
		// 开启事务
		Transaction tx = session.beginTransaction();
		// 插入
		session.save(classInfo);
		// 提交事务
		tx.commit();
		// 关闭连接
		session.close();
	}

	// 更新
	public void updateClass() {
		// TODO Auto-generated method stub

	}

}
