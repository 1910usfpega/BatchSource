package com.revature.varargs;

public class FunWithVarargs {
	/*	Variable length arguments- varargs
	 * 		Method that will take a variable number of arguments
	 * 		Automates and hides the process of creating and saving the values
	 * 		  into an array prior to invoking the method
	 * 		Can be of any type!
	 * 		Must be the last argument!
	 * 		0 to many args
	*/
	public static void main(String[] args) {
		vaTest(10);
		vaTest(10, 1, 45, 6, 34, 26, 87, 107);
		vaTest();
		
	}
	
	public static void vaTest(int ... v) {
		System.out.println("Number of args is: " + v.length + ". Contents:");
		for(int x:v) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}