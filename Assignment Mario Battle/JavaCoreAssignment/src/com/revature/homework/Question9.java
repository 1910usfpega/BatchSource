package com.revature.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question9 {

	public static void primeList() {
		List<Integer> array = new ArrayList<Integer>();
		for (int i=1; i<=100; i++) {
			array.add(i);
		}
		for(int entry: array) {
			primeCheck(entry);
		}
	}
	
		public static boolean primeCheck(int numberToCheck) {
	        int remainder;
	        for (int i = 2; i <= numberToCheck / 2; i++) {
	            remainder = numberToCheck % i;
	            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
	            if (remainder == 0) {
	                return false;
	            }
	        }
	        System.out.print(numberToCheck + ",");
	        return true;
	 
	    }}

