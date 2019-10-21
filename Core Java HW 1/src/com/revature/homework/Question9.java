package com.revature.homework;

import java.util.ArrayList;

public class Question9 {
	static ArrayList<Integer> magicjohnson = new ArrayList<Integer>();
			
		
	
		public static void Magic() {
			System.out.println("Question 9");
			System.out.println("Prime Numbers");
			System.out.println(2);
			System.out.println(3);
			System.out.println(5);
			System.out.println(7);
		
	for (int i=0; i<100; i++) {
		magicjohnson.add(1+i);
		if (i%2!=0) {
			if (i%3!=0) {
				if (i%5!=0) {
					if(i%7!=0) {
						System.out.println(i);
					}
				}
			}
				
		}
			
		}
		
	}
	
}

