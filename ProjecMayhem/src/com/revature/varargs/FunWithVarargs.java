package com.revature.varargs;

public class FunWithVarargs {
	/*
	 *Variable length arguments - varargs
	 * Method that will take a variable number of arguments
	 * Automates and hides the process of crating and saving
	 * the value into an array prior to invoking the method 
	 * Can be of any type!
	 * must be the last argument!
	 */
	static Integer myInteger1 = 3;
	static Integer myInteger2 = 9;
	
	public static void main(String[] args) {
		mult(3,4);
		mult(myInteger1, myInteger2);
		
		
//		vaTest(10);
//		vaTest(1,23,4,33,3,3,5,35,35,32,32,42,2);
//		vaTest(0);
	}
	
	public static void vaTest( int ... v ) {
		System.out.print("Number of args is: " + v.length + " \nContents: ");
		for (int x:v) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println();
	}
	
	
	public static int mult(int a, int b ) {
		System.out.println("Exact match");
		return a*b;
	}
	
	public static Integer mult(Integer a, Integer b) {
		System.out.println("Conversion match");
		return a*b;
	}
	
}
