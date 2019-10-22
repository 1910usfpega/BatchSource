package com.revature.mainscreen;

import java.util.Scanner;

import com.revature.storage.Bank;
import com.revature.user.Customer;

public class NewCustomerLoop {
	public static void newCustomerLoop(Scanner sc, Bank bank) {
		boolean uniqueName = false;
		while (uniqueName == false) {
			String r1;
			do{
				System.out.println("(Enter \"back\" to go back)");
				System.out.println("What would you like your username to be? (; and : not allowed)");
				r1 = sc.nextLine();
			}while(r1.contains(";")||r1.contains(":"));
			if (r1.toLowerCase().equals("back")) {
				return;
			} else if (bank.custAlreadyUsed(r1) == false) {
				String r2;
				do{
					System.out.println("What would you like your password to be? (; and : not allowed)");
					r2 = sc.nextLine();
				}while(r2.contains(";")||r2.contains(":"));
				
				bank.newUser(r1, r2);
				Customer newUser = new Customer(r1, r2);
				bank.addCust(newUser);
				System.out.println("New user info added.");
				uniqueName = true;
				//write to file
			} else {
				System.out.println("Sorry, that username has been taken.");
			}
		}
	}
}
