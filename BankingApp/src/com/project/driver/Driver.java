package com.project.driver;

import java.util.Scanner;

public class Driver {

	public static Scanner input = new Scanner(System.in);
	public static String uInput;
	public static int valid;
	public static boolean badInput = true;

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
	}	
}
