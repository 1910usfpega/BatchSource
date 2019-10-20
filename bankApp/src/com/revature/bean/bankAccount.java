package com.revature.bean;
import java.util.ArrayList;


public class bankAccount {
	double amount;
	final int ACCOUNTNUMBER;
	
	
	
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
	
	public boolean withdraw(double withdraw, bankAccount b) {
		if(b.getBalance()>= withdraw) {
		this.amount = this.amount-withdraw;
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

