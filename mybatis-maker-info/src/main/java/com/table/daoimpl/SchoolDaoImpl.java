package com.table.daoimpl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.table.dao.SchoolDao;
import com.table.pojo.School;
import com.table.utils.TableUtils;

public class SchoolDaoImpl implements SchoolDao {

	public SchoolDaoImpl() {
	}

	public void insertSchool(School school) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertSchool", school);
		sqlSession.commit();
		sqlSession.close();
	}

	public void deleteSchool() {

	}

	public List<Long> selectSchool() throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		List<Long> selectIdList = sqlSession.selectList("selectSchool");
		sqlSession.close();
		return selectIdList;
	}

	public void updateSchool() {

	}

}
