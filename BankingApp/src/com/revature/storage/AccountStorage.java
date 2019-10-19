package com.revature.storage;

import java.util.ArrayList;

import com.revature.user.Account;

public class AccountStorage {
	private static ArrayList<Account> allAccounts = new ArrayList<Account>();

	public static void addAccount(Account acct) {
		AccountStorage.allAccounts.add(acct);
	}

	
	public static void removeAccount(Account acct) {
		AccountStorage.allAccounts.remove(acct);
	}
	
	public static Account getThisAccount(int acct) {
		return allAccounts.get(acct);
	}
	
	
	public static ArrayList<Account> getAllAccounts() {
		return allAccounts;
	}
	
	public static ArrayList<Integer> getAllAccountNumbers() {
		ArrayList<Integer> allAccountNums= new ArrayList<Integer>();
		for (Account x:allAccounts) {
			allAccountNums.add(x.getAccountNumber());
		}
		return allAccountNums;
	}

	public static void setAllAccounts(ArrayList<Account> allAccounts) {
		AccountStorage.allAccounts = allAccounts;
	}
	
	
	

}
