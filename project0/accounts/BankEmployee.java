package com.project0.accounts;

public class BankEmployee extends Customer {

	protected String accountInfo;
	protected double balance;
	protected String customerPersonalInfo;

	public BankEmployee(String accountInfo, double balance, String personalInfo) {
		super();
		this.accountInfo = accountInfo;
		this.balance = balance;
		this.customerPersonalInfo = personalInfo;
	}

	public String getAccountInfo() {
		return accountInfo;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomerPersonalInfo() {
		return customerPersonalInfo;
	}

	public void setAccountInfo(String accountInfo) {
		this.accountInfo = accountInfo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setCustomerPersonalInfo(String customerPersonalInfo) {
		this.customerPersonalInfo = customerPersonalInfo;
	}

	protected void viewAccount() {

	}

	protected void approveAccount() {

	}

	protected void denyAccount() {

	}

}
