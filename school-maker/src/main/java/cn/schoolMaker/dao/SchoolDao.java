package cn.schoolMaker.dao;

import cn.school.pojo.School;

public interface SchoolDao {

	public void findSchool();

	public void deleteSchool();

	public void insertSchool(School school);

	public void updateSchool();

}
