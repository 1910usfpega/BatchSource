package com.revature.even;

public class Even {
	
	public static boolean even(int n) {
		//int n = 7;
		int y = n / 2;
		
		if (n == y + y) {
			System.out.println("Number is even.");
			return true;
		}else {
			System.out.println("Number is not even");
			return false; 
		}
		
	}

}
