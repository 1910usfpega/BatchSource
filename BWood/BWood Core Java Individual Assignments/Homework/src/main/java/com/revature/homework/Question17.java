package com.revature.homework;

import java.util.Scanner;

/******************************************************************************
 *  Q17. Write a program that calculates the simple interest on the principal, 
 *  	 rate of interest and number of years provided by the user. Enter 
 *  	 principal, rate and time through the console using the Scanner class.
 *  	 Interest = Principal* Rate* Time
 * @author Bryan Wood
 *
 *****************************************************************************/


public class Question17 {
	String s;
	
	public void calculateMoneyThings() {
		double prin;
		float rate;
		double years;
		double interest;
		System.out.println("Hello I will calculate simple intrest for you!\n"
				+"Please enter the priciple on which the interest is earned: ");
		Scanner sc = new Scanner(System.in);
		
		prin= Double.parseDouble(sc.next());
		
		System.out.println("You entered: $"+prin+"\n"
				+"Please enter the interest rate to be earned: ");
		rate =sc.nextFloat();
		
		System.out.println("You entered a rate of"+rate+"% \n"
				+"Please enter the number of years that the intrest will accrue");
		years = Double.parseDouble(sc.next());
		interest = prin*rate*years;
		System.out.println("Your interest has been calculated to be: $"+interest);
		System.out.println("Thank you! Goodbye!");
		sc.close();
	}

}
