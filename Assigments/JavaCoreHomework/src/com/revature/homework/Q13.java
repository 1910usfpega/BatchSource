package com.revature.homework;



public class Q13 {
	public static String triangle() {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(((i+j)%2)+" ");
			}
			System.out.print("\n");
		}
	return "triangle";}
}
