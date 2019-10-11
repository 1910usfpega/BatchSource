package com.revature.varargs;

public class FunWithVarargs {
	/*
	 * Variable length arguments- varargs.
	 * Method that require an arbitrary number of values, no need to create array & invoke it.
	 * MEthod that will take a variable number of arguments
	 * Automates and hides the process of creating and saving 
	 * the values into an array prior to invoking the method
	 * can be of any type
	 * must be the last argument in the class. Only 1 allowed.
	 * varargs give you the option to not have to make an array.
	 */
	
	public static void main(String[] args) {
		vaTest(10);
		
		vaTest(1,2,3,4,5,6,7,8,9,10);
		
	}
	
	public static void vaTest(int ... v) {
		System.out.println("Number of args is: " + v.length + " Contents");
		
		for (int x: v) {
			System.out.print(x + " ");
		}
		
	}

}
