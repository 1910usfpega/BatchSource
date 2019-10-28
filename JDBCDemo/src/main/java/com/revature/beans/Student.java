package com.revature.beans;

public class Student {
	private int s_id;
	private String s_name;
	private int sch_id;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int s_id, String s_name, int sch_id) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.sch_id = sch_id;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getSch_id() {
		return sch_id;
	}

	public void setSch_id(int sch_id) {
		this.sch_id = sch_id;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", sch_id=" + sch_id + "]";
	}
	
	
	
	
}
