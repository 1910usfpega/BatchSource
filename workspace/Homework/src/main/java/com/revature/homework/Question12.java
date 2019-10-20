package com.revature.homework;


/******************************************************************************
 * Q12. Write a program to store numbers from 1 to 100 in an array. Print out 
 *  		all the even numbers from the array. Use the enhanced FOR loop for 
 *  		printing out the numbers.
 * @author Bryan Wood
 *
 *****************************************************************************/


public class Question12 {
	
	public int[] countingFun(){
		int[] r = new int[100];
		
		for (int i =0; i <100; i++)
			r[i]=i+1;
		
		System.out.println("I shall count from 1 to 100: ");
		
		for(int i :r) 			
			System.out.print(i+" ");
		
		return r;
	}

}
