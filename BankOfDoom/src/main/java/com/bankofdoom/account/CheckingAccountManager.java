package com.bankofdoom.account;

import com.bankofdoom.bean.Account;

public class CheckingAccountManager {
	
	CheckingAccount account;
	public CheckingAccountManager(CheckingAccount account) {
		super();
		this.account = account;
	
	}

	public boolean deposit(double amount) {
		if(amount > 0) {
			account.setBalance(account.getBalance() + amount);
			return true;
		}
			else {
				return false; 
			} 
	}
			
	public boolean withdrawal(double amount) {
		if(amount <= account.getBalance()) {
			account.setBalance( account.getBalance() - amount) ;
			System.out.println(account.getBalance());
			return true;
		
		}
		else if (amount > account.getBalance()) {
			account.setBalance(account.getBalance() - account.getOverdraftFee());
			System.out.println("Withdrawal amount of $" + amount + " is greater than total balance. Transaction canceled.");
			return true;	
			
		}
		else {
			return false;
		}
		}
	public void transfer(Account a, double amount) {
		this.withdrawal(amount);
		this.deposit(amount);
	}
	
}

