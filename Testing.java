package com.revature.testing123;

public class Testing {
	static int newInt=12;
	static int myInt=3;
	static Integer newInteger=7;
	static Double ourDouble=69.69;
	public static void main(String[] args)
	{
		System.out.println(addEmUp(newInt, myInt));
		System.out.println(addEmUp(newInt, ourDouble));
		System.out.println(addEmUp(newInteger.doubleValue(),ourDouble));
		addEmUp(newInt, myInt, newInt);
	}
	public static int addEmUp(int a, int b) {
		System.out.println("Exact Match");
		return a+b;
		
	
}
	public static double addEmUp(int a, double b) {
		System.out.println("Conversion");
		return a+b;}
	
	public static double addEmUp(Double a, Double b) {
		System.out.println("Boxing");
		return a+b;
	}

	public static void addEmUp(int ...v) {
		//System.out.println("Number of args is: "+ v.length+ " Contents");
		System.out.println("Varagrs");
		for(int x:v) {
			System.out.print(x+ "");
}
	}
}
