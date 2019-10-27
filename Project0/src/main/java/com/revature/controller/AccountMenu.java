package com.revature.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.AccountDaoImpl;
import com.revature.model.Account;

public class AccountMenu extends Input {
	double lastAmount;
	double balance;
	
	public AccountMenu() {
		super();
	}
	
	public AccountMenu(double lastAmount, double balance) {
		this.lastAmount = lastAmount;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount != 0) {
			balance += amount;
			lastAmount = amount;
			
		}
	}
	
	public void withdraw( double amount) {
		if (amount != 0) {
			balance -= amount;
			lastAmount = amount;
		}
	}
	
	public void accountMenuOtions(String username) throws SQLException {
		
		AccountDaoImpl adi = new AccountDaoImpl();
		balance = adi.getBalance(username);
		
		int choice;
		
		Scanner scan = new Scanner(System.in);
		
		double depositAmount = 0;
		double withdrawAmount = 0;
		
		System.out.println("Welcome to your bank\n");
		System.out.println("input a number for each choice");
		System.out.println("1.) To view your balance.");
		System.out.println("2.) To make a deposit.");
		System.out.println("3.) To make a withdraw");
		System.out.println("4.) To create a new account.");
		System.out.println("5.) To view all your accounts.");
		System.out.println("6.) To exit the app");
		
		do {
			System.out.println("your choice: ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Your account's balance is: " + balance);
				break;
			case 2:
				System.out.println("Amount to deposit: ");
				while(!(scan.hasNextDouble())) {
					System.out.println("you must enter a numeric value");
					scan.next();
				}
				depositAmount = scan.nextDouble();
				
				if (depositAmount > 0) {
					deposit(depositAmount);
				} else {
					System.out.println("you attemtep to deposit a negative amount.");
				}
				break;
			case 3: 
				
				System.out.println("Enter amount to withdraw: ");
				while(!(scan.hasNextDouble())) {
					System.out.println("Enter a number and try again.");
					scan.next();
				}
				
				withdrawAmount = scan.nextDouble();
				
				if (withdrawAmount < 0) {
					System.out.println("You entered a negative amount.");
				} else if (withdrawAmount > balance) {
					System.out.println("You attempted an amount larger than your balance");
					
				} else {
					withdraw(withdrawAmount);
				}
				break;
			case 4:
				createNewBankAccount();
				break;
			case 5:
				System.out.println("These are your accounts: \n");
				adi.getAccountByID(username);
				break;
			case 6: 
				System.out.println("Thank you for letting us service you");
				break;				
			default: 
				System.out.println("Enter a number from the menu (1-4)");
			}
		} while (choice != 6);
			Account account = new Account();
			account.setId(username);
			account.setBalance(balance);
			
			adi.updateAccount(account);
		
	}

}
