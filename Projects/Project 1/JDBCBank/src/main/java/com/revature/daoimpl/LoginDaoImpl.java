package com.revature.daoimpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class LoginDaoImpl {

	static Scanner input = new Scanner(System.in);

	static int pwAttempts; // LIMITS PASSWORD TRY ATTEMPTS, CAN BE ALTERED IF WE WANT

	public static String currentUser;

	// BASICALLY START
	public static void welcomeScreen() {

		pwAttempts = 3;

		System.out.println("Welcome to Benright Bank! \n");
		System.out.println("Do you have an account with us? Y/N");
		String answer = input.nextLine(); // USER INPUT OF Y/N
		System.out.println();

		// Y WILL SEND TO LOGINUSERNAME() METHOD
		if (answer.equals("y") || answer.equals("Y")) {
			login();
		}
		// N WILL SEND TO NOACCOUNT() METHOD
		else if (answer.equals("n") || answer.equals("N")) {
			//noAccount();
		}
		// USER INPUTS INVALID RESPONSE, RESTARTS
		else {
			System.out.println("Invalid input.\n");
			System.out.println("////////////////////\n");
			welcomeScreen();
		}

	}

	// ASKS TO ENTER YOUR USERNAME
	public static void login() {
		System.out.println("Enter your Username: ");
		String user = input.nextLine();
		System.out.println();
		System.out.print("Enter your Password: ");
		System.out.println();
		String pw = input.nextLine();
		System.out.println();
		adminCheck(user, pw);
		if (/*UserAccountManagerTest.isAccountValid(user, pw) == true*/) {
			System.out.println("Login Success!\n");
			System.out.println("////////////////////\n");
			CustomerMenuDaoImpl.customerMenu(currentUser);
		} 
		else if (/*UserAccountManagerTest.isAccountValid(user, pw) == false*/) {
			pwAttempts--;
			if (pwAttempts > 0) {
				System.out.println("Username and/or Password is incorrect! Please try again\n");
				login(); // LETS YOU TRY TO LOGIN AGAIN W/ ONE LESS ATTEMPT
			} else {
				System.out.println("Too many failed login attempts; please try again later.\n");
				System.out.println("////////////////////\n");
				welcomeScreen();
				 //THIS RESTARTS THE PROGRAM/SENDS BACK TO MAIN MENU
			}
		}
	}
	
	public static void adminCheck(String user, String pw) {
		Properties prop = new Properties();
		String adminUser = null; String adminPw = null;
		String adminUser1 = null; String adminPw1 = null;
		try {
			prop.load(new FileReader("database.properties"));
			adminUser = prop.getProperty("adminUser");
			adminPw = prop.getProperty("adminPw");
			adminUser1 = prop.getProperty("adminUser1");
			adminPw1 = prop.getProperty("adminPw1");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(adminUser);
		if ((user == adminUser) && (pw == adminPw)) {
			currentUser = "Mr Revature";
			AdminMenuDaoImpl.adminMenu(currentUser);
		}
		else if((user == adminUser1) && (pw == adminPw1)) {
			currentUser = "Benjamin Enright";
			AdminMenuDaoImpl.adminMenu(currentUser);
		}
	}
	
	public static void createNewAccount() {
		System.out.println("Please enter a Username for your new account: ");
		String user = input.nextLine();
		//if(UserAccountManagerTest.usernameAvailability(user) == false) {
			System.out.println("This Username is already taken! Please try again!\n");
			System.out.println("////////////////////\n");
			createNewAccount();
		//}

		//VALIDATES PASSWORD IN CASE USER FAT FINGERED
		int passCheck = 0;
		String pw = "";
		String pwc = "";
		while(passCheck == 0) {
			System.out.println("Please enter a Password for your new account: ");
			pw = input.nextLine();
			System.out.println("Please confirm your Password for your new account: ");
			pwc = input.nextLine();
				if (pw.equals(pwc)) {
					passCheck = 1;
				}
				else {
					System.out.println("Passwords did not match! Please try again!\n");
					System.out.println("////////////////////\n");
					pw = "";
					pwc = "";
					continue;
				}
		}
		
		System.out.println("Please enter your full name (First Last) for your new account: ");
		String name = input.nextLine();
		
		//CONFIRMS ALL INFORMATION IS CORRECT
		int inputCheck = 0;
		while(inputCheck == 0) {
			System.out.println("Is the following information correct?\n Username: " + user + "\n Password: " + pw + "\n Full Name: " + name + "\n Y/N");                               
			String answer = input.nextLine();
			//SENDS YOU TO CUSTOMER MENU()
			if (answer.equals("y") || answer.equals("Y")) {
				inputCheck = 1;
			}
			//INCORRECT INFO, TRY AGAIN
			else if (answer.equals("n") || answer.equals("N")) {
				System.out.println();
				System.out.println("////////////////////\n");
				user = "";
				pw = "";
				pwc = "";
				name = "";
				inputCheck = 2;
			}
			//USER INPUTS INVALID RESPONSE, ASKS AGAIN
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				continue;
			}
		}
		if(inputCheck == 1) {
			UserAccountManagerTest.userList.add(new User(user, pw, name, 2));
			UserAccountManagerTest.writeUserFile();
			customerMenu(user);
		}
		else if(inputCheck == 2) {
			createNewAccount();
		}
	}

}
