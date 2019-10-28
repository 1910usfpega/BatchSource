package com.bankofdoom.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bankofdoom.bean.Account;
import com.bankofdoom.bean.User;

public class UserManager {

	//private static objects to limit the amount of times I need to create these
	//object to hopefully make the program run better, this may or may not be 
	//a good idea
	private static User u = new User();
	private static UserManager um = new UserManager();
	
	
//	public static 
//	public static List<Account> accountList = new ArrayList<Account>();
//	
	//sesssion credential I'm not sure if this is the correct spot to put this
	private static User loggedInUser = new User();
	
	

	public static User getLoggedInUser() {
		return loggedInUser;
	}

	public static void setLoggedInUser(User loggedInUser) {
		UserManager.loggedInUser = loggedInUser;
	}
/**
 * Ensures that user name field only contains alphanumeric string and is safe
 * @param s string entered by user that may or may not be safe
 * @return true if contains only alpha numeric characters false if contains 
 * 			illegal characters
 */
	private boolean isGoodUserName(String s) {
		if (s.matches("[a-zA-Z0-9]+"))
			return true;

		return false;
	}

	public String createUserName(Scanner sc) {
		List<User> userList = new ArrayList<User>();
		
		String uName = null;
		//		Scanner sc = new Scanner(System.in);
		// no duplicate usernames allowed

		while (uName == null) {
			String tmp;
			System.out.println("Please enter new username:");

			tmp = sc.next();

			// set username to false I would much prefer to do this the other way
			// but i'm tired and this SHOULD work fine.... i hope... well I'll find out
			// later
			boolean usernameExists = false;
			for (User i : userList) {
				if (i.getuName().contentEquals(tmp)) {
					usernameExists = true;
				}
			}
			if (!usernameExists && isGoodUserName(uName)) {
				uName = tmp;
			} else {
				System.out.println("Invalid entry, username already in use." 
						+ "Please choose another username.");
			}
		}
		// sc.close();
		return uName;
	}

/**
 * Sanitize input into a hashvalue
 * @param s string input taken from user input
 * @return hashvalue of that input
 */
	public int sanitizeInput(String s) {
		return s.hashCode();
	}

/**
 * Create a valid password
 * @param sc scanner being passed in to collect password
 * @return hash value of the confirmed password made by the user
 */
	private int createPassword(Scanner sc) {

		//		Scanner sc = new Scanner(System.in);

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
		// sc.close();
		return password;
	}

	// method to create new user/account. still need logic
/**
 * Register a new user
 * @param sc
 */
	private void registerUser(Scanner sc) {

		// new log in info
		u.setuName(createUserName(sc));
		
		//password credentials do not persist through the program they are 
		//immediately sent to the database
		u.setPassword(createPassword(sc));

	}

	public void createAdmin(Scanner sc) {

	}
	// method to add personal info to newly created account. still need logic

	public void userPersonalInfo(Scanner sc) {
		//		Scanner sc = new Scanner(System.in);

		String tmp = "";

		registerUser(sc);

		
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

		// sc.close();
	}

	/**
	 * method for logging in a user
	 */

	public static boolean userLogin(Scanner sc) {
		

		String un;
		int pw;
		System.out.println("Welcome please enter Username: ");
		un = sc.nextLine();
		if(um.isGoodUserName(un)) {

			System.out.println("Password: ");
			pw = um.sanitizeInput(sc.nextLine());

			//call user doa login!!!
			
			
		}
		return false;
		// sc.close();
	}

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