package com.revature.storage;

import java.util.ArrayList;

import com.revature.user.User;

public class OpenApplications {
	ArrayList<User> allApplications = new ArrayList<>();

	public void addApplication(User user) {
		allApplications.add(user);
	}
	
	public void removeApplication(User user) {
		allApplications.remove(user);
	}
	
	
	
	public OpenApplications() {
		super();
	}

	public ArrayList<User> getAllApplications() {
		return allApplications;
	}

	public void setAllApplications(ArrayList<User> allApplications) {
		this.allApplications = allApplications;
	}
	
	
	
	
	
}
