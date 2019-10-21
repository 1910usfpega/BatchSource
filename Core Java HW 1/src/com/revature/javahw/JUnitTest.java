package com.revature.javahw;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.revature.homework.Question1;
import com.revature.homework.Question2;
import com.revature.homework.Question3;
import com.revature.homework.Question4;
import com.revature.homework.Question5;
import com.revature.homework.Question6;
import com.revature.homework.Question7main;

class JUnitTest {

	@Test//Question1
	void test() {
		int[]ar = {1,0,5,6,3,2,3,7,9,8,4};
		int[] result = Question1.sortMe(ar);
		assertEquals(Arrays.toString(result),"[0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9]");
				
	}
	@Test//Question2
	void test2() {
		int result = Question2.fibonacci();
		assertEquals(75025,result);
		

}
	@Test//Question3
	void test3() {
		int result = Question3.Kobe("Kobe");
		System.out.println(result);
		assertEquals(2,result);
	}
		
	@Test//Question4
	void test4() {
		assertEquals(120,Question4.Factorial(5));
		
		
		}
	
	@Test//Question5
	void test5() {
		assertEquals('s',Question5.sub("Magic Johnson",10));
	}
		
	@Test//Question6
	void test6() {
		assertEquals(true,Question6.Even(20));
		
	}
	
	@Test//Question7
	void test7() {
	
	}
	
	@Test//Question8
	void test8() {
		
		
	}
	@Test//Question9
	void test9() {
		
	}
	@Test//Question9
	void test10() {
	}
	
	@Test//Question9
	void test11() {
		
	}
		
	@Test//Question9
	void test12() {
	}
	
	@Test//Question9
	void test13() {
		
	}
	@Test//Question9
	void test14() {
		
	}
	@Test//Question9
	void test15() {
		
	}
	@Test//Question9
	void test16() {
		
	}
	@Test//Question9
	void test17() {
		
	}
	@Test//Question9
	void test18() {
		
	}
	@Test//Question9
	void test19() {
		
	}
	@Test//Question9
	void test20() {
		
	}
}

