package com.revature.driver;

import java.util.Scanner;

import com.revature.ui.UserInterface;

public class Driver {

	public static void main(String[] args) {
		// Field Declarations
		String uInput, loginStatus;
		Scanner input = new Scanner(System.in);
		int valid = 0;
		boolean badInput = true;

		// Top level do-while loop. Keeps user in the loop unless the user opts out
		do {
			// do-while loop that evaluates user input. If user input is valid, escape the
			// loop.
			do {
				// Call the display for opening options.
				UserInterface.openingOptions();
				// Sanitize input from user. Only accept numbers 1-3
				uInput = input.next();
				try {
					valid = Integer.parseInt(uInput);
				} catch (NumberFormatException e) {
					System.out.println("Please enter a number 1-3");
				}
				if (valid > 0 && valid < 4) {
					badInput = false;
				} else {
					badInput = true;
				}
				// End of Validation do-while
			} while (badInput);

			switch (valid) {
			// Create an account
			case 1:
				UserInterface.createAccount();
				break;
			// Login
			case 2:
				// Authenticate user login. If incorrect information is passed
				// to the system, keep going until either the user is successful
				// or the user exits
				do {
					loginStatus = UserInterface.login();
					if (loginStatus.equals("exit")) {
						break;
					} else if (loginStatus.equals("success")) {
						UserInterface.customerUI();
						break;
					}
					System.out.println("\nUsername/password combination does not match our records. Please try again\n");
				} while (loginStatus.equals("fail"));
				break;
			// Exit
			case 3:
				input.close();
				System.out.println("\nHave a nice day!\n");
				break;
			// Something's burning
			default:
				input.close();
				System.out.println("Something's burning");
				break;
			}// End of Switch(valid)

			// End of top level do-while loop
		} while (valid != 3);

	}// End of Main method

}// End of Class Driver