package com.revature.bankapplication;

import java.util.Scanner;

import java.util.ArrayList;
import com.revature.account.Account;

public class ScannerMain {		
	
	public void findCustomer(){
		
	}
	
	
	public static void main(String[] args) {
	
	//Create an ArrayList of Customers
	ArrayList<Account> customer = new ArrayList<Account>(); 
	customer.add(new Account("Roman", "Ibba", 5555, "Zeus"));	
	customer.add(new Account("Steven", "McCanter", 2020, "Oden"));
	
	//Allows to log in as Customer, Employee or Admin
	System.out.println("Enter 1 for Customer, 2 for Employee or 3 for Admin");
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	if(num == 1) {
		System.out.println("Welcome Valued Customer!");
	}else if (num == 2) {
		System.out.println("Welcome Employee!");
	}else if (num == 3) {
		System.out.println("Welcome Admin!");
	}else {
		System.out.println("Entered an incorect number");
	}	
	
	//Finds Customer info based on Last name and SSN
	System.out.println("Enter Last name and SSN ");
	Scanner c = new Scanner(System.in);
	String last = c.next();
	int ssn = c.nextInt();
	
	for(int i = 0; i < customer.size(); i++) {
		
		if(customer.get(i).getLast().equals(last) || customer.get(i).getSsn() == ssn) {
			System.out.println(customer.get(i));
		}		 
	}
	}
	
}

