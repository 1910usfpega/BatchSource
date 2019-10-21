package com.revature.tasks;

public class Q12 {
	// Write a program to store numbers from 1 to 100 in an array. 
	// Print out all the even numbers from the array. 
	// Use the enhanced FOR loop for printing out the numbers.

	public static void main(String [] args) {
		System.out.println();
		System.out.println("==> Q12");
		
		int[] a = createArray(100);
		
		System.out.print("Numbers printed by enchanced loop: ");
		for (int iii:a) {
			System.out.print(iii + " ");
		}
		System.out.println();

	}
	
	public static int[] createArray(int countOfElemnts) {
		int[] a = new int[countOfElemnts];
		for (int i = 0; i < countOfElemnts; ++i) {
			a[i] = i+1;
		}
		return a;
	}

}
