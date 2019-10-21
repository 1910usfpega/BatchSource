package com.revature.differentpackage;

public class Implementor implements MathInterface {
	/*
	 * Question 15 requires an implementor for an interface.
	 * This is that implementor
	 */


	@Override
	public double addition(double a, double b) {
		return a+b;
		
	}

	@Override
	public double subtraction(double a, double b) {
		return a-b;
		
	}

	@Override
	public double multiplication(double a, double b) {
		return a*b;
		
	}

	@Override
	public double division(double a, double b) {
		return a/b;
		
	}

}
