package com.revature.tasks;

public class Q10 {
	//Find the minimum of two numbers using ternary operators
	
	public static void main(String [] args) {
		System.out.println();
		System.out.println("==> Q10");
		
		int n1 = 1, n2 = 3, min;
		
		min = ternaryWrap(n1, n2);
		
		System.out.println("Min of "+n1+" and "+n2+" is "+min);
	}
	
	public static int ternaryWrap(int n1, int n2) {
		int min = n1 < n2 ? n1 : n2;
		return min;
	}
}
