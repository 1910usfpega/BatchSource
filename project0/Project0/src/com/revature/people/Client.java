package com.revature.people;

import com.revature.account.Account;
import com.revature.account.Transactions;

public class Client extends Person implements Transactions{
	private int credit;
	private int amount;
	private Account your_account;
	private boolean premium_member = false;
	
	public Client(String name, String password, int socialsecnum, int credit, int i_amount) {
		super(name, password, socialsecnum);
		// TODO Auto-generated constructor stub
		this.credit = credit;
		this.amount = i_amount;
		if(i_amount >= 100000) {
			premium_member = true;
		}
		
		your_account = new Account(name, amount);
	}
	
	public boolean isPremium() {
		return premium_member;
	}
	
	public Account getAccount(){
		return your_account;
	}
	
	@Override
	public void withdraw(int value) {
		// TODO Auto-generated method stub
		your_account.withdrawal(value);
	}

	@Override
	public void deposit(int value) {
		// TODO Auto-generated method stub
		your_account.deposit(value);
	}

	@Override
	public void transferTo(Account theirs, int value) {
		// TODO Auto-generated method stub
		your_account.transferTo(value, theirs);
	}

	@Override
	public void transferFrom(Account theirs, int value) {
		// TODO Auto-generated method stub
		your_account.transferFrom(value, theirs);
	}

	@Override
	public String toString() {
		return "Client [credit=" + credit + ", amount=" + amount + ", your_account=" + your_account
				+ ", premium_member=" + premium_member + "]";
	}
}