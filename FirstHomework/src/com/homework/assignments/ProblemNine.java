//Create an ArrayList which stores numbers from 1 to 100 and prints out all the prime numbers to the console.

package com.homework.assignments;

import java.util.ArrayList;

public class ProblemNine {

	public static void isPrime() {
		
		//Create an arraylist to put numbers from 1 to 100 into
		ArrayList<Integer> num = new ArrayList<>();
		
		//Adding num 1 to 100 into array
		for (int i = 1; i < 101; i++) {
			num.add(i);
		}
		
		//Go through each one and see if they are prime numbers
		for (int i = 0; i < 100; i++) {
			if(i == 1)
				System.out.print("Prime Numbers: ");
			if(i == 2)
				System.out.print(i + " ");
			if(i == 3)
				System.out.print(i + " ");
			if(i == 5)
				System.out.print(i + " ");
			if(i == 7)
				System.out.print(i + " ");
			if (i % 7 != 0) //Check if the number is divisible by 7
				if (i % 5 != 0) //Check if the number is divisible by 5
					if (i % 3 != 0) //Check if the number is divisible by 3
						if (i % 2 != 0) //Check if the number is divisible by 2
							System.out.print(i + " "); //if not divisible by previous number, print out number
		}

	}
}
