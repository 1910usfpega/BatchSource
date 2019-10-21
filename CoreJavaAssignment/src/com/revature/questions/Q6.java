package com.revature.questions;

public class Q6 {

	public static boolean checkIfEven(int num) {
		int test1=num/2;
		int test2=(num+1)/2;
		if (test1==test2) {
			System.out.println("It is even");
			return true;
		}else {
			System.out.println("It is odd");
			return false;
		}
	}

}
