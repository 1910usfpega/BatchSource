package com.john;

import java.util.ArrayList;

public class Q9PrimeNumbersList {
	
//	ArrayList<Integer> arr = new ArrayList<Integer>();
	
	public static void isPrime() {
		ArrayList<Integer> aL = new ArrayList<Integer>();
		for (int i = 0; i <= 100; i++) {
			if (i == 2 || (i == 3) || (i == 5) || (i == 7)){
				aL.add(i);
			} else if (i > 9 && (i % 3 == 0) || (i % 2 == 0) || (i % 5 == 0) || (i % 7 == 0)) {
				continue;
			} else {
				aL.add(i);
			}
		}
		System.out.println("This is an the Array: " + aL);
	}
	
	        
	      
//		for (int i = 3; i <= 100; i++) {
//			
//			if (i % 2 == 0) {
//				System.out.println("Not Prime" + i);
//			} else {
//				System.out.println("Is Prime" + i);
//			}
			
			
//		}
	
}
