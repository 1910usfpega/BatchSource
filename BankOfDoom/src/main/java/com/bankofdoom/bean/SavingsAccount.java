package com.bankofdoom.bean;

public class SavingsAccount extends Account{
	double minBalance;
	int currentMonthlyWithdrawals;
	int maxMonthlyWithdrawals;
	
	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	public int getCurrentMonthlyWithdrawals() {
		return currentMonthlyWithdrawals;
	}

	public void setCurrentMonthlyWithdrawals(int currentMonthlyWithdrawals) {
		this.currentMonthlyWithdrawals = currentMonthlyWithdrawals;
	}

	public int getMaxMonthlyWithdrawals() {
		return maxMonthlyWithdrawals;
	}

	public void setMaxMonthlyWithdrawals(int maxMonthlyWithdrawals) {
		this.maxMonthlyWithdrawals = maxMonthlyWithdrawals;
	}
//String accountID, boolean checkingAccount, String firstName, String lastName, double balance,
//	double overdraftFee
	public SavingsAccount(double minBalance, int currentMonthlyWithdrawals, int maxMonthlyWithdrawals, String accountID, 
			boolean accountType, String firstName, String lastName, double balance) {
		super(accountID, accountType, firstName, lastName, balance);
		this.minBalance = minBalance;
		this.currentMonthlyWithdrawals = currentMonthlyWithdrawals;
		this.maxMonthlyWithdrawals = maxMonthlyWithdrawals;
		
	}

	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", currentMonthlyWithdrawals=" + currentMonthlyWithdrawals
				+ ", maxMonthlyWithdrawals=" + maxMonthlyWithdrawals + ", accountID=" + accountID + ", firstName=" + firstName + ", lastName=" + lastName + ", balance=" + balance + "]";
	}

	
}
