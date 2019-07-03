package com.table.daoimpl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.table.dao.TeacherDao;
import com.table.pojo.Teacher;
import com.table.utils.TableUtils;

/*
 * 作者:付全镇
 * 类名:teacherDaoImpl
 * 作用:teacher表的增删查改
 * 日期:2019/7/1
 */

@Repository
public class TeacherDaoImpl implements TeacherDao {

	// 无参构造器
	public TeacherDaoImpl() {
	}

	// 插入
	public void insertTeacher(Teacher teacher) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertTeacher", teacher);
		sqlSession.commit();
		sqlSession.close();
	}

	// 删除
	public void deleteTeacher() {

	}

	// 查询
	public List<Teacher> selectTeacher() throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		List<Teacher> teacherList = sqlSession.selectList("selectTeacher");
		sqlSession.close();
		return teacherList;
	}

	// 修改
	public void updateTeacher() {

	}

}
