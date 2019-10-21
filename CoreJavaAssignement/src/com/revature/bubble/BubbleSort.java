package com.revature.bubble;

//Q1. Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
public class BubbleSort {
	
	public static void bubbleSort() {
		
        int temp = 0;  
        int arr[] ={1,0,5,6,3,2,3,7,9,8,4};    
         
        System.out.println("Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

         for(int i=0; i < arr.length; i++){  
                 for(int j=1; j < (arr.length-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                          }
                 }
         }
	}
	
//    public static void main(String[] args) {  
//        int arr[] ={1,0,5,6,3,2,3,7,9,8,4};    
//        bubbleSort(arr);//sorting array elements using bubble sort  
//         
//        System.out.println("Bubble Sort");  
//        for(int i=0; i < arr.length; i++){  
//                System.out.print(arr[i] + " ");  
//        }  
//
//}  
}  

