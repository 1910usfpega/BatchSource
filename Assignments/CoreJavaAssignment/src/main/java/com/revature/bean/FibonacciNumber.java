package com.revature.bean;

public class FibonacciNumber {
	
	//function accepts number to of times to execute Fibonacci
	public void printFibonacci(int n) {
        int t1 = 0, t2 = 1;
        
        System.out.print("Upto " + n + ": ");
        
  
        for(int x = t1;x <= n; x++)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

}
