package com.revature;

public class NumbersTriangle {

	public static void makeShape() {
		System.out.println("Q13");
		int rowCount = 4;
		int x = 0;

		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(x % 2);
				x++;
			}
			System.out.println();
		}
		System.out.println();
	}
}