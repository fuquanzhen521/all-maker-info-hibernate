package com.table.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.table.dao.ClassInfoDao;
import com.table.daoimpl.ClassInfoDaoImpl;
import com.table.pojo.ClassInfo;

public class ClassTest {

	@Test
	public void insertClass() throws IOException {
		ClassInfoDao classInfoDaoImpl = new ClassInfoDaoImpl();
		ClassInfo classInfo = new ClassInfo();
		classInfo.setName("软件工程01班");
		classInfo.setSch_id(123L);
		classInfo.setGra_id(436L);
		classInfoDaoImpl.insertClass(classInfo);
	}

	@Test
	public void selectClass() throws IOException {
		ClassInfoDao classInfoDaoImpl = new ClassInfoDaoImpl();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sch_id", 38061L);
		map.put("gra_id", 1229L);
		List<Long> classInfoIdList = classInfoDaoImpl.selectClass(map);
		System.out.println(classInfoIdList);
	}

}
