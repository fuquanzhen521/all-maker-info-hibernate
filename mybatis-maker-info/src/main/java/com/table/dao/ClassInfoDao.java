package com.table.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.table.pojo.ClassInfo;

public interface ClassInfoDao {

	public void insertClass(ClassInfo classInfo) throws IOException;

	public void deleteClass();

	public List<Long> selectClass(Map<String, Object> map) throws IOException;

	public void updateClass();

}
