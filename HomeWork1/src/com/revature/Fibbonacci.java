package com.revature;

public class Fibbonacci {

	int max = 23;
    int previousNumber = 0;
    int number=1;
	int i =1;
	int[] a = new int [25];
    public int[] fibbonacci(){
    	a[0]=0;
    	a[1] = 1;
    	System.out.print("Fibonacci Series of 25 numbers:");
    	while(i <= max)
    	{
    		System.out.print(previousNumber+" ");
    		int sum = previousNumber + number;
    		previousNumber = number;
    		number = sum;
    	a[i+1] = sum;
    		i++;
    	}
  
    	System.out.println("");
		return a;
    }


}

