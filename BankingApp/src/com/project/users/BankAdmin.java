package com.project.users;

import java.util.ArrayList;

public class BankAdmin extends Employee{
	
	public boolean approval() {
		return true;
	}
	
	public boolean jointApproval(Customer a, Customer b,bankAccount c, ArrayList <bankAccount> d ) {
		System.out.print("Enter y or n");
		if(true) {
		if(cInfo.containsKey(a)) {
			if(cInfo.containsKey(b)) {
				if(d.contains(c)) {
					b.addBankAccount(c);
					return true;
				}
			}
		}}
		
		return false;
	}
	
	public void removeAccount(bankAccount a, Customer b) {
		removeAccount(a, b);
	}
}
