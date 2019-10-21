package com.revature.bankapplication;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import com.revature.account.Account;
import com.revature.account.Customer;

public class ScannerMain {
//	
//	public static void findCustomer(){
//		
//		ArrayList<Account> customer = new ArrayList<Account>(); 
////		customer.add(new Account("Roman", "Ibba", 5555, "Zeus", 1000));
////		customer.add(new Account("Steven", "McCanter", 2020, "Oden", 1000));
//		
//		String strin = "";
//		try {
//			InputStream in = new FileInputStream(new File("Customer.txt"));
//			int str;
//
//			while ((str = in.read()) != -1) {
//				char let = (char ) str;
//				strin += let;}
//			in.close();
//		} catch (IOException e) {
//		}
//		
//		String[] customers = strin.split("\n");
//		
//		for(String n: customers) {
//			String[] info = n.split(":");
//			String first = info[0];
//			String last = info[1];
//			int ssn = Integer.parseInt(info[2]);
//			String employee = info[3];
//			double balance = Double.parseDouble(info[4]); 
//			int account = Integer.parseInt(info[5]);
//			customer.add(new Account(first, last, ssn, employee, balance, account));
//		}
//		System.out.println(customer.toString());
//		
//	}

	public static void main(String[] args) {

		// ScannerMain.findCustomer();

		// Allows to log in as Customer, Employee or Admin
		System.out.println("Enter 1 for Customer, 2 for Employee or 3 for Admin");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (num == 1) {
			System.out.println("Welcome Valued Customer!");
			System.out.println("Enter 1 to log in, 2 to apply for an account or 3 to join two existing accounts.");
			int n = in.nextInt();
			if (n == 1) {
				Customer.logIn();
			}
			if (n == 2) {
				Customer.apply();
			}
			if (n == 3) {
				Customer.join();
			}
		} else if (num == 2) {
			System.out.println("Welcome Employee!");
		} else if (num == 3) {
			System.out.println("Welcome Admin!");
		} else {
			System.out.println("Entered an incorect number, restart application and try again.");
		}

	}
}
