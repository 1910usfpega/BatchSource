package com.revature;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class SubStringTest {

	@Test
	void testSubStringer() {
		SubString a = new SubString();
		char aa =a.subStringer("hiqw", 1);
		assertEquals(aa,'i');
	}
	}


