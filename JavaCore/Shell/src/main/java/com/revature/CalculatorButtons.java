package com.revature;

public class CalculatorButtons implements CalculatorInterface {
	int a;
	int b;
	
	public void addition () {
		System.out.println(a+b);
	}
	
	public void subtraction() {
		System.out.println(a-b);
	}
	public void multiplication() {
		System.out.println(a*b);
	}
	
	public void division() {
		System.out.println(a/b);
	}
	
	
}
