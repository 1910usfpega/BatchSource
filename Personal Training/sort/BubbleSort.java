package com.revature.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar= {5,6,7,8,9,3};
		sortMe(ar);
	}
	
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
