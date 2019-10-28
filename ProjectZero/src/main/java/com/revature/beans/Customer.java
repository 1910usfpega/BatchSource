package com.revature.beans;

import java.util.HashMap;

public class Customer extends Person {

	private HashMap<Integer, Account> accounts= new HashMap<Integer, Account>();
	private HashMap<Integer, Account> pendingAccounts= new HashMap<Integer, Account>();
	
	public HashMap<Integer, Account> getAccounts() {
		return accounts;
	}

	public void addAccount(int id, Account acct) {
		accounts.put(id, acct);
	}

	public HashMap<Integer, Account> getPendingAccounts() {
		return pendingAccounts;
	}
	public void addPending(int id,Account acct) {
		pendingAccounts.put(id, acct);
	}

	public void setPendingAccounts(HashMap<Integer, Account> pendingAccounts) {
		this.pendingAccounts = pendingAccounts;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastName, String username, String password) {
		super(firstName, lastName, username, password);
		// TODO Auto-generated constructor stub
	}

	
	
}
