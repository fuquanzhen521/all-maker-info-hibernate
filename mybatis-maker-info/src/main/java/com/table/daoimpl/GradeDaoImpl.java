package com.table.daoimpl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.table.dao.GradeDao;
import com.table.pojo.Grade;
import com.table.utils.TableUtils;

/*
 * 作者:付全镇
 * 类名:GradeDaoImpl
 * 作用:grade表的增删查改操作
 * 日期:2019/7/1
 */

@Repository
public class GradeDaoImpl implements GradeDao {

	// 无参构造器
	public GradeDaoImpl() {
	}

	// 插入
	public void insertGrade(Grade grade) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertGrade", grade);
		sqlSession.commit();
		sqlSession.close();
	}

	// 删除
	public void deleteGrade() {

	}

	// 查询
	public List<Long> selectGrade() throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		List<Long> gradeIdList = sqlSession.selectList("selectGrade");
		sqlSession.close();
		return gradeIdList;
	}

	// 修改
	public void updateGrade() {

	}

}
