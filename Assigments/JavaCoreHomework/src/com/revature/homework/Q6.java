package com.revature.homework;

public class Q6 {
	public static boolean isEven(int n) {
		boolean isEven = true;
		
		for (int i = 1; i <= n; i++)
			isEven = !isEven;
		
		return isEven;
	}

	
	public static void even() {
		
		int n = 88;
		if(isEven(n))
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
