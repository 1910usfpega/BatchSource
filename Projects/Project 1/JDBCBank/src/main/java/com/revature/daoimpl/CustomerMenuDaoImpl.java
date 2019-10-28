package com.revature.daoimpl;

import java.util.Scanner;

public class CustomerMenuDaoImpl {

	static Scanner input = new Scanner(System.in);
	
	public static void customerMenu(String currentUser) {
		System.out.println("Welcome " + currentUser + "!");
		System.out.println("What would you like to do?");
		System.out.println(" 1. Check Balances\n 2. Withdraw\n 3. Deposit\n 4. Transfer Between Accounts\n 5. Open a New Account\n");
		System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
		System.out.println();
		String answer = input.nextLine();
		//1 WILL SEND TO checkBalance() METHOD
		if (answer.equals("1")) {
			//AccountManagement.getAccountsByName(currentUser);
			customerMenu(currentUser);
		}
		//2 WILL SEND TO withdraw() METHOD
		else if (answer.equals("2")) {
			//withdraw	
		}
		//3 WILL SEND TO deposit() METHOD
		else if (answer.equals("3")) {
			//deposit
		}
		//4 WILL SEND TO transfer() METHOD
		else if (answer.equals("4")) {
			//AccountManagement.transferFunds(currentUser);
		}
		//5 WILL ASK WHICH ACCOUNT TYPE THEY WOULD LIKE TO OPEN
		else if (answer.equals("5")) {
			System.out.println("Would you like to create a 1)Checking or 2)Savings account?");
			System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
			String choice = input.nextLine();
			if (choice.equals("1")) {
				//AccountManagement.CreateSinglePersonCheckingAccount(currentUser);
			}
			else if (choice.equals("2")) {
				//AccountManagement.CreateSinglePersonSavingsAccount(currentUser);
			}
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				customerMenu(currentUser);
			}
		}
	}
	
}
