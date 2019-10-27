package com.jdbc.bank.driver;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.bean.User;
import com.jdbc.bank.exception.OverDraftException;

public class AccountDriver {
	
	//account of tyoe Account 
	Account account;
	
	public AccountDriver() {
		super();
	}

	public AccountDriver(Account account) {
		this.account = account;
	}
	
	private static AccountDriver atm = new AccountDriver();
	

	public static boolean deposit(double depAmount) {
		
		if (depAmount <= 0) {
			System.out.println("Deposit transaction cannot be completed." +
					"/n Deposit amount cannot be 0 or a negative transaction.");
			return false;
		} else {
//			updates balance after deposit
			atm.setBalance(atm.getBalance() + depAmount);
			System.out.println("Desposit successful" + atm.getBalance());
			return true;
		}
	}		
	
		public boolean withdraw(double wAmount) throws OverDraftException {
			double overDraftFee = 50;
			if (wAmount <= 0) {
				System.out.println("Withdrawal amount is invalid");
				return false;
		
			} else if (wAmount > atm.getBalance()) {
		try {	atm.setBalance(atm.getBalance() - (wAmount + overDraftFee));
				System.out.println("OverDraftFeeApplied!" + " A fee of $50 has been applied.");
				System.out.println("OverDraft Exception made.");
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
		
			} else if (wAmount <= atm.getBalance()) {
				atm.setBalance(atm.getBalance() - wAmount);
				System.out.println("Current Balance:" + atm.getBalance());
			}
			return true;
		}
	}
	
	public static boolean transfer() {
		return false;

	}

}
