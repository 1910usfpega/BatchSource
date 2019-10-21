package com.revature.assignment;

import java.util.Arrays;

public class Q1 {

	public static void sortinBubs(int[] bubs) {
		
		int ble=0;
		for(int i=1;i<bubs.length;i++) {
			for(int j=0;j<bubs.length-i;j++) {
				if(bubs[j]>bubs[j+1]) {
					ble = bubs[j];
					bubs[j]=bubs[j+1];
					bubs[j+1]=ble;
					System.out.println("Attempt number: "+i);
					System.out.println(Arrays.toString(bubs));
					
				}
			}
		}
	}
}
