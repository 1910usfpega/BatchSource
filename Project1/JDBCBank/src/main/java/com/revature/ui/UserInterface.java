package com.revature.ui;

//import java.math.BigDecimal;
//import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.BankAccount;
import com.revature.beans.Customer;
import com.revature.daoImpl.BankAccountDaoImpl;
import com.revature.daoImpl.CustomerDaoImpl;
//import com.revature.util.ConnFactory;

public class UserInterface {

	// Declare everything required for user login
	public static Scanner sc = new Scanner(System.in);
	public static String fName, lName, uName, pw, pw2;
	public static double amount;
	static Customer user = null;
	public static boolean uCheck = true;

	// The first thing a user sees when the application runs
	// Determines which actions to take based on user input
	public static void openingOptions() {
		System.out.println("What would you like to do today?");
		System.out.println("================================");
		System.out.println("1. Create A Customer Account");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		System.out.print("Enter number: ");
	}// End of method openingOptions

	public static void createAccount() {
		System.out.print("Please enter first name: ");
		fName = sc.next();
		System.out.print("\nPlease enter last name: ");
		lName = sc.next();
		do {
		System.out.print("\nPlease enter username (10 characters): ");
		uName = sc.next();
		if(uName.length() > 10) {System.out.println("Username is too long. Please keep to 10 characters in length\n");}
		}while(uName.length() > 10);
		// Password confirmation. Password variables must match to continue
		do {
			System.out.print("\nPlease enter password (15 characters): ");
			pw = sc.next();
			System.out.print("\nPlease reenter your password: ");
			pw2 = sc.next();
			if (!pw.equals(pw2)) {
				System.out.println("Passwords do not match.\n");
			}
			if(pw.length() > 15){ System.out.println("Password is too long. Please keep to 15 characters in length\n"); }
		} while (!pw.equals(pw2) || pw.length() > 15);

		//Connect to database and create user
		System.out.println("Connecting to database...\n");
		CustomerDaoImpl cdi = new CustomerDaoImpl();
		try {
			System.out.println("Creating new user...");
			user = cdi.insertCustomerByUser(uName, pw, fName, lName);
			System.out.println("User creation successful!\n");
		} catch (SQLException e1) {
			System.out.println("Could not create user. Please try again\n");
			e1.printStackTrace();			
		}
		
		//Connect to database and create bank account
		BankAccountDaoImpl badi = new BankAccountDaoImpl();
		try {
			System.out.println("Creating new bank account...\n");
			user.setAccounts(badi.addNewBankAccount(uName));
			System.out.println("Account creation successful!\n");
		} catch (SQLException e) {
			System.out.println("Could not create account. Please try again\n");
		}
		
	}// End of method createAccount

	public static String login() {
		// Declare connection variables
//		Connection loginResult = null;
//		CustomerDaoImpl cdi = new CustomerDaoImpl();
		String u, p;

		// Gather information from the user
		System.out.println("type exit to return to the menu");
		System.out.print("Enter username: ");
		// If the user opts to exit, return exit string
		u = sc.next();
		if (u.equals("exit")) {
			System.out.println("\n\nReturning to main menu...\n");
			return "exit";
		}
		System.out.print("\nEnter password: ");
		// If the user opts to exit, return exit string
		p = sc.next();
		if (p.equals("exit")) {
			System.out.println("\n\nReturning to main menu...\n");
			return "exit";
		}

		// Run the loginCheck. If the user enters options that do not
		// align with username and password information in the database, return fail
		// value
		System.out.println("Validating login information...\n");
		
		if (loginCheck(u, p) == null) {
			return "fail";
		}else {
			user = loginCheck(u,p);
			System.out.println("Welcome back, " + user.getFName() + "\n");
			return "success";
		}
	}// End of method

	public static Customer loginCheck(String user, String password) {
		// Confirm login status
		CustomerDaoImpl cdi = new CustomerDaoImpl();
		Customer c = null;
		try {
			c = cdi.login(user, password);
		} catch (SQLException e) {
			System.out.println("Could not connect to the server to verify information. Please try again.");
		}
		return c;
	}// End of method login

	public static void customerUI() {
		// Variable declaration
		BankAccountDaoImpl badi = new BankAccountDaoImpl();
		// CustomerDaoImpl cdi = new CustomerDaoImpl();
		String uInput = "";
		int valid = 0;
		boolean badInput = true;

		try {
			user.setAccounts(badi.getBankAccountsByCustomerUser(user.getUser()));
		} catch (SQLException e) {
			System.out.println("Could not retrieve account list. Please try again");
		}

		// Top level do-while loop. Continues to run until the user decides to logout.
		do {
			// Display user options
			System.out.println("What would you like to do today?\n");
			System.out.println("1. View account information");
			System.out.println("2. Create a new bank account");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Remove an empty account");
			System.out.println("6. Logout\n");
			System.out.print("Enter number: ");

			// Sanitize input from user. Only accept numbers 1-6
			do {
				uInput = sc.next();
				try {
					valid = Integer.parseInt(uInput);
				} catch (NumberFormatException e) {
					System.out.println("Please enter a number 1-6\n");
				}
				if (valid > 0 && valid < 7) {
					badInput = false;
				} else {
					badInput = true;
				}
			} while (badInput);

			// Used validated user input to call methods
			switch (valid) {
			// View bank account information
			case 1:
				try {
					user.setAccounts(badi.getBankAccountsByCustomerUser(user.getUser()));
				} catch (SQLException e) {
					System.out.println("Could not update account list");
				}
				for (BankAccount b : user.getAccounts()) {
					System.out.println(b.toString() + "\n");
				}
				break;
			// Create a new bank account
			case 2:
				accountManipUI(2, user.getAccounts());
				break;
			// Deposit
			case 3:
				accountManipUI(3, user.getAccounts());
				break;
			// Withdraw
			case 4:
				accountManipUI(4, user.getAccounts());
				break;
			// Remove an empty bank account
			case 5:
				accountManipUI(5, user.getAccounts());
				break;
			// logout
			case 6:
				System.out.println("Logging out... Have a nice day, " + user.getFName() +"\n");
				break;
			default:
				System.out.println("Something's burning");
				break;
			}
		} while (valid != 6);

	}// End of method customerUI

	public static void accountManipUI(int valid, List<BankAccount> accountList) {
		BankAccountDaoImpl badi = new BankAccountDaoImpl();
		double amount = 0;
		int i = 1, account = 0;

		// Addition of another account
		if (valid == 2) {
			// Add another bank account record to the database
			try {
				badi.addNewBankAccount(user.getUser());
			} catch (SQLException e1) {
				System.out.println("Could not add new bank account");
			}
			// Pull the bank accounts from the database to refresh the java objects
			try {
				accountList = badi.getBankAccountsByCustomerUser(user.getUser());
			} catch (SQLException e) {
				System.out.println("Could not retrieve list of accounts");
			}
		}//End of new account case
		// Deposit funds
		else if (valid == 3) {
			// First, determine which bank account the user wants to deposit funds into
			do {
			System.out.println("Please select an account: ");
			i = 1;
			for (BankAccount b : accountList) {
				System.out.println(i + ": " + b.getAccount_num() + "\n");
				i++;
			}
				try {
					account = Integer.parseInt(sc.next());
					account -= 1;
				} catch (NumberFormatException e) {
					System.out.println("Please enter a number 1-" + i);
				}
				
			} while (account < 0 && account >= i);
			
			// Then deposit funds into the previously determined bank account
			do {
				System.out.print("How much would you like to deposit? ");
				try {
					amount = Double.parseDouble(sc.next());
				} catch (NumberFormatException e) {
					System.out.println("Please enter a number");
				}
				if (amount > 0) {
					System.out.println("Depositing funds...");
					accountList.get(account).deposit(amount);
					try {
						System.out.println("Updating account information...");
						badi.updateAccountBalance(accountList.get(account), amount);
					} catch (SQLException e) {
						System.out.println("You failed. Again. Try again");
						e.printStackTrace();
					}
				} else {
					System.out.println("Please enter a positive number");
				}
			} while (amount <= 0);
		}//End of deposit case
		// Withdraw funds
		else if (valid == 4) {
			// First, determine which bank account the user wants to deposit funds into
			do {
			i = 1;
			for (BankAccount b : accountList) {
				System.out.println(i + ": " + b.getAccount_num() + "\n");
				i++;
			}
			System.out.println("Please select an account: ");
				try {
					account = (Integer.parseInt(sc.next())-1);
				} catch (NumberFormatException e) {
					System.out.println("Please enter a number 1-" + i);
				}
			} while (account < 0 && account >= i);
			// Then withdraw funds from the previously determined bank account
			double cap = accountList.get(account).getBalance();
			do {
				System.out.print("How much would you like to withdraw? ");
				try {
					amount = Integer.parseInt(sc.next());
				} catch (NumberFormatException e) {
					System.out.println("Please enter a number");
				}
				if (amount >= 0 && amount <= cap) {
					System.out.println("Removing account funds...");
					accountList.get(account).withdraw(amount);
					try {
						System.out.println("Updating account information...");
						badi.updateAccountBalance(accountList.get(account), amount);
					} catch (SQLException e) {
						System.out.println("Could not update account balance");
					}
				} else if (amount > accountList.get(account).getBalance()) {
					System.out.println("Account balance too low");
				} else {
					System.out.println("Please enter a positive number");
				}
			} while (amount < 0 || amount > cap);
		}//End of withdraw case
		// Deletion of an EMPTY bank account
		else if (valid == 5) {
			do {
				i = 1;
			for (BankAccount b : accountList) {
				System.out.println(i + ": " + b.getAccount_num() + "\n");
				i++;
			}
				try {
					account = (Integer.parseInt(sc.next())-1);
				} catch (NumberFormatException e) {
					System.out.println("Please enter a number 1-" + i);
				}
			} while (account < 0 && account >= i);
			if (accountList.get(account).getBalance() == 0) {
				try {
					System.out.println("Deleting empty account...");
					accountList = badi.deleteEmptyAccount(accountList.get(account), user.getUser());
					user.setAccounts(accountList);
					System.out.println("Account deletion successful...");
				} catch (SQLException e) {
					System.out.println("You broke it. Again. Try again. And again");
					e.printStackTrace();
				}
			}//End of balance check

		}//End of account deletion case
		// Something went wrong. Why is there additional work for options besides 2-5??
		else {
			System.out.println("Something's burning. Find and fix");
		}

	}// End of accountManipUI

}// End of Class UserInterface