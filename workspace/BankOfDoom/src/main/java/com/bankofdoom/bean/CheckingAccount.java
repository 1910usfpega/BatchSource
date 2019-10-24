package com.bankofdoom.bean;

public class CheckingAccount extends Account{

	
	//String accountID, boolean checkingAccount, String firstName, String lastName, double balance,

	public CheckingAccount(String accountID, boolean accountType, String firstName, 
			String lastName, double balance) {
		super(accountID, accountType, firstName, lastName, balance);
	}

	@Override
	public String toString() {
		return "CheckingAccount [overdraftFee=" + overdraftFee + ", accountID=" 
				+ accountID + ", firstName=" + firstName + ", lastName=" 
				+ lastName + ", balance=" + balance + "]";
	}
	
	
	
}
