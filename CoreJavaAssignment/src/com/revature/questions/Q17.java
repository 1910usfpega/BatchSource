package com.revature.questions;

import java.util.Scanner;

public class Q17 {

	public static void main(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle");
		String r1=sc.nextLine();
		System.out.println("Enter the rate of interest");
		String r2=sc.nextLine();
		System.out.println("Enter the number of years");
		String r3=sc.nextLine();
		System.out.println("The interest is $"+calculate(r1,r2,r3));
		
	}
	
	public static double calculate(String a,String b,String c) {
		double interest=Double.parseDouble(a)*Double.parseDouble(b)*Double.parseDouble(c);
		return interest;
	}

}
