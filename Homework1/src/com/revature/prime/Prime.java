package com.revature.prime;

import java.util.ArrayList;

public class Prime {
	public static void main(String[] args) {
		ArrayList<Integer> to100 = new ArrayList<Integer>();
		
		for( int n : to100) {
			if(is_prime(n)) {
				System.out.println(n);
			}
		}
	}
	
	public static boolean is_prime(int n) {
		boolean prime = true;
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				prime = false;
			}
		}
		return prime;
	}
}
