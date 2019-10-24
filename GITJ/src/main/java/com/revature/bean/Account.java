package com.revature.bean;

public class Account {
	private double balance;
	private int id;
	private boolean accountType;
	public Account(double balance, int id, boolean accountType) {
		super();
		this.balance = balance;
		this.id = id;
		this.accountType = accountType;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isAccountType() {
		return accountType;
	}
	public void setAccountType(boolean accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", id=" + id + ", accountType=" + accountType + "]";
	}
	
	
}
