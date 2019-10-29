package com.revature.driver;

import com.revature.beans.Account;

public class SavingsAccountManager {
private SavingsAccountManager sman=new SavingsAccountManager();
	

	public boolean withdrawal(Account account, double amount) {
		if(amount <= account.getSavingsBalance()) {
			account.setSavingsBalance( account.getSavingsBalance() - amount) ;
			System.out.println(account.getCheckBalance());
			return true;
		
		}
		else {
			System.out.println("Withdrawal amount of $" + amount + " is greater than total balance. Transaction canceled.");
			return false;
		}
		}
	
	public boolean deposit(Account account, double amount) {
		if(amount > 0) {
			account.setSavingsBalance(account.getSavingsBalance() + amount);
			System.out.println("Deposit of $" + amount + " accepted. New balance = $" + account.getSavingsBalance() + ".");
			return true;
		}
			else {
				System.out.println("Error. Invalid ammount! Transaction voided.");
				return false;
			}
	}

}
