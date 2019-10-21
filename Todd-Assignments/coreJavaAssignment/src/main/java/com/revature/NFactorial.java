package com.revature;

	/**
	 * Class NFactorial
	 * @author James Todd
	 * 
	 * NFactorial is a class designed to display the calculated result of n factorial, n being a number passed as an argument to
	 *  	method factorial(int)
	 *  
	 * One method: factorial(int)
	 *  	
	 * factorial(int) - Method that accepts one int value and calculates that value's factorial. Displays the factorial, the full
	 *  	multiplication tree, and the calculated value
	 * 
	*/


public class NFactorial {
		
	public static void factorial(int n) {
		System.out.println("Q4");
		
		int total = 1;
		System.out.print(n + "! = ");
		for(int i=n;i>0;i--) {
			System.out.print(i);
			if(i>1) {System.out.print("*");}
			total*=i;
		}
		System.out.println(" = " + total + "\n");
	}
	
}
