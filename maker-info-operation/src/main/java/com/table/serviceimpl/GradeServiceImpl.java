package com.table.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.table.dao.GradeDao;
import com.table.pojo.Grade;
import com.table.service.GradeService;

/*
 * 作者:付全镇
 * 类名:GradeServiceImpl
 * 作用:grade表的增删查改的具体实现
 * 日期:2019/6/28
 */

@Service
public class GradeServiceImpl implements GradeService {

	@Autowired
	private GradeDao gradeDao;

	// 无参构造器
	public GradeServiceImpl() {
	}

	// 插入
	public void insertGrade(Integer size) throws IOException {
		// 创建Grade对象
		Grade grade = new Grade();
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
		// 查询
		List<Long> gradeIdList = gradeDao.selectGrade();
		return gradeIdList;
	}

}
