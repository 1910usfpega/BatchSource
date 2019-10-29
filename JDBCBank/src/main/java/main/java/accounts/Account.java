package main.java.accounts;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = -6222345555992770377L;
	private String accountType;
	private String username;
	private Double accountBalance;
	//Constructor
	public Account(String accountType, String username, Double accountBalance) {
		this.accountType = accountType;
		this.username = username;
		this.accountBalance = accountBalance;
	}
	//No-arg constructor
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", username=" + username + ", accountBalance=" + accountBalance
				+ "]";
	}
	
}
