package com.bankofdoom.display;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bankofdoom.bean.Account;
import com.bankofdoom.bean.User;
import com.bankofdoom.daoimpl.AccountDaoImpl;
import com.bankofdoom.daoimpl.UserDaoImpl;
import com.bankofdoom.driver.AccountManager;
import com.bankofdoom.driver.UserManager;

public class MenuMethod {

	static Scanner sc = new Scanner(System.in);
	private static UserDaoImpl udi = new UserDaoImpl();
	private static AccountDaoImpl adi = new AccountDaoImpl();
	private static int selection;
	private static UserManager um = new UserManager();
	private static AccountManager am = new AccountManager();
	// method to run Main Menu in the scanner
	private static String invalid = "Entry invalid... Please try again.";



	public static void displayLoginMenu() {
		String s;
		//
		String tryAgain = "Please enter Y if you have an existing" 
				+ " account and wish to login \n"
				+ "Please enter N if you would like to create a new account.\n"
				+ "Please enter X if you wish to close the application.";
		String thankYouMsg = "Thank you for choosing JDBC Bank for" + " all your Banking needs!";


		UserManager um = new UserManager();

		User u = new User();

		System.out.println("Welcome to my JDBC Bank Application!\n" + tryAgain);

		s = sc.next();

		s = s.toLowerCase();

		switch (s) {

		case "x"://exit application
			System.out.println(thankYouMsg);
			System.out.println("Application Closing!");
			break;
		case "y"://login existing user
			u.setuName(um.enterUserName(sc));
			u.setPassword(um.enterUserPassword(sc));
			u = udi.userLogin(u);
			if (u != null) {
				displayMainMenu(u);
			} else {
				System.out.println("Invalid Username/Password combination.\n" + "Please try again");
				displayLoginMenu();
			}
			break;
		case "n"://create new user
			u = um.newUserInfo(sc);
			udi.createLogin(u);
			udi.createNewUser(u, 0);
			displayLoginMenu();
			break;
		default:
			System.out.println(invalid);
			displayLoginMenu();

		}

		sc.close();

	}


	private static void displayMainMenu(User currentUser) {
		//		List<?> daList= null;

		System.out.println("Welcome "+currentUser.getuName()+"\n"
				+"What can we help you with today?");

		System.out.println("Main Menu \n Please select from the following options: ");
		if(currentUser.getRole()==0) {
			userMainMenu(currentUser);
		} else {
			adminMainMenu(currentUser);
		}
	}

	private static void adminMainMenu(User currentUser) {
		List<User> ul = new ArrayList<User>();

		ul = udi.getAllUsers();
		System.out.println("1. Update Existing User \n"
				+ "2. Delete User \n"
				+ "3. Create New User \n "
				+ "4. View All Users ");
		selection = sc.nextInt();
		switch(selection) {
		case 1:

			break;
		case 2:
			deleteUser(currentUser);
			break;
		case 3:
			createNewUser(currentUser);

		}

	}
	private static void createNewUser(User currentUser) {
		// TODO Auto-generated method stub

	}


	private static void deleteUser(User currentUser) {
		// TODO Auto-generated method stub

	}


	private static void updateUser(User currentUser) {
		// TODO Auto-generated method stub

	}


	private static void userMainMenu(User currentUser) {


		System.out.println("1. Existing Account \n"
				+ "2. Create New Account \n"
				+ "3. Close account (Balance must be zero) ");
		selection = sc.nextInt();
		switch(selection) {

		case 1:
			accountMenu(currentUser);
		case 2:
			System.out.println("Please select what type of new account would you like to open: \n"
					+ "1. checking account \n"
					+ "2. savings account ");
			selection = sc.nextInt();
			Account acc = new Account();
			if(selection == 1) {
				acc = new Account(1,true,0,currentUser.getUserId(),true);
			}else {
				acc = new Account(1,false,0,currentUser.getUserId(),true);
			}
			adi.createAccount(acc);
			break;
		case 3:
			closeAccount(currentUser);

			break;
		default:
			System.out.println(invalid);
		}
		userMainMenu(currentUser);
	}

	/*
	 * You may close an account only if the balance is at zero.
	 */
	private static void closeAccount(User currentUser) {

		List<Account> daList = new ArrayList<Account>();

		daList = adi.getAccounts(currentUser);
		for(Account i: daList) {
			System.out.println(i.toString());
		}
		System.out.println("Please enter the account id for the account you wish to close: ");
		selection = sc.nextInt();

		System.out.println("Are you sure you wish to close your account: y/n?");
		String s = sc.next();
		if(s.equalsIgnoreCase("y")) {
			for(Account i: daList) {
				if (i.getAccountID()==selection) {
					System.out.println("Closing account "+i.getAccountID());
					if(adi.removeAccount(i)) {
						System.out.println("Account "+i.getAccountID()+" closed.");
					} else {
						System.out.println("Unable to close account "
								+i.getAccountID()+" is your balance something other than $0.00?\n"
								+ "If so please transfer funds to make the balance "
								+ "$0.00 and try again.");
					}
				}

			}
		} 
		System.out.println("Returning to main menu.");
		displayMainMenu(currentUser);

	}


	// display menu for withdrawal
	public static void withdrawalMenu(User currUser, Account selectedAcc) {

		double withdraw;

		System.out.println("Please choose the Account type to withdrawal from: "
				+ "\n 1. Checking Account \n 2. Savings Account \n 3. Cancel ");
		System.out.println("Please enter number:");
		selection = sc.nextInt();
		switch (selection) {
		case 1:
			System.out.println("You chose Checking Account.\n Enter withdrawal amount: ");
			withdraw = sc.nextDouble();

			System.out.println("Withdrawal complete. Updated Checking Account balance: ");
			break;
		case 2:
			System.out.println("You chose Savings Account.\n Enter withdrawal amount: ");
			withdraw = sc.nextDouble();
			System.out.println("Withdrawal complete. Updated Savings Account balance: ");
			break;
		case 3:
			System.out.println("Transaction canceled..");
			accountMenu(currUser);
			break;
		default:
			System.out.println(invalid);
		}
		withdrawalMenu(currUser, selectedAcc);

	}

	private static void accountMenu(User curUser) {

		List<Account> daList = new ArrayList<Account>();

		daList = adi.getAccounts(curUser);

		System.out.println("\t Account Menu \n"
				+ "1. View Account Balances \n "
				+ "2. Withdrawal \n"
				+ "3. Deposit \n"
				+ "4. Transfer Funds \n"
				+ "5. Cancel");
		System.out.println("Please make a selection: ");

		selection = sc.nextInt();
		// what happens once option is selected

		switch (selection) {

		// viewing account balances
		case 1:
			System.out.println("Account Balances:");
			for(Account i: daList) {
				System.out.println(i.toString());
			}

			break;

			// Bring up withdrawal menu
		case 2:
			System.out.println("Please select which account you would like to withdraw from: ");
			for(int i=0; i< daList.size();i++) {
				System.out.println(i+". Account "+daList.get(i).getAccountID());
			}
			selection = sc.nextInt();
			MenuMethod.withdrawalMenu(curUser,daList.get(selection));
			break;

			// Bring up deposit menu
		case 3:
			//MenuMethod.depositMenu();

			break;

			// Transfer funds menu
		case 4:
			//MenuMethod.transferMenu();
			break;

		case 5:
			System.out.println("Transaction canceled..");
			displayLoginMenu();
			break;
		default:
			System.out.println();
			accountMenu(curUser);

		}

	}
	// display menu for deposit
	public static void depositMenu(User currentUser, Account selectedAccount) {
		int choose;
		double deposit;

		// double amount = deposit;
		// Account a = checkingAccount;


		System.out.println("Please choose the Account type to deposit into: \n "
				+ "1. Checking Account \n 2. Savings Account \n 3. Cancel ");
		System.out.println("Please enter number:");
		choose = sc.nextInt();
		switch (choose) {

		case 1:
			System.out.println("You chose Checking Account.\n Enter deposit amount: ");
			deposit = sc.nextDouble();
			System.out.println("Deposit complete. Updated Checking Account balance: $" + deposit);
			// System.out.println("Deposit complete. Updated Checking Account balance: $" +
			// AccountManager.deposit(a, amount));
			break;
		case 2:
			System.out.println("You chose Savings Account.\n Enter deposit amount: ");
			deposit = sc.nextDouble();
			System.out.println("Deposit complete. Updated Savings Account balance: $" + deposit);
			// AccountManager.deposit(a, amount);
			break;
		case 3:
			System.out.println("Transaction canceled..");
			break;
		default: 
			System.out.println(invalid);
		}
		depositMenu(currentUser,selectedAccount);
	}

	public static void transferMenu(User currentUser) {

		double transfer;

		System.out.println("Please choose the Account to transfer out of: "
				+ "\n 1. Checking Account \n 2. Savings Account \n 3. Cancel ");
		System.out.println("Please enter number:");
		selection = sc.nextInt();
		switch (selection) {

		case 1:
			System.out.println("You chose to transfer out of Checking Account.\n" + " Enter transfer amount: ");
			transfer = sc.nextDouble();
			System.out.println(
					"Transfer complete. \n Updated Checking Account balance: \n Updated Savings Account balance: ");
			break;
		case 2:
			System.out.println("You chose to transfer out of Savings Account.\n Enter transfer amount: ");
			transfer = sc.nextDouble();
			System.out.println(
					"Transfer complete. \n Updated Savings Account balance: \n Updated Checking Account balance: ");
			break;
		case 3:
			System.out.println("Transaction canceled..");
			break;

		default:
			System.out.println(invalid);
		}
		transferMenu(currentUser);
	}
}
