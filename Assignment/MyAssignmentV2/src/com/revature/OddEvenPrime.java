package com.revature;

import java.util.ArrayList;
import java.util.Arrays;

public class OddEvenPrime {

	 static boolean isPrime(int n) {
	        if (n == 2) {
	            return true;
	        }
	        int a = 0;
	        int b = 0;

	        b = n / 2;
	        for (a = 2; a <= b; a++) {
	            if (n % a == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public  void test1() {
	        ArrayList<Integer> myArray = new ArrayList<>();
	        for (int i = 1; i <= 10; i++)
	            myArray.add(i);

	        int even = 0;
	        int odd = 0;
	        for (int n : myArray) {
	            if (n % 2 == 0)
	                even += n;
	            else
	                odd += n;
	        }
	        System.out.println("ArrayList: " + Arrays.toString(myArray.toArray()));
	        System.out.println("Even number sum: " + even);
	        System.out.println("Odd number sum: " + odd);
	        System.out.println("Removing prime numbers: ");
	          for(int a=1;a<=10;a++){
	              if(isPrime(a)){
	                  myArray.remove(new Integer(a));
	              }

	    }
	        System.out.println("List: " + Arrays.toString(myArray.toArray()));
	    }
}
