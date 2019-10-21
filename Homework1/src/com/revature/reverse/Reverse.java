package com.revature.reverse;

import java.util.Scanner;

public class Reverse {
	System.out.println("Enter a string to reverse.");
	Scanner read = new Scanner(System.in);
	
	String original = read.nextLine();
	String reverse = "";
	
	for( int i = original.length() - 1; i >= 0; i--) {
		reverse = reverse + original.charAt(i);
	}
	
	System.out.println(original + " reversed is " + reverse);
}
