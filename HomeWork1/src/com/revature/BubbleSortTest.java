package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	void testBubbleSort() {
		boolean bool = true;
	int [] a =BubbleSort.bubbleSort();
	int [] b = {0 ,1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
	for(int i = 0; i< a.length;i++) {
		if(a[i]!=b[i])
			bool = false;
	}	
	assertEquals(true, bool);
	}
}
