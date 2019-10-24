package com.revature.bean;

public class Users {
	private int id;
	private String username, pw;
	public Users(int id, String username, String pw) {
		super();
		this.id = id;
		this.username = username;
		this.pw = pw;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return pw;
	}
	public void setPassword(String password) {
		this.pw = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + pw + "]";
	}
	
	
}
