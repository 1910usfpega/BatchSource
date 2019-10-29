package com.revature.bean;

import java.io.Serializable;

public class Employee extends Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1633280756907706861L;

	public Employee(int PERSON_ID, String name, String last, String username, String password) {
		super(PERSON_ID, name, last, username, password);
		// TODO Auto-generated constructor stub
	}

	// View user-name and name
	public void viewPersonal(Customer client) {
		System.out.println("Name: " + client.getFirst() + client.getLast() + " : Username " + client.getUsername());
	}
		
	public void viewAccount(Customer client) {
		for(BankAccount bank : client.all_accounts()) {
			System.out.print(bank.getAccountNumber());
			bank.info();
			
		}
	}
}
