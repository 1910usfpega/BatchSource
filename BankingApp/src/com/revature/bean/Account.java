package com.revature.bean;

public class Account {
	private String accountName;
	private Double balance;
	private String ownerUsername;
	private String accountStatus;
	private Integer accountNumber;
	
	public Account(String accountName, Double balance, String ownerUsername, String accountStatus,
			Integer accountNumber) {
		super();
		this.accountName = accountName;
		this.balance = balance;
		this.ownerUsername = ownerUsername;
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

	public String getOwnerUsername() {
		return ownerUsername;
	}

	public void setOwnerUsername(String ownerUsername) {
		this.ownerUsername = ownerUsername;
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
		return "Account [accountName=" + accountName + ", balance=" + balance + ", ownerUsername=" + ownerUsername
				+ ", accountStatus=" + accountStatus + ", accountNumber=" + accountNumber + "]";
	}

	
	
}
