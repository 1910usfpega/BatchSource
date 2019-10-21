//Write a program that calculates the simple interest on the principal, 
//rate of interest and number of years provided by the user. 
//Enter principal, rate and time through the console using the Scanner class.
//Interest = Principal* Rate* Time

package com.homework.assignments;

import java.util.Scanner;

public class ProblemSeventeen {
	
	public static Scanner input = new Scanner(System.in);
	public static int time;
	public static double rate, principal, interest;
	
	public static void calculate() {
		
		//Taking in a principal, rate, and time inputs
		System.out.print("Enter a principal: ");
		principal = Double.parseDouble(input.next());
		System.out.print("Enter a rate: ");
		rate = Double.parseDouble(input.next());
		System.out.print("Enter a time(year): ");
		time = Integer.parseInt(input.next());
		
		//Multiply the inputs and display
		interest = principal * rate * time;
		System.out.print("\nThe interest with " + principal + " principal, " 
		+ rate + " rate, in " + time + " year(s) is: $" + interest);
	}
}
