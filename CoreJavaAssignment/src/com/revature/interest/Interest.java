package com.revature.interest;

import java.util.Scanner;

public class Interest {
	
	public static void findInterest() {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter principal amount: ");
		int p = scan.nextInt();
		System.out.println("Enter interest rate: ");
		String r = scan.next();
		double R = Double.parseDouble(r);
		System.out.println("Enter time in years: ");
		int y = scan.nextInt();
		
		double t = p * R * y;
		System.out.println("The simple interest is: " + t);
		
		
	}

}
