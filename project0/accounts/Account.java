package com.project0.accounts;

public abstract class Account {
	//fields
	
	protected String existingUserName;
	protected String firstName;
	protected String lastName;
	protected String password;
	protected double balance;
	protected double withdrawAmount;
	protected double depositAmount;
	protected String accountID;
	protected String accountType;

	
	//Getters and Setters
	public String getExistingUserName() {
		return existingUserName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	public double getBalance() {
		return balance;
	}
	public double getWithdraw() {
		return withdrawAmount;
	}
	public double getDeposit() {
		return depositAmount;
	}
	public String getAccountID() {
		return accountID;
	}
	public String getAccountType() {
		return accountType;
	}
	
	
	public void setExistingUserName(String existingUserName) {
		this.existingUserName = existingUserName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setWithdraw(double withdraw) {
		this.withdrawAmount = withdraw;
	}
	public void setDeposit(double deposit) {
		this.depositAmount = deposit;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	public abstract AccountManager getAccountManager();
	

}
