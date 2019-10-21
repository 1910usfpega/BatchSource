import java.net.InterfaceAddress;
import java.util.Scanner;

import getBeans.getPerson;

public class Driver {
	public static void main(String[] args) {
		//Q1
		System.out.println("****************************************************************************************************************");
		try {
			BubbleSort.performSort();//Print sorted array
		} catch (Exception e) {
			System.out.println("");
		}
		//Q2
		System.out.println("****************************************************************************************************************");
		FibonacciNumbers.displayNumbers();
		//Q3
		System.out.println("****************************************************************************************************************");
		ReverseString.Reverse();
		//Q4
		System.out.println("****************************************************************************************************************");
		Factorial.Compute(10);
		//Q5
		System.out.println("****************************************************************************************************************");
		System.out.println("Substring: " + subStrings.GetString("Hello Revature", 4));
		//Q6
		System.out.println("****************************************************************************************************************");
		IsIntegerEven.isEven(5);
		//Q7
		System.out.println("****************************************************************************************************************");
		sortEmployees.sortTwoEmployees();
		//Q8
		System.out.println("****************************************************************************************************************");
		System.out.println("Palindromes:");
		Palindromes.getPalindromes();
		//Q9
		//System.out.println("****************************************************************************************************************");
		//PrimeNumbers.Compute();
		//Q10
		System.out.println("****************************************************************************************************************");
		minimumNumbers.minimumCompare(43, 22);
		//Q11
		System.out.println("****************************************************************************************************************");
		System.out.println("Get variable from other packge:");
		getPerson.Person();
		//Q12
		System.out.println("****************************************************************************************************************");
		PrintEven.numbers();
		//Q13
		System.out.println("****************************************************************************************************************");
		Triangle.draw();
		//Q14
		System.out.println("****************************************************************************************************************");
		cases.getTodaysDate();
		cases.getsquareRoot(64.0);
		cases.splitString();
		//Q15
		System.out.println("****************************************************************************************************************");
		System.out.println("Interface example");
		interfacesExample ea = new interfacesExample();
		ea.addition(4.5, 4.2);
		ea.subtraction(15.5, 5.5);
		ea.division(128.8, 8.2);
		ea.multiplication(5.5, 9.5);
		//Q16
		System.out.println("****************************************************************************************************************");
		System.out.println("Enter a String to get its length!");
		Scanner sc = new Scanner(System.in);
		System.out.println("String length = "+sc.next().length());
		//Q17
		System.out.println("****************************************************************************************************************");
		interestRate.calculate();
		//Q18
		System.out.println("****************************************************************************************************************");
		stringChild schild = new stringChild();
		System.out.println("It is "+schild.containsUpercase("Hello World")+" that Hello World contains uppercase characters.");
		System.out.println("HELLO REVATURE converted to lowercase is "+schild.toLowerCase("HELLO REVATURE"));
		System.out.println("String with value 10 converted to an integer and adding 10: "+schild.stringTOIntPlusTen("10"));
		//Q19
		//System.out.println("****************************************************************************************************************");
		//arraysWithnumberAlgorithms.calculate();
		//Q20
		System.out.println("****************************************************************************************************************");
		readFromFile.printFromFile();
	}
}
