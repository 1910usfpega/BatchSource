package com.revature.login;

import java.util.Scanner;

public class Intro {
	
	static Scanner input = new Scanner(System.in);
	
	public static void introMessage() {

		System.out.println("Welcome to Benright Bank! \n");
		System.out.println("Do you have an account with us? Y/N");
		String answer = input.nextLine(); //USER INPUT OF Y/N
		System.out.println();

		//Y WILL SEND TO LOGINUSERNAME() METHOD
		if (answer.equals("y") || answer.equals("Y")) {
			login();
		}
		//N WILL SEND TO NOACCOUNT() METHOD
		else if (answer.equals("n") || answer.equals("N")) {
			noAccount();	
		}
		//USER INPUTS INVALID RESPONSE, RESTARTS
		else {
			System.out.println("Invalid input.\n");
			System.out.println("////////////////////\n");
			introMessage();
		}
	}
		
		public static void login() {
			System.out.println("Enter your Username: ");
			String user = input.nextLine();
			System.out.println();
			System.out.print("Enter your Password: ");
			System.out.println();
			String pw = input.nextLine();
			System.out.println();
			if(UserAccountManagerTest.isAccountValid(user, pw) == true) {
				System.out.println("Login Success!\n");
				System.out.println("////////////////////\n");
				if (UserAccountManagerTest.getAccountType(user) == 1) {
					adminMenu(currentUser);
				}
				else if (UserAccountManagerTest.getAccountType(user) == 2) {
					customerMenu(currentUser);
				}
				else if (UserAccountManagerTest.getAccountType(user) == 3) {
					employeeMenu(currentUser);
				}
			}
			else if(UserAccountManagerTest.isAccountValid(user, pw) == false) {
				pwAttempts--;
				if(pwAttempts > 0) {
					System.out.println("Username and/or Password is incorrect! Please try again\n");
					login(); //LETS YOU TRY TO LOGIN AGAIN W/ ONE LESS ATTEMPT
				}
				else {
					System.out.println("Too many failed login attempts; please try again later.\n");
					System.out.println("////////////////////\n");
					startProgram();
					//THIS RESTARTS THE PROGRAM/SENDS BACK TO MAIN MENU
				}
			}
		}
		
		
	}
}
