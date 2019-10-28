package com.revature.beans;

import com.revature.loops.EmployeeMenuLoop;

public class Employee extends User {

	public Employee() {
		super();
	}

	public Employee(Integer userId, String username, String userType, String firstName, String lastName) {
		super(userId, username, userType, firstName, lastName);
	}
	
	@Override
	public void showMenu() {
		EmployeeMenuLoop.start();
	}
}
