package com.revature;

	/**
	 * 	Class EvenInteger
	 * 	@author James Todd
	 *
	 * 	EvenInteger is a class designed to determine whether a number is even without using modulus (%)
	 * 
	 * 	One method: isEven(int)
	 * 
	 * 	isEven(int) - a method that receives one integer, casts the integer into a double, and divides that double by two. If the 
	 *		two values are equal, the method will return true; otherwise it will return false
	 *
	 */

public class EvenInteger {

	public static boolean isEven(int n) {
		System.out.println("Q6");
		System.out.print("Is Even: ");
		
		double match = n;
		
		match /= 2;
		n /= 2;
		
		if(match == n) {
			return true;
		}
		else {return false;}
	}
	
}
