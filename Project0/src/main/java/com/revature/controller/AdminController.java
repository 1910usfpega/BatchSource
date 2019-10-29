package com.revature.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.revature.daoimpl.AccountDaoImpl;
import com.revature.daoimpl.UserDaoImpl;
import com.revature.model.Admin;
import com.revature.model.User;
import com.revature.util.ConnFactory;

public class AdminController {
	
	public static ConnFactory cf = ConnFactory.getInstance();
	
	Admin admin = new Admin();
	
	public static void adminSession(Scanner scan) throws SQLException {
		//generate date and current time
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		//System.out.println(formatter.format(date));
		
		//stores users for admin session
		List<User> usersList = new ArrayList<User>();
		
		User user = new User();
		
		AccountDaoImpl adi = new AccountDaoImpl();
		UserDaoImpl udi = new UserDaoImpl();
		
		Connection conn = cf.getConnection();
		
		System.out.println("Welcome Admin " + formatter.format(date));
		
		String username, password;
		
		System.out.println("Enter your username: ");
		username = scan.nextLine();
		
		Properties pro = new Properties();
		
		try {
			pro.load(new FileReader("admin.properties"));
			if (username.equals(pro.getProperty("adminUsername"))) {
				System.out.println("Enter your password: ");
				
				password = scan.nextLine();
				
				if (password.equals(pro.getProperty("adminPassword"))) {
					System.out.println("welcome Admin: ");
					
					
				} else {
					System.out.println("Wrong passowrd, try again.");
				}
			} else {
				System.out.println("Incorrect username, try again");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("1.) to view users");
		System.out.println("2.) to create a new user");
		System.out.println("3.) to delete users");
		System.out.println("4.) to update users");
		System.out.println("5.)  to Log Out");
	
		
		int choice = scan.nextInt();
		
		switch(choice) {
		
		case 1:
			try {
			for (int i=0; i <= udi.getUsers().size(); i++) {
				System.out.println(udi.getUsers().get(i));
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
			
		case 2: 
			String user_username, user_password, firstName, lastName;
			
			System.out.println("enter a username: ");
			user_username = scan.nextLine();
			
			while (udi.doesUsernameMatch(user_username)) {
				System.out.println("username already in use, try again: ");
				user_username = scan.nextLine();
			}
			
			user.setUsername(user_username);
			
			System.out.println("Enter your secret password: ");
			user_password = scan.nextLine();
			user.setPassword(user_password);
			
			System.out.println("Enter your first name: ");
			firstName = scan.nextLine();
			user.setFirstName(firstName);
			System.out.println("Enter your last name: ");
			lastName = scan.nextLine();
			user.setLastName(lastName);
			
			udi.createUser(user);
			
			System.out.println(udi.getUsers());
			
			break;
			
		case 3: 
			System.out.println("Enter the username for the account you wish to delete: ");
			String usernameToDelete = scan.nextLine();
			User u = udi.getUserByUsername(usernameToDelete);
			udi.deleteUser(u);
			System.out.println("User deleted");
			break;
			
		case 4: 
			System.out.println("enter username for account you wish to update: ");
			String usernameAcctUpdate = scan.nextLine();
			System.out.println("1.) to update username \n 2.) to update password \n 3.) to update first name \n 4.) to update last name:");
			int updateChoice = scan.nextInt();
			
			if (updateChoice==1) {
				System.out.println("enter a new username: ");
				String newUsername = scan.nextLine();
				 u = udi.getUserByUsername(usernameAcctUpdate);
				udi.updateUsername(newUsername, usernameAcctUpdate);
				System.out.println(u.toString());
			} else if (updateChoice==2) {
				System.out.println(udi.getUsers().toString()+"\n");
				System.out.println("enter the username of the user: ");
				String uname = scan.nextLine();
				u = udi.getUserByUsername(uname);
				System.out.println("enter a new password: ");
				String newPassword = scan.nextLine();
				udi.updatePassword(newPassword, uname);
				System.out.println(u.toString());
			} else if (updateChoice==3) {
				System.out.println(udi.getUsers().toString()+"\n");
				System.out.println("enter the username of an user to update: ");
				String uname = scan.nextLine();
				u = udi.getUserByUsername(uname);
				System.out.println("enter a new first name for the user: ");
				String newFirstName = scan.nextLine();
				udi.updateFirstName(newFirstName, uname);
				System.out.println(u.toString());
				
			} else if (updateChoice==4) {
				System.out.println(udi.getUsers().toString()+"\n");
				System.out.println("enter the username of an user to update: ");
				String uname = scan.nextLine();
				u = udi.getUserByUsername(uname);
				System.out.println("enter a new last name for the user: ");
				String newLastName = scan.nextLine();
				udi.updateFirstName(newLastName, uname);
				System.out.println(u.toString());
			}
			break;
			
			case 5: 
				System.out.println("Thank you for working on behalf of us.");
				break;
		}

		
		
	}

}
