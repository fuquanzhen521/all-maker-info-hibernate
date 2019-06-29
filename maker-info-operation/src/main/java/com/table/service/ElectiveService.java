package com.table.service;

import java.io.IOException;

public interface ElectiveService {

	public void insertElective(long studentId, long teacherId, long courseId) throws IOException;

}
