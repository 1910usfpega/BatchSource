package com.revature.sort;

import java.util.Arrays;

public class BubbleSort {

	static int[] a = {6, 8, 5, 9, 3};
	public static void main(String[] args) {
		sortMe(a);
	}
	
	public static void sortMe(int[] a) {
		int temp=0;
		for(int i=1; i<a.length; i++) {
			System.out.println("iteration: " + i);
			for(int j=0; j<a.length-i; j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				System.out.println(Arrays.toString(a));
			}
		}
	}
	
	
	
}
