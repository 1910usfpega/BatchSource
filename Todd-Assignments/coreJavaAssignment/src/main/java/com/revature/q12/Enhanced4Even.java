package com.revature.q12;

/**
 * 	Class Enhanced4Even
 * 	@author James Todd
 * 
 * 	Enhanced4Even is a class designed to create and populate an array of integers with 1 through 100, and to print the even numbers
 * 		in the array.
 * 
 * 	One method: <method>printEven()</method>
 * 
 * 	<method>printEven()</method> creates an array of integers of size 100, populates the aforementioned array with 1 through 100,
 * 		and if the integer being added to the array is an even number, display it in the console.
 *
 */
public class Enhanced4Even {

	
	
	public static void printEven() {
	
		System.out.println("Q12");
		int[] nums = new int[100];
		
		for(int i=1; i<=nums.length; i++) {
			nums[i-1] = i;
			for(int j=i; j==i; j++) {
				if(i%2 == 0) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println("\n");
	}
	
	
}
