package com.revature.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q9 {

	{
		 System.out.println("My Prime Number from 1 - 100: ");
	}
	public static boolean checkPrime(int numberToCheck) {
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
		    public static List<Integer> isPrime() {
		        List<Integer> myArray = new ArrayList<Integer>(100);

		        
		        for(int i =1; i<=100; i++) {
		        	if(checkPrime(i)) {
		         myArray.add(i);
		      
		        	}
		            }
				return myArray;
		        
		    }

		

	
}
