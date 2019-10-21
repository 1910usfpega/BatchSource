package com.revature.driver;

import java.util.ArrayList;
import java.util.Collections;

import com.revature.q1.BubbleSort;
import com.revature.q10.TernaryMin;
import com.revature.q11.FloatAccess;
import com.revature.q12.Enhanced4Even;
import com.revature.q13.NumbersTriangle;
import com.revature.q15.InterfaceDefinition;
import com.revature.q16.StringCharCount;
import com.revature.q17.SimpleInterestCalculator;
import com.revature.q18.Abstraction;
import com.revature.q19.ArrayListArithmetic;
import com.revature.q2.Fibonacci;
import com.revature.q20.FileIO;
import com.revature.q4.NFactorial;
import com.revature.q5.Substrings;
import com.revature.q6.EvenInteger;
import com.revature.q7.EListComparator;
import com.revature.q7.Employee;
import com.revature.q8.ArrayListPalindromes;
import com.revature.q9.DisplayPrime;

public class Driver {

	public static void main(String[] args) {
		
		//Q1 -- BubbleSort
		int[] myArray = new int[] {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		myArray = BubbleSort.sort(myArray);
		
		//Q2 -- Fibonacci
		Fibonacci.fib();
		
		//Q3 -- String reversal
		
		
		//Q4 -- N Factorial
		NFactorial.factorial(7);
		
		//Q5 -- Substrings
		System.out.println(Substrings.getSubstring("flapjackals", 4) + "\n");
		
		//Q6 -- EvenInteger
		System.out.println(EvenInteger.isEven(36) + "\n");
		
		//Q7 -- ComparatorSort
		System.out.println("Q7");
		ArrayList<Employee> eList = new ArrayList<>();
		Employee e1 = new Employee("John", "Production", 38),
				 e2 = new Employee("Jack", "Sales", 26);
		eList.add(e1);
		eList.add(e2);
		Collections.sort(eList, new EListComparator());
		for(Employee e : eList) {
			System.out.println(e.toString());
		}
		System.out.println();
		
		//Q8 -- ArrayListPalindromes
		ArrayListPalindromes.isPalindrome();
		
		//Q9 -- DisplayPrime
		DisplayPrime.prime();
		
		//Q10 -- TernaryMin
		TernaryMin.min(6, 10);
		
		//Q11 -- FloatAccess
		FloatAccess.printNums();
		
		//Q12 -- Enhanced4Even
		Enhanced4Even.printEven();
		
		//Q13 -- NumbersTriangle
		NumbersTriangle.makeShape();
		
		//Q14 -- SwitchStuff
		
		
		//Q15 -- InterfaceDefinition
		InterfaceDefinition id = new InterfaceDefinition();
		System.out.println("Addition: " + id.aaddition(16, 42));
		System.out.println("Subtraction: " + id.subtraction(86, 64));
		System.out.println("Multiplication: " + id.multiplication(13, 6));
		System.out.println("Division: " + id.division(60, 5) + "\n");
		
		//Q16 -- StringCharCount
		String[] sArray = new String[] {"Strings","rrrrrrr","sooooooo","keeeewwwwlll"};
		StringCharCount.numChars(sArray);
		
		//Q17 -- SimpleInterestCalculator
		System.out.println(SimpleInterestCalculator.calcInterest(2500, .24, 3) + "\n");
		
		//Q18 -- Abstraction
		String str = "abStraCtioN";
		Abstraction abs = new Abstraction();
		
		System.out.println(abs.hasCaps(str));
		System.out.println(abs.lowerCaps(str));
		abs.stringToInt("257");
		System.out.println();
		
		//Q19 -- ArrayListArithmetic
		ArrayListArithmetic.arithmetic();
		
		//Q20 -- FileIO
		FileIO.readAndPrint();
		
	}
	
	
}
