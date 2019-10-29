package com.revature.util;

import com.revature.beans.BankAccount;
import com.revature.beans.Customer;

public class AccountInfo {
	private BankAccount bankAccount= null;
	private Customer customer = null;
	
	public AccountInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountInfo(BankAccount bankAccount, Customer customer) {
		super();
		this.bankAccount = bankAccount;
		this.customer = customer;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
