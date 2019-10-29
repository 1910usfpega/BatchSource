package com.revature.loops;

import java.util.Scanner;

import com.revature.daoimpl.UserDaoImpl;
import com.revature.exceptions.UsernameAlreadyExistsException;
import com.revature.util.GlobalStorageSingletone;

public class AdminCreateCustomerLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	
	public static void start() {
		System.out.println("CREATE NEW CUSTOMER");
		String login =  MainSignupLoop.getUsernameFromSC();
		String pass = MainSignupLoop.getPasswordFromSC();
		String firstname = MainSignupLoop.getFirstNameFromSC();
		String lastname = MainSignupLoop.getLastNameFromSC();
		
		UserDaoImpl udi = new UserDaoImpl();
		try {
			udi.createNewCustomer(login, pass, firstname, lastname);
		} catch (UsernameAlreadyExistsException e) {
			System.out.println("\nUsername already exists!\n");
		}
	}
	
	
	public static String getUserTypeFromSC(){
		String contents;
		do {
			System.out.println("Choose usertype:");
			System.out.println("1. Customer");
			System.out.println("2. Employee");
			System.out.println("Input number:");
			contents = sc.nextLine().toLowerCase();
		} while (!contents.equals("1") || !contents.equals("2"));
		
		if (contents.equals("1")) {
			return "customer";
		} else {
			return "employee";
		}

	}

}
