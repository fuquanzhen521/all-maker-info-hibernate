package cn.studentMaker.dao;

import cn.student.pojo.Student;

public interface StudentDao {

	public void findStudent();

	public void deleteStudent();

	public void insertStudent(Student student);

	public void updateStudent();

}
