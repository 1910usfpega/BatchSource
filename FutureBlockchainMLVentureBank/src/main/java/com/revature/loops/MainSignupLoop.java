package com.revature.loops;

import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.daoimpl.UserDaoImpl;
import com.revature.exceptions.UsernameAlreadyExistsException;
import com.revature.util.GlobalStorageSingletone;

public class MainSignupLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	public static UserDaoImpl udi = new UserDaoImpl();
	
	public static void start() {
		boolean signUpFlag = true;
		while (signUpFlag) {
			String login =  MainSignupLoop.getUsernameFromSC();
			String pass = MainSignupLoop.getPasswordFromSC();
			String firstname = MainSignupLoop.getFirstNameFromSC();
			String lastname = MainSignupLoop.getLastNameFromSC();
			
			try {
				Customer newCustomer = udi.createNewCustomer(login, pass, firstname, lastname);
				System.out.format("Welcome, %s %s\n", newCustomer.getFirstName(), newCustomer.getLastName());
				System.out.println("Now you can login with you login/pass");
				signUpFlag = false;
			} catch (UsernameAlreadyExistsException e) {
				System.out.println("\nUsername already exists. Try again!\n");
//				e.printStackTrace();
			}
		}
	}
	
	public static String getUsernameFromSC(){
		String contents;
		System.out.println("Input your new username:");
		contents = sc.nextLine().toLowerCase();
		return contents;

	}
	
	public static String getPasswordFromSC(){
		String contents;
		System.out.println("Input your new password:");
		contents = sc.nextLine();
		return contents;
		
	
	}
	
	public static String getFirstNameFromSC(){
		String contents;
		System.out.println("Input your first name:");
		contents = sc.nextLine();
		return contents;
		
	}
	
	public static String getLastNameFromSC(){
		String contents;
		System.out.println("Input your last name:");
		contents = sc.nextLine();
		return contents;
		
	}
}
