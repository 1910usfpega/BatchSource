//Reverse a string without using a temporary variable.  Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.

package com.homework.assignments;

import java.util.Scanner;

public class ProblemThree {
	
	public static Scanner myString = new Scanner(System.in);
	
	public static void reverse() {
		
		//Inputting a string
		System.out.print("Enter a string: ");
		String s = myString.nextLine();
		System.out.print("Your String: ");
		System.out.print(s);
		
		System.out.print("\nYour string reversed: ");
		//Print out each letter in the array backwards
		for(int i = s.length(); i > 0; i--) {
			System.out.print(s.charAt(i-1));
		}
	}
	
	
	
}
