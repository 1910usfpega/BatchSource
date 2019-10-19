package com.revature.storage;

import java.util.ArrayList;

import com.revature.user.Account;

public class OpenApplications {
	private static ArrayList<Account> allApplications = new ArrayList<>();

	public static void addApplication(Account acct) {
		allApplications.add(acct);
	}
	
	public static void removeApplication(Account acct) {
		allApplications.remove(acct);
	}
	
	

	public static ArrayList<Account> getAllApplications() {
		return allApplications;
	}

	public static void setAllApplications(ArrayList<Account> allApplications) {
		OpenApplications.allApplications = allApplications;
	}
	
	
	
	
	
}
