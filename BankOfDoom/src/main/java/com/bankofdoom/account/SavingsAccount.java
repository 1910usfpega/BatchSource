package com.bankofdoom.account;

import com.bankofdoom.bean.Account;

public class SavingsAccount extends Account{
	double minBalance;
	int currentMonthlyWithdrawals;
	int maxMonthlyWithdrawals;
	
	public SavingsAccount(double minBalance, int currentMonthlyWithdrawals, int maxMonthlyWithdrawals, String accountID, 
			String accountType, String firstName, String lastName, double balance) {
		super();
		this.minBalance = minBalance;
		this.currentMonthlyWithdrawals = currentMonthlyWithdrawals;
		this.maxMonthlyWithdrawals = maxMonthlyWithdrawals;
		this.accountID = accountID;
		this.accountType=accountType;
		this.firstName=firstName;
		this.lastName=lastName;
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [minBalance=" + minBalance + ", currentMonthlyWithdrawals=" + currentMonthlyWithdrawals
				+ ", maxMonthlyWithdrawals=" + maxMonthlyWithdrawals + ", accountID=" + accountID + ", accountType="
				+ accountType + ", firstName=" + firstName + ", lastName=" + lastName + ", balance=" + balance + "]";
	}

	
}
