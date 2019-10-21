package com.revature.questions;

import java.util.Date;
import java.util.Scanner;

public class Q14 {

	static Scanner sc = new Scanner(System.in);
	
	public static double main(String[] args) {
		System.out.println("Enter 1, 2, or 3");
		String r=sc.nextLine();
		
		return askUser(r);
		
	}
	public static double askUser(String r) {
		switch(r) {
		case "1":
			double m = Math.sqrt(2.0);
			System.out.println("The square root of 2 is a very interesting number, and it is approximately " + m);
			return m;
		case "2":
			Date d = new Date();
			System.out.println("Today's date and time is "+d);
			return 0.0;
		case "3":
			String firstString="I am learning Core Java";
			String[] splitString= firstString.split(" ");
			System.out.println("The string has been split and stored");
			for (String x : splitString) {
				System.out.println(x);
			}
			return 1.1;
		default:
			System.out.println("That's not a 1, 2, or 3. Try again.");
			System.out.println("Enter 1, 2, or 3");
			r=sc.nextLine();
			askUser(r);
			return 0;
		}
		
		
	}

}
