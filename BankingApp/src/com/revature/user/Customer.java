package com.revature.user;

//import com.revature.user.User;

public class Customer extends User {
	private boolean joint;
	private double balance;
	private int accountNumber;
	
	
	public double withdraw(double amount) {
		balance-=amount;
		return balance;
	}
	
	public double deposit(double amount) {
		balance-=amount;
		return balance;
	}
	
	public double transfer(double amount) {
		balance-=amount;
		return balance;
	}

	public boolean isJoint() {
		return joint;
	}

	public void setJoint(boolean joint) {
		this.joint = joint;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Customer [joint=" + joint + ", balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}
	
	
	
	

}
