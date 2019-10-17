package com.revature.people;

import com.revature.account.Account;
import com.revature.account.Transactions;

public class Employee extends Person{
	protected boolean admin_auth;
	
	public static Account main_bank = new Account("Bank", 10000);
	
	public Employee(String name, String password, int socialsecnum) {
		super(name, password, socialsecnum);
		// TODO Auto-generated constructor stub
		
	}
	
	// All employees are able to look at any Client's info or account info
	void look_at_persons_info(String name, Client[] clients){
		for(Client client : clients) {
			if (client.name == name){
				System.out.println(client.toString());
			}
		}
	}
	
	void look_at_persons_account_info(String name, Client[] clients) {
		for(Client client : clients) {
			if(client.name == name) {
				System.out.println(client.getAccount().toString());
			}
		}
	}
	

	// 
	
	public void withdraw(Client[] clients, String name, int value) {
		for(Client client : clients) {
			if(client.name == name) {
				client.getAccount().withdrawal(value);
			}
		}
		
	}

	public void deposit(Client[] clients, String name, int value) {
		for(Client client : clients) {
			if(client.name == name) {
				client.getAccount().deposit(value);
			}
		}
	}
	
	// Employees do not transfer to a member's account
	public void transferTo(Client[] clients, String name, int value) {
		// TODO Auto-generated method stub
		for(Client client : clients) {
			if(client.name == name) {
				main_bank.transferTo(value, client.getAccount());
			}
		}
		
	}

	public void transferFrom(Client[] clients, String name, int value) {
		// TODO Auto-generated method stub
		for(Client client : clients) {
			if(client.name == name) {
				if(client.name == name) {
					main_bank.transferFrom(value, client.getAccount());
				}
			}
		}
	}
}
