package com.revature.evens;

public class Evens {
	
	public static String evens() {
		
		int[] nums = new int[100];
		int[] evens = new int[50];
		
		for (int i = 1, y = 0; i <=100; i++, y++) {
			nums[y] = i;
		}
		
		for(int z: nums) {
			if (z%2 == 0) {
				System.out.print(z + ", ");
				
			}
		}
		return 
		
	}

}
