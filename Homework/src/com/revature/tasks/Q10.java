package com.revature.tasks;

public class Q10 {
	//Find the minimum of two numbers using ternary operators
	
	public static void driver() {
		System.out.println();
		System.out.println("==> Q10");
		
		int n1 = 1, n2 = 3, min;
		
		min = n1 < n2 ? n1 : n2;
		
		System.out.println("Min of "+n1+" and "+n2+" is "+min);
	}

}
