package com.revature.account;

public class Account {
	int id;
	String owner;
	int amount;
	
	public static int num_of_accounts = 0;
	
	public Account(String owner, int amount) {
		this.owner = owner;
		this.amount = amount;
		
		num_of_accounts++;
		this.id = num_of_accounts;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", owner=" + owner + ", amount=" + amount + "]";
	}

	public Account() {
		
	}
	
	public void transferTo(int transferred, Account other) {
		if (transferred <= this.amount) {
			other.amount += transferred;
			this.amount -= transferred;
		}
		else {
			System.out.println("You do not have this money to transfer.");
		}
	}
	
	public void transferFrom(int transferred, Account other) {
		if(transferred <= other.amount) {
			other.amount -= transferred;
			this.amount += transferred;
		}
		else {
			System.out.println("This account holder does not have this money to transfer to you.");
		}
	}
	
	public void deposit(int transferred){
		amount += transferred;
	}
	
	public void withdrawal(int transferred) {
		if(amount <= transferred) {
			amount -= transferred;
		}
		else {
			System.out.println("This account has no value");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}