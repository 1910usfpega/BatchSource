package com.revature;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.revature.extra.importedFloats;

class JUnitTest {

	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize Test Data for " + info.getDisplayName());
	}
	
	@Test
	void Bubblez()
	{		
	int[] myArray = { 100, 1, 2, 3, 10 };
	int temp = 0;
	int[] expectedArray = {1, 2, 3, 10, 100};
	for (int i = 0; i < myArray.length; i++) {
		for (int j = 0; j < myArray.length - 1; j++) {
			if (myArray[j] > myArray[j + 1]) {
				temp = myArray[j];
				myArray[j] = myArray[j + 1];
				myArray[j + 1] = temp;
				System.out.println(Arrays.toString(myArray));
				
			}
		}
		System.out.println("Attempt number " + i);
		if (i == 5)
		{assertTrue(expectedArray.equals(myArray));}
	}
	
	System.out.println(myArray);
		//String expectedArray = "1, 2, 3, 10, 100";
		//int[] actualArray = myArray[];
		//System.out.println(myArray);

						
	}
	
	
	@Test
	void Fibonacci() {
		int fibNumber = 25, fibNumba1 = 0, fibNumba2 = 1;
		
		
		System.out.println(fibNumba1);
		System.out.println(fibNumba2);
		for(int i=0; i< fibNumber; i++) {
			int fibNumba3 = fibNumba1 + fibNumba2;
			fibNumba1 = fibNumba2;
			fibNumba2 = fibNumba3;
			System.out.println(fibNumba3);
			if(i == 24)
			{assertEquals(121393, fibNumba3);}
		}
		
		
	}
	
	
	@Test
	void StringMagic() {

			String stringMagic = "Cat";
			String stringMagic2 = "";
			
			for (int i = stringMagic.length()-1; i >= 0; i--) {
				stringMagic2 += stringMagic.charAt(i);
			}
			System.out.println(stringMagic2);
			
			assertEquals("taC", stringMagic2);
	}
	
	
	
	@Test
	void Factorial() {
		double n1 = 5, n2 = 0, sum = 1;
		for(int i = 0; i < n1; i++) {
			n2++;
			sum *= n2;
			
			System.out.println(sum + " " + n2);

		}
		double actual = 1*2*3*4*5;
		assertEquals(actual, sum);

	}
		
	
	
	@Test
	void NamelessHorse() {
//		public static Scanner sc= new Scanner(System.in);
//		System.out.println("Print String.");
//		String str = sc.nextLine();
//		System.out.println("Print Int.");
//		int idx = sc.nextInt();
		String str = "herse";
		int idx = str.length();
		
		System.out.println(str.substring(0, idx-1));
		assertEquals(str.substring(0, idx-1), "hers");
		
	}
	
	
	@Test
	void ModuluslessEven() {
		double n64 = 64;
		boolean even = false;
		
		if(n64/2 - (int)n64/2 != 0) {
			even = false;
		}
		else {
			even = true;
		}
		assertEquals(true, even);
		
	}
		
	
//	@Test
//	void CompareEmployees() {
//		List<Employee> employeeList = new ArrayList<Employee>();
//		employeeList.addAll(Arrays.asList(new Employee[] { 
//				new Employee("Alex", "Teacher", 66), 
//				new Employee("Heather", "Dean", 41)}));
//		List<Employee> employeeList1 = new ArrayList<Employee>();
//		employeeList1.addAll(Arrays.asList(new Employee[] { 
//				new Employee("Alex", "Teacher", 66), 
//				new Employee("Heather", "Dean", 41)}));
//		List<Employee> employeeList2 = new ArrayList<Employee>();
//		employeeList2.addAll(Arrays.asList(new Employee[] { 
//				new Employee("Heather", "Dean", 41),
//				new Employee("Alex", "Teacher", 66)}));
//
//		Collections.sort(employeeList);
//
//		
//		Collections.sort(employeeList, (arg0, arg1) -> {
//			return arg0.getName().compareTo(arg1.getName());
//		});
//		Collections.sort(employeeList2, (arg0, arg1) -> {
//			return arg0.getName().compareTo(arg1.getName());
//		});
//		assertTrue(employeeList2.equals(employeeList));
//		System.out.println(employeeList2.equals(employeeList));
//
//		System.out.println(employeeList1.equals(employeeList));
//		Collections.sort(employeeList, (arg0, arg1) -> {
//			return arg0.getDepartment().compareTo(arg1.getDepartment());
//		});
//		assertTrue(employeeList2.equals(employeeList));
//		
//		
//		//assertEquals();
//	}
	
	
	@Test
	void Palindromes() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("karan");
		names.add("madam");
		names.add("tom");
		names.add("civic");
		names.add("radar");
		names.add("jimmy");
		names.add("kayak");
		names.add("john");
		names.add("refer");
		names.add("billy");
		names.add("did");
		
		ArrayList<String> Palindrome2 = new ArrayList<String>(); 
		Palindrome2.add("madam");
		Palindrome2.add("civic");
		Palindrome2.add("radar");
		Palindrome2.add("kayak");
		Palindrome2.add("refer");
		Palindrome2.add("did");
		
		//names.get(i).length()-1;
		ArrayList<String> Palindrome = new ArrayList<String>();
		String stringMagic = "";
		for (int j = 0; j < names.size(); j++)
		{
			for (int i = names.get(j).length()-1; i >= 0; i--) {
				stringMagic += names.get(j).charAt(i);
			}
		if(names.get(j).equals(stringMagic)) {
			Palindrome.add(names.get(j));
		}
		stringMagic = "";
		}

		assertEquals(Palindrome2, Palindrome);
		
	}
	
	/*
	@Test
	void PrimeNumbers() {}
	*/
	
	@Test
	void Ternary() {
		
		int number = 7;
		int number2 = 8;
		int Minimum;
		Minimum = (number < number2) ? number : number2;
		assertEquals(7, Minimum);
		
	}
	
	
	@Test
	void Import() {
		importedFloats f = new importedFloats();
		assertEquals(4, f.extraA);
		assertEquals(5, f.extraB);
		
	}
	
	
	
	@Test
	void EvenArrays() {
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 2; i <= 100; i++)
		{if (i % 2 == 0)
			{numbers.add(i);}
		}
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(2); numbers2.add(4); numbers2.add(6); numbers2.add(8); numbers2.add(10);
		numbers2.add(12); numbers2.add(14); numbers2.add(16); numbers2.add(18); numbers2.add(20);
		numbers2.add(22); numbers2.add(24); numbers2.add(26); numbers2.add(28); numbers2.add(30);
		numbers2.add(32); numbers2.add(34); numbers2.add(36); numbers2.add(38); numbers2.add(40);
		numbers2.add(42); numbers2.add(44); numbers2.add(46); numbers2.add(48); numbers2.add(50);
		numbers2.add(52); numbers2.add(54); numbers2.add(56); numbers2.add(58); numbers2.add(60);
		numbers2.add(62); numbers2.add(64); numbers2.add(66); numbers2.add(68); numbers2.add(70);
		numbers2.add(72); numbers2.add(74); numbers2.add(76); numbers2.add(78); numbers2.add(80);
		numbers2.add(82); numbers2.add(84); numbers2.add(86); numbers2.add(88); numbers2.add(90);
		numbers2.add(92); numbers2.add(94); numbers2.add(96); numbers2.add(98); numbers2.add(100);

		assertEquals(numbers2, numbers);
	}
	
	/*
	@Test
	void Triangle() {}
	*/
	
	@Test
	void ShowCase() {
		String Input = "R";
		double a = 9;
		//ArrayList<String> split = new ArrayList<>();
		
		String seperate = ("I am learning Core Java");
		
		switch(Input) {
		case "R":
			System.out.println(Math.sqrt(a));
			a = Math.sqrt(a);
			break;
		case "D":
			System.out.println(LocalDateTime.now());
			break;	
		case "S":
			String[] split = seperate.split(" ", 0);
			for (String b:split) 
			{System.out.println(b);}
			break;
		}
		assertEquals(3, a);
		
	}
	
	
	@Test
	void CalculatorTest() {
		CalculatorButtons buttons = new CalculatorButtons();
		buttons.a = 8; buttons.b = 8;
		
		assertEquals(16, buttons.a+buttons.b);
		assertEquals(0, buttons.a-buttons.b);
		assertEquals(64, buttons.a*buttons.b);
		assertEquals(1, buttons.a/buttons.b );
	}
	
	
	@Test
	void CharCount() {
		int count;
		String str = "";
		str = "fiber";
		count = str.length();
		System.out.println(count);
		
		assertEquals(5, count);
	}
	
	
	@Test
	void InterestRates() {
		double principle, rate, time;
		principle = 100;
		rate = 0.04;
		time = 1;
		System.out.println(principle * (1 + rate * time));
		double A = principle * (1 + rate * time);
		assertEquals(104, A);
	}
	
	/*
	@Test
	void Grunt() {

		}

		
	}
	
	@Test
	void EvensOddsPrime() {}

	@Test
	void FileRead() {}
		
	*/
	
}
