package com.revature.beans;

public class BankAccount {
	private String accountName;
	private Double balance;
	private String accountStatus;
	private Integer accountNumber;
	
	public BankAccount(String accountName, Double balance, String accountStatus, Integer accountNumber) {
		super();
		this.accountName = accountName;
		this.balance = balance;
		this.accountStatus = accountStatus;
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", balance=" 
				+ balance + ", accountStatus=" + accountStatus + ", accountNumber=" + accountNumber + "]";
	}
	
	
	
	
}
