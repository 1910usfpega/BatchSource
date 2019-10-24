package com.bankofdoom.driver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bankofdoom.bean.Account;
import com.bankofdoom.bean.User;

public class UserManager {

	private final long SALT = 1285967041;
	public static List<User> userList = new ArrayList<User>();
	public static List<Account> accountList = new ArrayList<Account>();

	private User u;
	
	
	
	private boolean isGoodUserName(String s) {
		if (s.matches("[a-zA-Z0-9]+"))
			return true;

		return false;
	}

	public String createUser(Scanner sc) {
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
		this.u.setUser(createUser(sc));
		this.u.setPassword(createPassword(sc));

	}

	public void createAdmin(Scanner sc) {
		
	}
	// method to add personal info to newly created account. still need logic

	public void userPersonalInfo(Scanner sc) {
//		Scanner sc = new Scanner(System.in);

		String tmp = "";
		
		registerUser(sc);

		System.out.println("Please enter Legal name:");
		tmp = sc.nextLine();
		u.setName(tmp);
//		System.out.println("Please enter Last name:");
//		tmp = sc.nextLine();
		
		u.setLastName(tmp);
		System.out.println("Please enter address:");
		tmp = sc.nextLine();
		u.setAddress(tmp);
		System.out.println("Please enter email:");
		tmp = sc.nextLine();
		u.setEmail(tmp);
		System.out.println("Please enter phone number:");
		tmp = sc.nextLine();
		u.setPhoneNumber(tmp);
		
		u.setRole("user");
		

		// add new user to master user list
		userList.add(u);

		// sc.close();
	}

	/**
	 * method for logging in a user
	 */

	public static boolean userLogin(Scanner sc) {
//		Scanner sc = new Scanner(System.in);

		UserManager();
		
		String un;
		String pw;
		System.out.println("Welcome please enter Username: ");
		un = sc.nextLine();
		if(!this.isGoodUserName(un))
			
		System.out.println("Password: ");
		pw = sc.nextLine();

		if (UserManager.isValidUserLogin(un, sanitizeInput(pw))) {
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
	private static boolean isValidUserLogin(String name, long pwd) {

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

	

	

//	/**
//	 * reads users from a file and stores them into a static arraylist
//	 */
//	public static void readUserFile() {
//		User u = new User();
//		try (BufferedReader br = new BufferedReader(new FileReader(inUserFile));) {
//			String str;
//			while ((str = br.readLine()) != null) {
//				// there is a better way to do this
//				// but time is short so split the read file and
//				// then set the variables
//				String[] s = str.split(",");
//				u.setUserName(s[0]);
//				u.setPassword(s[1]);
//				u.setFirstName(s[2]);
//				u.setLastName(s[3]);
//				u.setAddress(s[4]);
//				u.setEmail(s[5]);
//				u.setPhoneNumber(s[6]);
//				u.setUserType(s[7]);
//				userList.add(u);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

//	/**
//	 * reads users from a file and stores them into a static arraylist
//	 * 
//	 * return accountID + ","+ checkingAccount + "," + firstName + "," + lastName +
//	 * "," + balance + "," + approved
//	 */
//	public static void readAccountFile() {
//		Account u = new Account();
//
//		try (BufferedReader br = new BufferedReader(new FileReader(inAccountFile));) {
//			String str;
//			while ((str = br.readLine()) != null) {
//				// there is a better way to do this
//				// but time is short so split the read file and
//				// then set the variables
//				String[] s = str.split(",");
//				u.setAccountID(s[0]);
//				u.setCheckingAccount(Boolean.parseBoolean((s[1])));
//				u.setFirstName(s[2]);
//				u.setLastName(s[3]);
//				u.setBalance(Double.parseDouble(s[4]));
//				u.setApproved(Boolean.parseBoolean(s[5]));
////				u.setPhoneNumber(s[6]);
////				u.setUserType(s[7]);
//				accountList.add(u);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
}
