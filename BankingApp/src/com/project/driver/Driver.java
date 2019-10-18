package com.project.driver;

import java.util.Scanner;

import com.project.users.Person;

public class Driver {

	public static Scanner input = new Scanner(System.in);
	public static String uInput, uPassword;
	public static int valid;
	public static boolean badInput = true;
	public static boolean uCheck = true;
	public static void main(String[] args) {

		do {
			System.out.println("What would you like to do today?");
			System.out.println("================================");
			System.out.println("1. Existing User");
			System.out.println("2. Create an Account");
			System.out.println("3. Employee Login");
			System.out.print("Enter: ");

			try {
				uInput = input.next();
				valid = Integer.parseInt(uInput);
				if (valid > 0 && valid < 4)
					badInput = false;
				else
					badInput = true;

			} catch (Exception e) {
				System.out.println("\nEnter a valid option.");
				badInput = true;
			}
		} while (badInput);

		switch(valid) {
		case '1': 
			System.out.print("Existing User");
			uInput = input.next();
			uPassword = input.next();
			Person.login(uInput, uPassword);
			break;
		case '2':
			System.out.println("Creating an Account: ");
			
			do {
			System.out.print("Pick a username: ");
			uInput = input.next();
			uCheck = Person.userCheck(uInput);
			} while(uCheck);
			
			//Limit the password length
			System.out.print("Enter a password: ");
			uPassword = input.next();
			
			//Write username and password to a file
			//Call another menu
			uCheck = true;
			break;
		case '3':
			System.out.print("Employee Login");
			System.out.print("Employee Username: ");
			uInput = input.next();
			System.out.print("Password: ");
			uPassword = input.next();
			do {
			uCheck = Person.login(uInput, uPassword);
			} while(uCheck);
			
			uCheck = true;
			break;
		default:
			break;
		}
	}

}
