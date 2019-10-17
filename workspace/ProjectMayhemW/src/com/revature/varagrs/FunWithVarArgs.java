package com.revature.varagrs;

public class FunWithVarArgs {

	/*
	 * Variable length arguments - varags
	 * Method thaty will takee a variable number of argument/parameters
	 * Automates and hides the process of creating and saving
	 * the values into an array prior to invoking them
	 * Can be of any type
	 * MUST be the LAST argument !!!
	 * 
	 */
	
	
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1,2,5,5,6,3,4,6,3,2,6,7,2,23423,234,3256,98);
		vaTest();
	}
	
	public static void vaTest(int ... v) {
		System.out.println("\n Number of args is : "+v.length+ ". \n Contents :");
		for(int x:v) {
			System.out.print(x+", ");
		}
	}
	
	
	
}
