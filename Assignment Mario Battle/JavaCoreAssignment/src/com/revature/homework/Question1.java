package com.revature.homework;

import java.util.Arrays;

public class Question1 {


	public static int  sortMe(int[] a) {
		int temp = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];//removes a selected value from the array
					a[j]=a[j+1];//replaces the selected value with the next value in the array
					a[j+1]=temp;// replaces that next value in the array with the originally 
					//selected value that was stored in temp, the "Bucket"
					// the highest numbers in the list bubble up 
					System.out.println(Arrays.toString(a));
				}
			}
		}
		return 0;
	}
}
