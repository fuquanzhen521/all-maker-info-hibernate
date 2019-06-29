package com.table.test;

import java.io.IOException;
import java.sql.Date;

import org.junit.Test;

import com.table.daoimpl.StudentDaoImpl;
import com.table.pojo.Student;

public class StudentTest {

	@Test
	public void insertStudent() throws IOException {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		Student student = new Student();
		student.setName("杨幂");
		student.setBirthday(new Date(1));
		student.setSex((byte) 2);
		student.setSch_id(1412L);
		student.setGra_id(2534L);
		student.setCla_id(4757L);
		studentDaoImpl.insertStudent(student);
	}
}
