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
	
	public static Account getThisApplication(int acctNum) {
		for(Account x:allApplications) {
			if(x.getAccountNumber()==acctNum) {
				return x;
			}
		}
		return null;
	}

	public static boolean alreadyUsed(int acctNum) {
		boolean found=false;
		for(Account x:allApplications) {
			if (x.getAccountNumber()==acctNum) {
				found=true;
			}
		}
		return found;
	}
	
	public static ArrayList<Account> getAllApplications() {
		return allApplications;
	}

	public static void setAllApplications(ArrayList<Account> allApplications) {
		OpenApplications.allApplications = allApplications;
	}
	
	
	
	
	
}
