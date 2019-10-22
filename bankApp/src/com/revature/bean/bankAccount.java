package com.revature.bean;
import java.util.ArrayList;
import java.util.HashMap;

import com.revature.*;
import com.revature.bean.*;

public class bankAccount {
	double amount;
	final int ACCOUNTNUMBER;
	static HashMap<Integer, bankAccount> matchBankAccountNumber = new HashMap<>();
	public bankAccount(ArrayList <bankAccount>aa) {
		this.amount = 0;
		int temp =0;
		boolean opened = true;
		boolean go = true;
		while(opened) {
		 temp = (int)(Math.random()*10000000);
		while(go) {
			for(bankAccount a:aa) {
			if(temp == a.getAccountNumber()) {
				go = false;
			}}
			opened= false;
			go = false;
			}
		
		}
		this.ACCOUNTNUMBER = temp;
		matchBankAccountNumber.put(temp, this);
	}
	
	public boolean checkMoney(double money) {
		if(this.getBalance()>=  money)
			return true;
		return false;
	}
	
	public static bankAccount getBankAccount(Integer number) {
		bankAccount a = null;
		if(matchBankAccountNumber.containsKey(number)) {
			a  = matchBankAccountNumber.get(number);
		}
		return a;
	}
	public static boolean checkBankAccount(Integer number) {
		bankAccount a = null;
		if(matchBankAccountNumber.containsKey(number)) {
			return true;
		}
		return false;
	}
	
	public static boolean checkAccountExist(Integer a) {
		if(matchBankAccountNumber.containsKey(a))
			return true;
		return false;
	}

	
	
	
	public bankAccount() { // testing purposes only
		this.amount = 0;
		int temp =0;
		boolean opened = true;
		boolean go = true;
		this.ACCOUNTNUMBER = 1;
	}
	public boolean check(int a, ArrayList<bankAccount> aa) {
		boolean taken = true;
		for(bankAccount x: aa) {
			if(a == x.getAccountNumber())
				return taken;
		}
		return false;
	}
	
	public double deposit(double deposit) {
		this.amount = this.amount + deposit;
		return this.amount;
	}
	
	public boolean withdraw(double withdraw) {
		if(this.getBalance()>= withdraw) {
		this.amount = this.amount-withdraw;
		return true;
		}
		return false;
	}
	public boolean withdraw(double withdraw, bankAccount b) {
		if(b.getBalance()>= withdraw) {
		b.amount = b.amount-withdraw;
		return true;
		}
		return false;
	}
	
	public int getAccountNumber() {
		return this.ACCOUNTNUMBER;
	}
	
	public double getBalance() {
		return this.amount;
	}	
}

