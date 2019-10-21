package com.revature.q1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	void testSort() {
		int[] testA = new int[] {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		int[] sortedA = new int[] {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
		boolean bool = true;
		int[] a =BubbleSort.sort(testA);
		for(int i = 0;i < sortedA.length;i++) {
			if(a[i]!=sortedA[i])
				bool = false;
		}
		BubbleSort.sort(testA);
		assertEquals(true, bool);
	}

}
