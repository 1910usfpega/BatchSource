package com.revature.homework;

import java.util.Arrays;

public class Question1 {

		static void sortMe(int[] ar) {
			int temp=0;
			for (int i=1; i<ar.length; i++) {
				for (int j=0; j<ar.length-i; j++) {
					if(ar[j] > ar[j+1]) {
						temp = ar[j];
						ar[j] = ar[j+1];
						ar[j+1] = temp;
						
						System.out.println(Arrays.toString(ar));
						
					}
					//System.out.println();
				}
			}
			
			
		}

	}
