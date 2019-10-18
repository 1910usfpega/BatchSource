package com.bankofdoom.account;

public class SavingsAccountManager {

	SavingsAccount account;
	
	public SavingsAccountManager(SavingsAccount account) {
		super();
		this.account = account;
	}


	public boolean deposit(double amount) {
		if(amount > 0) {
			account.setBalance(account.getBalance() + amount);
			System.out.println("Deposit of $" + amount + " accepted. New balance = $" + account.getBalance() + ".");
			return true;
		}
			else {
				System.out.println("Error");
				return false;
			}
	}
			
	public boolean withdrawal(double amount) {
		if(amount <= account.getBalance()) {
			account.setBalance(account.getBalance() - amount);
			System.out.println("Withdrawal of $" + amount + " accepted. New balance = $" + account.getBalance() + ".");
			return true;
		}
		else if (account.currentMonthlyWithdrawals >= account.maxMonthlyWithdrawals) {
			System.out.println("Max monthly withdrawal limit reached. Transaction canceled.");
			return false;
		}
		else {
			System.out.println("Withdrawal amount of $" + amount + " is greater than total balance. Transaction canceled.");
			return false;
		}
	}
}
