package com.revature.bean;

import java.util.ArrayList;
import java.util.HashMap;

public class bankAdmin extends Employee{
	
	public bankAdmin(String name, String last, String username, String password) {
		super(name, last, username, password);
	}

	public boolean approvalNewAccount(Customer a) {
			boolean approve = false;
				if(pending.contains(a)) {//check
			// scanner here
					System.out.println(a.getName() +" "+a.getUsername()+
					"wants a new account! y or n");
					if(approve) {
						a.addBankAccount();
						return true;
									}}
		return false;
	}
	
	public boolean jointApproval(Customer a, bankAccount c ) {
		if(!list.isEmpty()) {
			if(pendingJoint.containsKey(a)) {
				if(bankAccounts.contains(c)) {
					boolean approve = false;
					// scanner here
					System.out.println(a.getName() +" "+a.getUsername()+
					"wants get a joint account! y or n");
					if(approve) {
						a.addBankAccount(c);
						return true;
					}	}	}	}
		
		return false;
	}
	
	public ArrayList<Customer> jPending() {
		if(!pending2.isEmpty()) {
			Customer dCustomer = pending.get(0);
			HashMap<Customer, bankAccount> sCustomer = Person.joint();
			bankAccount toAdd = sCustomer.get(dCustomer);
			dCustomer.addBankAccount(toAdd);
		}
	
		return null;
	}
	
	public void removeAccount(bankAccount a, Customer b) {
		removeAccount(a, b);
	}
}
