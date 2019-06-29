package com.table.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.table.dao.TeacherDao;
import com.table.daoimpl.TeacherDaoImpl;
import com.table.pojo.Teacher;

public class TeacherTest {

	@Test
	public void selectTeacher() throws IOException {
		TeacherDao teacherDao = new TeacherDaoImpl();
		List<Teacher> teacherList = teacherDao.selectTeacher();
		System.out.println(teacherList);
	}
}
