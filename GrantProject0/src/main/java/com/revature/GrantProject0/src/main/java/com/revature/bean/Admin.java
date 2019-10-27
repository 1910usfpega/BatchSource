package com.revature.bean;

public class Admin extends  Employee {

	public Admin(String userName, String fName, String lName, String passWord) {
		super(userName, fName, lName, passWord);
		// TODO Auto-generated constructor stub
	}

	public boolean isAdmin() {
		return false;
		
	}
	
	
}
