package com.revature.homework;

import java.util.Arrays;

public class Q1 {

	public static void bubblesort() {
	int[] ar= {1,0,5,6,3,2,3,7,9,8,4};
	Q1.sortMe(ar);
	
	}
	public static int sortMe(int[] a) {
		int temp = 0;
		for(int i = 1; i < a.length; i++) {
			for(int j = 0; j<a.length-i; j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j+1] = temp;
					System.out.println(Arrays.toString(a));
				}
			
			}
		} return 2;
	}
}
