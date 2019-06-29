package com.table.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ClassInfoService {

	// 插入
	public void insertClass(long schoolId, long gradeId, Integer size) throws IOException;

	// 查询
	public List<Long> selectClass(Map<String, Object> map) throws IOException;

}
