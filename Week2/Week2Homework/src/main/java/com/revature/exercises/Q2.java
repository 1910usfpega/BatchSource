package com.revature.exercises;

public class Q2 {
    static int maxNumber = 25;
    static int previousNumber = 0;
    static int nextNumber=1;
    static int i =1;
    
                            
    public static int[] fibb(){
        int arr[] = {};
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
        while(i <= maxNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
        
        
        System.out.println(" ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr ;
    }
}


