package com.john;

/**
 * Write a program that calculates the simple interest
 *  on the principal, rate of interest and number of years 
 *  provided by the user. Enter principal, rate and time
 *  through the console using the Scanner class.
Interest = Principal* Rate* Time

 * @author johnljennings
 *
 */

public class Q17Interest {
	
	public static double calInterest(double principle, double rate, double time) {
		double interestRate = principle * rate * time;
		return interestRate;
	}
}
