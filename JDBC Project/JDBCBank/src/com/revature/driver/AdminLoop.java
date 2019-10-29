package com.revature.driver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import com.revature.bean.Accounts;
import com.revature.bean.Users;
import com.revature.daoimpl.JDBCDaoImpl;

public class AdminLoop {
//Create AdminLoop that can do all functions as other loops plus delete Accts.
	public static void adminchoice(Scanner input) {
		JDBCDaoImpl jdi = new JDBCDaoImpl();

		System.out.println("Welcome to JDBC Bank!");
		String password = " ";
		String username = " ";
		String str1 = "";
		String str2 = "";
		do {
		System.out.println("Enter Your Username");
		str1 = input.next();
		System.out.println("Enter Your Password");
		str2 = input.next();
		Properties prop = new Properties();
		
		
		try {
			prop.load(new FileReader("database.properties"));
			username = prop.getProperty("adminusername");
			password = prop.getProperty("adminpassword");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Failed");
		}
	
		}while(str1.equals(username)==false && str2.equals(password)==false );
		
		boolean done = false;
		while (done == false) {

			System.out.println("Welcome Admin");
			System.out.println("Enter 1 to Create a New Account");
			System.out.println("Enter 2 for User Information");
			System.out.println("Enter 3 To Delete Accounts");
			System.out.println("Enter 4 to Exit");

			String choice = input.next();

			switch (choice) {
			case "1":
				System.out.println("Create New Account");
				UserLoop.newuserlogin();
				break;
			case "2":
				ArrayList<Users> ul = null;
				try {
					ul = jdi.getAllUsers();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (Users u : ul) {
					System.out.println("Username is " + u.getUsername());
					System.out.println("Password is " + u.getPassword());
				}
				break;
			case "3":
				System.out.println("What is the AccountID?");
				int a = input.nextInt();
				jdi.deleteAccount(a);
				System.out.println("Account deleted successfully!");
				break;
			case "4":
				System.out.println("Exit");
				done = true;
				System.exit(0);
				break;
			default:
				System.out.println("Please choose between 1-4");
			}
		}
	}
}
