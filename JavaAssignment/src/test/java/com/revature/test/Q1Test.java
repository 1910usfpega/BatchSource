package com.revature.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.assignment.Q1;

class Q1Test {

	@Test
	public void bubbleSortTestSuccess() {

        int[] numbers = new int[] { 3, 7, 54, 12, 88, 17, 32 };

        Q1.sortinBubs(numbers);



        assertArrayEquals(new int[] { 3, 7, 12, 17, 32, 54, 88 }, numbers);

    }

}
