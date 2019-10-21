package com.revature.driver;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.bean.Customer;
import com.revature.bean.Person;
import com.revature.bean.bankAccount;

public class Driver {
	static Scanner myObj = new Scanner(System.in);
	static String username ="";
	static Customer user =null;
public static void main(String [] args) {
	Customer a = new Customer("Ryan","Crnich","Ryancrnich","123");
	a.addBankAccount();
	bankAccount[] aa =a.allAccounts(a);
	for(bankAccount aaa:aa) {
		System.out.print(aaa.getAccountNumber() +" ");
		aaa.deposit(200);
		aaa.withdraw(20, aaa);
		
		System.out.println(aaa.getBalance());
	}

	
	
	
	
	
	
	
	
	
	System.out.println("Enter options");
	System.out.println("1: login");
	System.out.println("2: new account");
	    int choose = myObj.nextInt();
	    boolean valid= false;// valid input
	    
	    while(!valid) {
	    	try {
	    	choose = myObj.nextInt();}
	    	catch(InputMismatchException e) {
	    		System.out.print("enter only numbers please");
	    	}
	    	if(choose == 1) {
	    		System.out.print("enter username");
	    		username = myObj.next();	    
	    		System.out.print("enter password");
	    		String pw = myObj.next();
	    		boolean login =Person.login(username, pw);
	    		if(login) {
	    			while(true) {
	    			System.out.print("welcome"+ user.getName());
	    			System.out.println("Enter options");
	    			System.out.println("1: view accounts");
	    			user.viewAccount();
	    			System.out.println("2: new bank account");
	    			user.addBankAccount();
	    			System.out.println("3: get existing account");
	    			user.addBankAccount(c);
	    			System.out.println("4: get balance");
	    			System.out.println("5: new jointAccount");
	    			System.out.println("6: transfer");
	    		}}
	    		else {
	    			System.out.print("Wrong info please try again");
	    		}
	    	}
	    	
	    	
	    	
	    	else if(choose == 2) { 
	    		System.out.print("enter username");
	    		String name = myObj.next();	    
	    		System.out.print("enter password");
	    		String last = myObj.next();
	    		System.out.print("enter username");
	    		username = myObj.next();	    
	    		System.out.print("enter password");
	    		String pw = myObj.next();
	    		 user = new Customer(name,last,"",pw);
	   
	    	}
	    	
	    	
	    	
	    	
	    	else {
	    		System.out.print("enter vaild option");
	    	}
	    				
	    }
	
}
}
