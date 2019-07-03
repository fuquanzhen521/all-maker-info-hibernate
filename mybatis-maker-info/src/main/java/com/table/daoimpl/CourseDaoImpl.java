package com.table.daoimpl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.table.dao.CourseDao;
import com.table.pojo.Course;
import com.table.utils.TableUtils;

/*
 * 作者:付全镇
 * 类名:CourseDaoImpl
 * 作用:course表的增删查改
 * 日期:2019/7/1
 */

@Repository
public class CourseDaoImpl implements CourseDao {

	public CourseDaoImpl() {
	}

	public void insertCourse(Course course) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertCourse", course);
		sqlSession.commit();
		sqlSession.close();
	}

	public void deleteCourse() {
		// TODO Auto-generated method stub

	}

	public List<Long> selectCourse() throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		List<Long> CourseIdList = sqlSession.selectList("selectCourse");
		return CourseIdList;
	}

	public void updateCourse() {
		// TODO Auto-generated method stub

	}

}
