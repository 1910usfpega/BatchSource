package com.revature.homework;

public class Q12 {
	public static String even() {
		int [] array = new int[100];
		for (int a =0; a < array.length; a++) {
			array[a] = a + 1;
			if(array[a]%2==0) {
				System.out.println(array[a]);
			}
		}
	return "even";}

}
