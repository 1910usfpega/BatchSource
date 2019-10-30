package com.bank.bean;

import java.util.List;

public class Users {
	
	private Integer users_id;
	private String users_first_name;
	private String users_last_name;
	private String users_name;
	private String users_password;
	private String users_type;
	public Integer getUsers_id() {
		return users_id;
	}
	public void setUsers_id(Integer users_id) {
		this.users_id = users_id;
	}
	public String getUsers_first_name() {
		return users_first_name;
	}
	public void setUsers_first_name(String users_first_name) {
		this.users_first_name = users_first_name;
	}
	public String getUsers_last_name() {
		return users_last_name;
	}
	public void setUsers_last_name(String users_last_name) {
		this.users_last_name = users_last_name;
	}
	public String getUsers_name() {
		return users_name;
	}
	public void setUsers_name(String users_name) {
		this.users_name = users_name;
	}
	public String getUsers_password() {
		return users_password;
	}
	public void setUsers_password(String users_password) {
		this.users_password = users_password;
	}
	public String getUsers_type() {
		return users_type;
	}
	public void setUsers_type(String users_type) {
		this.users_type = users_type;
	}
	public Users(Integer users_id, String users_first_name, String users_last_name, String users_name,
			String users_password, String users_type) {
		super();
		this.users_id = users_id;
		this.users_first_name = users_first_name;
		this.users_last_name = users_last_name;
		this.users_name = users_name;
		this.users_password = users_password;
		this.users_type = users_type;
	}
	@Override
	public String toString() {
		return "Users [users_id=" + users_id + ", users_first_name=" + users_first_name + ", users_last_name="
				+ users_last_name + ", users_name=" + users_name + ", users_password=" + users_password
				+ ", users_type=" + users_type + "]";
	}
	public static Users login(String loginFromUser, String passFromUser, List<Users> usersList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}