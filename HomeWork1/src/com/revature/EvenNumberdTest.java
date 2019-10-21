package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenNumberdTest {

	@Test
	void testEvenNumber() {
		EvenNumberArray a = new EvenNumberArray();
		int [] aa =a.evenNumber();
		int [] aaa = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100 };
		boolean bool = true;

	for(int i = 0; i< aa.length;i++) {
		if(aaa[i]!=aa[i])
			bool = false;
	}	
	assertEquals(true, bool);

	
	}

}
