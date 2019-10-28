package com.revature.beans;

public class Bank {
	private String username;
	private double balance;
	public Bank(String username, double balance) {
		super();
		this.username = username;
		this.balance = balance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [username=" + username + ", balance=" + balance + "]";
	}
	
	
	
}
