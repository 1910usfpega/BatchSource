package com.revature.overloading;

public class MethodOverloading {
	
	static int myInt = 5;
	static int otherInt = 10;
	
	static Integer myInteger = 100;
	static Integer otherInteger = 200;
	
	static Double myDouble = 100.00;
	static Double otherDouble = 200.00;
	
	public static void main(String[] args) {
		//exact match
		System.out.println(addInts(myInt, otherInt));
		
		//conversion
		System.out.println(addInts(myDouble.intValue(), otherDouble.intValue()));
		
		//unboxing
		System.out.println(addInts(myInteger, otherInteger));
		
		//varargs
		varArgsTest(2, 5, 10, 15, 16);
		
	}
	
	public static int addInts(int a, int b) {
		return a+b;
	}
	
	public static void varArgsTest(int a, int ... v) {
		System.out.println("VarArgs Length: " + v.length);
		
		for(int i : v) {
			System.out.println("I + 2 " + i + a);
		}
	}
	
//	public static Integer addInts(Integer a, Integer b) {
//		return a+ b;
//	}
	
	

}
