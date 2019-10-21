package com.revature.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.revature.employee.Employee;
import com.revature.questions.Q1;
import com.revature.questions.Q4;

class TestAllQuestions {
	/*
	 *  This runs at least one JUnit test for each question
	 */

	@Test           //Q1
	void test1() {
		int[] bubble= {5,4,8,35,22,6};
		int[] result = Q1.bubbleSort(bubble);
		assertEquals("[4, 5, 6, 8, 22, 35]"  ,  Arrays.toString(result));
	}
	@Test           //Q2
	void test2() {
		int n=3;
		int result=com.revature.questions.Q2.printFib(n);
		assertEquals(1,result);
	}
	
	@Test           //Q2
	void test3() {
		int n=8;
		int result=com.revature.questions.Q2.printFib(n);
		assertEquals(13,result);
	}
	
	@Test           //Q3
	void test4() {
		String str="Look at it go!";
		String result = com.revature.questions.Q3.reverse(str);
		assertEquals("!og ti ta kooL",result);
	}
	
	@Test           //Q4
	void test5() {
		int result = Q4.computeFactorial(2);
		assertEquals(2,result);
	}
	
	@Test           //Q4
	void test6() {
		int result = com.revature.questions.Q4.computeFactorial(6);
		assertEquals(720,result);
	}
	
	@Test           //Q5
	void test7() {
		String str="Look at it go!";
		String result = com.revature.questions.Q5.subString(str, 6 );
		assertEquals("Look a",result);
	}
	
	@Test           //Q6
	void test8() {
		boolean result = com.revature.questions.Q6.checkIfEven(6 );
		assertEquals(true,result);
	}
	
	@Test           //Q6
	void test9() {
		boolean result = com.revature.questions.Q6.checkIfEven(13);
		assertEquals(false,result);
	}
	
	@Test           //Q7
	void test10() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.addAll(Arrays.asList(
		new Employee [] {
		new Employee("The Dude", "rug", 49),
		new Employee("Greg","clothing",24),
		new Employee("Bob","food",83)
		}));
		List <Employee> result = com.revature.questions.Q7.makeEmployees();
		assertEquals(employees.toString(),result.toString());
	}
	
	@Test           //Q8
	void test11() {
		ArrayList<String> result = com.revature.questions.Q8.makePalindromes();
		assertEquals("[madam, civic, radar, kayak, refer, did]",result.toString());
	}
	
	@Test           //Q9
	void test12() {
		int result = com.revature.questions.Q9.getPrimes();
		assertEquals(25,result);
	}
	
	@Test           //Q10
	void test13() {
		int result = com.revature.questions.Q10.compare(2, 7);
		assertEquals(2,result);
	}
	
	@Test           //Q11
	void test14() {
		float[] result = com.revature.questions.Q11.getNums();
		assertEquals(Arrays.toString(new float[]{(float)6.0,(float)122.0}),Arrays.toString(result));
	}
	
	@Test           //Q12
	void test15() {
		ArrayList<Integer> result = com.revature.questions.Q12.main(new String[1]);
		ArrayList<Integer> evens=new ArrayList<Integer>();
		for(int i=2;i<=100;i+=2) {
			evens.add(i);
		}
		assertEquals(evens.toString(),result.toString());
	}
	
	@Test           //Q13
	void test16() {
		int result = com.revature.questions.Q13.main(new String[1]);
		assertEquals(0,result);
	}
	
	@Test           //Q14
	void test17() {
		double result = com.revature.questions.Q14.askUser("1");
		assertEquals(Math.sqrt(2),result);
	}
	
	@Test           //Q15
	void test18() {
		double result = com.revature.questions.Q15.main(new String[1]);
		assertEquals(10.5,result);
	}
	@Test           //Q16
	void test19() {
		double result = com.revature.questions.Q16.main(new String[] {"hello"});
		assertEquals(5,result);
	}
	@Test           //Q17
	void test20() {
		double result = com.revature.questions.Q17.calculate("10", "0.3", "12");
		assertEquals(36,result);
	}
	
	@Test           //Q18
	void test21() {
		com.revature.questions.Q18 q=new com.revature.questions.Q18();
		boolean result=q.hasUpper("hello");
		assertEquals(false,result);
	}
	
	@Test           //Q18
	void test22() {
		com.revature.questions.Q18 q=new com.revature.questions.Q18();
		boolean result=q.hasUpper("my name is Sam");
		assertEquals(true,result);
	}
	
	@Test           //Q18
	void test23() {
		com.revature.questions.Q18 q=new com.revature.questions.Q18();
		String result=q.makeUpper("my name is Sam");
		assertEquals("MY NAME IS SAM",result);
	}
	
	@Test           //Q18
	void test24() {
		com.revature.questions.Q18 q=new com.revature.questions.Q18();
		int result=q.convert("36");
		assertEquals(46,result);
	}
	
	@Test           //Q19
	void test25() {
		ArrayList<Integer> result=com.revature.questions.Q19.main(new String[1]);
		assertEquals("[1, 4, 6, 8, 9, 10]",result.toString());
	}
	
	@Test           //Q20
	void test26() {
		String result=com.revature.questions.Q20.main(new String[1]);
		assertEquals(104,result.length());
	}
	
	
	
	

}
