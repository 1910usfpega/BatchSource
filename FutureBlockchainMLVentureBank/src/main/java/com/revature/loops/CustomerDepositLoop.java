package com.revature.loops;

import java.util.Scanner;

import com.revature.beans.BankAccount;
import com.revature.daoimpl.AccountDaoImpl;

public class CustomerDepositLoop {
	public static Scanner sc = new Scanner(System.in);
	public static AccountDaoImpl adi = new AccountDaoImpl();
	
	public static void start(BankAccount currentAccount) {
		
		Double amount = 0.0;
		
		while (amount == 0.0) {
			System.out.println("How much would you like to deposit?");
			if (sc.hasNextDouble()) {
				amount = sc.nextDouble();
			} else if (sc.hasNextInt()) {
				amount = (double) sc.nextInt();
				
			} else if (sc.hasNext()) {
				sc.nextLine();
			}
			
			if (amount > 0) {
				adi.deposit(currentAccount, amount);
				System.out.println("$"+amount+" deposited successfully to account #"+currentAccount.getAccountNumber());
			} else {
				amount = 0.0;
				System.out.println("Incorrect amount");
			}
		}
		
		
	}

}
