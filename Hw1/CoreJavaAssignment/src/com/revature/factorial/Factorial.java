package com.revature.factorial;

public class Factorial {
	
	public static int factorial(int y){
		int n = 5;
		int f = 1;
		
		for (int i = 1; i<= y; i ++) {
			f = f * i;
		}
		
		System.out.println(f);
		return f;
		
	}

}
