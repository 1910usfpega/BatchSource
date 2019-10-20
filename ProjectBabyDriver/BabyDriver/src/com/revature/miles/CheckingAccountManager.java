package com.revature.miles;

public abstract class CheckingAccountManager implements AccountManager {
CheckingAccount checkingAccount; 
	
	public CheckingAccountManager(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount; 
	}
	
	@Override
	public boolean deposit( double amount) {
		if (amount<= 0) {
			System.out.println("Deposit must be greater than zero.");
			return false;
		}
		
		checkingAccount.setBalance(checkingAccount.getBalance() +amount);
		return true;
	}
	
	@Override
	public boolean withdraw( double amount) {
		
		if (amount <= 0) {
			System.out.println("An overdraft fee will be charged");
		}
		checkingAccount.setBalance(checkingAccount.getBalance() +amount);
		return true;
	}

}
