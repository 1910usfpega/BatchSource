package com.revature.driver;


/*
 *  Q15. Write a program that defines an interface having the following methods:
 *  	 addition, subtraction, multiplication, and division. Create a class
 *  	 that implements this interface and provides appropriate 
 *  	 functionality to carry out the required operations. Hard code two 
 *  	 operands in a test class having a main method that calls the 
 *  	 implementing class.
 */
public abstract interface QuestionFifteenInterface {
	
	public abstract int addition(int x,int y);
	public abstract int subtraction(int x,int y);
	public abstract int multiplication(int x,int y);
	public abstract int division(int x,int y);

}
