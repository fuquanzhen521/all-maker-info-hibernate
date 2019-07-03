package com.table.daoimpl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.table.dao.StudentDao;
import com.table.pojo.Student;
import com.table.utils.TableUtils;

/*
 * 作者:付全镇
 * 类名:StudentDaoImpl
 * 作用:student表的增删查改
 * 日期:2019/7/1
 */

@Repository
public class StudentDaoImpl implements StudentDao {

	// 无参构造器
	public StudentDaoImpl() {
	}

	// 插入
	public void insertStudent(Student student) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertStudent", student);
		sqlSession.commit();
		sqlSession.close();
	}

	// 删除
	public void deleteStudent() {

	}

	// 查询
	public List<Long> selectStudent(Map<String, Object> map) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		List<Long> studentIdList = sqlSession.selectList("selectStudent", map);
		sqlSession.close();
		return studentIdList;
	}

	// 修改
	public void updateStudent() {

	}

}
