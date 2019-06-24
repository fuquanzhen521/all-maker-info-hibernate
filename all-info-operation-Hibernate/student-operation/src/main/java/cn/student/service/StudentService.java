package cn.student.service;

import java.util.List;

public interface StudentService {

	public List<Long> insertStudent(long schoolId, long gradeId, long classId);

}
