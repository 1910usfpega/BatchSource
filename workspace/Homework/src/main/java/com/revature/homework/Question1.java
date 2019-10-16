package com.revature.homework;

/******************************************************************************
 * Q1. Perform a bubble sort on the following integer array:
 * 1,0,5,6,3,2,3,7,9,8,4
 * 
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question1 {

	public Question1() {

	}

	public void bubbleSort(int a[]) {
		int x;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j+1]) {
					x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
				}
			}
		}
		
	}

}
