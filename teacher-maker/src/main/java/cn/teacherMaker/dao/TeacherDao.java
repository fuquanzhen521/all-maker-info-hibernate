package cn.teacherMaker.dao;

import cn.teacher.pojo.Teacher;

public interface TeacherDao {

	public void findTeacher();

	public void deleteTeacher();

	public void insertTeacher(Teacher teacher);

	public void updateTeacher();

}
