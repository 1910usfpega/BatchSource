package com.revature.overloading;

public class Overloading {
	
	public static void main(String[] args) {
		
		//double a =0.0;
		//int i = a;
		Integer myInteger = 1;
		add(1,2);
		add(1, 2.0);
		add(myInteger, 1);
		add();
		
	}
	
	static double add(double i, double b) {
		return i+b;
	}	 
	
	/*static int add(int i, double b) {
		return i+b;
	}
	static int add(Integer i, Integer b) {
		return i+b;
	}
	*/
	static int add(int ... i) {
		int sum =0;
		for(int a:i) {
			sum+= a;
		}
		return sum;
	}
}
