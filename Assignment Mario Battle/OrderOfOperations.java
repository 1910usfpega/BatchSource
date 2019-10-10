package com.revature.varargs;
//team MARIO &ISKANDAR
public class OrderOfOperations {
 public static int myInt = 6;
 public static double myDouble = 1;
 public static Double yourDouble = 4.0;
 public static Integer myInteger = 9;
 public static int yourInt = 7;
 public static Integer yourInteger = 8;
 public static int ourInt = 5;
 public static Integer ourInteger = 2;
 
	public static void main(String[] args) {
		System.out.print("Exact Match: ");
	System.out.println(addition(myInt, yourInt));
	System.out.print("Conversion: ");
	System.out.println(addition(myInt, myDouble));
	System.out.print("Boxing: ");
	System.out.println(addition(myInteger, yourInteger));
	System.out.print("Varargs: ");
	System.out.println(addition(myInt,yourInteger,ourInteger));

	}
public static int addition(int a, int b) {
	
	return a+b;
}
public static double addition(Double a, Double b) {
	
	return a+b;
}
public static double addition (double a, double b) {
	
	return a+b;
}
public static double addition(double ... x) {
	
	double b = 0;
	for(double i :x) {
		b +=i;
	}
	return b;
}
}
