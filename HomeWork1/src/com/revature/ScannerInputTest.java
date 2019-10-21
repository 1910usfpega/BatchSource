package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScannerInputTest {

	@Test
	void testScanner() {
		ScannerInput a = new ScannerInput();
		char [] aa = a.scanner();
		boolean bool = true;
		char [] b = {'h','e','l','l','o'};
		for(int i = 0; i< aa.length;i++) {
			if(aa[i]!=b[i])
				bool = false;
		}	
		assertEquals(true, bool);
		

	}

}
