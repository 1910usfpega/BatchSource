package com.revature.loops;

import java.util.Scanner;

import com.revature.beans.BankAccount;
import com.revature.daoimpl.AccountDaoImpl;

public class CustomerWorkWithAccountMenuLoop {
	public static Scanner sc = new Scanner(System.in);
	public static AccountDaoImpl adi = new AccountDaoImpl();
	
	public static void start (Integer accountNumber) {
			BankAccount currentAccount = adi.getBankAccountByNumber(accountNumber);
			printAccountInfo(currentAccount);
			
			if (currentAccount.getAccountStatus().equals("active")) {
				activeLoop(currentAccount);
				
			} else if (currentAccount.getAccountStatus().equals("pending")) {
				pendingLoop(currentAccount);
				
			} else if (currentAccount.getAccountStatus().equals("canceled")) {
				System.out.println("\nThis account was canceled. You can't work with it. Call us!");
			}
	}
	
	
	public static void activeLoop(BankAccount currentAccount) {
		// TODO implement active account methods 
		Boolean finishWorkWithAccount = false;
		while (!finishWorkWithAccount) {
			System.out.println("What whoud you like to do?");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Transfer");
			System.out.println("4. Back to Main Menu");
			System.out.println("Input number of action 1-4:");
			
			String content = sc.nextLine();
			switch (content) {
			case "1":
				CustomerDepositLoop.start(currentAccount);
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				finishWorkWithAccount = true;
				break;
			default:
				break;
			}
		}
	}
	
	
	public static void pendingLoop(BankAccount currentAccount) {
		Boolean finishWorkWithAccount = false;
		while (!finishWorkWithAccount) {
			System.out.println("What whoud you like to do?");
			System.out.println("1. Cancel Application");
			System.out.println("2. Back to Main Menu");
			System.out.println("Input action number");
			
			String content = sc.nextLine();
			
			switch (content) {
			case "1":
				adi.cancelAccount(currentAccount.getAccountNumber());
				System.out.println("\nYou cancel this account #"+currentAccount.getAccountNumber());
				finishWorkWithAccount = true;
				break;
			case "2":
				finishWorkWithAccount = true;
				break;
			default:
				break;
			}
		}
	}
	
	public static void printAccountInfo(BankAccount account) {
		System.out.format("\n\n==================\n"
				+ "Account: %s\n"
				+ "Account number: %s\n"
				+ "Status: %s\n"
				+ "Balance: $%s\n\n", 
					account.getAccountName(), 
					account.getAccountNumber(),
					account.getAccountStatus(),
					account.getBalance()
				);
	}
}
