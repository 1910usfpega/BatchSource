package com.revature.q13;

public class Triangle {

	public static boolean yesNo = false;
	public static int x = 1;

	public static void makeTheThing() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < x; j++) {
				if (yesNo == false) {
					System.out.print("0");
					yesNo = true;
				} else {
					System.out.println("1");
					yesNo = false;
				}
			}
			x++;
		}
	}
}
