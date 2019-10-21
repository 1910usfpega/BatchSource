package com.john;

public class Q4NFactoral {
	
	public static double computeFactorial(double num) {
		if (num < 0) {
			System.out.println("fail");
			return -1;
		} else if (num > 0) {
			double fact = num -1;
			while(fact != 0) {
				(num) *= (fact);
				fact --;
			}
		} else {
			return 1;
		}
		return num;
	}
}

// recursion
//	public int factorialN(int n) {
//		if(n==1 || n==0) {
//			return 1;
//		}
//		return n * factorialN(n-1);
//	}