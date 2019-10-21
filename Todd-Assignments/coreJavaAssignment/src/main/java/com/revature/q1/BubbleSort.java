package com.revature.q1;

import java.util.Arrays;

/**
 * Class BubbleSort
 * @author James Todd
 *
 *	BubbleSort is a class designed to declare and initialize a predetermined array of integers and sort them in ascending order.
 *		
 *	Contains one method -- sort()
 *	
 *	Sort() - Uses an enhanced for loop to sort a predetermined array in ascending order. Displays array both pre sort and post sort
 *
*/

public class BubbleSort {

	public static void sort() {
		System.out.println("Q1");
		
		int[] myArray = new int[] {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		System.out.println("Array: " + Arrays.toString(myArray));
		
		for(int i=0; i<myArray.length; i++) {
			for(int j=myArray.length-2; j>=i ;j--) {
				if(myArray[j]>myArray[j+1]) {
					int temp = myArray[j];
					myArray[j] = myArray[j+1];
					myArray[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array: " + Arrays.toString(myArray) + "\n");
	}
}