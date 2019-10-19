package com.project.users;

public class bankAccount {
	double amount;
	final int ACCOUNTNUMBER;
	
	public bankAccount() {
		this.amount = 0;
		this.ACCOUNTNUMBER = (int)(Math.random()*10000000);
	}
	
	public double deposit(double deposit) {
		this.amount = this.amount + deposit;
		return this.amount;
	}
	
	public boolean withdraw(double withdraw, bankAccount b) {
		if(b.getBalance()>= withdraw) {
		this.amount = this.amount-withdraw;
		return true;
		}
		return false;
	}
	
	public int getAccountNumber() {
		return this.ACCOUNTNUMBER;
	}
	
	public double getBalance() {
		return this.amount;
	}	
}
