//Write a program that would access two float-variables from a class that exists in another package. 
//Note, you will need to create two packages to demonstrate the solution.	

package com.homework.assignments;

import com.homework.problemeleven.floatProblem;

public class ProblemEleven {
	
	//instantiate two floats
	public static float float1 = floatProblem.f1;
	public static float float2 = floatProblem.f2;
	
	//Print out the two floats from another package
	public static void showFloat() {
		System.out.println(float1);
		System.out.println(float2);
	}
	
}
