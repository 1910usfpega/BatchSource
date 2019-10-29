package com.revature.loops;

import java.util.Scanner;

import com.revature.beans.BankAccount;
import com.revature.daoimpl.AccountDaoImpl;
import com.revature.exceptions.AccountOverdraftException;

public class CustomerWithdrawLoop {
	public static Scanner sc = new Scanner(System.in);
	public static AccountDaoImpl adi = new AccountDaoImpl();
	
	public static void start(BankAccount currentAccount) {
		
		Double amount = 0.0;
		
		while (amount == 0.0) {
			System.out.println("\n\n\n\n========WITHDRAW========");
			System.out.println("How much would you like to withdraw? $"+currentAccount.getBalance()+" avalialbe");
			
			if (sc.hasNextDouble()) {
				amount = sc.nextDouble();
			} else if (sc.hasNextInt()) {
				amount = (double) sc.nextInt();
				
			} else if (sc.hasNext()) {
				sc.nextLine();
			}
			
			
			if (amount <= currentAccount.getBalance()) {
				try {
					adi.withdraw(currentAccount.getAccountNumber(), amount);
					System.out.println("$"+amount+" withdraw successfully from account #"+currentAccount.getAccountNumber()+"\n");
				} catch (AccountOverdraftException e) {
					System.out.println("Not enough money\n");
					amount = 0.0;
				}
				
			} else {
				amount = 0.0;
				System.out.println("Incorrect amount");
			}
			
		}
	}
}
