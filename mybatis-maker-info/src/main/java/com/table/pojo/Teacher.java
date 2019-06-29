package com.table.pojo;

public class Teacher {

	private long id;
	private String name;
	private long cid;

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

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", cid=" + cid + "]";
	}
}
