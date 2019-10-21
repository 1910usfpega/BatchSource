package com.revature.questions;

import java.util.Scanner;

public class Q10 {
	/*
	 * gets 2 numbers from the user and compares them with ternary operators
	 */

	public static void main(Scanner sc) {
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the first number?");
		String r1 = sc.nextLine();
		int a = Integer.parseInt(r1);
		System.out.println("What is the second number?");
		String r2 = sc.nextLine();
		int b = Integer.parseInt(r2);

		int min=compare(a,b);
		
		
		System.out.println("The smaller number is "+min);
		

	}
	
	public static int compare(int a,int b) {
		int min = a<b ? a : b;
		return min;
	}

}
