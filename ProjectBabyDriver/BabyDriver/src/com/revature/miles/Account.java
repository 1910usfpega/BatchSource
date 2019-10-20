package com.revature.miles;

public class Account {
	protected double balance;
	protected String accountType;
	protected String accountID;
	protected String username;
	protected String password;
	public Account(double balance, String accountType, String accountID, String username, String password) {
		super();
		this.balance = balance;
		this.accountType = accountType;
		this.accountID = accountID;
		this.username = username;
		this.password = password;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountType=" + accountType + ", accountID=" + accountID
				+ ", username=" + username + ", password=" + password + "]";
	}
	
	
	
}