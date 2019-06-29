package com.table.dao;

import java.io.IOException;
import java.util.List;

import com.table.pojo.School;

public interface SchoolDao {

	public void insertSchool(School school) throws IOException;

	public void deleteSchool();

	public List<Long> selectSchool() throws IOException;

	public void updateSchool();

}
