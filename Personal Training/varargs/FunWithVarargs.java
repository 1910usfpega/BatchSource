package com.revature.varargs;

public class FunWithVarargs {
	/*Variable length arguments - varargs
	 * used inside of method parameters
	 * Method that will take a variable number of args
	 * Automates and hides the prescess of creating and saving 
	 * the values onto an array prior  to invoking the method
	 * Can be the last arguments 
	 * 0 can be an argument
	 */
	public static void main(String[] args) {
		vaTest(10);
		vaTest(1,3,4,5,5,6,6,7,7,7,8,8,345,234,3,3456,345);
		vaTest(0);
	}
	//... tells the JVM that there willbe a series of "Named type
	public static void vaTest(int...v) {
		System.out.println("Number of args is : " + v.length+ " Contents");
		//v is an array
		//x represents the v's as they come through
		for (int x:v) {
			System.out.print(x + " ");
		}
		System.out.println();
		
	}
	
	

}
