package com.revature.beans;

import java.io.Serializable;
import java.util.ArrayList;

import com.revature.exceptions.NotEnoughFundsException;
import com.revature.util.CheckDatabase;

public class AccountBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2320503989427815506L;
	private int accountNumber;
	private String accountType;
	private double accountBalance;
	private ArrayList<String> users = new ArrayList<String>();

	public AccountBean() {

	}

	public AccountBean(int accountnum, String accountType, ArrayList<String> users) {
		super();
		this.accountNumber = accountnum;
		this.accountType = accountType;
		this.accountBalance = 0;
		this.users = users;
	}

	public AccountBean(int accountnum, String accountType, String... user) {
		super();
		this.accountNumber = accountnum;
		this.accountType = accountType;
		this.accountBalance = 0;
		for (String x : user) {
			this.users.add(x);
		}
	}

	public AccountBean(String accountType, String... user) {
		super();
		this.accountNumber = (int) (Math.random() * 1000000000);
		while (CheckDatabase.acctNumAlreadyUsed(this.accountNumber)
				|| CheckDatabase.openAcctNumAlreadyUsed(this.accountNumber)) {
			this.accountNumber = (int) (Math.random() * 1000000000);
		}
		this.accountType = accountType;
		this.accountBalance = 0;
		for (String x : user) {
			this.users.add(x);
		}
	}

	public AccountBean(String accountType, ArrayList<String> users) {
		super();
		this.accountNumber = (int) (Math.random() * 1000000000);
		while (CheckDatabase.acctNumAlreadyUsed(this.accountNumber)
				|| CheckDatabase.openAcctNumAlreadyUsed(this.accountNumber)) {
			this.accountNumber = (int) (Math.random() * 1000000000);
		}
		this.accountType = accountType;
		this.accountBalance = 0;
		this.users = users;
	}

	public AccountBean(int accountNumber, String accountType, double accountBalance, ArrayList<String> user) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.users = user;
	}

	public AccountBean(int accountNumber, String accountType, double accountBalance, String... user) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		for (String x : user) {
			this.users.add(x);
		}
	}

	public void addUser(String user) {
		this.users.add(user);
	}

	public ArrayList<String> getUsers() {
		return this.users;
	}

	public void setUsers(ArrayList<String> users) {
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

	public double withdraw(double amount) throws NotEnoughFundsException {
		if (amount > accountBalance) {
			throw new NotEnoughFundsException(amount + " is more than this account contains.");
		}
		accountBalance -= amount;
		return accountBalance;
	}

	public double deposit(double amount) {
		accountBalance += amount;
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
