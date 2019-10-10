package com.revature.wrappers;

public class Wrapperz {
	
	/* Wrapper
	 * Wraps around a primitive type and allows it to be treated as an object. 
	 * Also good for their utility methods
	 * Character
	 * Boolean
	 * Byte
	 * Short
	 * Integer
	 * Long
	 * Float
	 * Double
	 * Number is the common super-type for char, float, double, and all numeric types.
	 */
	//static variables b/c we won't make an instance of this class,
	//they belong to the class.
	//primitives have no methods associated.
	//Boxing is expensive
	
	static  int myInt = 3;
	static Integer myInteger = 5;
	
	static Integer newInteger = 7;
	
	static Double myDouble = 45.99;
	
	public static void main(String[] args) {
		
		myInteger.byteValue();
		//auto-boxing- implicit conversion from primitive to Wrapper. myInteger.doubleValue() returns a primitive type.
		System.out.println(addEmUp(myInteger.doubleValue(), myDouble));
		
		//auto-unboxing- implicit conversion from a Wrapper to a primitive. both myInteger and newInteger are Wrapper types.
		System.out.println(addEmUp(myInteger, newInteger));
		
		System.out.println(addEmUp1(myInt, newInteger));
	}
	
	public static int addEmUp(int a, int b) {
		return a+b;
	}

	public static double addEmUp(Double a, Double b) {
		return a+b;
	}
	
	public static Double addEmUp1(Number a, Number b) {
		return a.doubleValue() + b.doubleValue();
	}
}
