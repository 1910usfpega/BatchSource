package com.revature.tasks;

import java.util.Arrays;

import com.revature.driver.BubbleSort;

public class Q1 {
	// Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
	
	public static void driver() {
		System.out.println();
		System.out.println("==> Q1");
		int [] myArray = {1,0,5,6,3,2,3,7,9,8,4};
		System.out.println("Input: " + Arrays.toString(myArray));
		BubbleSort.sortMe(myArray);
	}
}
