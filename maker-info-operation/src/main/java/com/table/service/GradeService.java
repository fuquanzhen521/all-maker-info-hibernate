package com.table.service;

import java.io.IOException;
import java.util.List;

public interface GradeService {

	public void insertGrade(Integer size) throws IOException;

	public List<Long> selectGrade() throws IOException;

}
