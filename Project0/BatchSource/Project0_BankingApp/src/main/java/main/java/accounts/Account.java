package main.java.accounts;

import java.io.Serializable;

public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	private int accountType;
	private String username;
	private Double accountBalance;
	//Constructor
	public Account(int accountType, String username, Double accountBalance) {
		super();
		this.accountType = accountType;
		this.username = username;
		this.accountBalance = accountBalance;
	}
	//Custom Constructor
//	public Account(String username, Double accountBalance) {
//		super();
//		this.username = username;
//		this.accountBalance = accountBalance;
//	}
	//No-arg constructor
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public int getAccountType() {
		return accountType;
	}
	public void setAccountType(int accountType) {
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
		return "Account [Account Type = " + accountType + ", Username = " + username + ", Account Balance = " + accountBalance
				+ "]";
	}
	
}
