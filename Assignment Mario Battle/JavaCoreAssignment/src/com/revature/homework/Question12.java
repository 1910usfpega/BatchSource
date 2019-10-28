package com.revature.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question12 {
	
	    
	 public static void evenArr() {
		// int even = 0;
		// int odd = 0;
		 int [] array = new int[101];
		 int[] evens = new int[100];
		 //= new ArrayList<Integer>();
		 //List<Integer> odds = new ArrayList<Integer>();
			for (int i=0; i<array.length; i++) {
				array[i]=i;
			}
			  for (int n : array) {
		            if (n % 2 == 0)
		                System.out.print( array[n]+", ");

			  }
//			  for(int i: evens) {
//				  System.out.println(evens[i]);
//			  }	 
	 }
}
