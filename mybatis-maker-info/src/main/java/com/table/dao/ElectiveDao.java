package com.table.dao;

import java.io.IOException;

import com.table.pojo.Elective;

public interface ElectiveDao {

	public void insertElective(Elective elective) throws IOException;

	public void deleteElective();

	public void selectElective();

	public void updateElective();

}
