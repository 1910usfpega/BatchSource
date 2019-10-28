package options;

import java.util.Scanner;

public abstract class Options {

	public static Scanner input = new Scanner(System.in);
	public static String uInput;
	public static double amount;
	public static int valid;
	public static boolean badInput = true;

	public static int startOption(int s) {

		do {
			System.out.println("What would you like to do today?");
			System.out.println("================================");
			System.out.println("1. Create an Account");
			System.out.println("2. Customer Login");
			System.out.println("3. Admin Login");
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
				System.out.println("\nInvalid Input. Enter a valid option.\n");
				badInput = true;
			}
		} while (badInput);
		return s = Integer.parseInt(uInput);
	}

	public static int cOption(int s, String t) {
		do {
			System.out.println("\n\nWelcome " + t + "!\nWhat would you like to do?");
			System.out.println("================================");
			System.out.println("1. View Account");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Close Account");
			System.out.println("5. Exit");
			System.out.print("Enter: ");

			try {
				uInput = input.next();
				valid = Integer.parseInt(uInput);
				if (valid > 0 && valid < 6) {
					badInput = false;
				} else
					badInput = true;

			} catch (Exception e) {
				System.out.println("\nInvalid Input. Enter a valid option.\n");
				badInput = true;
			}
		} while (badInput);
		return s = Integer.parseInt(uInput);
	}

	public static int aOption(int s, String t) {
		
		do {
			System.out.println("\n\nWelcome " + t + "!");
			System.out.println("================================");
			System.out.println("1. View an account");
			System.out.println("2. Open an account");
			System.out.println("3. Withdraw from an account");
			System.out.println("4. Deposit to an account");
			System.out.println("5. Close an account");
			System.out.println("6. Exit");
			System.out.print("Enter: ");

			try {
				uInput = input.next();
				valid = Integer.parseInt(uInput);
				if (valid > 0 && valid < 7) {
					badInput = false;
				} else
					badInput = true;

			} catch (Exception e) {
				System.out.println("\nInvalid Input. Enter a valid option.\n");
				badInput = true;
			}
		} while (badInput);
		return s = Integer.parseInt(uInput);
	}
}
