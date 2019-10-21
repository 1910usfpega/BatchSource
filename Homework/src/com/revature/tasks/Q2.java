package com.revature.tasks;

import java.util.List;

import utils.Fib;

public class Q2 {
	
	// Write a program to display the first 25 Fibonacci numbers beginning at 0
	
	public static void main(String [] args) {
		System.out.println();
		System.out.println("==> Q2");
		int iteractions = 5;
		System.out.print("First "+ iteractions + " Fibonacci numbers: ");
		
		// Create list with N Fibonacci numbers
		List<Integer> result = Fib.createListWithFib(iteractions);
		
		// Print values from the list
		for (int i=0; i<result.size(); i++) {
			System.out.print(result.get(i).toString() + " ");
		}
		
		
	}
}
