package com.revature.wrapperz;

public class Wrapperz {
	
	/*
	 * Wraps around primitive and allows it to be treated as an object 
	 * Character
	 * Boolean
	 * Byte
	 * Short
	 * Integer
	 * Long 
	 * Float 
	 * Double
	 * exception : String is an object so it doesn't need to be wrapped
	 * Why Wrappers?
	 * 	good for their utility method 
	 */
	static int myInt = 3; 
	static Integer myInteger = 5;
	static Integer newInteger = 7;
	static Double myDouble = 45.93;
	
	
	public static void main(String[] args) {//static is a modifier
		myInteger.byteValue();
		//myInt.
		//System.out.println(addEmUp(myInt,6));
		System.out.println(addEmUp(myInteger.doubleValue(),myDouble));
		//myInteger.getClass();
		//Auto-unboxing-implicit conversion from a wrapper to a primitive
		System.out.println(addEmUp(myInteger,newInteger));//addemUp is a method that takes two reference type parameters
		//Boxing is expensive!
		//Number wrapper for all numeric types
		System.out.println(addEmUp1(myInt, newInteger));//second method
	}
	public static int addEmUp(int a, int b) {
		return a+b;
	}
	public static double addEmUp(Double a, Double b) {
		return a+b;
	}
	public static Number addEmUp1(Number a, Number b) {//second method 
		return a.doubleValue()+b.doubleValue();
	}
}

