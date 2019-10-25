package com.bankofdoom.bean;

public class Account {

	private int accountID;
	private boolean checkingAccount;
	
	private double balance;
	
	private String uName;
	
	private boolean approved;

	
	private final static double overdraftFee = 5.00;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Account(int accountID, boolean checkingAccount, double balance, String uName, boolean approved) {
		super();
		this.accountID = accountID;
		this.checkingAccount = checkingAccount;
		this.balance = balance;
		this.uName = uName;
		this.approved = approved;
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

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
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
				+ ", uName=" + uName + ", approved=" + approved + "]";
	}

	

}
