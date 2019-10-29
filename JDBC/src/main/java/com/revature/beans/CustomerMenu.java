package com.revature.beans;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.accountsdaoimpl.AccountsDaoImpl;
import com.revature.exception.WithdrawTooMuchException;
import com.revature.usersdaoimpl.UsersDaoImpl1;

public class CustomerMenu {

	public static void customermenu(Scanner in, String user) {

		AccountsDaoImpl adi = new AccountsDaoImpl();
		UsersDaoImpl1 udi = new UsersDaoImpl1();
		System.out.println("Press 1 to deposit");
		System.out.println("Press 2 to withdraw");
		System.out.println("Press 3 to create new Account");
		System.out.println("Press 4 to log out!");
		String key = in.next();
		switch (key) {
		case "1":
			// This is for deposit
			System.out.println("Please enter Account number");
			String c = in.next();
			int accountnumber = Integer.parseInt(c);
			Accounts acct = null;
			try {
				acct = adi.getAccountsbyaccounts_accountnumber(accountnumber);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("How much would you like to deposit?");
			c = in.next();
			double amount = Double.parseDouble(c);
			acct.Deposit(amount);
			adi.updatebalance(acct);
			System.out.println("Your new balance is " + acct.getAccounts_accountbalance());
			break;

		case "2":
			// This is for withdraw
			System.out.println("Please enter Account number");
			String d = in.next();
			int accountnumber1 = Integer.parseInt(d);
			Accounts acct1 = null;
			try {
				acct1 = adi.getAccountsbyaccounts_accountnumber(accountnumber1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("How much would you like to withdraw?");
			c = in.next();
			double amount1 = Double.parseDouble(c);
			try {
				acct1.withdraw(amount1);
			} catch (WithdrawTooMuchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			adi.updatebalance(acct1);
			System.out.println("Your new balance is " + acct1.getAccounts_accountbalance());
			break;

		case "3":
			//This is for Creating new account
			System.out.println("What type of account would you like to create?");
			System.out.println("What new username would you like to use?");
			String type= in.next();
			String username= in.next();
			
			Accounts z =new Accounts(type, username);
			adi.addAccount(z);
			System.out.println("Account successfully created!");
			break;
		case "4":
			System.out.println("You have succesfully logged out!");
			

		}
	}
}
