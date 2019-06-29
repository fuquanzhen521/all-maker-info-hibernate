package com.table.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.table.dao.SchoolDao;
import com.table.daoimpl.SchoolDaoImpl;
import com.table.pojo.School;

public class SchoolTest {

	@Test
	public void insertSchool() throws IOException {
		SchoolDao schoolDaoImpl = new SchoolDaoImpl();
		School school = new School();
		school.setName("清华大学");
		school.setJbw(true);
		school.setEyy(true);
		schoolDaoImpl.insertSchool(school);
	}

	@Test
	public void selectSchool() throws IOException {
		SchoolDao schoolDaoImpl = new SchoolDaoImpl();
		List<Long> selectSchool = schoolDaoImpl.selectSchool();
		System.out.println(selectSchool);
	}
}
