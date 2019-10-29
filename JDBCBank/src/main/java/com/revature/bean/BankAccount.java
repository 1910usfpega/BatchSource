package com.revature.bean;

import java.util.ArrayList;
import java.util.HashMap;

import com.revature.driver.ScannerMain;

public class BankAccount {
	private int Bank_Account_ID;
	private String first;
	private String last;
	private double amount;
	private int owner_id;
	int ACCOUNTNUMBER;
	static HashMap<Integer, BankAccount> matchBankAccountNumber = new HashMap<Integer, BankAccount>();
	
	
	public BankAccount( String first, String last, double amount, int ownler_id) {
		this.first = first;
		this.last = last;
		this.amount = amount;
		this.owner_id = owner_id;
		
		int temp = 0;
		boolean opened = true;
		boolean go = true;
		while(opened) {
			temp = (int)(Math.random() * 1000000);
			while(go) {
				for(BankAccount bank : ScannerMain.all_accounts) {
					if(temp == bank.getAccountNumber()) {
						go = false;
					}
				}
				opened = false;
				go = false;
			}
			this.ACCOUNTNUMBER = temp;
			matchBankAccountNumber.put(temp, this);
		}
	}

	public boolean has_the_money(double withdraw) {
		if(amount > withdraw) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void withdraw(double withdraw) {
		if(has_the_money(amount)) {
			amount = amount - withdraw;
			System.out.println("$ " + withdraw + " withdrawn. You now have $" + amount + " left in this account.");
		}
		else {
			throw new ArithmeticException("This customer's account does not have the money to withdraw");
		}
	}
	
	public void deposit(double deposit) {
		amount = amount + deposit;
		System.out.println("$ " + deposit + " deposited. You now have $" + amount + " in this account.");
	}
	
	public void transfer_to(BankAccount other, double transfer) {
		if(this.has_the_money(transfer)) {
			this.withdraw(transfer);
			other.deposit(transfer);
		}
		else {
			throw new ArithmeticException("This customer's account does not have the money to withdraw");
		}
	}
	
	public int getAccountNumber() {
		return this.ACCOUNTNUMBER;
	}
	
	public double getBalance() {
		return amount;
	}
	
	public void info() {
		System.out.println("This account has $" + amount + " and is owned by " + first + " " + last + ".");
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public static HashMap<Integer, BankAccount> getMatchBankAccountNumber() {
		return matchBankAccountNumber;
	}

	public static void setMatchBankAccountNumber(HashMap<Integer, BankAccount> matchBankAccountNumber) {
		BankAccount.matchBankAccountNumber = matchBankAccountNumber;
	}

	public int getACCOUNTNUMBER() {
		return ACCOUNTNUMBER;
	}

	
}
