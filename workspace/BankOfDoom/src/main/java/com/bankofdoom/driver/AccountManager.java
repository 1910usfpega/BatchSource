package com.bankofdoom.driver;

import com.bankofdoom.bean.Account;

/**
 * Controller for actions upon account
 * methods are withdrawal, deposit, and transfer
 * @author bryan wood
 *
 */

public class AccountManager {
	//so I only have one instance of this object
	private AccountManager am = new AccountManager();

	public boolean withdrawal(Account account, double amount) {
		if(amount <= account.getBalance()) {
			account.setBalance( account.getBalance() - amount) ;
			System.out.println(account.getBalance());
			return true;
		}
		
		
			System.out.println("Withdrawal amount of $" + amount + " is greater than total balance. Transaction canceled.");
			return false;
		}
	
	public boolean transfer(Account debit,Account deposit, double amount) {
		if(am.withdrawal(debit,amount)) {
			am.deposit(deposit, amount);
			return true;
		}
		return false;
		
	}
	public boolean deposit(Account a, double amount) {
		if(amount > 0) {
			a.setBalance(a.getBalance() + amount);
			System.out.println("Deposit of $" + amount + " accepted. New balance = $" + a.getBalance() + ".");
			return true;
		}
			
				System.out.println("Error. Invalid ammount! Transaction voided.");
				return false;
			
	}
}
