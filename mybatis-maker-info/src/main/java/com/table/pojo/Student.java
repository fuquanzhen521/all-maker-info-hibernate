package com.table.pojo;

import java.sql.Date;

public class Student {

	private long id;
	private String name;
	private Date birthday;
	private byte sex;
	private long sch_id;
	private long gra_id;
	private long cla_id;

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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public byte getSex() {
		return sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public long getSch_id() {
		return sch_id;
	}

	public void setSch_id(long sch_id) {
		this.sch_id = sch_id;
	}

	public long getGra_id() {
		return gra_id;
	}

	public void setGra_id(long gra_id) {
		this.gra_id = gra_id;
	}

	public long getCla_id() {
		return cla_id;
	}

	public void setCla_id(long cla_id) {
		this.cla_id = cla_id;
	}
}
