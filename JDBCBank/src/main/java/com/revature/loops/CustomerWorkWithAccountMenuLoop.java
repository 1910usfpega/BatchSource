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
			
			if (currentAccount.getAccountStatus().equals("active") || currentAccount.getAccountStatus().equals("approved")) {
				activeLoop(currentAccount);
				
			} else if (currentAccount.getAccountStatus().equals("pending")) {
				pendingLoop(currentAccount);
				
			} else if (currentAccount.getAccountStatus().equals("canceled")) {
				canceledLoop(currentAccount);
			}
	}
	public static void canceledLoop(BankAccount currentAccount) {
		Boolean finishWorkWithAccount = false;
		while (!finishWorkWithAccount) {
			System.out.println("\nThis account was canceled");
			System.out.println("What whoud you like to do?");
			System.out.println("1. Close account");
			System.out.println("2. Back to Main Menu");
			System.out.println("Input number of action 1-2:");
			String content = sc.nextLine();
			switch (content) {
				case "1":
					adi.deleteBankAccount(currentAccount.getAccountNumber());
					System.out.println("Account #"+currentAccount.getAccountNumber()+" closed");
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
	
	public static void activeLoop(BankAccount currentAccount) {
		// TODO implement active account methods 
		Boolean finishWorkWithAccount = false;
		while (!finishWorkWithAccount) {
			System.out.println("What whoud you like to do?");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Back to Main Menu");
			System.out.println("4. Close account");
			System.out.println("Input number of action 1-3:");
			
			String content = sc.nextLine();
			switch (content) {
			case "1":
				CustomerDepositLoop.start(currentAccount);
				break;
			case "2":
				CustomerWithdrawLoop.start(currentAccount);
			case "3":
				finishWorkWithAccount = true;
				break;
			case "4":
				if (currentAccount.getBalance() != 0) {
					System.out.println("You can't close this account. You need to withdraw money before.");
				} else {
					adi.deleteBankAccount(currentAccount.getAccountNumber());
					System.out.println("Account #"+currentAccount.getAccountNumber()+" closed");
					finishWorkWithAccount = true;
				}
				
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
			System.out.println("1. Cancel Application and close account");
			System.out.println("2. Back to Main Menu");
			System.out.println("Input action number");
			
			String content = sc.nextLine();
			
			switch (content) {
			case "1":
				adi.deleteBankAccount(currentAccount.getAccountNumber());
				System.out.println("\nYou closed account #"+currentAccount.getAccountNumber());
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
