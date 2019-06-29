package com.table.test;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.table.daoimpl.GradeDaoImpl;
import com.table.pojo.Grade;

public class GradeTest {

	@Test
	public void insertGrade() throws IOException {
		GradeDaoImpl gradeDaoImpl = new GradeDaoImpl();
		Grade grade = new Grade();
		grade.setName("计算机学院");
		gradeDaoImpl.insertGrade(grade);
	}

	@Test
	public void selectGrade() throws IOException {
		GradeDaoImpl gradeDaoImpl = new GradeDaoImpl();
		List<Long> gradeIdList = gradeDaoImpl.selectGrade();
		System.out.println(gradeIdList);
	}
}
