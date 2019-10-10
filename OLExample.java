//Partner Derthalie Joseph

package com.revature.example;

public class OLExample {
	
	static int k = 1;
	static int myInt = 10;
	static int myInt2 = 20;
	static double myDouble = 5.5;
	static double myDouble2 = 12.5;
	static Integer myInteger = 18;
	
	public static void main(String[] args) {
		System.out.println(mult(myInt, myDouble, myInteger));
		System.out.println(mult(myInt2,myDouble2));
		System.out.println(mult(myInt2, myInteger));
		mult(1,2,3,4,5,6,7,8,9,20);
	}
	
	public static double mult(int a, double b) {
		return a * b;
	}
	
	public static double mult(float a, double b, int c) {
		return a * b * c;
	}
	
	public static int mult(int a, Integer myInteger) {
		return a * myInteger;
	}
	
	public static void mult(int ... x) {
		for(int i:x) {
			System.out.print(i + "*" + i);
			i *= i;
			System.out.println("=" + i);
			}
	}
}
