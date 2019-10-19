package com.revature.driver;

import java.util.Date;
import java.util.Scanner;

import com.revature.bean.Customer;
import com.revature.bean.Login;
import com.revature.bean.LoginException;
import com.revature.bean.User;
import com.revature.io.IOWithCollections;

public class Driver {
	public static Scanner sc = new Scanner(System.in);
	public static User currentUser = null;

	public static void main(String[] args) {
		
		IOWithCollections.readUserFile();
		currentUser = Login.loginProcess(IOWithCollections.usersList);
		currentUser.showMenu();
//		System.out.println("Successfull login: " + currentUser.getClass().getName());

//		
//		Date dateOfB = new Date();
//		Customer c1 = new Customer("Iskandar", "Bakhtizin", dateOfB, true, "iskandar", "pass");
//		IOWithCollections.usersList.add(c1);
//		
		
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
