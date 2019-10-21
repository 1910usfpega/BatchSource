package com.revature.questions;

import com.revature.differentpackage.DifferentPackage;

public class Q11 {
	/*
	 * Gets numbers from another package.
	 * 
	 */

	public static void main(String[] args) {
		float[] nums=getNums();
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		
		

	}
	
	public static float[] getNums() {
		/*
		 * added this for JUnit testing
		 */
		float[] nums=new float[2];
		nums[0]=DifferentPackage.getA();
		nums[1]=DifferentPackage.getB();
		return nums;
	}

}
