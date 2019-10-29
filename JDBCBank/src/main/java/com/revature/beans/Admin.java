package com.revature.beans;

import com.revature.loops.AdminMenuLoop;

public class Admin extends User {

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String username) {
		super(99999999, username, "admin", "Admin", "Admin");
	}
	
	@Override
	public void showMenu() {
		AdminMenuLoop.start();
	}
}
