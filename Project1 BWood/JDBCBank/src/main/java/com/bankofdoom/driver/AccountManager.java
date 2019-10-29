package com.bankofdoom.driver;

import java.util.ArrayList;
import java.util.List;

import com.bankofdoom.bean.Account;
import com.bankofdoom.bean.User;

/*****************************
 * Controller for actions upon account methods are withdrawal, deposit, and
 * transfer
 * 
 * @author bryan wood
 *
 ****************************************/

public class AccountManager {

	// so I only have one instance of this object
	private AccountManager am = new AccountManager();

	/**
	 * Method to debit accounts
	 * 
	 * @param account the account to be debitted
	 * @param amount  the funds to be debitted
	 * @return returns true if action is successful
	 */
	public Account withdrawal(Account account, double amount) {
		// no overdrafts allowed for now can be adjusted to do such at a later time
		if (amount <= account.getBalance()) {
			account.setBalance(account.getBalance() - amount);
			System.out.println(account.getBalance());
			return account;
		}

		System.out.println("Withdrawal amount of $" + amount + " is greater "
				+ "than total balance. Please try a different amount.");
		return account;
	}

	/**
	 * Method to transfer funds between accounts
	 * 
	 * @param debit   variable stating the originating account
	 * @param deposit variable stating the destination of the transfer
	 * @param amount  variable stating the funds to be transferred
	 * @return returns true if the action is successful
	 */
	public List<Account> transfer(Account debit, Account deposit, double amount) {
		List<Account> al = new ArrayList<Account>();
		
		if (amount< debit.getBalance()) {
			debit =am.withdrawal(debit, amount);
			al.add(debit);
			deposit = am.deposit(deposit, amount);
			al.add(deposit);
			return al;
		}else {
		System.out.println("Transfer amount of $" + amount + " is greater than "
				+ "the total balance of originating account. "
				+ "Please try a different amount.");
		}
		return null;

	}
	
	/**
	 * Method to deposit funds into a given account
	 * 
	 * @param account variable stating where the funds are to be deposited
	 * @param amount  variable containing the amount to be deposited
	 * @return returns true if action is successful
	 */
	public Account deposit(Account account, double amount) {
		// no negatives in deposit
		if (amount > 0) {
			account.setBalance(account.getBalance() + amount);
			System.out.println("Deposit of $" + amount + " accepted. New " 
			+ "balance = $" + account.getBalance() + ".");
			return account;
		}

		System.out.println("Error. Invalid ammount! Transaction voided.");
		return account;

	}
}
