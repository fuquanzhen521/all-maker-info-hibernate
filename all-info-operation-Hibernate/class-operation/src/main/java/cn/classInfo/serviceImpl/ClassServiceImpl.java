package cn.classInfo.serviceImpl;

import cn.classInfo.daoImpl.ClassDaoImpl;
import cn.classInfo.service.ClassService;
import cn.classMaker.dao.ClassDao;
import cn.classMaker.pojo.ClassInfo;

/*
 * 作者:付全镇
 * 类名:ClassServiceImpl
 * 作用:增删查改的具体操作
 * 日期:2019/06/21
 */

public class ClassServiceImpl implements ClassService {

	// 插入
	public long insertClass(long schoolId, long gradeId, String name) {
		// 创建ClassInfo对象
		ClassInfo classInfo = new ClassInfo();
		// 创建ClassDaoImpl对象
		ClassDao classDaoImpl = new ClassDaoImpl();

		classInfo.setSchoolId(schoolId);
		classInfo.setGradeId(gradeId);
		classInfo.setName(name);
		// 调用dao层的insertClass方法
		classDaoImpl.insertClass(classInfo);
		// 获取id
		long id = classInfo.getId();
		// 返回id
		return id;
	}

}
