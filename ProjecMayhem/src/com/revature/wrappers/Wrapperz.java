package com.revature.wrappers;

public class Wrapperz {
	/*Wrapper
	 * Wraps around primitive and allows it to be treated as an object
	 * Character 
	 * Boolean
	 * Byte
	 * Short
	 * Integer
	 * Long
	 * Float
	 * Double
	 * 
	 * Why wrappers??
	 * good for their utility methods
	 */
	
	static int myInt=3;
	static Integer myInteger = 5;
	static Integer newInteger = 7;
	static Double myDouble = 45.94;
	
	public static void main(String[] args) {
		myInteger.byteValue();
		// myInt.
		// Autoboxing – implicit conversion from primitive to Wrapper
		System.out.println(addEmUp(myInteger.doubleValue(), myDouble));
		// Auto-unboxing - implicit conversion from Wrapper to a primitive
		System.out.println(addEmUp(myInteger, newInteger));
		// Boxing is expensive!
		
		// Number-Wrapper for all numeric types
		System.out.println(addEmUp1(myInt, myDouble));
	}
	public static int addEmUp(int a, int b) {
		return a+b;
	}
	
	public static double addEmUp(Double a, Double b) {
		return a+b;
	}
	
	public static Number addEmUp1( Number a, Number b) {
		return a.doubleValue() + b.doubleValue();
	}
}
