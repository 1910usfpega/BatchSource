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
		
		//shows the accounts after login, figure out why double sysout?
		AccountDaoImpl adi = new AccountDaoImpl();
		System.out.println(adi.getAccountsByID(username)+ "\n");
		
		//selects an account to deposit or withdraw
		System.out.println("Enter an account number: ");
		Scanner scan = new Scanner(System.in);
		int accountNumber = scan.nextInt();
		balance = adi.getBalance(accountNumber);
		
		int choice;
		
		double depositAmount = 0;
		double withdrawAmount = 0;
		
		System.out.println("Welcome to your bank\n");
		System.out.println("input a number for each choice");
		System.out.println("1.) To view your balance.");
		System.out.println("2.) To make a deposit.");
		System.out.println("3.) To make a withdraw");
		System.out.println("4.) To create a new account.");
		System.out.println("5.) To view all your accounts.");
		System.out.println("6.) To select an account.");
		System.out.println("7.) To exit the app");
		
		do {
			System.out.println("your choice: ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Your account's balance is: " + balance);
				break;
			case 2:
				System.out.println("Enter an amount to deposit: ");
				while(!(scan.hasNextDouble())) {
					System.out.println("You must enter a numeric value, try again.");
					scan.next();
				}
				depositAmount = scan.nextDouble();
				
				if (depositAmount > 0) {
					deposit(depositAmount);
				} else {
					System.out.println("You attemtepted to deposit an invalid amount. Try again.");
				}
				break;
			case 3: 
				
				System.out.println("Enter an amount to withdraw: ");
				while(!(scan.hasNextDouble())) {
					System.out.println("Amount must be a valid number, try again.");
					scan.next();
				}
				
				withdrawAmount = scan.nextDouble();
				
				if (withdrawAmount < 0) {
					System.out.println("You entered a negative amount. Try again.");
				} else if (withdrawAmount > balance) {
					System.out.println("You attempted to withdraw more than your balance");
					
				} else {
					withdraw(withdrawAmount);
				}
				break;
			case 4:
				createNewBankAccount();
				break;
			case 5:
				System.out.println("These are your available accounts: \n");
				adi.getAccountsByID(username);
				break;
			case 6: 
				System.out.println("enter an account number to select that account: ");
				
				int acct_number = scan.nextInt();
				
				Account account = adi.selectAccount(acct_number);
			
				adi.updateAccount(account);
				break;
			case 7:
				System.out.println("Thank you for letting us service you, see you soon.");
				break;
			default: 
				System.out.println("Please enter a valid number ranging from 1-7");
			}
		} while (choice != 7);
			Account account = new Account();
			account.setId(username);
			account.setBalance(balance);
			
			adi.updateAccount(account);
		
	}

}
