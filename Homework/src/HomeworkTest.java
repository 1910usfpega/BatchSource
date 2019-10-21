import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.revature.anotherpack1.DemoClass1;
import com.revature.interfacedemo.MathImplementation;
import com.revature.q18.DemoSubClass;
import com.revature.q7.Employee;
import com.revature.q7.SortByAge;
import com.revature.tasks.Q10;
import com.revature.tasks.Q12;
import com.revature.tasks.Q16;
import com.revature.tasks.Q17;
import com.revature.tasks.Q19;
import com.revature.tasks.Q20;
import com.revature.tasks.Q6;

import utils.BubbleSort;
import utils.Factorial;
import utils.Palindrome;
import utils.PrimeNumber;
import utils.Fib;
import utils.ReversString;
import utils.SubStringFun;
import utils.Triangle;

class HomeworkTest {
	@Test
	void test_q1() {
		int [] myArray = {1,0,5,6,3,2,3,7,9,8,4};
		int [] actualResult = BubbleSort.sortMe(myArray);;
		
		int [] expectedResult = {0,1, 2, 3, 3, 4, 5, 6, 7, 8, 9};
		
		for (int i=0; i<expectedResult.length; i++) {
			assertEquals(expectedResult[i], actualResult[i]);
		}
	}

	
	@Test
	void test_q2() {
		List<Integer> actualResult = Fib.createListWithFib(5);
		List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3));
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	void test_q3() {
		String actualResult = ReversString.reversingString("Some");
		String expectedResult = "emoS";
		
		assertEquals(expectedResult, actualResult);
		assertNotEquals("ddd", actualResult);
	}
	
	
	@Test
	void test_q4() {
		Integer actualResult = Factorial.factorial(3);
		Integer expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	
	@Test
	void test_q5() {
		assertEquals(SubStringFun.substring("SomeString", 3), "Som");
	}
	
	@Test
	void test_q6() {
		assertEquals(Q6.isEven(5), false);
		assertEquals(Q6.isEven(6), true);
	}
	
	@Test
	void test_q7() {
		
		ArrayList<Employee> expectedResult = new ArrayList<Employee>();
		expectedResult.add(new Employee("Iskandar", "Software developing", 22));
		expectedResult.add(new Employee("Bob", "Logistic", 30));
		expectedResult.add(new Employee("Rick", "R&D", 300));
		expectedResult.add(new Employee("Morty", "R&D", 400));
		
		
		ArrayList<Employee> actualResult = new ArrayList<Employee>();
		
		
		actualResult.add(new Employee("Iskandar", "Software developing", 22));
		actualResult.add(new Employee("Morty", "R&D", 400));
		actualResult.add(new Employee("Bob", "Logistic", 30));
		actualResult.add(new Employee("Rick", "R&D", 300));		
		
		Collections.sort(actualResult, new SortByAge()); 
		
		for (int i=0; i<expectedResult.size(); i++) 
			assertEquals(expectedResult.get(i).toString(), actualResult.get(i).toString());
	}
	
	
	@Test
	void test_q8 () {
		assertEquals(Palindrome.isPalindrome("true"), false);
		assertEquals(Palindrome.isPalindrome("civic"), true);
	}
	
	
	@Test
	void test_q9 () {
		assertEquals(PrimeNumber.checkPrime(5), true);
		assertEquals(PrimeNumber.checkPrime(6), false);
	}
	
	
	@Test
	void test_q10 () {
		assertEquals(Q10.ternaryWrap(1, 2), 1);
		assertEquals(Q10.ternaryWrap(100, 200), 100);
	}
	
	@Test
	void test_q11 () {
		assertEquals(DemoClass1.f1, (float) 33.22);
	}
	
	@Test
	void test_q12 () {
		int [] expectedResult = {1, 2};
		int [] actualResult = Q12.createArray(2);
		for (int i=0; i<expectedResult.length; i++) {
			assertEquals(actualResult[i], expectedResult[i]);
		}
	}
	
	@Test
	void test_q13 () {
		assertEquals(Triangle.draw(1), "1 \n");
		assertEquals(Triangle.draw(2), "1 \n0 1 \n");
	}
	
	@Test
	void test_q14 () {
		assertEquals(Math.sqrt(16), 4);
	}
	
	
	@Test
	void test_q15 () {
		MathImplementation mm = new MathImplementation();
		assertEquals(mm.addition(4.0, 2.0), 6.0);
		assertEquals(mm.substraction(4.0, 2.0), 2.0);
		assertEquals(mm.multiplication(4.0, 2.0), 8.0);
		assertEquals(mm.division(10.0, 2.0), 5.0);
	}
	
	@Test
	void test_q16 () {
		String [] args = {"Aa", "Bb"};
		String actualResult = Q16.concatArgs(args);
		String expectedResult = "Aa Bb ";
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	void test_q17 () {
		List<Number> interest_variables = new ArrayList<Number>();
		interest_variables.add(100);
		interest_variables.add(10);
		interest_variables.add(10);
		
		double actualResult = Q17.calcInterest(interest_variables);
		double expectedResult = 100.0;
		
		assertEquals(actualResult, expectedResult);
	}
	
	
	@Test
	void test_q18 () {
		DemoSubClass dsc = new DemoSubClass();
		assertEquals(dsc.convertStringToInteger("10"), 10);
	}
	
	@Test
	void test_q19 () {
		List<Integer> arrayToTen = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayToTen.add(i + 1);
		}
		
		List<Integer> actualResult = Q19.deletePrimeNumbers(arrayToTen);
		List<Integer> expectedResult = new ArrayList<Integer>();
		// [1, 3, 4, 6, 8, 9, 10]
		expectedResult.add(1);
		expectedResult.add(3);
		expectedResult.add(4);
		expectedResult.add(6);
		expectedResult.add(8);
		expectedResult.add(9);
		expectedResult.add(10);
		
		assertEquals(actualResult, expectedResult);
		
	}
	
	
	@Test
	void test_q20 () {
		String actualResult = Q20.renderOutputByLine("Mickey:Mouse:35:Arizona");
		String expectedResult = "Name: Mickey Mouse\nAge: 35 years\nState: Arizona\n\n";
		
		assertEquals(actualResult, expectedResult);
	}
	
	
	
	

}
