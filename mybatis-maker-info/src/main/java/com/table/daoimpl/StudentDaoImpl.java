package com.table.daoimpl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.table.dao.StudentDao;
import com.table.pojo.Student;
import com.table.utils.TableUtils;

public class StudentDaoImpl implements StudentDao {

	public StudentDaoImpl() {
	}

	public void insertStudent(Student student) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertStudent", student);
		sqlSession.commit();
		sqlSession.close();
	}

	public void deleteStudent() {
		// TODO Auto-generated method stub

	}

	public List<Long> selectStudent(Map<String,Object> map) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		List<Long> studentIdList = sqlSession.selectList("selectStudent",map);
		sqlSession.close();
		return studentIdList;
	}

	public void updateStudent() {
		// TODO Auto-generated method stub

	}

}
