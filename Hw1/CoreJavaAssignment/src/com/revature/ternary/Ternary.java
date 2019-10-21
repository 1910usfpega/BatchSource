package com.revature.ternary;

public class Ternary {
	
	public static int ternary(int a, int b) {
		
		int num1 =600;
		int num2 =900;
		int min;
		int max;
		
		min = (a < b) ? a: b; 
		max = (a < b)? b: a;
		
		System.out.println(min);
		return min;
		
		
	}

}
