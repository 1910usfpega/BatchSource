//Write a program that defines an interface having the following methods: addition, subtraction, multiplication, and division.
//Create a class that implements this interface and provides appropriate functionality to carry out the required operations.
//Hard code two operands in a test class having a main method that calls the implementing class.


package com.homework.assignments;

public class ProblemFifteen implements Problem15{

	public ProblemFifteen() {
		
	}
	
	//Add, subtract, multiply, and divide methods respectively
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mult(int a, int b) {
		return a * b;
	}

	@Override
	public double div(int a, int b) {
		return (double)a/b;
	}
	
}
