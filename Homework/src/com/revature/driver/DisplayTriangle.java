package com.revature.driver;

public class DisplayTriangle {
	public static void display(int lines) {
		for (int i=1; i<lines+1; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(((j+i) % 2) + " ");
			}
			System.out.println();
		}
	}

}
