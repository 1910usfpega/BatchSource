package com.revature.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Q12. Write a program to store numbers from 1 to 100 in an array. Print out 
 *  		all the even numbers from the array. Use the enhanced FOR loop for 
 *  		printing out the numbers.
 * @author Bryan Wood
 *
 */
class Question12Test {

	@Test
	void test() {
		Question12 q=new Question12();
		
		int[] r = new int[100];
		for (int i =0;i <100; i++)
			r[i]=i+1;
		
		assertArrayEquals(r, q.countingFun());
	}

}
