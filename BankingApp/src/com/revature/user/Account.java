package com.revature.user;

public class Account {
	private int accountNumber;
	private String accountType;
	private double accountBalance;
	private Customer user1;
	private boolean joint;
	private Customer user2;
	
	
	
	public Account(String accountType, Customer user1, boolean joint, Customer user2) {
		super();
		this.accountNumber=(int) Math.random();
		this.accountType = accountType;
		this.accountBalance = 0;
		this.user1 = user1;
		this.joint = joint;
		this.user2 = user2;
	}
	
	public Account(String accountType, Customer user1, boolean joint) {
		super();
		this.accountNumber=(int) Math.random();
		this.accountType = accountType;
		this.accountBalance = 0;
		this.user1 = user1;
		this.joint = joint;
		this.user2 = null;
	}
	
	
	public Customer getUser1() {
		return user1;
	}
	public void setUser1(Customer user1) {
		this.user1 = user1;
	}
	public boolean isJoint() {
		return joint;
	}
	public void setJoint(boolean joint) {
		this.joint = joint;
	}
	public Customer getUser2() {
		return user2;
	}
	public void setUser2(Customer user2) {
		this.user2 = user2;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	

	public double withdraw(double amount) {
		accountBalance-=amount;
		return accountBalance;
	}
	
	public double deposit(double amount) {
		accountBalance-=amount;
		return accountBalance;
	}
	


	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", accountBalance=" + accountBalance + ", user1=" + user1
				+ ", joint=" + joint + ", user2=" + user2 + "]";
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	


}
