package com.table.daoimpl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.table.dao.SchoolDao;
import com.table.pojo.School;
import com.table.utils.TableUtils;

/*
 * 作者:付全镇
 * 类名:SchoolDaoImpl
 * 作用:school表的增删查改操作
 * 日期:2019/7/1
 */

@Repository
public class SchoolDaoImpl implements SchoolDao {

	// 无参构造器
	public SchoolDaoImpl() {
	}

	// 插入
	public void insertSchool(School school) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertSchool", school);
		sqlSession.commit();
		sqlSession.close();
	}

	// 删除
	public void deleteSchool() {

	}

	// 查询
	public List<Long> selectSchool() throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		List<Long> selectIdList = sqlSession.selectList("selectSchool");
		sqlSession.close();
		return selectIdList;
	}

	// 修改
	public void updateSchool() {

	}

}
