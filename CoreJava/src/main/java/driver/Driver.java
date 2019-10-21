package driver;

import java.util.Scanner;

import assignments.Problem18;
import assignments.ProblemEight;
import assignments.ProblemEleven;
import assignments.ProblemFifteen;
import assignments.ProblemFive;
import assignments.ProblemFour;
import assignments.ProblemFourteen;
import assignments.ProblemNine;
import assignments.ProblemNineteen;
import assignments.ProblemOne;
import assignments.ProblemSeven;
import assignments.ProblemSeventeen;
import assignments.ProblemSix;
import assignments.ProblemTen;
import assignments.ProblemThirteen;
import assignments.ProblemThree;
import assignments.ProblemTwelve;
import assignments.ProblemTwenty;
import assignments.ProblemTwo;

public class Driver {

	public static int[] aArray = new int[]{1,0,5,6,3,2,3,7,9,8,4};
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Problem 1\n===================");
		ProblemOne.bSort(aArray);
		System.out.println("\nProblem 2\n===================");
		ProblemTwo.fSequence(26);
		System.out.println("\n\nProblem 3\n===================");
		ProblemThree.reverse();
		System.out.println("\n\nProblem 4\n===================");
		ProblemFour.nFactorial(input.nextInt());
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
		System.out.println("\nProblem 13\n===================");
		ProblemThirteen.triangle();
		System.out.println("\nProblem 14\n===================");
		ProblemFourteen.sCase();
		System.out.println("\nProblem 15\n===================");
		ProblemFifteen a = new ProblemFifteen();
		System.out.println("Addition: 1 + 2 = " + a.add(1, 2));
		System.out.println("Subtraction: 3 - 4 = " + a.sub(3, 4));
		System.out.println("Multiplication: 5 * 6 = " + a.mult(5, 6));
		System.out.println("Division: 7 / 8 = " + a.div(7, 8));
		System.out.println("\nProblem 16\n===================");
		System.out.println("Use terminal.");
		System.out.println("\nProblem 17\n===================");
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
		System.out.println("\nProblem 19\n===================");
		ProblemNineteen.display();
		System.out.println("\n\nProblem 20\n===================");
		ProblemTwenty.readFile();
	}
}