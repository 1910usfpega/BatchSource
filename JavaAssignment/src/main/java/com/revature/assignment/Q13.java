package com.revature.assignment;

public class Q13 {

	static boolean alternate = false;
	static int increment = 1;

	public static void triangle() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < increment; j++) {
				if (alternate == false) {
					System.out.print("0");
					alternate = true;
				} else {
					System.out.println("1");
					alternate = false;
				}
			}
			increment++;
		}
	}
}
