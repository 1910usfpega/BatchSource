package com.revature.sort;

import java.util.Arrays;

public class BublbleSort {
	public static void main(String[] args) {
		int [] myArray = {134,5,23,42,23,45};
		sortMe(myArray);
		
	}
	
	public static void sortMe(int[] a) {
		int temp=0;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length-1; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp; 
					System.out.println(Arrays.toString(a));
				}
			}
		}
		System.out.println("Result:" + a.toString());
	}
}
