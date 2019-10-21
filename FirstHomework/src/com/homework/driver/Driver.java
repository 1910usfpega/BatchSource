package com.homework.driver;

import java.util.Scanner;

import com.homework.assignments.Problem18;
import com.homework.assignments.ProblemEight;
import com.homework.assignments.ProblemEighteen;
import com.homework.assignments.ProblemEleven;
import com.homework.assignments.ProblemFifteen;
import com.homework.assignments.ProblemFive;
import com.homework.assignments.ProblemFour;
import com.homework.assignments.ProblemFourteen;
import com.homework.assignments.ProblemNine;
import com.homework.assignments.ProblemNineteen;
import com.homework.assignments.ProblemOne;
import com.homework.assignments.ProblemSeven;
import com.homework.assignments.ProblemSeventeen;
import com.homework.assignments.ProblemSix;
import com.homework.assignments.ProblemSixteen;
import com.homework.assignments.ProblemTen;
import com.homework.assignments.ProblemThirteen;
import com.homework.assignments.ProblemThree;
import com.homework.assignments.ProblemTwelve;
import com.homework.assignments.ProblemTwenty;
import com.homework.assignments.ProblemTwo;

public class Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Problem 1\n===================");
		ProblemOne.bSort();
		System.out.println("\nProblem 2\n===================");
		ProblemTwo.fSequence();
		System.out.println("\n\nProblem 3\n===================");
		ProblemThree.reverse();
		System.out.println("\n\nProblem 4\n===================");
		ProblemFour.nFactorial();
		System.out.println("\nProblem 5\n===================");
		System.out.print("Enter a String: ");
		String str = input.nextLine();
		System.out.print("Enter an index: ");
		int idx = input.nextInt();
		System.out.print("Substring of: '" + str + "' is " + "'" + ProblemFive.sString(str, idx) + "'");
		System.out.println("\n\nProblem 6\n===================");
		ProblemSix.isEven();
		System.out.println("\nProblem 7\n===================");
		ProblemSeven.sortEmployee();
		System.out.println("\nProblem 8\n===================");
		ProblemEight.isPalindrome();
		System.out.println("\n\nProblem 9\n===================");
		ProblemNine.isPrime();
		System.out.println("\n\nProblem 10\n===================");
		ProblemTen.checkMin();
		System.out.println("\n\nProblem 11\n===================");
		ProblemEleven.showFloat();
		System.out.println("\nProblem 12\n===================");
		ProblemTwelve.printEven();
		System.out.println("\n\nProblem 13\n===================");
		ProblemThirteen.triangle();
		System.out.println("\n\nProblem 14\n===================");
		ProblemFourteen.sCase();
		System.out.println("\n\nProblem 15\n===================");
		ProblemFifteen a = new ProblemFifteen();
		System.out.println("Addition: " + a.add(1, 2));
		System.out.println("Subtraction: " + a.sub(3, 4));
		System.out.println("Multiplication: " + a.mult(5, 6));
		System.out.println("Division: " + a.div(7, 8));
		System.out.println("\n\nProblem 16\n===================");
		System.out.println("Use terminal.");
		System.out.println("\n\nProblem 17\n===================");
		ProblemSeventeen.calculate();
		System.out.println("\n\nProblem 18\n===================");
		Problem18 b = new Problem18();
		System.out.print("Enter a string: ");
		str = b.getWord();
		System.out.println("String entered: " + str);
		if (b.upperCheck(str))
			System.out.println("The string: " + str + " contains uppercase letter(s)");
		else
			System.out.println("The string: " + str + " does not contain any uppercase letter");
		System.out.println("Turning string " + str + " to all uppercase letters " + b.allUpper(str));
		System.out.println("Turning string " + str + " to an integer and adding 10 to it: " + (b.convert(str) + 10));
		System.out.println("\n\nProblem 19\n===================");
		ProblemNineteen.display();
		System.out.println("\n\nProblem 20\n===================");
		ProblemTwenty.readFile();
	}
}