package com.jdbc.bank.controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu extends MenuInput {
	public Menu() {
		super();
	}

	MenuInput menuInput = new MenuInput();
	
	public void initialMenu() throws SQLException {

		int currentInput;
		Scanner scan = new Scanner(System.in);
		
		//Menu Queues
		System.out.println("Welcome to Redeeming JDBC Bank");
		System.out.println("To Sign up with us please create a user account. To create a new account: press 1");
		System.out.println("If you are have an account with us Login. To Login: press 2");
		System.out.println("If you have Admin credentials: press 3");
		System.out.println("To exit your Redeeming JDBC Bank: press 4");
		System.out.println("What would you like to do today?");

		do {
			currentInput = scan.nextInt();

			switch (currentInput) {
			
			case 1:
				createUserAccount();
				System.out.println("Proceed by inputing 2 into the console to log in to account: ");
				break;
				
			case 2:
				
					menuInput.login();
				break;
				
			case 3:
				Scanner in = new Scanner(System.in);
				break;
				
			case 4:
				System.out.println("Thank you for letting us serve you at Redeeming JDBC Bank.");
				break;
				
			default:
				System.out.println("Select an option between 1 - 3");
			}
		} while (currentInput != 4);
	}


}
