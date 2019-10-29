package com.revature.beans;

import java.io.Serializable;

public class Users {
	
	protected int userID;
	protected String userName;
	private String password;
	protected String name;
	protected int userType = 1;
	
	
	public Users() {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.userType = userType;
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Users [userID=" + userID + ", userName=" + userName + ", password=" + password + ", name="
				+ name + ", userType=" + userType + "]";
	}
	
	
	

}
