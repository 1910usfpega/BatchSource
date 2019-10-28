package com.revature.daoimpl;

import java.util.Scanner;

import com.revature.dao.AdminMenuDao;

public class AdminMenuDaoImpl implements AdminMenuDao {

	static Scanner input = new Scanner(System.in);
	
	public void adminMenu(String currentUser, int currentAccount) {
		System.out.println("Welcome " + currentUser + "!");
		//System.out.println("ACCOUNT#: " + currentAccount);
		System.out.println("What would you like to do?");
		System.out.println(" 1. Check Balances\n 2. Withdraw\n 3. Deposit\n 4. Transfer Between Accounts\n 5. Open a New Account\n 6. View Customer Information");
		System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
		System.out.println();
		String answer = input.nextLine();
		//1 WILL SEND TO checkBalance() METHOD
		if (answer.equals("1")) {
			//AccountManagement.getAccountsByName(currentUser);
			adminMenu(currentUser, currentAccount);
		}
		//2 WILL SEND TO withdraw() METHOD
		else if (answer.equals("2")) {
			//withdraw	
		}
		//3 WILL SEND TO deposit() METHOD
		else if (answer.equals("3")) {
			//deposit
		}
		//4 WILL SEND TO transfer() METHOD
		else if (answer.equals("4")) {
			//AccountManagement.transferFunds(currentUser);
			adminMenu(currentUser, currentAccount);
		}
		//5 WILL ASK WHICH ACCOUNT TYPE THEY WOULD LIKE TO OPEN
		else if (answer.equals("5")) {
			System.out.println("Would you like to create a 1)Checking or 2)Savings account?");
			System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
			String choice = input.nextLine();
			if (choice.equals("1")) {
				//AccountManagement.CreateSinglePersonCheckingAccount(currentUser);
			}
			else if (choice.equals("2")) {
				//AccountManagement.CreateSinglePersonSavingsAccount(currentUser);
			}
			else {
				System.out.println("Invalid input.\n");
				System.out.println("////////////////////\n");
				adminMenu(currentUser, currentAccount);
			}
		}
		//5 WILL ASK YOU TO SEARCH FOR WHICH CUSTOMER YOU ARE LOOKING FOR BY USERNAME OR NAME
		else if (answer.equals("6")) {
			System.out.println("Would you like to search by 1)Username or 2)Full Name?");
			System.out.println("(Please enter numerical answers only i.e. 1 or 2)");
			String choice = input.nextLine();
			if (choice.equals("1")) {
				System.out.println("Please enter the customer's username:");
				String choice1 = input.nextLine();
				//UserAccountManagerTest.readUserFile();
//				for(int i = 0; i < UserAccountManagerTest.userList.size(); i++) {
//					if(UserAccountManagerTest.userList.get(i).getUser().equals(choice1)) {
//						System.out.println(UserAccountManagerTest.userList.get(i).toString());
//						adminMenu(currentUser);
//					}
//					else {
//						System.out.println("User does not exist.\n");
//						System.out.println("////////////////////\n");
//						adminMenu(currentUser);
//					}
//				}
			}
			else if (choice.equals("2")) {
				System.out.println("Please enter the customer's full name:");
				String choice1 = input.nextLine();
//				UserAccountManagerTest.readUserFile();
//				for(int i = 0; i < UserAccountManagerTest.userList.size(); i++) {
//					if(UserAccountManagerTest.userList.get(i).getName().equals(choice1)) {
//						System.out.println(UserAccountManagerTest.userList.get(i).toString());
//						adminMenu(currentUser);
//					}
//					else {
//						System.out.println("User does not exist.\n");
//						System.out.println("////////////////////\n");
//						adminMenu(currentUser);
//					}
//				}
			}
		}
		//USER INPUTS INVALID RESPONSE, RESTARTS
		else {
			System.out.println("Invalid input.\n");
			System.out.println("////////////////////\n");
			adminMenu(currentUser, currentAccount);
		}
	}
	
}
