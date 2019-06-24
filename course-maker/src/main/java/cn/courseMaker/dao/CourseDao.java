package cn.courseMaker.dao;

import cn.course.pojo.Course;

public interface CourseDao {

	public void findCourse();

	public void deleteCourse();

	public void insertCourse(Course course);

	public void updateCourse();

}
