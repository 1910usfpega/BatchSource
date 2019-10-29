package com.jdbc.bank.people;

import java.text.DateFormat;
import java.util.Scanner;

import com.jdbc.bank.bean.User;

public class Customer extends User {
	
public static Scanner sc = new Scanner(System.in);

	public Customer() {
		super();
	}

	public Customer(String uName, double password, DateFormat dateOfBirth,
			String firstName, String lastName,
			String email, String address, String phoneNumber) {
		super(uName, password, dateOfBirth, firstName, lastName, email, address, phoneNumber);
	}
	
	public static void LogIn(Scanner input) {
	    String day = input.nextInt();
	    // ...
	    String month = input.nextLine();
	    // ... and so on
	}
	
	 System.out.println("Welcome to the JDBC Bank App!");
	 
		
		System.out.println("What is your username?");
		user= in.next();

		//seeing if the username is the same from 
		if(uName.equals(getuName())) {
			System.out.println("Please enter the passward associated with this account.");
			password = in.next();
			//will convert this to hash code later
			if (getPassword().equals(getPassword())) {
				System.out.println("Welcome to your bank vault!");
			
			} else {
				System.out.println("You have enter an in-valid entry! /n Re-enter your password:");
			}
			
		}	
}

