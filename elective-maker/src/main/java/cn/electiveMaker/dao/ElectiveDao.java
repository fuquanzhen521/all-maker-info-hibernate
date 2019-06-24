package cn.electiveMaker.dao;

import cn.elective.pojo.Elective;

public interface ElectiveDao {

	public void findElective();

	public void deleteElective();

	public void insertElective(Elective elective);

	public void updateElective();

}
