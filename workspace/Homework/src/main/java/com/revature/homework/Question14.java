package com.revature.homework;

import java.util.Date;
import java.util.Calendar;

/******************************************************************************
 * Q14. Write a program that demonstrates the switch case. Implement the 
 *  		following functionalities in the cases:java
 * 		 Case 1: Find the square root of a number using the Math class method.
 *  	 Case 2: Display today’s date.
 *  	 Case 3: Split the following string and store it in a string array. “I 
 *  				am learning Core Java”
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question14 {
	
	public void doTheThing(int x) {
		switch(x) {
		case 1:
			System.out.println("The Square root of 256 is: "+Math.sqrt(256));
			break;
		case 2:
			Date today = Calendar.getInstance().getTime();
			System.out.println(today);
			break;
		case 3:
			String n= "I am learning Core Java.";
			String[] y = n.split(" ");
			for(String i:y)System.out.println(i);
			break;
			default:
				System.out.println("Invalid entry.");
			
			
		}
		
			
	}

}
