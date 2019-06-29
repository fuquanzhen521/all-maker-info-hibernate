package com.table.service;

import java.io.IOException;
import java.util.List;

public interface SchoolService {

	public void insertSchool(String name, Integer size) throws IOException;

	public List<Long> selectSchool() throws IOException;

}
