package com.bankofdoom.display;

import java.sql.SQLException;
import java.util.Scanner;

import com.bankofdoom.bean.User;
import com.bankofdoom.daoimpl.AccountDaoImpl;
import com.bankofdoom.daoimpl.UserDaoImpl;
import com.bankofdoom.driver.UserManager;

public class MenuMethod {
	
	static Scanner sc = new Scanner(System.in);
	private static UserDaoImpl udi = new UserDaoImpl();
	private static AccountDaoImpl adi = new AccountDaoImpl();
	// method to run Main Menu in the scanner
	public static void displayLoginMenu() {
		String s;
		//
		String tryAgain = "Please enter Y if you have an existing" + " account and wish to login\n"
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
			System.out.println(thankYouMsg);
			break;
		case "y":
			System.out.println("Welcome please enter Username: ");
			s = sc.next();
			if (um.isGoodUserName(s)) {

				u.setuName(s);
				System.out.println("Please enter Password: ");
				s = sc.next();
				u.setPassword(um.sanitizeInput(s));

				try {
					u = udi.userLogin(u);
				} catch (SQLException e) {
					System.out.println("Whoops bad login query");
					e.printStackTrace();
				}
				if (u != null) {
					displayMainMenu(u);
				} else {
					System.out.println("Invalid Username/Password combination.\n" + "Please try again");
					displayLoginMenu();
				}

			}

			break;
		case "n":

			// needs to be replaced with db calls
			//			io.userPersonalInfo(sc);
			//			io.writeUserFile();
			break;
		default:
			System.out.println("Invalid Option! Self-destruct sequence " + "initiated!\n" + thankYouMsg);

		}
		System.out.println("Thank you for playing! Application Closing!");
		sc.close();

	}

	private static void displayMainMenu(User currentUser) {
		int choose;
		
		System.out.println("Welcome "+currentUser.getuName());
		
		System.out.println("\t Main Menu \n"
				+ "1. View Account Balances \n "
				+ "2. Withdrawal \n"
				+ "3. Deposit \n"
				+ "4. Transfer Funds \n"
				+ "5. Cancel");
		System.out.println("Please make a selection: ");

		choose = sc.nextInt();
		// what happens once option is selected

		switch (choose) {

		// viewing account balances
		case 1:
			System.out.println("Account Balances:");

			// System.out.println("Checking Account: $" + balance);
			// System.out.println("Savings Account: $"+ balance);
			// }
			break;

			// Bring up withdrawal menu
		case 2:
			MenuMethod.withdrawalMenu();

			// }
			break;

			// Bring up deposit menu
		case 3:
			MenuMethod.depositMenu();

			break;

			// Transfer funds menu
		case 4:
			MenuMethod.transferMenu();
			break;

		case 5:
			System.out.println("Transaction canceled..");
			displayLoginMenu();
			break;
		default:
			System.out.println("Entry invalid... Please try again.");
			displayMainMenu(currentUser);

		}

	}

	// display menu for withdrawal
	public static void withdrawalMenu() {
		int choose;
		double withdraw;
		do {
			System.out.println("Please choose the Account type to withdrawal from: "
					+ "\n 1. Checking Account \n 2. Savings Account \n 3. Cancel ");
			System.out.println("Please enter number:");
			choose = sc.nextInt();
			switch (choose) {
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
				break;

			}

		} while (choose >= 4);
	}

	// display menu for deposit
	public static void depositMenu() {
		int choose;
		double deposit;

		// double amount = deposit;
		// Account a = checkingAccount;

		do {
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

			}
		} while (choose >= 4);
	}

	public static void transferMenu() {
		int choose;
		double transfer;
		do {
			System.out.println("Please choose the Account type to transfer out of: "
					+ "\n 1. Checking Account \n 2. Savings Account \n 3. Cancel ");
			System.out.println("Please enter number:");
			choose = sc.nextInt();
			switch (choose) {

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

			}
		} while (choose >= 4);
	}
}
