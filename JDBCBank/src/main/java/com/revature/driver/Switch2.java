package com.revature.driver;
import java.util.Scanner;
public class Switch2 {
	public static Scanner sc = new Scanner(System.in);

	
	public static void input2() {
		String Input1 = "";
	do {						
	System.out.println("C - Create an account, R - Remove an account, W- Withdraw, D- Deposit, Q-Quit");
	Input1 = sc.nextLine();
	switch (Input1)
	{
	case "C":
		System.out.println("Created!");
		break;
		
	case "R":
		System.out.println("Deleted!");		
		break;
	case "W":
		System.out.println("No money for u!");
		break;
	case "D":
		System.out.println("You broke.");
		break;
	} 
	}while(!Input1.equals("Q"));
	}
}
