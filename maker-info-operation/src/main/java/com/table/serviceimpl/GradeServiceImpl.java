package com.table.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.table.dao.GradeDao;
import com.table.pojo.Grade;
import com.table.service.GradeService;

/*
 * 作者:付全镇
 * 类名:GradeServiceImpl
 * 作用:grade表的增删查改的具体实现
 * 日期:2019/6/28
 */
public class GradeServiceImpl implements GradeService {

	// 无参构造器
	public GradeServiceImpl() {
	}

	// 插入
	public void insertGrade(Integer size) throws IOException {
		// 创建Grade对象
		Grade grade = new Grade();
		// 加载spring配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化GradeDao对象
		GradeDao gradeDao = (GradeDao) context.getBean("gradeDaoImpl");
		for (int i = 1; i <= size; i++) {
			// 生成name
			String name = i + "年级";
			// 传入name
			grade.setName(name);
			// 插入
			gradeDao.insertGrade(grade);
		}
	}

	// 查询
	public List<Long> selectGrade() throws IOException {
		// 加载配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 实例化GradeDao对象
		GradeDao gradeDao = (GradeDao) context.getBean("gradeDaoImpl");
		// 查询
		List<Long> gradeIdList = gradeDao.selectGrade();
		return gradeIdList;
	}

}
