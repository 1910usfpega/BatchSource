//Perform a bubble sort on the following integer array: 1,0,5,6,3,2,3,7,9,8,4

package com.homework.assignments;

import java.util.Arrays;

public class ProblemOne {
	
	public static int[] aArray = new int[]{1,0,5,6,3,2,3,7,9,8,4};
	public static int increment = 0;
	
	//Bubble sort method
	public static void bSort() {
		System.out.print("Unsorted Array: " + Arrays.toString(aArray));
		System.out.println("\nSorting Array using bubble sort... ");
		
		//Creating a variable to temporary hold a value
		int holder;
		
		//Outer for loop which iterates through the array
		for(int i = 0; i < aArray.length-1; i++) {
			
			//Inner for loop which iterates a value all the way to the end if it's the biggest
			for(int j = 0; j < aArray.length-i-1; j++) {
				
				//Switch current value with next value if current is bigger than next
				if(aArray[j] > aArray[j+1]) {
					holder = aArray[j];
					aArray[j] = aArray[j+1];
					aArray[j+1] = holder;
					System.out.println(Arrays.toString(aArray));
				}
			}
		}
	}
	
}
