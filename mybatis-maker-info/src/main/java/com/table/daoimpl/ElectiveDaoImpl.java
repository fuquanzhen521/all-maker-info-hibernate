package com.table.daoimpl;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.table.dao.ElectiveDao;
import com.table.pojo.Elective;
import com.table.utils.TableUtils;

public class ElectiveDaoImpl implements ElectiveDao {

	public ElectiveDaoImpl() {
	}

	public void insertElective(Elective elective) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertElective", elective);
		sqlSession.commit();
		sqlSession.close();
	}

	public void deleteElective() {
		// TODO Auto-generated method stub

	}

	public void selectElective() {
		// TODO Auto-generated method stub

	}

	public void updateElective() {
		// TODO Auto-generated method stub

	}

}
