package com.revature.beans;

import com.revature.loops.CustomerMenuLoop;

public class Customer extends User {
	private Boolean status;

	public Customer(Integer userId, String username, String userType, String firstName, String lastName,
			Boolean status) {
		super(userId, username, "customer", firstName, lastName);
		this.setStatus(status);
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	@Override
	public void showMenu() {
		CustomerMenuLoop.start();
		
	}
	
	
}
