package com.revature;

import java.util.Arrays;

public class Bubblez {


	public static void sortMe() {
		int[] myArray = { 100, 1, 10, 2, 3 };
		int temp = 0;
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray.length - 1; j++) {
				if (myArray[j] > myArray[j + 1]) {
					temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
					System.out.println(Arrays.toString(myArray));
				}
			}
			System.out.println("Attempt number " + i);
		}
	}
}
