package com.revature.driver;

import java.util.Scanner;

import com.revature.bean.Employee;
import com.revature.bean.Person;
import com.revature.bean.bankAccount;

public class Driver {

	public static Scanner input = new Scanner(System.in);
	public static String uInput, uPassword, first, last;
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
			System.out.println("4. Exit");
			System.out.print("Enter: ");

			try {
				uInput = input.next();
				valid = Integer.parseInt(uInput);
				if (valid > 0 && valid < 5) {
					badInput = false;
				} else
					badInput = true;

			} catch (Exception e) {
				System.out.println("\nEnter a valid option.");
				badInput = true;
			}
		} while (badInput);

		switch (valid) {
		case 1:
			System.out.print("Existing User");
			System.out.print("Username: ");
			uInput = input.next();

			do {
				System.out.print("Password: ");
				uPassword = input.next();
				if (Person.login(uInput, uPassword)) {
					// login
				} else
					System.out.println("Invalid.");
			} while (Person.login(uInput, uPassword));
			break;
		case 2:
			System.out.println("Creating an Account: ");

			System.out.print("Enter your first name: ");
			first = input.next();
			System.out.print("Enter your last name: ");
			last = input.next();

			do {
				System.out.print("Pick a username: ");
				uInput = input.next();
				uCheck = Person.userCheck(uInput);
				do {
					System.out.print("Pick a password: ");
					uInput = input.next();
					// check password limitations
					// if password limitation is okay, break and write creation to file
				} while (!uCheck);
			} while (!uCheck);

			// Limit the password length
			System.out.print("Enter a password: ");
			uPassword = input.next();

			// Write username and password to a file
			// Call another menu
			break;
		case 3:
			int invalid = 0;
			do {
				System.out.print("Employee Login");
				System.out.print("\nEmployee Username: ");
				uInput = input.next();
				System.out.print("Password: ");
				uPassword = input.next();

				uCheck = Person.login(uInput, uPassword);
				
				//Do stuff after logging in

				if (invalid > 6) {
					System.out.println("Too many invalid inputs. Try again later");
					break;
				}
				invalid++;
			} while (!uCheck);
			break;
		case 4:
			System.out.println("\nExiting...");
			break;
		default:
			break;
		}
	}
}
