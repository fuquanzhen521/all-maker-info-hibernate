package cn.classMaker.pojo;

import java.util.HashSet;
import java.util.Set;

import cn.grade.pojo.Grade;
import cn.school.pojo.School;

/*
 * 作者:付全镇
 * 类名:ClassInformation
 * 作用:封装属性
 * 日期:5/1
 */
public class ClassInfo {
	private long id;
	private String name;
	private long schoolId;
	private long gradeId;

	private Set<School> schools = new HashSet<School>();

	private Set<Grade> grades = new HashSet<Grade>();

	public Set<Grade> getGrades() {
		return grades;
	}

	public void setGrades(Set<Grade> grades) {
		this.grades = grades;
	}

	public Set<School> getSchools() {
		return schools;
	}

	public void setSchools(Set<School> schools) {
		this.schools = schools;
	}

	public ClassInfo() {

	}

	public ClassInfo(long id, String name, long schoolId, long gradeId) {
	}

	public ClassInfo(String name, long schoolId, long gradeId) {
		this.name = name;
		this.schoolId = schoolId;
		this.gradeId = gradeId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}

	public long getGradeId() {
		return gradeId;
	}

	public void setGradeId(long gradeId) {
		this.gradeId = gradeId;
	}

	@Override
	public String toString() {
		return "classInfo [id=" + id + ", name=" + name + ", schoolId=" + schoolId + ", gradeId=" + gradeId + "]";
	}

}
