package com.revature.beans;

public class User{

	// private fields
	private int accountId;
	private String user;
	private String pw;
	private String name;

	// Constructors
	public User(int accountId, String user, String pw, String name) {

		this.accountId = accountId;
		this.user = user;
		this.pw = pw;
		this.name = name;
	}

	// No-arg Constructor (Default Constructor)
	public User() {
		super();
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "User [Account ID: " + accountId + ", Username = " + user + ", Password = " + pw + ", Name = " + name + "]";
	}

}