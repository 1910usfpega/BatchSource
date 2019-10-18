package com.revature.sort;
//Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
import java.util.Arrays;

public class BubbkeSort {
	public static void main(String[] args) {
		int[] ar= {1,0,5,6,3,2,3,7,9,8,4};
		sortMe(ar);
		
	}
	public static void sortMe(int[] a) {
		int temp=0;
		for(int i=1;i<a.length; i++) {
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					System.out.println(Arrays.toString(a));
				}
			}
			System.out.println("Atempt number " + i);
		}
		
	}
}
