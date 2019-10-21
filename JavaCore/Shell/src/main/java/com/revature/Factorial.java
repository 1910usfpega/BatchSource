package com.revature;

public class Factorial {
	public static void factorial(){
	double n1 = 5, n2 = 0, sum = 1;
	for(int i = 0; i < n1; i++) {
		n2++;
		sum *= n2;
		
		System.out.println(sum + " " + n2);
	}
	}
}
