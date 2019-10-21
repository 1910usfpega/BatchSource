package com.revature.exercises;

import java.util.Scanner;

public class Q17 {
	   
		public static void calculator() {
			Scanner in = new Scanner(System.in);
	        System.out.println("The principal amount is: ");
	        double principal = in.nextDouble();
	        System.out.println("Enter years of loan :");
	        double time = in.nextDouble();
	        System.out.println("Enter annual rate for loan: ");
	        double rate = in.nextDouble();
	        double interest = (principal * rate * time);
	        System.out.println("The simple interest of the amount is: " + interest);
		}
	}

