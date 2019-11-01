package com.jdbc.bank.driver;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.exception.OverDraftException;

public class AccountDriver {
	
	//account of type Account 
	static Account account ;
	
	
	private static AccountDriver atm = new AccountDriver();
	

	public static Account deposit(Account account, double depAmount) {
		
		if (depAmount <= 0) {
			System.out.println("Deposit transaction cannot be completed." +
					"/n Deposit amount cannot be 0 or a negative transaction.");
			return account;
		} else {
//			updates balance after deposit
			account.setBalance(account.getBalance() + depAmount);
			System.out.println("Desposit successful" + account.getBalance());
			return account;
		}
	}		
	
		public static Account withdraw(Account account, double wAmount) throws OverDraftException {
			double overDraftFee = 50;
			if (wAmount <= 0) {
				System.out.println("Withdrawal amount is invalid");
				return account;
		
			} else if (wAmount > account.getBalance()) {
				
				account.setBalance(account.getBalance() - (wAmount + overDraftFee));
				try {
				}
			catch (RuntimeException e) {
				e.printStackTrace();
				System.out.println("OverDraftFeeApplied!" + " A fee of $50 has been applied.");
				System.out.println("OverDraft Exception made.");
			}
		
			} else if (wAmount <= account.getBalance()) {
				account.setBalance(account.getBalance() - wAmount);
				System.out.println("Current Balance:" + account.getBalance());
			}
			return account;
		}
	
	
	
	
}
