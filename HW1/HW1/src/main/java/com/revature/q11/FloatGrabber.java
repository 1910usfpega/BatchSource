package com.revature.q11;

import com.revature.q1.BubbleSort;

public class FloatGrabber {

	public static BubbleSort bubba = new BubbleSort();
	
	public static void grabSomeFloats() {
		
		System.out.println("I stole these from BubbleSort and put them together; I hope he won't notice.");
		System.out.println("\t" + (bubba.FloatGrabber1 + bubba.FloatGrabber2));
	}
	
}
