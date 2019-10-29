package com.jdbc.bank.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class Account {
	
	private boolean accType;
	private double balance;
	private double accID;
	private String fullName;
	
	
	public Account() {
		super();
	}


	public Account(boolean accType, double balance, double accID, String fullName) {
		super();
		this.accType = accType;
		this.balance = balance;
		this.accID = accID;
		this.fullName = fullName;
	}

	static HashMap<String, Double> accInfo = new HashMap<String, Double>();
	static ArrayList <Account> bankAccounts =  new ArrayList<>();
	
    //   GETTERS   //
	public boolean isAccType() {
		return accType;
	}

	public double getBalance() {
		return balance;
	}


	public double getAccID() {
		return accID;
	}


	public String getFullName() {
		return fullName;
	}
	
    //    SETTERS    //
	public void setAccType(boolean accType) {
		this.accType = accType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void setAccID(double accID) {
		this.accID = accID;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	

	@Override
	public String toString() {
		return "Account [accType=" + accType + ", balance=" + balance + ", accID=" + accID + ", fullName=" + fullName
				+ "]";
	}
	
	
}
