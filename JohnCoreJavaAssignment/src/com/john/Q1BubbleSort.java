package com.john;

import java.util.Arrays;

public class Q1BubbleSort {
	
	//Initialize the array into existence
	int[] ar= {1,0,5,6,3,2,3,7,9,8,4};
	
	//method that 
	public static void sortMe (int[] a) {
		int temp = 0;
		for (int i = 1; i<a.length; i++) {
			for(int j = 0; j<a.length-i; j++) {
				if (a[j]>a[j+1]) {
					//if a of j is greater than a of j plus one
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					System.out.println(Arrays.toString(a));
				}
			}
			System.out.println("Attempt number " + i);
		}
	}

}


