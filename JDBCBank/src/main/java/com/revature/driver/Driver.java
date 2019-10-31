package com.revature.driver;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.TheImpl;
import com.revature.bean.Account;
import com.revature.bean.Features;
import com.revature.bean.User;
import com.revature.dao.TheDao;


public class Driver {

	public static char custChoice;

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException{

		TheImpl adi = new TheImpl();
		Features features = new Features();
		TheImpl users = new TheImpl ();
		
		
		welcomeMenu();
		//System.out.println(TheImpl.getUsersById(Account.getUserId()));
		//System.out.println(users.getUsersById(2));
//		
//		System.out.println(adi.getAllAccounts(2));
		
		
		
//		try {
//			System.out.println(adi.getAllAccounts());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
	}



	
	public static void welcomeMenu() throws SQLException {
		// Welcome Menu
				System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Welcome to Tampa General Bank");
				System.out.println("Please select your account type below.");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");
				System.out.println(" ");
				System.out.println("1. New Customer\n");
				System.out.println("2. Existing Customer\n");
				System.out.println("3. Administrator\n");
				System.out.println(" ");
				System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");

				{


						System.out.println(" ");
						System.out.println(" ");
						System.out.println("Please select a menu option : ");
						System.out.println(" ");
						System.out.println(" ");
						sc.hasNextInt();
						custChoice = sc.next().charAt(0);
						System.out.println(" ");
						System.out.println(" ");
						System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");

						switch (custChoice) {

						case '1':
							//Create Login
							
							System.out.println(" ");
							System.out.println(" ");
							System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");
							System.out.println(" ");
							System.out.println(" ");
							System.out.print("Sign Up\n");
							System.out.print("This information will be used for you login.\n");
							System.out.print("Choose a username : ");
							System.out.println(" ");
							System.out.println(" ");
							String username = sc.next();
							System.out.println(" ");
							System.out.println(" ");
							
							boolean doneOrNot = false;
							String password = "";
							while (!doneOrNot) {
								System.out.print("Choose a password : ");
								System.out.println(" ");
								System.out.println(" ");
								password = sc.next();
								if (password.toLowerCase() != null)
									doneOrNot = true;
							}
							
							Features.createLogin(username, password);
							
							System.out.println(" ");
							System.out.println(" ");
							//System.out.println("Your User ID is : " + userId);
							Features.checkLogin();
							
							
							
							break;

						case '2':
							boolean loginCust = Features.checkLogin();
							if (loginCust == true) {
								displayCustomerMenu();
							}
							else {
								System.out.println("Invalid Username and Password. Please try again.");
								Features.checkLogin();
							}
							displayCustomerMenu();
							break;

						case '3':
							boolean loginAdmin = Features.checkLogin();
							if (loginAdmin == true) {
								displayAdminMenu();
							}
							else {
								System.out.println("Invalid Username and Password. Please try again.");
								Features.checkLogin();
							}
							displayAdminMenu();
							break;

						default:
							System.out.println("Invalid Option. Please enter a number " + 
						"from the menu list: ");
							System.out.println(" ");
							System.out.println(" ");
							
							welcomeMenu();
							break;
						}
					

				}
	}
	
	

	public static void displayCustomerMenu() throws SQLException {
		
		System.out.println("Hello " + Account.getFirstName()); 
		System.out.println("ID: " + Account.getUserId()); 
		System.out.println("\n");
		System.out.println("A. Create an Account\n");
		System.out.println("B. View Account\n");
		System.out.println("C. View Balance\n");
		System.out.println("D. Deposit\n");
		System.out.println("E. Withdraw\n");
		System.out.println("F. View Transaction History\n");
		System.out.println("G. Delete Account\n");
		System.out.println("H. Transfer\n");
		System.out.println("I. Log out\n");
		System.out.println("\n");

		boolean validChoice = true;

		do {

			
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("What would you like to do today? ");
			System.out.println(" ");
			System.out.println(" ");
			custChoice = sc.next().charAt(0);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");

			switch (custChoice) {

			case 'A':
				//Features.createAccount();
				System.out.println("This feature is coming soon. We will email you when it is " + "available.");
				System.out.println("Thank you for banking with us! :D");
				
				
				
				validChoice = true;
				break;

			case 'B':
				// View Account Info
				TheImpl.getAccountInfo(Account.getAccountId());
				validChoice = true;
				break;

			case 'C':
				//view balance
				Features.viewBalance(Account.getAccountId());
				validChoice = true;
				break;

			case 'D':
				System.out.println("This feature is coming soon. We will email you when it is " + "available.");
				System.out.println("Thank you for banking with us! :D");
				//Features.getDeposit();
				validChoice = true;
				break;

			case 'E':
				System.out.println("This feature is coming soon. We will email you when it is " + "available.");
				System.out.println("Thank you for banking with us! :D");
				//Features.getWithdraw();
				validChoice = true;
				break;

			case 'F':
				System.out.println("This feature is coming soon. We will email you when it is " + "available.");
				System.out.println("Thank you for banking with us! :D");
				validChoice = true;
				break;

			case 'G':
				System.out.println("This feature is coming soon. We will email you when it is " + "available.");
				System.out.println("Thank you for banking with us! :D");
				validChoice = true;
				break;

			case 'H':
				System.out.println("This feature is coming soon. We will email you when it is " + "available.");
				System.out.println("Thank you for banking with us! :D");
				validChoice = true;
				break;

			case 'I':
				System.out.println(
						"``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Thank you for being a valued customer at Tampa General Bank. ");
				System.out.println("Have a great day!");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(
						"``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``");
				System.out.println(" ");
				System.out.println(" ");
				welcomeMenu();
				validChoice = false;
				break;

			default:
				System.out.println("Invalid Option. Please enter an option from " + "from the menu list: ");
				
				validChoice = true;
				break;

			}

		} while (validChoice);

	}

	// Admin Menu
	public static void displayAdminMenu() throws SQLException {

		System.out.println("Hello " + Account.getFirstName()); 
		System.out.println("ID: " + Account.getUserId()); 
		System.out.println("\n");
		System.out.println("A. View All Users\n");
		System.out.println("B. Search Users\n");
		System.out.println("C. Add Users\n");
		System.out.println("D. Update Users\n");
		System.out.println("E. Delete Users\n");
		System.out.println("F. Logout\n");
		System.out.println("\n");

		boolean validChoice = true;

		do {

			System.out.println(" ");
			System.out.println(" ");
			System.out.println("What would you like to do today? ");
			System.out.println(" ");
			System.out.println(" ");
			custChoice = sc.next().charAt(0);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");

			switch (custChoice) {

			case 'A':
				// view all users
				System.out.println(TheImpl.getUsersById(Account.getUserId()));
				validChoice = true;
				break;

			case 'B':
				// View Account
				//Features.viewAccount();
				System.out.println("This feature is coming soon. We will email you when it is " + "available.");
				System.out.println("Thank you for banking with us! :D");
				validChoice = true;
				break;

			case 'C':
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("``$``$``$``$``$``$``$``$``$``$``$``");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Register a User.\n");
				System.out.print("This information will be used for their login.\n");
				System.out.print("Choose a username : ");
				System.out.println(" ");
				System.out.println(" ");
				String username = sc.next();
				System.out.println(" ");
				System.out.println(" ");
				
				boolean doneOrNot = false;
				String password = "";
				while (!doneOrNot) {
					System.out.print("Choose a password : ");
					System.out.println(" ");
					System.out.println(" ");
					password = sc.next();
					if (password.toLowerCase() != null)
						doneOrNot = true;
				}
				
				Features.createLogin(username, password);
				
				System.out.println(" ");
				System.out.println(" ");
				//System.out.println("Your User ID is : " + userId);
				
				
				
				
				break;


			case 'D':
				System.out.println("This feature is coming soon. We will email you when it is " + "available.");
				System.out.println("Thank you for banking with us! :D");
				validChoice = true;
				break;

			case 'E':
				System.out.println("This feature is coming soon. We will email you when it is " + "available.");
				System.out.println("Thank you for banking with us! :D");
				validChoice = true;
				break;

			case 'F':
				System.out.println(
						"``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Thank you for being a valued employee at Tampa General Bank. ");
				System.out.println("Have a great day!");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(
						"``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``$``");
				System.out.println(" ");
				System.out.println(" ");
				welcomeMenu();
				validChoice = false;
				break;

			default:
				System.out.println("Invalid Option. Please enter an option from " + "from the menu list: ");
				validChoice = true;
				break;

			}

		} while (validChoice);

	}

}

//
