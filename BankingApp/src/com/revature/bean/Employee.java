package com.revature.bean;

public class Employee extends User {
	public Employee(String username, String password) {
		super(username, password, "employee");
	}
	
	@Override
	public void showMenu() {
		System.out.println("EMPLOYEE ACCOUNT");
	}
}
