package com.revature.factorial;

public class Factorial {
	private int max;
	
	
	public Factorial(int max) {
		this.max = max;
	}
	
	public int factorial() {
		int fac = 1;
		
		for(int i = 1; i < max; i++) {
			fac = fac * i;
		}
		return fac;
	}
}