package cn.classMaker.dao;

import cn.classMaker.pojo.ClassInfo;

public interface ClassDao {

	public void findClass();

	public void deleteClass();

	public void insertClass(ClassInfo classInfo);

	public void updateClass();

}
