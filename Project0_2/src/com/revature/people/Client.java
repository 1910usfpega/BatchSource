package com.revature.people;

import java.util.ArrayList;

import com.revature.account.Account;
import com.revature.account.Transactions;

public class Client extends Person{
	private double amount;
	private String employee;
	private Account your_account;
	
	public Client(String first, String last, String password, int socialsecnum, String employee, double i_amount, ArrayList<Account> banks) {
		super(first, last, password, socialsecnum);
		// TODO Auto-generated constructor stu
		this.amount = i_amount;
		this.employee = employee;
		your_account = new Account((first + last), i_amount);
		banks.add(your_account);
	}

	public int getSsn() {
		// TODO Auto-generated method stub
		return socialsecnum;
	}

	public Object getLast() {
		// TODO Auto-generated method stub
		return last;
	}
}