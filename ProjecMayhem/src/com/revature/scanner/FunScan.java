package com.revature.scanner;

import java.util.Scanner;

public class FunScan {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Scanner gets input from user
		
		String contents;
		System.out.println("What would you like to type?");
		contents = sc.nextLine();
		System.out.println("You entered: "+contents);
		
		System.out.println("Now what would you like to type?");
		contents = sc.nextLine();
		System.out.println("You entered: "+contents);
		
		System.out.println("Int?");
		contents = sc.nextLine();
		int i = Integer.parseInt(contents);
		double d = Double.parseDouble(contents);
		System.out.println("You entered: "+i);

	}

}
