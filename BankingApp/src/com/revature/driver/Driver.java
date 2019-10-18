package com.revature.driver;

import java.util.Scanner;

import com.revature.bean.LoginException;
import com.revature.bean.User;
import com.revature.io.IOWithCollections;

public class Driver {
	public static Scanner sc = new Scanner(System.in);
	public static User currentUser;

	public static void main(String[] args) {
		
		IOWithCollections.readUserFile();
		
		
		String login = "username1";
		String pass = "pass1";
		
		try {
			currentUser = User.login(login, pass, IOWithCollections.usersList);
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Successfull login: " + currentUser.getUsername());
		
		
		
		
		
		
//		User u1 = new User("username1", "pass", "customer");
//		User u2 = new User("username2", "pass", "customer");
//		User u3 = new User("username3", "pass", "customer");
//		
//		IOWithCollections.usersList.add(u1);
//		IOWithCollections.usersList.add(u2);
//		IOWithCollections.usersList.add(u3);
//		
//		IOWithCollections.writeUserFile();
//		 TODO Auto-generated method stub
		
		// Read Customers, Accounts and Transactions from file
		
		
		// Check if we already logged in
		
		
		
		
		
//		String contents = null;
//		System.out.println("What would you like to do?\nLogin press 1\nLogon press 2");
//		System.out.println(sc.hasNextInt());
//		//(contents = sc.nextInt()) !=0
//		while ((contents = sc.nextLine())!= null) {
//			if (contents.equals("1") || contents.equals("2")) {
//				break;
//			} else {
//				System.out.println("Input 1 or 2");
//			}
//		} 
//		
//		
//		if (contents.equals("1")) {
//			System.out.println("Start Login process");
//		} else if (contents.equals("2")) {
//			System.out.println("Start Logon process");
//		}

		
	}

}
