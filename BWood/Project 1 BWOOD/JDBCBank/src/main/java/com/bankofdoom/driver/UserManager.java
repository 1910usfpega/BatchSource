package com.bankofdoom.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bankofdoom.bean.User;


public class UserManager {

	//private static objects to limit the amount of times I need to create these
	//object to hopefully make the program run better, this may or may not be 
	//a good idea
	//private static UserManager um = new UserManager();
	//	public static 
	//	public static List<Account> accountList = new ArrayList<Account>();
	//	
	//sesssion credential I'm not sure if this is the correct spot to put this
	//private User loggedInUser = new User();




	/**
	 * Ensures that user name field only contains alphanumeric string and is safe
	 * @param s string entered by user that may or may not be safe
	 * @return true if contains only alpha numeric characters false if contains 
	 * 			illegal characters
	 */
	private boolean isGoodUserName(String s) {
		String[] tmp1 = s.split("");
		for(String i : tmp1) {
		if (i.matches("[a-zA-Z0-9]"))
			return true;

		}
		return false;
	}
	public String enterUserName(Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		String s = null;
		System.out.println("Please enter new username:");
		s = sc.next();
		if(isGoodUserName(s)) {
//			sc.close();
			return s;
			
		} else {
//			sc.close();
			return null;
		}

	}
	public int enterUserPassword(Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter password:");
//		sc.close();
		return sanitizeInput(sc.next());
	}

	public String createUserName(Scanner sc) {
		List<User> userList = new ArrayList<User>();

		
//				Scanner sc = new Scanner(System.in);
		// no duplicate usernames allowed

		
			String tmp;
			System.out.println("Please enter new username:");

			tmp = sc.next();

			// set username to false I would much prefer to do this the other way
			// but i'm tired and this SHOULD work fine.... i hope... well I'll find out
			// later
			
			for (User i : userList) {
				if (i.getuName().contentEquals(tmp)) {
					createUserName(sc);
				}
			}
			if (isGoodUserName(tmp)) {
				return tmp;
			} else {
				System.out.println("Invalid entry, username already in use." 
						+ "Please choose another username.");
				
			}
		
//		sc.close();
		createUserName(sc);
		return null;
	}

	/**
	 * Sanitize input into a hashvalue
	 * @param s string input taken from user input
	 * @return hashvalue of that input
	 */
	private int sanitizeInput(String s) {
		return s.hashCode();
	}

	/**
	 * Create a valid password
	 * @param sc scanner being passed in to collect password
	 * @return hash value of the confirmed password made by the user
	 */
	public int createPassword(Scanner sc) {

//				Scanner sc = new Scanner(System.in);

		int pass1, pass2, password;
		password = 0;

		while (password == 0) {
			System.out.println("Please enter a new password:");
			pass1 = sanitizeInput(sc.next());

			System.out.println("Please re-enter the password:");
			pass2 = sanitizeInput(sc.next());
			if (pass1 ==pass2) {
				password = pass1;
			} else {
				System.out.println("The passwords you entered do not match.\n" 
						+ "Please try again.");
			}

		}
//		 sc.close();
		return password;
	}

	// method to create new user/account. still need logic
	/**
	 * Register a new user
	 * @param sc
	 */
	public User registerUser(Scanner sc) {
		User u = new User();
		// new log in info
		u.setuName(createUserName(sc));

		//password credentials do not persist through the program they are 
		//immediately sent to the database
		u.setPassword(createPassword(sc));

		return u;

	}

	public User updateUserInfo(Scanner sc, User old) {
//			Scanner sc = new Scanner(System.in);

		System.out.println("Your current user name is: "+old.getuName()+"\n"
				+ "Do you wish to change it? Y/N?");

		String tmp = sc.next();
		if (tmp.equalsIgnoreCase("y")) {
			old.setuName(createUserName(sc));
		}

		System.out.println("Do you wish to reset the password for: "
				+old.getuName()+" Y/N? ");
		tmp = sc.next();
		if (tmp.equalsIgnoreCase("y")) {
			//password credentials are never shown
			old.setPassword(createPassword(sc));
		}
		System.out.println("Do you wish to update the legal name for: "
				+old.getuName()+" Y/N? ");
		tmp = sc.next();
		if (tmp.equalsIgnoreCase("y")) {
			//password credentials are never shown
			System.out.println("Please enter full Legal name:");
			tmp = sc.nextLine();
			old.setName(tmp);
		}
		System.out.println("Do you wish to update the address for: "
				+old.getuName()+" Y/N? ");
		tmp = sc.next();
		if (tmp.equalsIgnoreCase("y")) {
			
			System.out.println("Please enter new address:");
			tmp = sc.nextLine();
			old.setAddress(tmp);
		}
		System.out.println("Do you wish to update the email address for: "
				+old.getuName()+" Y/N? ");
		tmp = sc.next();
		if (tmp.equalsIgnoreCase("y")) {
			System.out.println("Please enter email:");
			tmp = sc.nextLine();
			old.setEmail(tmp);
		}
		System.out.println("Do you wish to update the contact number for: "
				+old.getuName()+" Y/N? ");
		tmp = sc.next();
		if (tmp.equalsIgnoreCase("y")) {
			System.out.println("Please enter phone number: (###)###-####");
			tmp = sc.nextLine();
			old.setPhoneNumber(tmp);
		}
		System.out.println("Do you wish to update the role for: "
				+old.getuName()+" Y/N? ");
		tmp = sc.next();
		if (tmp.equalsIgnoreCase("y")) {
			System.out.println("Please enter 1 for admin and 0 for regular user: ");
			int i = sc.nextInt();
			old.setRole(i);
		}
//		sc.close();
		return old;
		

	}
	// method to add personal info to newly created account. still need logic

	public User newUserInfo(Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		User u = new User();
		String tmp = "";

		u.setuName(createUserName(sc));

		//password credentials do not persist through the program they are 
		//immediately sent to the database
		u.setPassword(createPassword(sc));


		System.out.println("Please enter full Legal name:");
		tmp = sc.nextLine();
		u.setName(tmp);

		//		System.out.println("Please enter Last name:");
		//		tmp = sc.nextLine();
		//		u.setName(tmp);

		System.out.println("Please enter address:");
		tmp = sc.nextLine();
		u.setAddress(tmp);

		System.out.println("Please enter email:");
		tmp = sc.nextLine();
		u.setEmail(tmp);

		System.out.println("Please enter phone number:");
		tmp = sc.nextLine();
		u.setPhoneNumber(tmp);

		u.setRole(0);


		// add new user to master user list
		//userList.add(u);
//		sc.close();
		return u;
		
	}

	/**
	 * method for logging in a user
	 */



	/***************************************************************************
	 * Takes in two strings that have been sanitized (not done yet!!!!) to verify if
	 * login credentials are valid
	 * 
	 * @param name username entered by user
	 * @param pwd  password entered by user
	 * @return authorized boolean value that is false if no matching combination of
	 *         username and password are found in the record of users
	 *************************************************************************/
	//	private boolean isValidUserLogin(String name, long pwd) {
	//
	//		// first pull up the user file list from the Default users
	//
	//		//getUserList -  from UserDAO
	//
	//
	//		// poll my list of known users and check the string against it
	//		for (User u : userList) {
	//			if (name.equalsIgnoreCase(u.getuName()) && pwd == u.getPassword()) {
	//				return true;
	//			}
	//		}
	//		return false;
	//
	//	}

}