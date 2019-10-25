package com.bankofdoom.display;
import com.bankofdoom.bean.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bankofdoom.driver.*;
public class MenuMethod {

	static Scanner sc = new Scanner(System.in);
	//method to run Main Menu in the scanner
	public static void displayMainMenu() {
		int choose;
		//loop to generate numbered options in Main Menu to choose from 

		do {	
			System.out.println("\t Main Menu \n 1. View Account Balances \n "
					+ "2. Withdrawal \n 3. Deposit \n 4. Transfer Funds \n "
					+ "5. Cancel");
			System.out.println("Please enter number:");
			choose=sc.nextInt();
			//what happens once option is selected


			switch (choose){

			//viewing account balances
			case 1:
				System.out.println("Account Balances:");
				//System.out.println("Checking Account: $" + balance);
				//System.out.println("Savings Account: $"+ balance);
				//}
				break;

				//Bring up withdrawal menu
			case 2:
				MenuMethod.withdrawalMenu();


				//}
				break;

				//Bring up deposit menu
			case 3:
				MenuMethod.depositMenu();

				break;

				//Transfer funds menu
			case 4:
				MenuMethod.transferMenu();
				break;

			case 5:
				System.out.println("Transaction canceled..");	

				break;
			default: 
				System.out.println("Entry invalid... Please try again.");
				break;

			}
		}
		while (choose >=5);
	}
	//display menu for withdrawal
	public static void withdrawalMenu() {
		int choose;
		double withdraw;
		do {
			System.out.println("Please choose the Account type to withdrawal from: "
					+ "\n 1. Checking Account \n 2. Savings Account \n 3. Cancel ");
			System.out.println("Please enter number:");
			choose=sc.nextInt();
			switch (choose) {
			case 1:
				System.out.println("You chose Checking Account.\n Enter withdrawal amount: ");
				withdraw=sc.nextDouble();
				
				
				System.out.println("Withdrawal complete. Updated Checking Account balance: " );
				break;
			case 2:
				System.out.println("You chose Savings Account.\n Enter withdrawal amount: ");
				withdraw=sc.nextDouble();
				System.out.println("Withdrawal complete. Updated Savings Account balance: ");
				break;
			case 3:
				System.out.println("Transaction canceled..");
				break;

			}

		}
		while (choose >=4);
	}
	// display menu for deposit
	public static void depositMenu() {
		int choose;
		double deposit;
		
		//double amount = deposit;
		//Account a = checkingAccount;
		
		do {
			System.out.println("Please choose the Account type to deposit into: \n "
					+ "1. Checking Account \n 2. Savings Account \n 3. Cancel ");
			System.out.println("Please enter number:");
			choose=sc.nextInt();
			switch (choose) {

			case 1:
				System.out.println("You chose Checking Account.\n Enter deposit amount: ");
				deposit=sc.nextDouble();
				System.out.println("Deposit complete. Updated Checking Account balance: $" +deposit);
				//System.out.println("Deposit complete. Updated Checking Account balance: $" + AccountManager.deposit(a, amount));
				break;
			case 2:
				System.out.println("You chose Savings Account.\n Enter deposit amount: ");
				deposit=sc.nextDouble();
				System.out.println("Deposit complete. Updated Savings Account balance: $" + deposit);
				//AccountManager.deposit(a, amount);
				break;
			case 3:
				System.out.println("Transaction canceled..");
				break;


			}
		}
		while (choose>=4);
	}
	public static void transferMenu() {
		int choose;
		double transfer;
		do {
			System.out.println("Please choose the Account type to transfer out of: "
					+ "\n 1. Checking Account \n 2. Savings Account \n 3. Cancel ");
			System.out.println("Please enter number:");
			choose=sc.nextInt();
			switch (choose) {

			case 1:
				System.out.println("You chose to transfer out of Checking Account.\n"
						+ " Enter transfer amount: ");
				transfer=sc.nextDouble();
				System.out.println("Transfer complete. \n Updated Checking Account balance: \n Updated Savings Account balance: ");
				break;
			case 2:
				System.out.println("You chose to transfer out of Savings Account.\n Enter transfer amount: ");
				transfer=sc.nextDouble();
				System.out.println("Transfer complete. \n Updated Savings Account balance: \n Updated Checking Account balance: ");
				break;
			case 3:
				System.out.println("Transaction canceled..");
				break;


			}
		}
		while (choose>=4);
	}
}



