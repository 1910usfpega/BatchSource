package com.revature.mainscreen;

import java.util.Scanner;

import com.revature.beans.CustomerBean;
import com.revature.daoimpl.CustomerDaoImpl;
import com.revature.util.CheckDatabase;

public class NewCustomerLoop {
	public static void newCustomerLoop(Scanner sc) {
		boolean uniqueName = false;
		while (uniqueName == false) {
			String r1;
			System.out.println("(Enter \"back\" to go back)");
			System.out.println("What would you like your username to be?");
			r1 = sc.nextLine();
			if (r1.toLowerCase().equals("back")) {
				continue;
			} else if (CheckDatabase.usernameAlreadyUsed(r1) == false) {
				String r2;

				System.out.println("What would you like your password to be? ");
				r2 = sc.nextLine();
				CustomerBean newUser = new CustomerBean(r1, r2);
				CustomerDaoImpl cdi = new CustomerDaoImpl();
				cdi.addCustomerToDatabase(newUser);
				System.out.println("New user info added.");
				uniqueName = true;
			} else {
				System.out.println("Sorry, that username has been taken.");
			}
		}
	}
}
