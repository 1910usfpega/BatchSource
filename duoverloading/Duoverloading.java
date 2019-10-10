package com.revature.duoverloading;

public class Duoverloading {
	static int myInt = 1;
	static int yourInt = 2;
	static double ourDouble = 1.2;
	static Integer myInteger = 3;
	static Integer yourInteger = 4;
	static Double myDouble = 5.6;
	static Double yourDouble = 7.89;
	
	
	public static void main(String[] args) {
		System.out.println(addEmUp(myInt, yourInt));
		System.out.println(addEmUp(myInt,ourDouble));
		System.out.println(addEmUp(myInt, myInteger));	
		addEmUp(myInt, yourInt, myInteger.intValue());
	}
	
	public static int addEmUp(int a, int b) {
		System.out.println("one");
		return a + b;
	}
	
	public static double addEmUp(int a, double b) {
		System.out.println("two");
		return a + b;
	}

	public static double addEmUp(int a, Integer b) {
		System.out.println("three");
		return a + b;
	}
	
	public static void addEmUp(int ... v) {
		System.out.println("four");
		for(int i:v) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
