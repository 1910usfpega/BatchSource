package com.revature.questions;

public class Q4 {
	
	
	public static int computeFactorial(int n){
		int total=1;
		for (int i=1;i<=n;i++) {
			total=total*i;
		}
		return total;
	}

}
