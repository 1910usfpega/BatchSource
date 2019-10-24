package com.bankofdoom.bean;

public class Account {

	protected String accountID;
	

	protected boolean checkingAccount;
	protected String firstName;
	protected String lastName;
	protected double balance;
	protected static double overdraftFee = 30.00;
	protected boolean approved;

	public Account(String accountID, boolean checkingAccount, String firstName, String lastName, double balance) {
		super();
		this.accountID = accountID;
		this.checkingAccount = checkingAccount;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}

	public double getOverdraftFee() {
		return overdraftFee;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isChecking() {
		return checkingAccount;
	}

	public void setCheckingAccount(boolean checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isCheckingAccount() {
		return checkingAccount;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
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
	
	@Override
	public String toString() {
		return accountID + ","+ checkingAccount + "," + firstName
				+ "," + lastName + "," + balance + "," + approved;
	}

}
