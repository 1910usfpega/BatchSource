package com.revature.activity;

public class Overloads {

	static Integer first= 4;
	static Integer second= 5;
	
	

	
	
	public static Float adding(int a, float b) {
		return a+b;
		
	}
	
	
	public static int adding1(int ... v) {
	int y = 0;
		for(int x:v) {
		y +=x;
	}
		return y;
	}
	
	public static double adding(Integer a, Integer b) {
		return a.doubleValue()+b.doubleValue();
	}
	
	public static void main(String[] args) {
		
		System.out.println(adding(first, second));
		System.out.println(adding1(1,2,4,3,2,3,5,3));
		System.out.println(adding(first.intValue(),second.floatValue()));
	}

	
}
