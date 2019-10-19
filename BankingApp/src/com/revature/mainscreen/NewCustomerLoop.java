package com.revature.mainscreen;

import java.util.Scanner;

import com.revature.storage.CustomerStorage;
import com.revature.storage.LoginInfo;
import com.revature.user.Customer;

public class NewCustomerLoop {
	public static void newCustomerLoop(Scanner sc) {
		boolean uniqueName = false;
		while (uniqueName == false) {
			System.out.println("What would you like your username to be? (Enter \"back\" to go back)");
			String r1 = sc.nextLine();
			if (r1.toLowerCase().equals("back")) {
				return;
			} else if (LoginInfo.alreadyUsed(r1) == false) {
				System.out.println("What would you like your password to be?");
				String r2 = sc.nextLine();
				LoginInfo.newUser(r1, r2);
				Customer newUser = new Customer(r1, r2);
				CustomerStorage.add(newUser);
				System.out.println("New user info added.");
				uniqueName = true;
				//write to file
			} else {
				System.out.println("Sorry, that username has been taken.");
			}
		}

	}
}
