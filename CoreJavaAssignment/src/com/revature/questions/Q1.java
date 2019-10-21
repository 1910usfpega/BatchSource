package com.revature.questions;

public class Q1 {
	
	public static int[] bubbleSort(int[] a) {
		/*
		 * Standard bubblesort method
		 */
		int tempInt;
		for (int i=1;i<a.length;i++) {
			for (int j=0;j<a.length-i;j++) {
				if (a[j]>a[j+1]) {
					tempInt=a[j];
					a[j]=a[j+1];
					a[j+1]=tempInt;
				}
			}
		}
		return a;
	}

}
