package com.revature.varargs;

public class FunWithVarargs {//varargs allow to vary the amount of arguments that a method can put in
	/* Variable length arguments-varargs
	 * Method that will take a variable number of arguments
	 * Automates and hides the process of creating and saving 
	 * the values into an array prior to invoking the method
	 * Can be of any type!
	 * Must be the last argument!
	 */
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1,2,3,4,5,6,7,8,4,6,3);
		vaTest();
	}
	public static void vaTest( int ... v) {
		System.out.println("Number of args is : "+ v.length + " Contents");
		for(int x:v) {
			System.out.print(x+" ");
			
		}
	}
   
}
