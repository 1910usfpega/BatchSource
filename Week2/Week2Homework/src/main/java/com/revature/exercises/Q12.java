package com.revature.exercises;

public class Q12 {
	public static int[] evenNumber() {
		int[] array = new int[101];
		int[] result = new int[50];

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int i = 0;

		for (int x : array) {
			if (x == 0) {}
			else if (x % 2 == 0) {

				System.out.print(x + ", ");
				result[i] = x;
				i++;
			}
		}
		return result;
	}

}
