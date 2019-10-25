package com.revature.beans;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 3787308024279877929L;

	// private fields
	private int accountId;
	private String user;
	private String pw;
	private String name;
	private int aType;

	// Constructors
	public User(int accountId, String user, String pw, String name, int aType) {

		this.accountId = accountId;
		this.user = user;
		this.pw = pw;
		this.name = name;
		this.aType = aType;
	}

	// No-arg Constructor (Default Constructor)
	public User() {
		// super(); implicitly there
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

	public int getAType() {
		return aType;
	}

	public void setAType(int aType) {
		this.aType = aType;
	}

	@Override
	public String toString() {
		return "User [Account ID: " + accountId + ", Username = " + user + ", Password = " + pw + ", Name = " + name + ", Account Type = " + aType
				+ "]";
	}

}