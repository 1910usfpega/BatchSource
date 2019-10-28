package com.revature.beans;

public class Account {

	private int accountId;
	private int accountType;
	private int accountNum;
	private double amount;
	
	public Account(int accountId, int accountType, int accountNum, double amount) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.accountNum = accountNum;
		this.amount = amount;
	}
	
	public Account() {
		super();
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getAccountType() {
		return accountType;
	}
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		if(accountType == 0) {
			return "Checking Account #" + accountNum + ", Balance = " + amount + "]";
		}
		else {
			return "Account [Account# = " + accountId + ", Account Type = " + accountType + ", Which Account = " + accountNum
					+ ", Balance = " + amount + "]";
		}
	}
	
}
