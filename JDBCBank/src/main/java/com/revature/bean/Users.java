package com.revature.bean;

public class Users {
	
	private Integer users_id;
	private String users_password;
	private String users_first_name;
	private String users_last_name;
	private String account_id;
	
	public Integer getUsers_id() {
		return users_id;
	}
	public void setUsers_id(Integer users_id) {
		this.users_id = users_id;
	}
	public String getUsers_password() {
		return users_password;
	}
	public void setUsers_password(String users_password) {
		this.users_password = users_password;
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
	public String getAccount_id() {
		return account_id;
	}
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}
	public Users(Integer users_id, String users_password, String users_first_name, String users_last_name,
			String account_id) {
		super();
		this.users_id = users_id;
		this.users_password = users_password;
		this.users_first_name = users_first_name;
		this.users_last_name = users_last_name;
		this.account_id = account_id;
	}
	@Override
	public String toString() {
		return "Users [users_id=" + users_id + ", users_password=" + users_password + ", users_first_name="
				+ users_first_name + ", users_last_name=" + users_last_name + ", account_id=" + account_id + "]";
	}
	
	
}
