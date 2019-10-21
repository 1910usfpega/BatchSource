package com.revature.q1;

import java.util.Arrays;

public class BubbleSort {	
	
//	public static void main(String[] args) {
//		int[] arr = {1,0,5,6,3,2,3,7,9,8,4};		
//		bubbleSort(arr); 	
//	}
		
		
	public static String BubbleSort(int[] arr){
		for(int i = 1; i < arr.length-1; i++) {
			for(int z = 0; z < arr.length-i; z++) {
				if (arr[z] > arr[z+1]) {
					int temp = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		return Arrays.toString(arr);
	}
}
	
	
	

