package com.revature.assignment;
import java.io.IOException;
import com.revature.assignmentfloat.Float;
import com.revature.assignment.*;
import com.revature.comparator.ComparatorMain;
public class Driver {

	public static void main(String[] args) throws IOException {
		System.out.println("Question 1");
		int [] ar = {1,0,5,6,3,2,3,7,9,8,4};
		Q1.sortinBubs(ar);
	System.out.println("====================");
	System.out.println("Question 2");
	Q2.fib();
	System.out.println("====================");
	System.out.println("Question 3");
	String reversed = reverseString("Eat my shorts");
	System.out.println("Reverse string -" + reversed);
	System.out.println("====================");
	System.out.println("Question 4");
	Q4.factorialMethod();
	System.out.println("====================");
	System.out.println("Question 5");
	System.out.println(Q5.substring("MILES PEW PEW PEW", 9));
	System.out.println("====================");
	System.out.println("Question 6");
	Q6.even();
	System.out.println("====================");
	System.out.println("Question 7");
	ComparatorMain.Comparator();
	System.out.println("====================");
	System.out.println("Question 8");
	Q8.palsOnPals();
	System.out.println("====================");
	System.out.println("Question 9");
	Q9.primeTime();
	System.out.println("====================");
	System.out.println("Question 10");
	Q10.ternary();
	System.out.println("====================");
	System.out.println("Question 11");
	Float.floaty();
	System.out.println("====================");
	System.out.println("Question 12");
	Q12.evenArray();
	System.out.println("====================");
	System.out.println("Question 13");
	Q13.triangle();
	System.out.println("====================");
	System.out.println("Question 14");
	//Q14.switchIt(); doesn't work in driver. has own main method to run in Q14 class
	System.out.println("====================");
	System.out.println("Question 15");
	ImplementInterface II = new ImplementInterface();
	II.add();
	II.subtract();
	II.multiply();
	II.divide();
	System.out.println("====================");
	System.out.println("Question 16");
	Q16.displayString();
	System.out.println("====================");
	System.out.println("Question 17");
	Q17.interestCalc();
	System.out.println("====================");
	System.out.println("Question 18");
	//need this one
	System.out.println("====================");
	System.out.println("Question 19");
	Q19.arrayLists();
	System.out.println("====================");
	System.out.println("Question 20");
	Q20.characters();
	}
	//method for question 3
	public static String reverseString(String str) {
	if((str == null) || (str.length() <= 1)) {
		return str;
	}
	 return reverseString(str.substring(1)) + str.charAt(0);
}
	}
	
