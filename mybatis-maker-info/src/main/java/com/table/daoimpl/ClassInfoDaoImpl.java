package com.table.daoimpl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.table.dao.ClassInfoDao;
import com.table.pojo.ClassInfo;
import com.table.utils.TableUtils;

/*
 * 作者:付全镇
 * 类名:ClassInfoDaoImpl
 * 作用:class表的增删查改的具体实现
 * 日期:2019/7/1
 */

@Repository
public class ClassInfoDaoImpl implements ClassInfoDao {

	// 无参构造器
	public ClassInfoDaoImpl() {
	}

	// 插入
	public void insertClass(ClassInfo classInfo) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertClass", classInfo);
		sqlSession.commit();
		sqlSession.close();
	}

	// 删除
	public void deleteClass() {
		// TODO Auto-generated method stub

	}

	// 查询
	public List<Long> selectClass(Map<String, Object> map) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		List<Long> classInfoList = sqlSession.selectList("selectClass", map);
		sqlSession.close();
		return classInfoList;
	}

	// 修改
	public void updateClass() {

	}

}
