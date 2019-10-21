package com.revature.tasks;

import com.revature.interfacedemo.MathImplementation;

public class Q15 {
	/*
	 * Write a program that defines an interface having the following methods: 
	 * addition, subtraction, multiplication, and division. 
	 * 
	 * Create a class that implements this interface and provides appropriate 
	 * functionality to carry out the required operations. Hard code two operands 
	 * in a test class having a main method that calls the implementing class.
	 */
	
	public static void main(String [] args) {
		System.out.println();
		System.out.println("==> Q15");
		MathImplementation mm = new MathImplementation();
		
		Double arg1 = 2.0;
		Double arg2 = 4.0;
		
		
		System.out.format("Arg1: %s Arg2: %s\n", arg1, arg2);
		Double addition 		= mm.addition(arg1, arg2);
		Double substraction 	= mm.substraction(arg1, arg2);
		Double multiplication 	= mm.multiplication(arg1, arg2);
		Double division 		= mm.division(arg1, arg2);
		
		
		System.out.println("Addition: " + addition);
		System.out.println("Substraction: " + substraction);
		System.out.println("Multiplication: " + multiplication);
		System.out.println("Division: " + division);
	}
}
