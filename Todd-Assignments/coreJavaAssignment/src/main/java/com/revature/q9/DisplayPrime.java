package com.revature.q9;

import java.util.ArrayList;

/**
 * 	Class DisplayPrime
 * 	@author James Todd
 * 
 * 	DisplayPrime is a class designed to display all prime numbers between 1 and 100 inclusive.
 * 
 * 	One method: <method>prime</method>
 * 
 *	<method>prime</method> is a method that creates and populates an ArrayList with the numbers 1 through 100. Using an enhanced
 *		for loop, checks whether or not a number is a prime number. If the checked number is prime, display in the console.
 */


public class DisplayPrime {
	
	public static void prime(){
		System.out.println("Q9");
		
		ArrayList<Integer> p = new ArrayList<Integer>();
		int count = 0;
		
		for(int x=1; x<=100; x++) {
			p.add(x);
		}
		System.out.println("Prime Numbers: ");
		//Checks to see how many times a number is evenly divisible. Prime numbers can only be evenly divided twice,
		// by 1 and by itself, with the exception of 1.
		for(int i=1; i<=p.size(); i++) {
			for(int j=1; j<=i; j++) {
				if (i%j == 0) {count++;}
			}
			//System.out.print(i + " count: " + count + "|| ");
			//1 is a prime number. Display 1
			if(i == 1) {System.out.print(i + " ");}
			//Display numbers that follow the aforementioned pattern
			if(count == 2) {System.out.print(i + " ");}
			count = 0;
		}
		System.out.println("\n");
	}
}
