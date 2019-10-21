package com.revature.homeworktest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import javax.print.DocFlavor.INPUT_STREAM;

import org.junit.jupiter.api.Test;

import com.revature.homework.Q1;
import com.revature.homework.Q10;
import com.revature.homework.Q11;
import com.revature.homework.Q12;
import com.revature.homework.Q13;
import com.revature.homework.Q14;
import com.revature.homework.Q15Test;
import com.revature.homework.Q16;
import com.revature.homework.Q17;
import com.revature.homework.Q18;
import com.revature.homework.Q19;
import com.revature.homework.Q2;
import com.revature.homework.Q20;
import com.revature.homework.Q3;
import com.revature.homework.Q4;
import com.revature.homework.Q5;
import com.revature.homework.Q6;
import com.revature.homework.Q7;
import com.revature.homework.Q8;
import com.revature.homework.Q9;

class QTests {

	@Test
	void test() {
		
		int[] ar= {1,0,5,6,3,2,3,7,9,8,4};
		int result = Q1.sortMe(ar);
		
		assertEquals(result, 2);
	}
	@Test
	void test2() {
		
		int a = Q2.fibonacci();
		
		assertEquals(a, 46368);
	}
	@Test
	void test3() {
		
		String try1 = Q3.reversestring();
		String input = "Racecar is the best word backwords";
		
		assertEquals(try1,input);
	}
	@Test
	void test4() {
		
		int tryit = Q4.factorial(3);
		assertEquals(tryit, 6);
		
	}
	@Test
	void test5() {
		
		int idx = Q5.substring2();
		assertEquals(idx, 5);
	}
	@Test
	void test6() {
		
		boolean ie = Q6.isEven(4);
		assertEquals(ie,true);
	}
	@Test
	void test7() {
		
		String c = Q7.Q7();
		assertEquals(c, "Compares");
	}
	@Test
	void test8() {
		
		String p = Q8.List();
		assertEquals(p, "Palindrome");
	}
	@Test
	void test9() {
		
		boolean cp = Q9.CheckPrime(4);
		assertEquals(cp, false);
	}
	@Test
	void test10() {
		int result = Q10.Ternary();
		assertEquals(result,5 );
	}//Use number 5 and 7 for testing purposes.
	@Test
	void test11() {
		String qe = Q11.print();
		assertEquals(qe, "Marsha");
	}
	@Test
	void test12() {
		String e = Q12.even();
		assertEquals(e, "even");
	}
	@Test
	void test13() {
		String t = Q13.triangle();
		assertEquals(t, "triangle");
	}
	@Test
	void test14() {
		String s = Q14.switchcase();
		assertEquals(s, "Switching");
	}
	@Test
	void test15() {
		int i = Q15Test.main(3);
		assertEquals(i, 3);
		
	}
	@Test
	void test16() {
		String sc = Q16.StringCount();
		assertEquals(sc, "String Count");
	}
	@Test
	void test17() {
		String si = Q17.interest(100);
		assertEquals(si, "sinterest");
		
	}
	@Test
	void test18(){
		boolean su = Q18.isStringUpperCase("s");
		assertEquals(su,false);
		
	}
	@Test
	void test19() {
		boolean cp = Q19.checkPrime(9);
		assertEquals(cp,false);
	}
	@Test
	void test20() {
		String r = Q20.main(new String[1]);
		assertEquals(r, "Reading");
	}


}
