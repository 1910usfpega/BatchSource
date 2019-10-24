package com.revature.bean;

import java.util.Date;

public class Bear {
	private int bear_id;
	private int bear_type_id;
	private String bear_name;
	private Date bear_birthday;
	private int bear_weight;
	private int cave_id;
	@Override
	public String toString() {
		return "Bear:\n [bear_id = " + bear_id + "\t bear_type_id = " 
				+ bear_type_id + "\t bear_name = " + bear_name
				+ "\t bear_birthday = " + bear_birthday + "\t bear_weight = "
				+ bear_weight + "\t cave_id = " + cave_id + "\n";
	}
	public int getBear_id() {
		return bear_id;
	}
	public void setBear_id(int bear_id) {
		this.bear_id = bear_id;
	}
	public int getBear_type_id() {
		return bear_type_id;
	}
	public void setBear_type_id(int bear_type_id) {
		this.bear_type_id = bear_type_id;
	}
	public String getBear_name() {
		return bear_name;
	}
	public void setBear_name(String bear_name) {
		this.bear_name = bear_name;
	}
	public Date getBear_birthday() {
		return bear_birthday;
	}
	public void setBear_birthday(Date bear_birthday) {
		this.bear_birthday = bear_birthday;
	}
	public int getBear_weight() {
		return bear_weight;
	}
	public void setBear_weight(int bear_weight) {
		this.bear_weight = bear_weight;
	}
	public int getCave_id() {
		return cave_id;
	}
	public void setCave_id(int cave_id) {
		this.cave_id = cave_id;
	}
	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bear(int bear_id, int bear_type_id, String bear_name, Date bear_birthday, int bear_weight, int cave_id) {
		super();
		this.bear_id = bear_id;
		this.bear_type_id = bear_type_id;
		this.bear_name = bear_name;
		this.bear_birthday = bear_birthday;
		this.bear_weight = bear_weight;
		this.cave_id = cave_id;
	}

}
