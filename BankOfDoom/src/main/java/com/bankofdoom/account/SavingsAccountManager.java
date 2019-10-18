package com.bankofdoom.account;

import com.bankofdoom.bean.SavingsAccount;

public class SavingsAccountManager extends AccountManager {

	SavingsAccount account;
	
	public SavingsAccountManager(SavingsAccount account) {
		super();
		this.account = account;
	}

//public voids

			
	public boolean canMakeWithdrawal(double amount) {
		if(amount <= account.getBalance()) {
//			account.setBalance(account.getBalance() - amount);
			System.out.println("Withdrawal of $" + amount + " accepted. New balance = $" + account.getBalance() + ".");
			super.withdrawal(account,amount);
			return true;
		}
		else if (account.getCurrentMonthlyWithdrawals() >= account.getMaxMonthlyWithdrawals()) {
			System.out.println("Max monthly withdrawal limit reached. Transaction canceled.");
			return false;
		}
		else {
			System.out.println("Withdrawal amount of $" + amount + " is greater than total balance. Transaction canceled.");
			return false;
		}
	}
}
