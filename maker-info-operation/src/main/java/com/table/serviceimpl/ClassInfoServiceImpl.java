package com.table.serviceimpl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.table.dao.ClassInfoDao;
import com.table.pojo.ClassInfo;
import com.table.service.ClassInfoService;

/*
 * 作者:付全镇
 * 类名:ClassInfoServiceImpl
 * 作用:class表的增删查改的具体实现
 * 日期:2019/6/28
 */
public class ClassInfoServiceImpl implements ClassInfoService {

	// 无参构造器
	public ClassInfoServiceImpl() {
	}

	// 插入
	public void insertClass(long schoolId, long gradeId, Integer size) throws IOException {
		// 创建ClassInfo对象
		ClassInfo classInfo = new ClassInfo();
		// 加载spring配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化ClassInfoDao对象
		ClassInfoDao classInfoDao = (ClassInfoDao) context.getBean("classInfoDaoImpl");
		for (int i = 1; i <= size; i++) {
			// 生成name
			String name = i + "班";
			// 传入name
			classInfo.setName(name);
			// 传入schoolId
			classInfo.setSch_id(schoolId);
			// 传入gradeId
			classInfo.setGra_id(gradeId);
			// 插入
			classInfoDao.insertClass(classInfo);
		}
	}

	// 查询
	public List<Long> selectClass(Map<String, Object> map) throws IOException {
		// 加载配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化ClassInfoDao对象
		ClassInfoDao classInfoDao = (ClassInfoDao) context.getBean("classInfoDaoImpl");
		// 查询
		List<Long> classIdList = classInfoDao.selectClass(map);
		return classIdList;
	}

}
