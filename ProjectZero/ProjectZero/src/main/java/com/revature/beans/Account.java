package com.revature.beans;
import java.util.ArrayList;

public class Account {
	//fields
	private int accountId;
	
	private double balance;
	private String acctType;
	private int userId;

	//constructors
	public Account(String acctType, int userId) {
		super();
		balance = 0;
		this.acctType = acctType;
		this.userId = userId;
	}

	public Account(int accountId, double balance,String acctType,int userId ) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.acctType = acctType;
		//this.accountType = accountType;
		//this.accountBalance = 0;
		this.userId = userId;
	}

	public Account(String acctType,double balance) {
		super();
		this.accountId = (int) Math.random()*1000000;
		this.balance = balance;
		this.acctType = acctType;
		//this.accountType = accountType;
		//this.accountBalance = 0;
//		for (Customer x:userId) {
//			this.owners.add(x);
//		}
	}
	
	public Account(String acctType) {
		this.acctType = acctType;
		this.balance = 0;
		
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getters and setters
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String isAcctType() {
		return acctType;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}	
	
	//withdraw and deposit
	public double withdraw(double amount) {
		balance-=amount;
		return balance;
	}
	
	public double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	
	//to string
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", balance=" + balance + ", acctType=" + acctType +  "]";
	}

}
