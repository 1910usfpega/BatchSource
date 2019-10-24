package com.revature.bean;

import java.util.ArrayList;

public class EvenInteger {
	/*
	 * Q6.Write a program to determine if an integer is even without using the modulus operator (%)
	 * 
	 * Q12.Write a program to store numbers from 1 to 100 in an array. Print out all the even numbers from the array.
	 *  Use the enhanced FOR loop for printing out the numbers.
	 *  
	 *  
	 * Q19. Create an ArrayList and insert integers 1 through 10. Display the ArrayList. 
	 * Add all the even numbers up and display the result. Add all the odd numbers up and display the result. 
     * <<Remove the prime numbers from the ArrayList and print out the remaining ArrayList.>>
	 * 
	 */
	
	public boolean isEvenInt(int i) {
		
		if (((i / 2)*2) == i) 
		{
			return true;
		}
		else
		{
			return false;
		}   
		
	}
	
	public void runMultiIsEven(int n) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		
		for(int j =1; j <= n; j++) {
			i.add(j);
			
		}
		
		for(int x: i) {
			if(isEvenInt(x) == true) {
				System.out.println(x +" : is even" );
			}
		}	
		
	}
	
	public void displaySumEvenOdd(ArrayList<Integer> i) {
		
		int esum= 0, osum= 0;
		
		for(int x = 0; x < i.size(); x++) {
			if(isEvenInt(i.get(x)) ==true) {
				esum = esum + i.get(x);
			}else
			{osum = osum + i.get(x);}
		}
		
		System.out.println("Sum of even numbers: " +esum);
		System.out.println("Sum of odd numbers: " +osum);
		
	}
	
	

}
