package com.revature.driver;

import com.revature.abstractmethods.AbstractM;
import com.revature.arraylist.ArrayLists;
import com.revature.commandl.CommandL;
import com.revature.data.Data;
import com.revature.employe.EmployeMain;
import com.revature.even.Even;
import com.revature.evens.Evens;
import com.revature.factorial.Factorial;
import com.revature.fibonacci.Fibonacci;
import com.revature.float1.FloatVariables;
import com.revature.interest.Interest;
import com.revature.interfaces.Implementation;
import com.revature.palindromes.Palindromes;
import com.revature.prime.Prime;
import com.revature.q1.BubbleSort;
import com.revature.reverse.Reverse;
import com.revature.substring.Substring;
import com.revature.switchCase.Switch;
import com.revature.ternary.Ternary;
import com.revature.triangle.Triangle;


public class MainClass {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };
		System.out.println("Q1:");
		BubbleSort.BubbleSort(arr);
		System.out.println("");

		System.out.println("Q2:");
		Fibonacci.fibonacci();
		System.out.println("");

		System.out.println("Q3: ");
		String s = "Hello";
		Reverse.reverse(s); 
		System.out.println("");

		System.out.println("Q4: ");
		Factorial.factorial(5);
		System.out.println("");

		String str = "Substring";
		int i = 3;
		System.out.println("Q5: ");
		Substring.substring(str, i);
		System.out.println("");

		System.out.println("Q6: ");
		Even.even(400);
		System.out.println("");

		System.out.println("Q7: ");
		EmployeMain.employeMain();
		System.out.println("");

		System.out.println("Q8: ");
		Palindromes.palindromes( "karan", "madam", "tom", "civic", "radar", "jimmy", "kayak", "john" ,"refer", "billy", "did");
		System.out.println("");
		
		System.out.println("Q9: ");
		Prime.prime();
		System.out.println("");
		
		System.out.println("Q10: ");
		Ternary.ternary(600, 900);
		System.out.println("");
		
		System.out.println("Q11: ");
		float one = FloatVariables.getF1();
		float two = FloatVariables.getF2();
		System.out.println("First float-variable: " + one + ". Second float-variable: " + two);
		System.out.println("");
		
		System.out.println("Q12: ");
		//Evens.evens();
		System.out.println("");
		
		System.out.println("Q13: ");
		Triangle.triangle();
		System.out.println("");
		
		System.out.println("Q14: ");
		Switch.switchCase();
		System.out.println("");
		
		System.out.println("Q15: ");
		int x = 10;
		int y = 20;
		Implementation imp = new Implementation();
		imp.addition(x, y);
		imp.subtraction(x, y);
		imp.multiplication(x, y);
		imp.division(x, y);
		System.out.println("");
		
		System.out.println("Q16: ");
		//comment out if not running through terminal
		//CommandL.main(args);
		System.out.println("");
		
		System.out.println("Q17: ");
		//Interest.findInterest();
		System.out.println("");
		
		System.out.println("Q18: ");
		AbstractM.main(args);
		System.out.println("");
		
		System.out.println("Q19: ");
		ArrayLists.main(args);
		System.out.println("");
		
		System.out.println("Q20: ");
		Data.main(args);
		System.out.println("");
		

	}

}
