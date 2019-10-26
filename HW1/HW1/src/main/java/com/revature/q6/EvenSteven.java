package com.revature.q6;

import java.util.Scanner;

public class EvenSteven {

	public static Scanner input = new Scanner(System.in);
	
	public static void noPercentage() {
		System.out.print("Enter an integer to check if it's even:  ");
		int answer = input.nextInt();
		if((answer/2) * 2 == answer) {
			System.out.println("\t" + answer + " is an even integer!");
		}
		else {
			System.out.println("\t" + answer + " is an odd integer!");
		}
	}
	
}
