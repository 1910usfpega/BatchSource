package com.revature.driver;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Homework 1 | Iskandar Bakhtizin");
		System.out.println("===============================");
		
		
		// Perform a bubble sort on the following integer array:  1,0,5,6,3,2,3,7,9,8,4
		System.out.println();
		System.out.println("==> Q1");
		int [] myArray = {1,0,5,6,3,2,3,7,9,8,4};
		System.out.println("Input: " + Arrays.toString(myArray));
		BubbleSort.sortMe(myArray);
		
		
		// Write a program to display the first 25 Fibonacci numbers beginning at 0
		System.out.println();
		System.out.println("==> Q2");
		PrintFib.start(25);
		
		
		// Reverse a string without using a temporary variable.  Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
		System.out.println();
		System.out.println("==> Q3");
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
