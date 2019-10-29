package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class JUnitBank {

	
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize Test Data for " + info.getDisplayName());
	}
	
	@Test
	void Username() {
		String Username = "L9999999";
		boolean StringTruth = true;
		//String must be a 4-20 characters
		if (Username.length() < 4 || Username.length() > 20)
		{
			StringTruth = false;
		}
		else if(Username.charAt(0) == '1' || Username.charAt(0) == '2' || Username.charAt(0) == '3' ||
				Username.charAt(0) == '4' || Username.charAt(0) == '5' || Username.charAt(0) == '6' ||
				Username.charAt(0) == '7' || Username.charAt(0) == '8' || Username.charAt(0) == '9' ||
				Username.charAt(0) == '0') {
			StringTruth = false;
		}
		assertEquals(true, StringTruth);
	}

}
