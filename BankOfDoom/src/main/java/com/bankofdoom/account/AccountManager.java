package com.bankofdoom.account;

import com.bankofdoom.bean.Account;

public class AccountManager {

//	Account account;
	public void withdrawal(Account account, double amount) {
		if(amount <= account.getBalance()) {
			account.setBalance( account.getBalance() - amount) ;
			System.out.println(account.getBalance());
		
		}
		else if (amount > account.getBalance()) {
			account.setBalance(account.getBalance() - account.getOverdraftFee());
			
			
			
		}
		else {
			System.out.println("Withdrawal amount of $" + amount + " is greater than total balance. Transaction canceled.");
		}
		}
	
	public void transfer(Account a,Account b, double amount) {
		a.setBalance(a.getBalance()-amount);
		deposit(b, amount);
	}
	public void deposit(Account a, double amount) {
		if(amount > 0) {
			a.setBalance(a.getBalance() + amount);
			System.out.println("Deposit of $" + amount + " accepted. New balance = $" + a.getBalance() + ".");
//			return true;
		}
			else {
				System.out.println("Error. Invalid ammount! Transaction voided.");
//				return false;
			}
	}
}
