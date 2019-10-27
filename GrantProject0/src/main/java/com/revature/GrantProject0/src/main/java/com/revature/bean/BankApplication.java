package com.revature.bean;

import com.revature.daoimpl.BankDaoImpl;

public class BankApplication {
	private  double amount = 0;
	private int id;
	static BankDaoImpl adi = new BankDaoImpl();
	
	public BankApplication(double amount, int id) {
		super();
		this.amount = amount;
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BankApplication() {
		
	}
	 
	public boolean checkMoney(double amount) {
		if (this.getAmount()>= amount) 
			return true;
		return false;
	}
	
	
	public void withraw(double amount) {
		if (this.checkMoney(amount)) {
			this.setAmount(amount - this.getAmount() );
		}
	}
	public void deposit(double amount) {
			this.setAmount(amount + this.getAmount() );	
	}
}
