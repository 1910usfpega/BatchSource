package com.revature.wrappers;

public class Wrappers {

	/*Wrapper
	 * Wraps around a value and allows it to be treated as an object.
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
	 * 
	 */
	static int myInt =3;
	static Integer myInteger=5;
	static Double myDouble=45.93;
	static Integer newInteger=7;
	
	public static void main(String[] args) {
		myInteger.byteValue();
//		myInt.
		//Auto-boxing = implicit conversion from primitive to Wrapper
		
			System.out.println(addEmUp(myInteger.doubleValue(), myDouble));	
		//Auto-unboxing = implicit conversion from Wrapper to primitive
		System.out.println(addEmUp1(myInt, newInteger));
	}
	public static int addEmUp(int a, int b) {
		return a+b;
	}
	
	public static Double addEmUp1(Number a, Number b) {
		return a.doubleValue()+b.doubleValue();
	}
	public static double addEmUp(Double a, Double b) {
		return a+b;
	}
	
	
	
}
