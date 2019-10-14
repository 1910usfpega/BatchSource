package com.revature.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {5, 6, 8, 2, 9, 3};
		sortMe(x);
	}

	public static void sortMe(int[] a) {
		int temp = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length-1; j++) {
				if(a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					System.out.println(Arrays.toString(a));
				}
			}
			System.out.println("Attempt number " +i);
		}
	}
}
