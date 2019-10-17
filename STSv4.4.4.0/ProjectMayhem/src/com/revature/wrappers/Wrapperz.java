package com.revature.wrappers;

public class Wrapperz {
	/*	Wrapper
	 * 		Wraps around a primitive data type and allows it to be treated as an object
	 * 		Character, Boolean, Byte, Short, Integer, Long, Float, and Double (Capitalization DOES matter)
	 * 		Why wrappers??
	 * 			Good for their utility methods
	 * 			Used when we NEED an object
	*/
	
	static int myInt = 3;
	static Integer myInteger = 5;
	static Integer newInteger = 7;
	static Double myDouble = 45.93;
	
	public static void main(String[] args) {
		myInteger.byteValue();
		//myInt. -- Primitive data types are value only. No object, no methods
		
		System.out.println(addEmUp(myInt, myDouble.intValue()));
		//Autoboxing- implicit conversion from primitive to wrapper
		System.out.println(addEmUp(myInteger.doubleValue(), myDouble));
		//Autounboxing- implicit conversion from wrapper to primitive
		System.out.println(addEmUp(myInteger, newInteger));
		//Boxing is expensive!
		//Number- Wrapper for all numeric types
		System.out.println(addEmUp1(myInt, newInteger));
	}
	
	public static int addEmUp(int a, int b) {
		return a+b;
	}
	
	public static double addEmUp(Double a, Double b) {
		return a+b;
	}
	public static Double addEmUp1(Number a, Number b) {
		return a.doubleValue()+b.doubleValue();
	}
}
