package com.table.service;

import java.io.IOException;
import java.util.List;

import com.table.pojo.Teacher;

public interface TeacherService {

	public void insertTeacher() throws IOException;

	public List<Teacher> selectTeacher() throws IOException;

}
