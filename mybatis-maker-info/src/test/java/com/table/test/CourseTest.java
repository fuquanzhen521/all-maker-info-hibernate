package com.table.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.table.dao.CourseDao;
import com.table.daoimpl.CourseDaoImpl;

public class CourseTest {

	@Test
	public void insertCourse() throws IOException {
		CourseDao courseDaoImpl = new CourseDaoImpl();
		List<Long> courseIdList = courseDaoImpl.selectCourse();
		System.out.println(courseIdList);
	}
}
