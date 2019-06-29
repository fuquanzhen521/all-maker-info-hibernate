package com.table.service;

import java.io.IOException;
import java.util.List;

public interface CourseService {

	public void insertCourse(Integer size) throws IOException;

	public List<Long> selectCourse() throws IOException;

}
