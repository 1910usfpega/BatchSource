package com.revature.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Question19 {
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
    }
    public  static void evenOddPrime() {
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
        System.out.println("Removing prime numbers from list... ");
          for(int a=1;a<=10;a++){
              if(primeCheck(a)){
                  myArray.remove(new Integer(a));
                  
              }
    }
          System.out.println(" ");
        System.out.println("List: " + Arrays.toString(myArray.toArray()));
    }
}
