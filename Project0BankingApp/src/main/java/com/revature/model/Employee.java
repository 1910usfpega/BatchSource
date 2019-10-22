package com.revature.model;

import com.revature.control.LoginControl;

public class Employee {

	private String username;
	private String password;
	private boolean isAdmin = false;
	
	LoginControl lc;

	public Employee() {}
	
	public Employee(String username, String password, boolean isAdmin) {
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
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

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "e "+ username + " " + password + " " + isAdmin + " " + lc
				+"";
	}
}
