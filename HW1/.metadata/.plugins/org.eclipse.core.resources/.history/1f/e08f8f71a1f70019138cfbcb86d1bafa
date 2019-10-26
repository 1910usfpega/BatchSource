package com.revature.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Q19 {
	
	  static boolean isPrime(int n) {
	       // only even prime
	       if(n==2) {
	           return true;
	       }
	       int i, m = 0;
	       m = n / 2;
	       for (i = 2; i <= m; i++) {
	           if (n % i == 0) {
	               return false;
	           }
	       }
	       return true;
	   }
	   public static void arrayLists() {
	       ArrayList<Integer> list = new ArrayList<>();
	       for (int i = 1; i <= 10; i++)
	           list.add(i);
	       int sumEven = 0, sumOdd = 0;
	       for (int a : list) {
	           if (a % 2 == 0)
	               sumEven += a;
	           else
	               sumOdd += a;
	       }
	       System.out.println("List: " + Arrays.toString(list.toArray()));
	       System.out.println("Even number sum: " + sumEven);
	       System.out.println("Odd number sum: " + sumOdd);
	      
	       System.out.println("\nRemoving prime numbers: ");
	       for(int i=1; i<=10; i++) {
	           if(isPrime(i)) {
	               list.remove(new Integer(i));
	           }
	       }
	       System.out.println("List: " + Arrays.toString(list.toArray()));
	      
	   }

}
