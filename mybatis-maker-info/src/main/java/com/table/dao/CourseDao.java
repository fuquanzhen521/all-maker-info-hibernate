package com.table.dao;

import java.io.IOException;
import java.util.List;

import com.table.pojo.Course;

public interface CourseDao {

	public void insertCourse(Course course) throws IOException;

	public void deleteCourse();

	public List<Long> selectCourse() throws IOException;

	public void updateCourse();

}
