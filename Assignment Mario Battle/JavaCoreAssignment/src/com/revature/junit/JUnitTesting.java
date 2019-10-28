package com.revature.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.homework.Question1;
import com.revature.homework.Question2;
import com.revature.homework.Question3;
import com.revature.homework.Question4;
import com.revature.homework.Question5;
import com.revature.homework.Question6;

class JUnitTesting {

	@Test
	void test1() {
		int [] meinArr= {1,0,5,6,3,2,3,7,9,8,4};
		int p = Question1.sortMe(meinArr);
		assertEquals(p, 0);
	//	fail("Not yet implemented");
	}
	@Test
	void test2(){
		int f = Question2.fibonacci();
		assertEquals(f, 0);
	}
	@Test
	void test3(){
		String f = Question3.reversal("\n");
		assertEquals(f, "\n");
	}
	@Test
	void test4(){
		int f = Question4.factorial(2);
		assertEquals(f, 0);
	}
	@Test
	void test5(){
		String f = Question5.subStringing("Voldemort", 5);
		assertEquals(f, " ");
	}
	@Test
	void test6(){
		String f = Question6.divisibility(886);
		assertEquals(f, "EVEN");
	}
//	@Test
//	void test7(){
//		String f = Question7.sortEmOut(employeeList);
//		assertEquals(f, "\n");
//	}
//	@Test
//	void test3(){
//		String f = Question3.reversal("\n");
//		assertEquals(f, "\n");
//	}
//	@Test
//	void test3(){
//		String f = Question3.reversal("\n");
//		assertEquals(f, "\n");
//	}
//	
	

}
