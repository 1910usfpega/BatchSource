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

	private static Scanner sc = new Scanner(System.in);
	private static UserDaoImpl udi = new UserDaoImpl();
	private static AccountDaoImpl adi = new AccountDaoImpl();
	private static int selection;
	private static UserManager um = new UserManager();
	private static AccountManager am = new AccountManager();
	// method to run Main Menu in the scanner
	private static String invalid = "Entry invalid... Please try again.";
	private static String logout = "Logging out, have a nice day!";

	public static void displayLoginMenu() {
		String s;
		//
		String tryAgain = "Please enter Y if you have an existing" + " account and wish to login \n"
				+ "Please enter N if you would like to create a new account.\n"
				+ "Please enter X if you wish to close the application.";
		String thankYouMsg = "Thank you for choosing JDBC Bank for" + " all your Banking needs!";

		UserManager um = new UserManager();

		User u = new User();

		System.out.println("Welcome to my JDBC Bank Application!\n" + tryAgain);

		s = sc.next();

		s = s.toLowerCase();

		switch (s) {

		case "x":
			// exit application
			System.out.println(thankYouMsg);
			System.out.println("Application Closing!");
			System.exit(0);
			break;
		
		case "y":
			// login existing user
			u.setuName(um.enterUserName(sc));
			u.setPassword(um.enterUserPassword(sc));
			//set session user to the login result
			u = udi.userLogin(u);
			//if all the fields in the session user are null the login failed
			if (!(u.getuName() == null)) {
				//the fields are not null so it is safe to proceed
				displayMainMenu(u);
			} else {
				//login failed send error message and return to login screen
				System.out.println("Invalid Username/Password combination.\n" + "Please try again");
				displayLoginMenu();
			}
			break;
		
		case "n":// create new user
			u = um.newUserInfo(sc);
			udi.createLogin(u);
			//create new user with default role of user only admin can set a user to admin role
			udi.createNewUser(u, 0);
			displayLoginMenu();
			break;
		
		default:
			System.out.println(invalid);
			displayLoginMenu();

		}

		

	}

	private static void displayMainMenu(User currentUser) {
		// List<?> daList= null;

		System.out.println("Welcome " + currentUser.getuName() + "\n" + "What can we help you with today?");

		System.out.println("Main Menu \n Please select from the following options: ");
		if (currentUser.getRole() == 0) {
			userMainMenu(currentUser);
		} else {
			adminMainMenu(currentUser);
		}
	}

	private static void adminMainMenu(User currentUser) {
		List<User> ul = new ArrayList<User>();

		ul = udi.getAllUsers();
		System.out.println("1. Update Existing User \n" + "2. Delete User \n" + "3. Create New User \n "
				+ "4. View All Users \n" + "5. Logout");
		selection = sc.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Please enter the id of the user you wish to update: ");
			selection = sc.nextInt();
			User update = new User();
			for (User i : ul) {
				if (i.getUserId() == selection) {
					update = i;
				}
			}
			update = um.updateUserInfo(sc, update);
			udi.updateUser(update);
			break;
		case 2:
			System.out.println("Please enter the id of the user you wish to delete: ");
			selection = sc.nextInt();
			update = new User();
			for (User i : ul) {
				if (i.getUserId() == selection) {
					update = i;
				}
			}
			System.out.println("Deleting user: " + update.getUserId());
			udi.deleteUser(update);
			break;

		case 3:
			System.out.println("Please enter the type of user you wish to" 
		+ " create \n 1 for admin and 0 for user: ");

			// because even sysadmins are human too
			if ((selection = sc.nextInt()) < 0 || (selection = sc.nextInt()) > 1) {
				System.out.println(invalid);
				adminMainMenu(currentUser);
			}
			udi.createNewUser(um.newUserInfo(sc), selection);
			break;
		case 4:
			System.out.println("Below are all the users currently in the system.");
			for (User i : ul) {
				System.out.println("User: " + i.getUserId());

			}
			break;
		case 5:
			System.out.println(logout);
			displayLoginMenu();
			break;
		default:
			System.out.println(invalid);

		}
		adminMainMenu(currentUser);

	}

	private static void userMainMenu(User currentUser) {

		System.out.println("1. Go to My Account \n" + "2. Create New Account \n"
				+ "3. Close my account (Balance must be zero) \n" + "4. Logout");
		selection = sc.nextInt();
		switch (selection) {

		case 1:
			accountMenu(currentUser);
			break;
		case 2:
			System.out.println("Please select what type of new account would you like to open: \n"
					+ "1. checking account \n" + "2. savings account ");
			selection = sc.nextInt();
			Account acc = new Account();
			if (selection == 1) {
				acc = new Account(1, true, 0, currentUser.getUserId(), true);
			} else {
				acc = new Account(1, false, 0, currentUser.getUserId(), true);
			}
			adi.createAccount(acc);
			break;
		case 3:
			closeAccount(currentUser);
			break;
		case 4:
			System.out.println(logout);
			displayLoginMenu();
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
		for (Account i : daList) {
			System.out.println(i.toString());
		}
		System.out.println("Please enter the account id for the account you wish to close: ");
		selection = sc.nextInt();

		System.out.println("Are you sure you wish to close your account: y/n?");
		String s = sc.next();
		if (s.equalsIgnoreCase("y")) {
			for (Account i : daList) {
				if (i.getAccountID() == selection) {
					System.out.println("Closing account " + i.getAccountID());
					if (adi.removeAccount(i)) {
						System.out.println("Account " + i.getAccountID() + " closed.");
					} else {
						System.out.println("Unable to close account " + i.getAccountID()
								+ " is your balance something other than $0.00?\n"
								+ "If so please transfer funds to make the balance " + "$0.00 and try again.");
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

		
			System.out.println("You chose Checking Account.\n Enter withdrawal amount: ");
			withdraw = sc.nextDouble();
			selectedAcc = am.withdrawal(selectedAcc, withdraw);
			System.out.println("Withdrawal complete. Updated Checking Account balance: "+selectedAcc.getBalance());
			adi.updateAccount(selectedAcc);
			displayMainMenu(currUser);

	}

	private static void accountMenu(User curUser) {

		List<Account> daList = new ArrayList<Account>();

		daList = adi.getAccounts(curUser);

		System.out.println("\t Account Menu \n" + "1. View Account Balances \n " + "2. Withdrawal \n" + "3. Deposit \n"
				+ "4. Transfer Funds \n" + "5. Cancel");
		System.out.println("Please make a selection: ");

		selection = sc.nextInt();
		// what happens once option is selected

		switch (selection) {

		// viewing account balances
		case 1:
			System.out.println("Account Balances:");
			for (Account i : daList) {
				System.out.println(i.toString());
			}

			break;

		// Bring up withdrawal menu
		case 2:
			System.out.println("Please select which account you would like to withdraw from: ");
			for (int i = 0; i < daList.size(); i++) {
				System.out.println(i + ". Account " + daList.get(i).getAccountID());
			}
			selection = sc.nextInt();
			System.out.println("Please enter the amount you wish to withdraw: ");
			double amt = sc.nextDouble();
			MenuMethod.withdrawalMenu(curUser, daList.get(selection));
			break;

		// Bring up deposit menu
		case 3:
			System.out.println("Please select which account you would like to deposit to: ");
			for (int i = 0; i < daList.size(); i++) {
				System.out.println(i + ". Account " + daList.get(i).getAccountID());
			}
			selection = sc.nextInt();
			MenuMethod.depositMenu(curUser, daList.get(selection));
			break;

		// Transfer funds menu
		case 4:
			List<Account> tmp = new ArrayList<Account>();
			System.out.println("Please select which account you would like to transfer from: ");
			for (int i = 0; i < daList.size(); i++) {
				System.out.println(i + ". Account " + daList.get(i).getAccountID());
			}
			int from = sc.nextInt();
			Account origin = daList.get(from);
						
			System.out.println("Please select which account you would like to transfer to: ");
			for (int i = 0; i < daList.size(); i++) {
				System.out.println(i + ". Account " + daList.get(i).getAccountID());
			}
			int to = sc.nextInt();

			Account dest = daList.get(to);
			
			System.out.println("Please enter the amount you wish to transfer: ");
			amt = sc.nextDouble();
			
			tmp = am.transfer(origin, dest, amt);
			if (tmp!=null) {
				origin  = tmp.get(0);
				dest = tmp.get(1);
			}
			adi.updateAccount(origin);
			adi.updateAccount(dest);
			
			displayMainMenu(curUser);
			break;

		case 5:
			System.out.println("Transaction canceled..");
			displayLoginMenu();
			break;
		default:
			System.out.println(invalid);
			accountMenu(curUser);

		}

	}

	// display menu for deposit
	public static void depositMenu(User currentUser, Account selectedAccount) {
		int choose;
		double deposit;

		// double amount = deposit;
		// Account a = checkingAccount;

		
			System.out.println("You chose Checking Account.\n Enter deposit amount: ");
			deposit = sc.nextDouble();
			selectedAccount = am.deposit(selectedAccount, deposit);
			System.out.println("Deposit complete. Updated Checking Account balance: $" + selectedAccount.getBalance());
			adi.updateAccount(selectedAccount);
			
		displayMainMenu(currentUser);
	}


}
