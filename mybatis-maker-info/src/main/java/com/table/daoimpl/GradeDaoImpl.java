package com.table.daoimpl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.table.dao.GradeDao;
import com.table.pojo.Grade;
import com.table.utils.TableUtils;

public class GradeDaoImpl implements GradeDao {

	public GradeDaoImpl() {
	}

	public void insertGrade(Grade grade) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertGrade", grade);
		sqlSession.commit();
		sqlSession.close();
	}

	public void deleteGrade() {
		// TODO Auto-generated method stub

	}

	public List<Long> selectGrade() throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		List<Long> gradeIdList = sqlSession.selectList("selectGrade");
		sqlSession.close();
		return gradeIdList;
	}

	public void updateGrade() {
		// TODO Auto-generated method stub

	}

}
