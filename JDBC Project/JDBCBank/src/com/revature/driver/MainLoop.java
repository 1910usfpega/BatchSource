package com.revature.driver;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bean.Accounts;
import com.revature.bean.Users;
import com.revature.daoimpl.JDBCDaoImpl;

public class MainLoop {

	@SuppressWarnings("unused")
	public static void customerchoice(Scanner in) {

		JDBCDaoImpl jdi = new JDBCDaoImpl();

		// 1int num = in.nextInt();

		System.out.println("Hello User!");

		String user, pass;

		System.out.println("Enter your username:");
		user = in.next();
		System.out.println("Enter your password:");

		pass = in.next();
		if (pass.equals(jdi.checkPassword(user))) {
			System.out.println("Welcome Valued Customer!");
			System.out.println("Welcome to JDBC Bank!");
			System.out.println("Welcome User!");
			System.out.println("Enter 1 to Create a New Account");
			System.out.println("Enter 2 to Deposit");
			System.out.println("Enter 3 to Withdraw");
			System.out.println("Enter 4 To Delete Accounts");
			System.out.println("Enter 5 to View Account by Account ID");
			
			System.out.println("Enter 6 to Exit");
			String choice = in.next();
			Users thisuser = null;
			try {
				 thisuser = jdi.getAUsers(user);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			switch (choice) {
			case "1":
				jdi.uploadNewAccount(user);
				System.out.println("New Account Has Been Created!");
				break;
			case "2":
				System.out.println("What is the AccountID");
				int id = in.nextInt();

				Accounts thisAccount;
				try {
					thisAccount = jdi.getAnAccounts(id);
					System.out.println("How Much Would You Like to Deposit?");
					thisAccount.deposit(in.nextDouble());
					jdi.updateAccount(thisAccount);
					System.out.println("Deposit Successful!");
					System.out.println(thisAccount.getBalance());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case "3":
				System.out.println("What is the AccountID");
				int id2 = in.nextInt();
				System.out.println("Withdrawing more than your balance will result in an Overdraft Fee");
				Accounts thisAccount2;
				try {
					thisAccount2 = jdi.getAnAccounts(id2);
					System.out.println("How Much Would You Like to Withdraw?");
					thisAccount2.withdraw(in.nextDouble());
					jdi.updateAccount(thisAccount2);
					System.out.println("Withdraw Successful!");
					System.out.println(thisAccount2.getBalance());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				break;
			case "4":
				System.out.println("What is the AccountID?");
				int a = in.nextInt();
				jdi.deleteAccount(a);
				System.out.println("Account deleted successfully!");
				break;
			case "5":
				System.out.println("Enter Account ID to View Account");
				int a1 = in.nextInt();
				try {
					jdi.getAnAccounts(a1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					System.out.println(jdi.getAnAccounts(a1));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}break;
			
			case "6":
				// exit
				System.exit(0);
				break;
			default:
				System.out.println("Please choose between 1-6");
				break;

			}

		} else {
			System.out.println("You have entered wrong  password:");

		}

	}

}
