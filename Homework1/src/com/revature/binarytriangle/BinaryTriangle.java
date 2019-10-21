package com.revature.binarytriangle;

public class BinaryTriangle {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < i; j++) {
				count++;
				
				if(count % 2 == 0) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
			}
			System.out.println("");
		}
	}
}
