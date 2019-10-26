package com.revature.q4;

import java.util.Scanner;

public class Factorial {

	public static Scanner input = new Scanner(System.in);
	
	public static void exclaimationPoint() {
		System.out.print("What number would you like to get the factorial of?  ");
		int answer = input.nextInt();
		int result = 1;
		for(int i = 1; i <= answer; i++) {
			result = result * i;
		}
		System.out.println("\t" + result);
	}
	
}
