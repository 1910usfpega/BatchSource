package com.project0.accounts;

public final class CheckingAccount extends Account {


	double overDraftFee;

	public double getOverDraftFee() {
		return this.overDraftFee;
	}

	public void setOverDraftFee(double overDraftFee) {
		this.overDraftFee = overDraftFee;
	}

	//no-arg constructor
	public CheckingAccount() {
		this.accountType = "Checking Account";
		// TODO: assign default values to your other fields
		this.firstName = "John";
	}

	//constructor that takes in arguments 
	public CheckingAccount(String accountID, String firstName, String lastName) {
		this.accountID = accountID;
		this.firstName = firstName;
		this.lastName = lastName;
		// TODO: assign default values (you can decide these)
		//to variables that don't correspond to the parameters 
	}

	// to initialize objects
	public CheckingAccount(double overDraftFee, double balance,
			String accountID, String firstName, String lastName,
			String accountType) {
		// CORRECT this is what your are doing :)  
		// using parameters to set the fields of my class this.field =
		// (the assignment operator) input parameter
		this.overDraftFee = overDraftFee;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = balance;
		this.accountType = accountType;
	}

	@Override
	public AccountManager getAccountManager() {
		return new CheckingAccountManager(this);
	}

	@Override
	public String toString() {
		return ("accountType:" + accountType + "accountID:" + accountID + "firstName:" + firstName
				+ "lastName:" + lastName + "balance:" + balance + "overDraftFee:" + overDraftFee);
	}

}
