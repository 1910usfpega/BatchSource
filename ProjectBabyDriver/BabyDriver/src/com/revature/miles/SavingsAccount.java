package com.revature.miles;

public class SavingsAccount extends Account {
	double minBalance;
	int currentMonthlyWithdrawals; 
	int maxMonthlyWithdrawals;
	


	
	public SavingsAccount(){
		this.accountType = "savings";
		this.username = "Username";
		this.password = "Password";
	}

	public SavingsAccount(String accountID, String username, String password, double balance){
		this.accountID = accountID; 
		this.username = username;
		this.password = password;
		this.balance = balance;
	}

	
	public double getminBalance() {
		return this.minBalance;
	}
	
	public void setminBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	public int getcurrentMonthlyWithdrawals() {
		return this.currentMonthlyWithdrawals;
	}
	
	public void setcurrentMonthlyWithdrawals(int currentMonthlyWithdrawals) {
		this.currentMonthlyWithdrawals = currentMonthlyWithdrawals;
	}
	
	public int getmaxMonthlyWithdrawals() {
		return this.maxMonthlyWithdrawals;
	}
	
	public void setmaxMonthlyWithdrawals(int maxMonthlyWithdrawals) {
		this.maxMonthlyWithdrawals = maxMonthlyWithdrawals;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", currentMonthlyWithdrawals=" + currentMonthlyWithdrawals
				+ ", maxMonthlyWithdrawals=" + maxMonthlyWithdrawals + "]";
	}

	

	

}
