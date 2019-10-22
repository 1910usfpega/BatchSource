package com.revature.user;

import java.io.Serializable;
import java.util.ArrayList;

import com.revature.storage.Bank;

public class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2320503989427815506L;
	private int accountNumber;
	private String accountType;
	private double accountBalance;
	private ArrayList<Customer> users=new ArrayList<Customer>();
	
	public Account() {
		
	}
	
	public Account(Bank bank,String accountType, Customer ... user) {
		super();
		this.accountNumber=(int)(Math.random()*1000000000);
		while(bank.acctNumAlreadyUsed(this.accountNumber) || bank.openAcctNumAlreadyUsed(this.accountNumber)) {
			this.accountNumber=(int)(Math.random()*1000000000);
		}
		this.accountType = accountType;
		this.accountBalance = 0;
		for (Customer x:user) {
			this.users.add(x);
		}
	}
	
	public Account(Bank bank,String accountType, ArrayList<Customer> users) {
		super();
		this.accountNumber=(int)(Math.random()*1000000000);
		while(bank.acctNumAlreadyUsed(this.accountNumber) || bank.openAcctNumAlreadyUsed(this.accountNumber)) {
			this.accountNumber=(int)(Math.random()*1000000000);
		}
		this.accountType = accountType;
		this.accountBalance = 0;
		this.users=users;
	}
	
	public Account(int accountNumber,String accountType,double accountBalance, Customer ... user) {
		super();
		this.accountNumber=accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		for (Customer x:user) {
			this.users.add(x);
		}
	}
	
	public void addUser(Customer user) {
		this.users.add(user);
	}
	
	
	
	public ArrayList<Customer> getUsers() {
		return this.users;
	}
	public void setUsers(ArrayList<Customer> users) {
		this.users = users;
	}


	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	

	public double withdraw(double amount) {
		accountBalance-=amount;
		return accountBalance;
	}
	
	public double deposit(double amount) {
		accountBalance+=amount;
		return accountBalance;
	}
	




	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountBalance="
				+ accountBalance + ", users=" + users + "]";
	}



	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	


}
