package com.revature;



public class BubbleSort {
	
	
	

	
	
	public  int[] bubbleSort() {
		int arr[] = { 1,0,5,6,3,2,3,7,9,8,4 };
		
//		System.out.println("Array Before Bubble Sort");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	      int n = arr.length;
	      int temp = 0;

	      for(int i = 0; i < n; i++) {
	         for(int j=1; j < (n-i); j++) {
	            if(arr[j-1] > arr[j]) {
	               temp = arr[j-1];
	               arr[j-1] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
//	      System.out.println("\n "+ "Array After Bubble Sort");
	  	for(int i = 0; i < arr.length; i++) {
	  		System.out.print(arr[i] + " ");
	  	}
	     System.out.println(" ");
		return arr; 
	   }
	
	
}
