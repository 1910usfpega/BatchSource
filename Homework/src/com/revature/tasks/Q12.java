package com.revature.tasks;

public class Q12 {
	// Write a program to store numbers from 1 to 100 in an array. 
	// Print out all the even numbers from the array. 
	// Use the enhanced FOR loop for printing out the numbers.

	public static void driver() {
		System.out.println();
		System.out.println("==> Q12");
		
		int[] a = new int[100];
		for (int i = 0; i < 100; ++i) {
			a[i] = i+1;
		}
		
		System.out.print("Numbers printed by enchanced loop: ");
		for (int iii:a) {
			System.out.print(iii + " ");
		}
		System.out.println();

	}

}
