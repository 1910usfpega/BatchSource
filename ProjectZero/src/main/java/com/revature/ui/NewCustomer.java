package com.revature.ui;

import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.storage.MotherLoad;

public class NewCustomer {

	public static  void newLoop(Scanner in, MotherLoad ml) {
		String input;
		boolean nameFree = false;
		while(nameFree ==false) {		

		System.out.println("Press 1 to Register");
		System.out.println("Press 2 to exit");
		input = in.nextLine();
		int putIn = Integer.parseInt(input);
		switch(putIn) {
			case 1:
				//logic for applying for an account 
				if (nameFree == false) {
				System.out.println("Enter First Name");
				String fn = in.nextLine();
				System.out.println("Enter Last Name");
				String ln = in.nextLine();
				System.out.println("Enter a potential User Name");
			String un = in.nextLine();
			if(ml.userNameAvailability(un)== true) {
				System.out.println("User Name Available \n Enter a Password");
				String pw = in.nextLine();
				Customer newClient = new Customer(fn,ln,un,pw);
				ml.addLogIn(un, pw);
				ml.addUser(newClient);
				System.out.println("new user added");
				nameFree = true;
				} else {System.out.println("That User Name has been taken, please choose another");
					}
				}
				break;
			case 2:
				return;
		default: System.out.println("Please enter a valid input.");
		break;
		
		}
		}
	}
	}
	

