package com.revature.bankapplication;

import java.util.Scanner;

import java.util.ArrayList;
import com.revature.account.Account;
import com.revature.account.customer;

public class ScannerMain {		
	
	public void findCustomer(){
		
	}
	
	
	public static void main(String[] args) {

	//Allows to log in as Customer, Employee or Admin
	System.out.println("Enter 1 for Customer, 2 for Employee or 3 for Admin");
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	if(num == 1) {
		System.out.println("Welcome Valued Customer!");
		System.out.println("Enter 1 to log in, 2 to apply for an account or 3 to join an account.");
			int n = in.nextInt();
			if (n==1) {customer.logIn();} 
			if (n==2) {customer.apply();}
			if (n==3) {customer.join();} 
	}else if (num == 2) {
		System.out.println("Welcome Employee!");
	}else if (num == 3) {
		System.out.println("Welcome Admin!");
	}else {
		System.out.println("Entered an incorect number, restart application and try again.");
	}	
	

	
}
}

