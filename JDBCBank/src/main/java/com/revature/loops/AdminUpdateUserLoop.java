package com.revature.loops;

import java.util.Scanner;

import com.revature.beans.User;
import com.revature.daoimpl.UserDaoImpl;

public class AdminUpdateUserLoop {
	public static Scanner sc = new Scanner(System.in);
	public static UserDaoImpl udi = new UserDaoImpl();
	
	
	public static void start(User currentUser) {
		System.out.println("UPDATE USER");
		String newUsername = getUsernameUpdate(currentUser); 
		String newFirstName = getFirstNameUpdate(currentUser);
		String newLastName = getLastNameUpdate(currentUser);
		String newUserType = getUserTypeUpdate(currentUser);
		
		System.out.println("NEW USERNAME: " + newUsername);
		System.out.println("NEW FirstName: " + newFirstName);
		System.out.println("NEW LastName: " + newLastName);
		System.out.println("NEW Type: " + newUserType);
		udi.updateUser(currentUser.getUserId(), newUsername, newFirstName, newLastName, newUserType);
		System.out.println("User Updated");
		
		
	}
	
	public static String getUserTypeUpdate(User user) {
		boolean newFlagg = true;
		
		while (newFlagg) {
			System.out.format("Input new user type (Now: %s)\n", user.getUserType());
			System.out.println("1. Customer");
			System.out.println("2. Employee");
			System.out.println("Imput 1 or 2:");
			String contents = sc.nextLine();
			if (contents.equals("1")) {
				newFlagg = false;
				return "customer";
			} else if (contents.equals("2")) {
				newFlagg = false;
				return "employee";
			}
			
		}
		return "customer";
	}
	
	public static String getLastNameUpdate(User currentUser) {
		System.out.println("Input new last name or input \"-\" to save existing ("+currentUser.getLastName()+"):");
		String contents = sc.nextLine();
		
		if (contents.equals("-")) {
			return currentUser.getLastName();
		} else {
			return contents;
		}
	}
	
	
	
	public static String getFirstNameUpdate(User currentUser) {
		System.out.println("Input new first name or input \"-\" to save existing ("+currentUser.getFirstName()+"):");
		String contents = sc.nextLine();
		
		if (contents.equals("-")) {
			return currentUser.getFirstName();
		} else {
			return contents;
		}
	}
	
	public static String getUsernameUpdate(User currentUser) {
		boolean guuFlag = true;
		String output = currentUser.getUsername();
		while (guuFlag) {
			System.out.println("Input new username or input \"-\" to save existing ("+currentUser.getUsername()+"):");
			String contents = sc.nextLine().toLowerCase();
			
			if (contents.equals("-") || contents.equals(currentUser.getUsername().toLowerCase())) {
				return currentUser.getUsername();
			} else {
				if (udi.usernameExists(contents)) {
					System.out.println("This username already exists. Try again");
				} else {
					output = contents;
					guuFlag = false;
				}
			}
			
		}
		return output;
	}
}
