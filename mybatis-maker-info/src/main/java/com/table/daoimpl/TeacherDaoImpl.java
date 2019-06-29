package com.table.daoimpl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.table.dao.TeacherDao;
import com.table.pojo.Teacher;
import com.table.utils.TableUtils;

public class TeacherDaoImpl implements TeacherDao {

	public TeacherDaoImpl() {
	}

	public void insertTeacher(Teacher teacher) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertTeacher", teacher);
		sqlSession.commit();
		sqlSession.close();
	}

	public void deleteTeacher() {
		// TODO Auto-generated method stub

	}

	public List<Teacher> selectTeacher() throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		List<Teacher> teacherList = sqlSession.selectList("selectTeacher");
		sqlSession.close();
		return teacherList;
	}

	public void updateTeacher() {
		// TODO Auto-generated method stub

	}

}
