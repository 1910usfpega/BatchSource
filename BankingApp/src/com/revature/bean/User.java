package com.revature.bean;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String userType;
	
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
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public User(String username, String password, String userType) {
		super();
		this.username = username;
		this.password = password;
		this.userType = userType;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", userType=" + userType + "]";
	}
	
	
	public static User login(String username, String password, List<User> usersList) throws LoginException {
		for (User user:usersList) {
			if (user.getUsername().toString().equals(username)) {
				if (user.getPassword().toString().equals(password)) {
					return user;
				} else {
					throw new LoginException("Incorrect pass");
				}
			}
		}
		throw new LoginException("No such login: " + username);
	}
	
	
	public void showMenu() {
		System.out.println("User blueprint not have menu");
		System.out.println(this.toString());
	}
	
	
	
}
