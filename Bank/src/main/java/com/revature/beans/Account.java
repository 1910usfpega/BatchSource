package com.revature.beans;

public class Account {
	
	protected int accountID;
	protected boolean checkingAccount;
	protected boolean savingsAccount;
	protected double checkBalance;
	protected double savingsBalance;
	//protected double balance;
	
	
	public Account(int accountID, boolean checkingAccount, boolean savingsAccount, double checkBalance,
			double savingsBalance) {
		super();
		this.accountID = accountID;
		this.checkingAccount = checkingAccount;
		this.savingsAccount = savingsAccount;
		this.checkBalance = checkBalance;
		this.savingsBalance = savingsBalance;
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

	public boolean isSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(boolean savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public double getCheckBalance() {
		return checkBalance;
	}

	public void setCheckBalance(double checkBalance) {
		this.checkBalance = checkBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", checkingAccount=" + checkingAccount + ", savingsAccount="
				+ savingsAccount + ", checkBalance=" + checkBalance + ", savingsBalance=" + savingsBalance
				+ "]";
	}
	
	

	
}
