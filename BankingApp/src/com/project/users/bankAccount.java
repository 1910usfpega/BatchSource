package com.project.users;

public class bankAccount {
	double amount;
	final int ACCOUNTNUMBER;
	
	public bankAccount() {
		this.amount = 0;
		this.ACCOUNTNUMBER =  (int)(Math.random()*10000000);
	}
	
	public double deposit(double deposit) {
		this.amount = this.amount + deposit;
		return this.amount;
	}
	
	public double withdraw(double deposit) {
		this.amount = this.amount-deposit;
		return this.amount;
	}
	
	public int getAccountNumber() {
		return this.ACCOUNTNUMBER;
	}
	
	public double getBalance() {
		return this.amount;
	}
	
}
