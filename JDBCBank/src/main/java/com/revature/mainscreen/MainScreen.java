package com.revature.mainscreen;

import java.util.Scanner;


public class MainScreen {
	private static String input = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (input != "EXIT") {
			System.out.println("-----------------------------------------");
			System.out.println("MAIN SCREEN");
			System.out.println("Press 1 if you are not yet a customer");
			System.out.println("Press 2 if you are a customer");
			System.out.println("Press 3 if you are an employee");
			System.out.println("Press 4 if you are the admin");
			System.out.println("Press 5 to exit.");

			input = sc.nextLine();

			switch (input) {
			case "1":
				NewCustomerLoop.newCustomerLoop(sc);
				break;
			case "2":
				CustomerLoop.customerLoop(sc);
				break;
			case "3":
				EmployeeLoop.employeeLoop(sc);
				break;
			case "4":
				AdminLoop.adminLoop(sc);
				break;
			case "5":
				input = "EXIT";
				break;
			default:
				System.out.println("That is not a 1, 2, 3, 4 or 5. Try again");
			}
		}
		sc.close();
	}
}
