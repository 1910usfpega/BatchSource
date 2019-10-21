package com.revature.homework;

/******************************************************************************
 * Q2. Write a program to display the first 25 Fibonacci numbers beginning at 0.
 * 
 * @author Bryan Wood
 *
 *****************************************************************************/
public class Question2 {

	public int[] x = new int[25];
	public int a = 0;
	private String b = "";

	public void Fibanacci() {

		for (int i = 0; i < 25; i++) {

			if (i == 0) {
				a = 0;
				x[i] = 0;

			} else if (i == 1 || i == 2) {
				a = 1;
				x[i] = 1;
			} else {
				a = x[i - 1] + x[i - 2];
				x[i] = a;

			}
			b = b + " " + Integer.toString(a);
			
		}
		System.out.println("The first 25 Fibonacci numbers starting with 0 "
				+ "are:\n" + b);
	}

	public static void main(String[] args) {
		Question2 a = new Question2();
		a.Fibanacci();
	}
}
