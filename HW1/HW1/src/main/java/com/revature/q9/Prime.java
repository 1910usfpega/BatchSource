package com.revature.q9;

import java.util.ArrayList;

public class Prime {
	
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void prime() {

		for (int i = 1; i <= 100; i++) { 		  	  
	        boolean check = false;
	        for(int j = 2; j <= i/2; j++) {
	            if(i % j == 0)
	            {
	                check = true;
	                break;
	            }
	        }
	        if (!check) {
	        	primes.add(i);
	        }
	    }
		System.out.println("Prime Numbers From 1-100: " + primes.toString());
	}

}
