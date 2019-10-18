package com.revature.storage;

import java.util.ArrayList;

import com.revature.user.User;

public class OpenApplications {
	private static ArrayList<User> allApplications = new ArrayList<>();

	public static void addApplication(User user) {
		allApplications.add(user);
	}
	
	public static void removeApplication(User user) {
		allApplications.remove(user);
	}
	
	

	public static ArrayList<User> getAllApplications() {
		return allApplications;
	}

	public static void setAllApplications(ArrayList<User> allApplications) {
		OpenApplications.allApplications = allApplications;
	}
	
	
	
	
	
}
