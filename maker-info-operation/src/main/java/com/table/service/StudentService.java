package com.table.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface StudentService {

	public void insertStudent(long schoolId, long gradeId, long classId) throws IOException;

	public List<Long> selectStudent(Map<String, Object> map) throws IOException;

}
