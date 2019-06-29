package com.table.dao;

import java.io.IOException;
import java.util.List;

import com.table.pojo.Teacher;

public interface TeacherDao {

	public void insertTeacher(Teacher teacher) throws IOException;

	public void deleteTeacher();

	public List<Teacher> selectTeacher() throws IOException;

	public void updateTeacher();

}
