package com.revature.overloading;

public class Overload {
	static int a=5;
	static double b=2.788;
	public static void main(String[] args) {
		System.out.println("exactMatch: "+exactMatch(a,b));
		System.out.println("conversion: "+conversion(a,b));
		System.out.println("boxing: "+	-boxing(a,b));
		System.out.println("varargs: "+bunchOfEm(a,b,17,18,9,1000));
	}
	
	static double exactMatch(int a, double b) {
		return a+b;
	}
	static double conversion(double a, double b) {
		return a+b;
	}
	static Double boxing(Integer a, Double b) {
		return a.doubleValue()+b.doubleValue();
	}
	
	static double bunchOfEm(double ... v) {
		double y=0;
		for (double x:v) {
			y=y+x;
		}
		return y;
	}
}
