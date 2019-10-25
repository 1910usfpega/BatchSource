package com.bankofdoom.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bankofdoom.bean.Account;
import com.bankofdoom.bean.User;

public class UserManager {
	
	private static User u = new User();
	private static UserManager um = new UserManager();
	private final long SALT = 1285967041;
	public static List<User> userList = new ArrayList<User>();
	public static List<Account> accountList = new ArrayList<Account>();

	
	
	
	
	private boolean isGoodUserName(String s) {
		if (s.matches("[a-zA-Z0-9]+"))
			return true;

		return false;
	}

	public String createUserName(Scanner sc) {
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

	private long sanitizeInput(String s) {
		long hash = SALT;
		String[] a = s.split("");
		for (String str : a) {
			hash += Integer.parseInt(str);
		}
		return hash;
	}

	
	private long createPassword(Scanner sc) {

//		Scanner sc = new Scanner(System.in);

		long pass1, pass2, password;
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

	private void registerUser(Scanner sc) {
		
		// new log in info
		u.setuName(createUserName(sc));
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
	
		u.addRole("user");
		

		// add new user to master user list
		userList.add(u);

		// sc.close();
	}

	/**
	 * method for logging in a user
	 */

	public static boolean userLogin(Scanner sc) {
//		Scanner sc = new Scanner(System.in);

//		UserManager();
		
		String un;
		String pw;
		System.out.println("Welcome please enter Username: ");
		un = sc.nextLine();
		if(um.isGoodUserName(un))
			
		System.out.println("Password: ");
		pw = sc.nextLine();

		if (um.isValidUserLogin(un, um.sanitizeInput(pw))) {
			System.out.println("Welcome " + un + "!");
			return true;
		} else {
			System.out.println("Invalid User/Password combination. Please try " + "again!");

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
	private boolean isValidUserLogin(String name, long pwd) {

		// first pull up the user file list from the Default users
		
		//getUserList -  from UserDAO
		

		// poll my list of known users and check the string against it
		for (User u : userList) {
			if (name.equalsIgnoreCase(u.getuName()) && pwd == u.getPassword()) {
				return true;
			}
		}
		return false;

	}

}