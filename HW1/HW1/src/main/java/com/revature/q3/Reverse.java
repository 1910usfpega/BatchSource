package com.revature.q3;

import java.util.Scanner;

public class Reverse {

	public static Scanner input = new Scanner(System.in);
	
	public static void reverseReverse() {
		System.out.print("What String would you like to reverse?  ");
		String answer = input.nextLine();
		System.out.print("\t");
		for(int i = answer.length(); i > 0; i--) {
			System.out.print(answer.charAt(i-1));
		}
		System.out.println();
	}
	
}
