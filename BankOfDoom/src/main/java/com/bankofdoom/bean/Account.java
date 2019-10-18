package com.bankofdoom.bean;

public class Account {
	
	protected String accountID;
	protected String accountType;
	protected String firstName;
	protected String lastName;
	protected double balance;
	protected double overdraftFee;
	
	public double getOverdraftFee() {
		return overdraftFee;
	}
	public void setOverdraftFee(double overdraftFee) {
		this.overdraftFee = overdraftFee;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
