package com.revature.homework;

import com.revature.driver.QuestionFifteenInterface;

/******************************************************************************
 *  Q15. Write a program that defines an interface having the following methods:
 *  	 addition, subtraction, multiplication, and division. Create a class
 *  	 that implements this interface and provides appropriate 
 *  	 functionality to carry out the required operations. Hard code two 
 *  	 operands in a test class having a main method that calls the 
 *  	 implementing class.
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question15 implements QuestionFifteenInterface{

	@Override
	public int addition(int x, int y) {
		
		return x+y;
	}

	@Override
	public int subtraction(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int multiplication(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int division(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}

}
