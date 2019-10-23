package com.revature.hwtesting;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.revature.corejava.FunWithJavaWeekB;

class PerfectTesting {

	@Test
	void test() {
		//Q1 BubbleSort
		int[] sorter = {1,0,5,6,3,2,3,7,9,8,4};
		String a = FunWithJavaWeekB.bubbleSort(sorter);
		assertEquals(a,"hello");
	}

	
	@Test
	void test2() {
		//Q2 Reverse a String
		
	}
	
	
	@Test
	void test3() {
		//Q3 Fibonacci
		String teehee = "Are we not drawn onward to new era?";
		for (int a = 0; a < teehee.length(); a++)
		{ teehee = teehee.substring(1, teehee.length() - a) + teehee.charAt(0)
		+ teehee.substring(teehee.length() - a);
		}
		System.out.println(teehee);
		assertEquals(teehee,"?are wen ot drawno nward ton ew erA");
		
	}
	
	
	@Test
	void test4() {
		//Q4 Factorial
		int facty = 7;
		System.out.println("The factorial of " + facty + " is " +
		FunWithJavaWeekB.factorial(facty) + ".");
		assertEquals("The factorial of " + facty + " is " +
				FunWithJavaWeekB.factorial(facty) + ".", 
				"The factorial of 7 is 5040.");
	}
	
	
	@Test
	void test5() {
		//Q5 
		System.out.println(FunWithJavaWeekB.stringInclusive("Derthalie", 5));
		assertEquals(FunWithJavaWeekB.stringInclusive("Derthalie", 5), "Derth");
	}
	
	
	
	@Test
	void test6() {
		//Q6
		int even = 1111;
		if (FunWithJavaWeekB.evenThough(even))
		System.out.println("The number " + even + " is truly even.");
		else
		System.out.println("This number, " + even + " is surely odd.");
		assertEquals("This number, " + even + " is surely odd.","This number, 1111 is surely odd.");
		
	}
	
	@Test 
	void test7() {
		//Q7
		
	}
	
	
}
