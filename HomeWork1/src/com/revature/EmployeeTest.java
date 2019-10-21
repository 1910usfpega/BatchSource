package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testAge() {
		Employee a = new Employee(1,"","");
		int temp = a.getAge();
		assertEquals(1,temp);
	}

	
}
