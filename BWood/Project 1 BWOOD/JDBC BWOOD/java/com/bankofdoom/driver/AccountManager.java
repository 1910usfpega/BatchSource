package com.bankofdoom.driver;

import com.bankofdoom.bean.Account;

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
	public boolean withdrawal(Account account, double amount) {
		// no overdrafts allowed for now can be adjusted to do such at a later time
		if (amount <= account.getBalance()) {
			account.setBalance(account.getBalance() - amount);
			System.out.println(account.getBalance());
			return true;
		}

		System.out.println("Withdrawal amount of $" + amount + " is greater than total balance. Transaction canceled.");
		return false;
	}

	/**
	 * Method to transfer funds between accounts
	 * 
	 * @param debit   variable stating the originating account
	 * @param deposit variable stating the destination of the transfer
	 * @param amount  variable stating the funds to be transferred
	 * @return returns true if the action is successful
	 */
	public boolean transfer(Account debit, Account deposit, double amount) {
		if (am.withdrawal(debit, amount)) {
			am.deposit(deposit, amount);
			return true;
		}
		return false;

	}

	/**
	 * Method to deposit funds into a given account
	 * 
	 * @param account variable stating where the funds are to be deposited
	 * @param amount  variable containing the amount to be deposited
	 * @return returns true if action is successful
	 */
	public boolean deposit(Account account, double amount) {
		// no negatives in deposit
		if (amount > 0) {
			account.setBalance(account.getBalance() + amount);
			System.out
					.println("Deposit of $" + amount + " accepted. New " + "balance = $" + account.getBalance() + ".");
			return true;
		}

		System.out.println("Error. Invalid ammount! Transaction voided.");
		return false;

	}
}
