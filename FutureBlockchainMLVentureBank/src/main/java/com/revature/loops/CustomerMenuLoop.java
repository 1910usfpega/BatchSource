package com.revature.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.BankAccount;
import com.revature.beans.Customer;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.util.GlobalStorageSingletone;

public class CustomerMenuLoop {
	public static Scanner sc = new Scanner(System.in);
	public static GlobalStorageSingletone gss = GlobalStorageSingletone.getInstance();
	
	public static void start() {
//		Boolean exit_from_user_account = false;
		
		while (gss.getCurrentUser() != null) {
			Customer currentUser = (Customer) gss.getCurrentUser();
			
			
			List<String> commands = new ArrayList<String>();
			commands.add("Apply for a new account");
			
			// Add Accounts to Commands
			AccountDaoImpl adi = new AccountDaoImpl();
			List<BankAccount> accountsList = adi.getBankAccountByUserId(currentUser.getUserId());
			for (int i=0; i<accountsList.size(); i++) {
				commands.add("Work with account: #" + accountsList.get(i).getAccountNumber());
			}
			
			commands.add("Exit");
			 
			
			System.out.println("YOU ARE IN CUSTOMER ACCOUNT");
			System.out.println("WELCOME, " + currentUser.getFirstName() + " " + currentUser.getLastName() + "!");
			System.out.println("Your accounts:");
			for (int i=0; i<accountsList.size(); i++) {
				BankAccount account = accountsList.get(i);				
				System.out.print(" - " + account.getAccountName() + " (Account number: #"+account.getAccountNumber() + ") – " );
    			if (account.getAccountStatus().equals("pending")) {
    				System.out.print("pending");
    			} else if (account.getAccountStatus().equals("canceled")) {
    				System.out.print("canceled");
    			} else {
    				System.out.print("$"+account.getBalance());
    			}
    			System.out.println();
			}
			
			System.out.println("\n\nWhat would you like to do?");
			for (int i=0; i<commands.size(); i++) {
        		System.out.println((i+1) + ". "+ commands.get(i));
        	}
			System.out.print("Input number of action 1-" + commands.size()+": ");
			
			if (sc.hasNextInt()) {
        		Integer contentsFromUser = sc.nextInt();
        		if ( contentsFromUser <= commands.size() && contentsFromUser>0 ) {
        			if (commands.get(contentsFromUser-1).equals("Apply for a new account")) {
        				CustomerApplyNewBankAccountLoop.start();
        				
        			} else if (commands.get(contentsFromUser-1).equals("Exit")) {
        				System.out.println("You Exited from your account\n\n\n");
        				gss.setCurrentUser(null);
        				
        			} else if (commands.get(contentsFromUser-1).substring(0,"Work with account: #".length()).equals("Work with account: #")) {
         				String accountNumString =  commands.get(contentsFromUser-1).substring("Work with account: #".length());
         				Integer accountNum = Integer.parseInt(accountNumString);
         				CustomerWorkWithAccountMenuLoop.start(accountNum);
         				
         			} 
        		}
        	}
		}
	}
}
