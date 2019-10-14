package com.revature.overloading;

public class Sum {

	static int add(int a, int b) {
		return (a+b);
	}
	
	static int add(double a, int b) {
		return (int) (a+b);
	}
	
	static Integer MyInteger = 6;
	static int add(int a, Integer MyInteger) {
		return (a+MyInteger);
	}
	
	public static void main(String[] args) {
		    MyInteger = 6;
			System.out.println(add(1, 2));//exact
			System.out.println(add(1, 2));//conversion
			System.out.println(add(1, MyInteger));//boxing
			
	}
    
}