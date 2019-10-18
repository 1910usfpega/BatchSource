package com.bankofdoom.account;

import com.bankofdoom.bean.Account;

public class CheckingAccount extends Account{

	

	public CheckingAccount(double overdraftFee, String accountID, String accountType, String firstName, 
			String lastName, double balance) {
		super();
		this.accountID = accountID;
		this.accountType=accountType;
		this.firstName=firstName;
		this.lastName=lastName;
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "CheckingAccount [overdraftFee=" + overdraftFee + ", accountID=" + accountID + ", accountType="
				+ accountType + ", firstName=" + firstName + ", lastName=" + lastName + ", balance=" + balance + "]";
	}
	
	
	
}
