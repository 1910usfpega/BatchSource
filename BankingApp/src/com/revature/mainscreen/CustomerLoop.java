package com.revature.mainscreen;

import java.util.Scanner;
import java.util.Set;

import com.revature.storage.CustomerStorage;
import com.revature.storage.LoginInfo;
import com.revature.user.Account;
import com.revature.user.Customer;

public class CustomerLoop {

	public static void customerLoop(Scanner sc) {
		// Start by entering username and the password
		String input="";
		Customer thisUser=new Customer();
		boolean loggedIn=false;
		while (loggedIn==false) {
			System.out.println("Enter your username. (Enter \"back\" to go back)");
			String ru=sc.nextLine();
			if (ru.toLowerCase().equals("back")) {
				return;
			}
			System.out.println("Enter your password.");
			String rp=sc.nextLine();
			if (LoginInfo.checkUser(ru, rp)==true) {
				thisUser=CustomerStorage.getThisCustomer(ru);
				loggedIn=true;
			}
		}
		while (input != "EXIT") {
			System.out.println("Press 1 to deposit");
			System.out.println("Press 2 to withdraw");
			System.out.println("Press 3 to transfer");
			System.out.println("Press 4 to apply for a new account");
			System.out.println("Press 5 to exit.");
			input = sc.nextLine();
			switch (input) {
			
			case "1":
				// This is the DEPOSIT branch
				if(thisUser.getMyAccounts().size()==0) {
					System.out.println("Sorry, you don't have any accounts yet.");
				}else {
					Set<Integer> set=thisUser.getAccountNumbers();
					boolean found=false;
					while (found==false){
						System.out.println(set);
						System.out.println("Enter account number you want to deposit to. (Enter \"back\" to go back)");
						String r1=sc.nextLine();
						if (r1.toLowerCase().equals("back")) {
							return;
						}else if(set.contains(Integer.parseInt(r1))) {
							Account acct=thisUser.getThisAccount(Integer.parseInt(r1));
							System.out.println("Enter deposit amount.");
							String r2=sc.nextLine();
							double amount = Double.parseDouble(r2);
							if (amount>0) {
								System.out.println(thisUser.deposit(amount, acct));
								System.out.println("Deposit successful.");
							}else {
								System.out.println("That is not a valid number");
							}
							
						}else {
							System.out.println("Sorry, that's not one of your account numbers");
						}
					}
				}
				break;
				
				
			case "2":
				// This is the WITHDRAW branch
				System.out.println("Enter withdraw amount.");
				//if (amount>0 && amount<acct.getAccountBalance())
			case "3":
				// This is the TRANSFER branch
				System.out.println("Enter account number of the account you want to transfer FROM.");
				String r1=sc.nextLine();
				System.out.println("Enter account number of the account you want to transfer TO.");
				String r2=sc.nextLine();
				System.out.println("Enter amount you want to transfer.");
				String r3=sc.nextLine();
				
			}

		}

	}


}
