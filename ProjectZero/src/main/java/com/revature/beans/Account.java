package com.revature.beans;
import java.util.ArrayList;

public class Account {
	private int accountId;
	private int accountNumber;
	private double balance;
	private String acctType;
	public String getAcctType() {
		return acctType;
	}

	public void setOwners(ArrayList<Customer> owners) {
		this.owners = owners;
	}

	private ArrayList<Customer> owners = new ArrayList<Customer>();
	public Account(String acctType,double balance, Customer ... userId) {
		super();
		this.accountId = (int) Math.random()*1000000;
		this.balance = balance;
		this.acctType = acctType;
		//this.accountType = accountType;
		//this.accountBalance = 0;
		for (Customer x:userId) {
			this.owners.add(x);
		}
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


	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}


	public void addOwner(Customer user) {
		this.owners.add(user);
	}
	
	
	
	public ArrayList<Customer> getOwners() {
		return this.owners;
	}
	public double withdraw(double amount) {
		balance-=amount;
		return balance;
	}
	
	public double deposit(double amount) {
		balance+=amount;
		return balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", balance=" + balance + ", acctType=" + acctType +  "]";
	}



}
