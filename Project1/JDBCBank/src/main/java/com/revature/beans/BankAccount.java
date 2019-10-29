package com.revature.beans;

import java.sql.SQLException;

import com.revature.daoImpl.BankAccountDaoImpl;

public class BankAccount {
	
	private int account_num;
	private double balance;
	private String user;

	public BankAccount() {
		super();
	}//End of no-arg constructor

	public BankAccount(int account_num, double balance, String user) {
		super();
		this.account_num = account_num;
		this.balance = balance;
		this.user = user;
	}//End of full arg constructor

	public int getAccount_num() {
		return account_num;
	}//End of getter getAccount_num

	public void setAccount_num(int account_num) {
		this.account_num = account_num;
	}//End of setter setAccount_num

	public double getBalance() {
		return balance;
	}//End of getter getBalance

	public void setBalance(double balance) {
		this.balance = balance;
	}//End of setter setBalance
	
	public String getUser() {
		return user;
	}//End of getter getUser

	public void setUser(String user) {
		this.user = user;
	}//End of setter setUser
	
	@Override
	public String toString() {
		return "BankAccount [account_num=" + account_num + ", balance=" + balance + "]";
	}//End of method toString

	public void withdraw(double money) {
		if(this.balance >= money) {
			this.balance -= money;
		}
	}//End of method withdraw
	
	public void deposit(double money) {
		this.balance += money;
	}//End of method deposit
	
	public void transfer(BankAccount a, double money) {
		if(this.balance >= money && a.exists()) {
		this.withdraw(money);
		a.deposit(money);
		}
	}//End of method transfer

	public boolean exists() {
		//Connect to the database and pull all bank accounts. If the list contains the current account
		BankAccountDaoImpl badi = new BankAccountDaoImpl();
		BankAccount account = null;
		System.out.println("Validating transfer account...");
		try {
			account = badi.getBankAccountByNum(this.account_num);
			if(this.equals(account)) {
				System.out.println("Validation successful! Beginning transfer...");
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Could not connect to the database and receive account list.");
		}
		return false;
	}//End of method exists
	
}//End of Class BankAccount