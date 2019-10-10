package com.revature.overloading;

public class OverloadTwo {
	static int a=5;
	static double b=2.788;
	static Integer c=10;
	static Double d=7.342876;
	public static void main(String[] args) {
		System.out.println("exactMatch: "+add(a,b));
		System.out.println("conversion: "+add(b,a));
		System.out.println("boxing: "+	add(c,d));
		System.out.println("varargs: "+add(a,b,c,d,17,18,9,1000));
	}
	
	static double add(int a, double b) {
		System.out.println("ID");
		return a+b;
	}
	static double add(double a, double b) {
		System.out.println("DD");
		return a+b;
	}
	static Double add(Integer a, Double b) {
		System.out.println("Box");
		return a.doubleValue()+b.doubleValue();
	}
	
	static double add(double ... v) {
		System.out.println("Many");
		double y=0;
		for (double x:v) {
			y=y+x;
		}
		return y;
	}
}
