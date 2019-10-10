package com.revature.ooo;

public class orderOfOperation {
	static Integer myInt = 2;
	
	static Double myDouble = 34.5;
	static int myInteger = 4;
	
	public static void main(String[] args) {
		
		System.out.println("exact match");
		System.out.println(exactMatch(1,2));
		System.out.println("conversion");
		System.out.println(exactMatch(myInt,myInt));
		System.out.println(exactMatch(23.5,myInt));
		System.out.println("boxing");
		System.out.println(exactMatch(myInt.doubleValue(),myDouble));
		System.out.println("VarArgs");
//		varTest(3);
		System.out.println(varTest(3,3,2));
		
	}
	
	public static int exactMatch(int a, int b) {
		
		return   a*b;
		
	}
	public static int exactMatch(Integer a, Integer b) {
		
		return a*b;
	}
	
	public static Double exactMatch(Number a, Number b) {
		
		return a.doubleValue()*b.doubleValue();
	}
	
	 public static int varTest(int ...v) {
		 int total = 1;
		 
		 for(int x:v) {
			 total = total*x;
		 }
	return total;
	 }
	
	
	

}
