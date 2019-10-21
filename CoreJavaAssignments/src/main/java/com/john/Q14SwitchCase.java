package com.john;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Write a program that demonstrates the switch case. Implement the following functionalities in the cases:java
Case 1: Find the square root of a number using the Math class method.
Case 2: Display today’s date.
Case 3: Split the following string and store it in a string array. “I am learning Core Java”

 * @author johnljennings
 *
 */
public class Q14SwitchCase {
	
	public static void demo(String java) {
		switch(java) {
		case "squareRoot":
			double sqrRoot = Math.sqrt(144);
			System.out.println("This SquareRoot of 144 will always result in: " + sqrRoot);
			break;
			
		case "Today":
			DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		       Date dateobj = new Date();
		       System.out.println(df.format(dateobj));

			break;
		case "splitString":
			String core = "I am learning Core Java";
	        String[] arrOfStr = core.split(" "); 
	  
	        for (String a : arrOfStr) 
	            System.out.println(a);
			break;
			
			default:
				System.out.println("Matt ares the bestest human being teaching teacher that teaches tech");
		}
	}
}
