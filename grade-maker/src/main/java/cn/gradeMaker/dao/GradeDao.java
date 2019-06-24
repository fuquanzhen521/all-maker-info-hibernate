package cn.gradeMaker.dao;

import cn.grade.pojo.Grade;

public interface GradeDao {

	public void findGrade();

	public void deleteGrade();

	public void insertGrade(Grade grade);

	public void updateGrade();

}
