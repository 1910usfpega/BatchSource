package com.revature.bean;

public class BubbleSort {

	public BubbleSort() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//1,0,5,6,3,2,3,7,9,8,4
 
	  
	// A function to implement bubble sort  
	public int [] bubbleSort(int arr[]) 
    { 
        int i, x, n, temp; 
        n = arr.length;
        boolean swapped; 
        
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (x = 0; x < n - i - 1; x++)  
            { 
                if (arr[x] > arr[x + 1])  
                { 
                    // swap arr[x] and arr[x+1] 
                    temp = arr[x]; 
                    arr[x] = arr[x + 1]; 
                    arr[x + 1] = temp; 
                    swapped = true; 
                } 
            } 
  

            // If no 2 elements were swapped by inner loop, then break 
            if (swapped == false) 
                return arr; 
        } 
        
        return arr;
    } 

}
