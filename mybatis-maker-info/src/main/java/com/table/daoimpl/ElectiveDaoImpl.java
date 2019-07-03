package com.table.daoimpl;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.table.dao.ElectiveDao;
import com.table.pojo.Elective;
import com.table.utils.TableUtils;

/*
 * 作者:付全镇
 * 类名:ElectiveDaoImpl
 * 作用:elective表的增删查改
 * 日期:2019/7/1
 */

@Repository
public class ElectiveDaoImpl implements ElectiveDao {

	// 无参构造器
	public ElectiveDaoImpl() {
	}

	// 插入
	public void insertElective(Elective elective) throws IOException {
		SqlSession sqlSession = TableUtils.openSqlSession();
		sqlSession.insert("insertElective", elective);
		sqlSession.commit();
		sqlSession.close();
	}

	// 删除
	public void deleteElective() {

	}

	// 查询
	public void selectElective() {

	}

	// 修改
	public void updateElective() {

	}

}
