package com.revature.bank;

public abstract class Account {
	private String accountID;
	private double balance;
	private String accountType;
	private String firstName;
	private String lastName;
	public Account(String accountID, double balance, String accountType, String firstName, String lastName) {
		super();
		this.accountID = accountID;
		this.balance = balance;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Account() {
		super();
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
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
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", balance=" + balance + ", accountType=" + accountType
				+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
