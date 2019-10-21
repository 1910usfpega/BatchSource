package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScannerInputTest {

	@Test
	void test() {
		ScannerInput  test = new ScannerInput();
		char[] output = test.scannery();
		boolean bool = true;s
		char [] output2 = {'h','e','l','l','o'	};
		for(int i = 0; i< output.length;i++) {
			if(output[i]!=output2[i])
			bool = false;
			} 
			assertEquals(true, bool);
			}

}
