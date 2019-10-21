package com.revature.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.even.Even;
import com.revature.factorial.Factorial;
import com.revature.fibonacci.Fibonacci;
import com.revature.float1.FloatVariables;
import com.revature.palindromes.Palindromes;
import com.revature.prime.Prime;
import com.revature.q1.BubbleSort;
import com.revature.reverse.Reverse;
import com.revature.substring.Substring;
import com.revature.ternary.Ternary;

class JunitT {

	@Test
	void test() {
		int[] arr = {2,4,6,1,3,5};
		String result = BubbleSort.BubbleSort(arr);
		assertEquals("[1,2,3,4,5,6]", result); 
//			
//		String q2 = Fibonacci.fibonacci();
//		assertEquals("[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368]",q2);
//		
//		String q3 = "Hello";
//		String q33 = Reverse.reverse(q3);
//		assertEquals("[olleH]", q3);
//		
//		int q4 = 120;
//		int q44 = Factorial.factorial(q4);
//		assertEquals(120, q44);
//		
//		String str = "Substring";
//		int i = 3;
//		String q5 = Substring.substring(str, i);
//		assertEquals("Sub", q5);
//		
//		boolean b = false;
//		int q6 = 400;
//		boolean q66 = Even.even(q6);
//		assertEquals(true, q66);
//		
//		// q7
//		
//		String q8 = Palindromes.palindromes( "karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john" ,"refer", "billy", "did");
//		assertEquals("[madam, civic, radar, kayak, refer, did]", q8);
//		
//		String q9 = Prime.prime();
//		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]", q9);
//		
//		int q10 = Ternary.ternary(600, 900);
//		assertEquals(600, q10);
//		
//		float one = FloatVariables.getF1();
//		float two = FloatVariables.getF2();
//		assertEquals(5, one);
//		assertEquals(10, two); 
//		
//	//	int q12 = 
//		
//		
//		
//		
//		
		
	}

}
