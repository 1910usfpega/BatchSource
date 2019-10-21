package com.revature.assignment;

import java.util.Scanner;

public class Q16 {

	public static void displayString() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a string");
	    String s = sc.nextLine();// methods should be called with () even if have no argument

	    for (int i = 0; i < s.length(); i++) {   
	    }//close the for loop here
	    System.out.println("Total amount of characters: " + s.length() + " - " + s);
	}
}
