package com.revature.fibonacci;

import java.util.Arrays;

public class Fibonacci {
	
	public static String fibonacci(){
		
		int fib[] = new int[25];
			fib[0]= 0;
			fib[1]= 1;
		for(int i = 2; i <25; i ++) {
			fib[i]= fib[i-1] + fib[i-2];			
		}
		
		System.out.println(Arrays.toString(fib));
		return Arrays.toString(fib); 
		
		
	}

}
