package com.table.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.table.pojo.Student;

public interface StudentDao {

	public void insertStudent(Student student) throws IOException;

	public void deleteStudent();

	public List<Long> selectStudent(Map<String, Object> map) throws IOException;

	public void updateStudent();

}
