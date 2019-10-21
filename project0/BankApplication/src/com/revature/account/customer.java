package com.revature.account;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.account.Account;

public class customer extends Account{
	
	public static void logIn() {
	ArrayList<Account> customer = new ArrayList<Account>(); 
	customer.add(new Account("Roman", "Ibba", 5555, "Zeus", 1000));
	customer.add(new Account("Steven", "McCanter", 2020, "Oden", 1000));
	
	
	
		System.out.println("Enter Last name and SSN ");
		Account the_one = null;
		boolean found = false;
		while(found == false) {
			Scanner c = new Scanner(System.in);
			String last = c.next();
			int ssn = c.nextInt();		
		
		for(int i = 0; i < customer.size(); i++) {
			
			if(customer.get(i).getLast().equals(last) && customer.get(i).getSsn() == ssn) {
				System.out.println(customer.get(i));				
				the_one = customer.get(i);
				found = true; 
				boolean cust = false;
				while(cust == false) {
					System.out.println("Enter 1 to withdraw, 2 to deposit ,3 to transfer funds or 4 to end transaction");
					Scanner n = new Scanner(System.in);
					int num = n.nextInt();
						if (num == 1) {
							System.out.println("Enter amount to withdraw: ");
							num = n.nextInt();
							customer.get(i).setWithdraw(num);
						}else if (num == 2) {
							System.out.println("Enter amout to deposit: ");
							num = n.nextInt();
							customer.get(i).setDeposit(num);
						}else if (num == 3) {
							System.out.println("Enter other customers Last name and SSN: ");
					
						}else if (num == 4) {
							cust = true;
						}else {
							System.out.println("Invalid entry");
						}
					}
				
				}
			}  
			if (the_one == null) {
				System.out.println("User not found, try again");
				System.out.println("Enter Last name and SSN");
				} 
		}
		
		
		
		
}
	public static void apply() {
	ArrayList<Account> customerApplication = new ArrayList<Account>();
	
		System.out.println("Enter First name, Last name, SSN and First deposit amount ");
		Scanner c = new Scanner(System.in);
		String first = c.next().toUpperCase();
		String last = c.next().toUpperCase();
		int ssn = c.nextInt();
		int deposit = c.nextInt(); 
		
		customerApplication.add(new Account(first, last, ssn, deposit));
		System.out.println("Your application successfully submitted!");
		System.out.println(customerApplication.get(0) + " First Deposit: " + deposit);
	}
	
	public static void join() {
		customers. 
	}
}