package utils;

import java.util.Arrays;

public class BubbleSort {
	public static int[] sortMe(int[] a) {
		int temp=0;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a.length-1; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
//		
	}
}
