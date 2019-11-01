package com.jdbc.bank.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.daoimple.AccountDoaImple;
import com.jdbc.bank.driver.AccountDriver;
import com.jdbc.bank.exception.OverDraftException;

public class AccountInput extends MenuInput {
	double balance;

	public AccountInput() {
		super();
	}

	public AccountInput(double balance) {
		
		this.balance = balance;
	}
	
public static void transfer(Account withdrawAccount, Account depositAccount, double transferAmount) throws OverDraftException {
		AccountDoaImple aDI = new AccountDoaImple();

		List<Account> account = new ArrayList<Account>();
		if (transferAmount <= 0) {
			System.out.println("Transfer amount is invalid");
		} else if (transferAmount > 0) {
			AccountDriver.withdraw(withdrawAccount, transferAmount);
			AccountDriver.deposit(depositAccount, transferAmount);
			try {
				aDI.updateAccount(depositAccount);
				aDI.updateAccount(withdrawAccount);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	

	public void accountMenuOptions(String username) throws SQLException {

		AccountDoaImple aDI = new AccountDoaImple();

		if (aDI.getAccId(username).isEmpty()) {
			System.out.println("Create an account with us \n ");
			createNewBankAccount();
		}

		System.out.println("Enter an account number to access it: ");
		Scanner scan = new Scanner(System.in);
		int accountNumber = scan.nextInt();
		Account account = aDI.getAcct(accountNumber, username);

		balance = aDI.getBalance(accountNumber);
		
		int choice;

		double depositAmount = 0;
		double withdrawAmount = 0;

		System.out.println("Welcome to your personal Redeeming JDBC Bank\n");
		System.out.println("Type in a number any of the following options.");
		System.out.println("To view your account's balance. (Press 1.) ");
		System.out.println("To execute a deposit to an account.(Press 2.) ");
		System.out.println("To execute a withdrawal from an account. (Press 3.)");
		System.out.println("To execute a transfer between accounts. (Press 4");
		System.out.println("To create another account. (Press 5.)");
		System.out.println("To view all your accounts.(Press 6.)");
		System.out.println("To select an account. (Press 7.)");
		System.out.println("To delete an account. (Press 8.)");
		System.out.println("To exit Redeemings JDBC Banking application (Press 9.) ");

		do {

			System.out.println("What would you like to do today?: ");
			choice = scan.nextInt();

			switch (choice) {
			
			case 1:
				System.out.println("Your account's balance is: " + balance);
				break;
				
			case 2:
				System.out.println("Account number: " + account.getAccID() + " balance: " + account.getBalance() + " type: "
						+ account.getAccType());
				System.out.println("Enter an amount to deposit: ");
				while (!(scan.hasNextDouble())) {
					System.out.println("You must enter a numeric value, try again.");
					scan.next();
				}
				depositAmount = scan.nextDouble();
				if (depositAmount > 0) {
					AccountDriver.deposit(account, depositAmount);

					
					aDI.updateAccount(account);

					System.out.println(
							"Your account number: " + account.getAccID() + " new balance is: " + account.getBalance());
				} else {
					System.out.println("You attemtepted to deposit an invalid amount. Try again.");
				}
				break;
				
			case 3:
				System.out.println("Account number: " + account.getAccID() + " balance: " + account.getBalance() + " type: "
						+ account.getAccType());
				System.out.println("Enter an amount to withdraw: ");

				while (!(scan.hasNextDouble())) {
					System.out.println("Amount must be a valid number, try again.");
					scan.next();
				}
					withdrawAmount = scan.nextDouble();

				if (withdrawAmount < 0) {
					System.out.println("You entered an amount below zero. Try again.");
				} else if (withdrawAmount > balance) {
					System.out.println("You attempted to withdraw more than your balance");

				} else {
					try {
						AccountDriver.withdraw(account, withdrawAmount);
					} catch (OverDraftException e) {
						e.printStackTrace();
					}
					
					aDI.updateAccount(account);

					System.out.println(
							"Your account number: " + account.getAccID() + " new balance is: " + account.getBalance());
				}
				break;
				
			case 4:
				//Transfer money
				System.out.println("How much would you like to transfer today?");
				withdrawAmount=scan.nextDouble();
				System.out.println("What account number would you like to transfer from?");
				account.setAccID(scan.nextInt());
				account.setBalance(aDI.getBalance(account.getAccID())- withdrawAmount);
				aDI.updateAccount(account);
				System.out.println("Removed " + withdrawAmount + " succesfully");
				System.out.println("Where would you like to transfer to?");
				account.setAccID(scan.nextInt());
				account.setBalance(aDI.getBalance(account.getAccID()) + withdrawAmount);
				aDI.updateAccount(account);
				System.out.println("Transfer complete" + account.getBalance());
				break;
				
			case 5:
				createNewBankAccount();
				break;
				
			case 6:
				System.out.println("These are your available accounts: \n");
				aDI.getAccId(username);
				break;
				
			case 7:
				System.out.println("enter an account number to select that account: ");

				int acct_number = scan.nextInt();

				Account acct = aDI.getAcct(acct_number, username);

				aDI.updateAccount(acct);
				break;
				
			case 8:
				System.out.println("select an account to delete: ");
				int number = scan.nextInt();
				Account accountToDelete = aDI.getAcct(number, username);
				if (accountToDelete.getBalance() != 0) {
					System.out.println("Account must have a balance of 0 to be deleted.");
				} else {
					aDI.removeAccount(accountToDelete);
				}

				break;
				
			case 9: 
				System.out.println("Thank you for letting us serve you, see you soon.");
				System.exit(0);
			default:
				System.out.println("Please enter a valid number ranging from 1-7");
			}
		} while (choice != 8);
		Account acct = new Account();
		acct.setAcct_uname(username);;
		acct.setBalance(balance);

		aDI.updateAccount(acct);
	}

}
