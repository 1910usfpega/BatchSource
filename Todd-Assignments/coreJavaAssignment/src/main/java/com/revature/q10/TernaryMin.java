package com.revature.q10;

	/**
	 * 	Class TernaryMin
	 * 	@author James Todd
	 * 
	 * 	TernaryMin is a class designed to display the lesser of two numbers using a ternary operator.
	 * 
	 * 	One method: <method>min(int, int)</method>
	 * 
	 * 	<method>min(int, int)</method> is a method that accepts two integers and compares them and displays one of the two values
	 * 		using a ternary operator
	 *
	 */
	
public class TernaryMin {

	public static void min(int a, int b) {
		System.out.println("Q10");
		
		int min = (a < b) ? a : b;
		System.out.println("Lesser number: " + min + "\n");
	}
	
}
