package com.revature.user;

import java.util.ArrayList;

public class Account {
	private int accountNumber;
	private String accountType;
	private double accountBalance;
	private ArrayList<Customer> users;
	
	
	
	public Account(String accountType, Customer ... user) {
		super();
		this.accountNumber=(int)(Math.random()*1000000000);
		this.accountType = accountType;
		this.accountBalance = 0;
		for (Customer x:user) {
			this.users.add(x);
		}
	}
	public Account(String accountType, ArrayList<Customer> users) {
		super();
		this.accountNumber=(int) Math.random();
		this.accountType = accountType;
		this.accountBalance = 0;
		this.users=users;
	}
	
	
	
	public ArrayList<Customer> getUsers() {
		return this.users;
	}
	public void setUsers(ArrayList<Customer> users) {
		this.users = users;
	}


	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	

	public double withdraw(double amount) {
		accountBalance-=amount;
		return accountBalance;
	}
	
	public double deposit(double amount) {
		accountBalance-=amount;
		return accountBalance;
	}
	




	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountBalance="
				+ accountBalance + ", users=" + users + "]";
	}



	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	


}
