package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberList {

	{
		 System.out.println("My Prime Number from 1 - 100: ");
	}
	public static boolean CheckPrime(int numberToCheck) {
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
 
    }
		    public static void isPrime() {
		        List<Integer> myArray = new ArrayList<Integer>(Arrays.asList());
		        for(int i = 1; i< 101; i++) {
		        	myArray.add(i);
		        }		        
		        for(int entry: myArray) {
		         CheckPrime(entry);    		     	
		        }
		    }
}
