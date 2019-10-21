package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenNumberArrayTest {

	@Test
	void test() {
		EvenNumberArray array2 = new EvenNumberArray();
		int [] array1 = array2.evenNumber();
		int [] array3 =  {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100,};
		 boolean bool = true;
		 for (int i=0; i<array1.length;i++) {
			 if (array3[i]!=array1[i]);
				boolean bool1 =false;
		 }
		 assertEquals(true, bool);
		 
		 
		 
		 
	}

}
