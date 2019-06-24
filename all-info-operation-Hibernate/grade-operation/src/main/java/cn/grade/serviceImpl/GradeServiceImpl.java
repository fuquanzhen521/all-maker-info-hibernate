package cn.grade.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import cn.grade.daoImpl.GradeDaoImpl;
import cn.grade.pojo.Grade;
import cn.grade.service.GradeService;
import cn.gradeMaker.dao.GradeDao;

/*
 * 作者:付全镇
 * 类名:GradeServiceImpl
 * 作用:增删查改的具体操作
 * 日期:2019/06/21
 */

public class GradeServiceImpl implements GradeService {

	// 插入
	public List<Long> insertGrade(Integer size) {
		// 创建Long类型集合
		List<Long> idList = new ArrayList<Long>();
		// 创建Grade对象
		Grade grade = new Grade();
		// 创建GradeDaoImpl对象
		GradeDao gradeDaoImpl = new GradeDaoImpl();
		for (int i = 1; i <= size; i++) {
			// 生成年级姓名
			String name = "第" + i + "年级";
			grade.setName(name);
			// 调用dao层的insertGrade方法
			gradeDaoImpl.insertGrade(grade);
			// 获取id
			Long id = grade.getId();
			// 把id存入集合
			idList.add(id);
		}
		// 返回集合
		return idList;
	}

}
