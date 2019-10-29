package com.bankofdoom.bean;

public class Account {

	private int accountID;
	private boolean checkingAccount;
	
	private double balance;
	
	private int userId;
	
	private boolean approved;

	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Account(int accountID, boolean checkingAccount,
			double balance, int userId, boolean approved) {
		super();
		this.accountID = accountID;
		this.checkingAccount = checkingAccount;
		this.balance = balance;
		this.userId = userId;
		this.approved = approved;
	}



	public Account(int accountID, boolean checkingAccount, double balance) {
		super();
		this.accountID = accountID;
		this.checkingAccount = checkingAccount;
		this.balance = balance;
	}



	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public boolean isCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(boolean checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}



	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", checkingAccount=" + checkingAccount + ", balance=" + balance
				+ ", userId=" + userId + ", approved=" + approved + "]";
	}

	

}
