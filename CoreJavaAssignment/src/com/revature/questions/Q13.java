package com.revature.questions;

public class Q13 {
	public static int main(String[] args) {
		/*
		 * Displays this: 
		 * 0
		 * 10
		 * 101
		 * 0101
		 * 
		 * and returns what the next number would be, in this case 0
		 * 
		 */
		int a=0;
		for(int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(a);
				if (a==1) {
					a=0;
				}else {
					a=1;
				}
			}
			System.out.println("");
		}
		return a;
	}

}
