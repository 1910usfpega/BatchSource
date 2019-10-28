package com.revature.beans;

import java.io.Serializable;

public class UserBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5759373799307012942L;
	protected String username;
	protected String password;
	//private int userNumber;
	
	public UserBean() {
		
	}
	
	public UserBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		//this.userNumber = (int)Math.random();
	}
	
	


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	

}
