package com.revature.user;

public class User {
	protected String username;
	protected String password;
	//private int userNumber;
	
	public User(){
		
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		//this.userNumber = (int)Math.random();
	}
	
	
//	public int getUserNumber() {
//		return userNumber;
//	}
//
//
//	public void setUserNumber(int userNumber) {
//		this.userNumber = userNumber;
//	}


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
