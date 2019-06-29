package com.table.dao;

import java.io.IOException;
import java.util.List;

import com.table.pojo.Grade;

public interface GradeDao {

	public void insertGrade(Grade grade) throws IOException;

	public void deleteGrade();

	public List<Long> selectGrade() throws IOException;

	public void updateGrade();

}
