package com.revature.overloading;
// James Todd & John Jennings
public class OverloadingPractice {
	
	static final double PI = 3.14159265;
	static int r1 = 1;
	static Integer r2 = 3;
	static Double r3 = 5.0;
	
	public static void main(String[] args) {
		
		//Display Exact Match result
		System.out.println("Exact Match result: " + area(PI, r1));
		//Display Conversion result
		System.out.println("Conversion result: " + area(PI, r2));
		//Display Boxing/Unboxing result
		System.out.println("Boxing/Unboxing result: " + area(PI, r3));
		//Display for Vararg result
		System.out.println("\nVariable length args result: ");
		area(PI, 1, 6, 25, 3, 10);
		
	}
	
	//Exact Match
	public static double area(double pi, int r) {
		return (pi*(r*r));
	}
	
	//Conversion
	public static double area(double pi, Integer r) {
		return (pi*(r.doubleValue()*r.doubleValue()));
	}
	
	//Boxing/Unboxing
	public static Double area(double pi, double r) {
		return (pi*(r*r));
	}
	
	//Varargs
	public static void area(double pi, int ... v) {
		for(int x:v) {
			double area;
			
			area = (pi*(x*x));
			System.out.println("Radius: "+ x + " Area: " + area);
		}
	}
	
}
