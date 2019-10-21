package com.revature.driver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.revature.bean.BubbleSort;
import com.revature.bean.DisplayPattern;
import com.revature.bean.DoOperation;
import com.revature.bean.DoStringManipulation;
import com.revature.bean.Employee;
import com.revature.bean.EvenInteger;
import com.revature.bean.Factorial;
import com.revature.bean.FibonacciNumber;
import com.revature.bean.FunWithFloats;
import com.revature.bean.Palindrome;
import com.revature.bean.Person;
import com.revature.bean.PrimeNumber;
import com.revature.bean.ReverseString;
import com.revature.bean.SimpleInterest;
import com.revature.bean.StringConsole;
import com.revature.bean.Substring;
import com.revature.bean.Ternary;
import com.revature.io.IOControl;

public class Driver {

	public static void main(String[] args) {
		
		//Q1. buubleSort
		//Declaring Array literal
		int[] intArray = new int[]{ 1,0,5,6,3,2,3,7,9,8,4 }; 
		
		BubbleSort q1BSort = new BubbleSort();
		
		System.out.println("Q1.  Unsorted Array : "  + Arrays.toString(intArray));
		System.out.println("Q1.  Sorted Array : "  + Arrays.toString(q1BSort.bubbleSort(intArray)));;
		System.out.println("-----------------------------------------------");
		
		//Q2. 25 Fibonacci numbers beginning at 0 
		System.out.println("");
		FibonacciNumber fnum = new FibonacciNumber();
		System.out.println("Q2.");
		fnum.printFibonacci(25);
		System.out.println("-----------------------------------------------");
		
		//Q3. Reverse a string
		ReverseString rstr = new ReverseString();
		System.out.println("");
		System.out.println("Q3.  Reverse String is : "  + rstr.stringReverse("Rastafari"));
		System.out.println("-----------------------------------------------");
		
		//Q4. Write a program to compute N factorial.
		Factorial fact = new Factorial();
		System.out.println("");
		System.out.println("Q4.");
		fact.computeFactorial(5);
		System.out.println("-----------------------------------------------");
		
		//Q5. Write a substring method
		Substring subs = new Substring();
		System.out.println("");
		System.out.println("Q5.  Substring is : "  + subs.getSubstring("Rastafari", 4));
		System.out.println("-----------------------------------------------");
		
		//Q6.Write a program to determine if an integer is even
		System.out.println("");
		EvenInteger eint = new EvenInteger();
		int i = 6;
		if(eint.isEvenInt(i) == true) {System.out.println("Q6.  Integer is Even : " + i);}
		else {System.out.println("Q6.  Integer is ODD  :" + i);}	
		System.out.println("-----------------------------------------------");
		
		//Q7. Sort two employees using Comparator interface
		System.out.println("");
		System.out.println("Q7.");
		List<Employee> empList= new ArrayList<Employee>();
		
		empList.addAll(Arrays.asList(
				new Employee [] {
						new Employee("Zuri","Accounts",45),
						new Employee("Xiya","IT",30),
				}));
		
			System.out.println("Original List");
			for(Employee emp: empList) {
				System.out.println(emp);
			}
			
			System.out.println("=======<>=======");
			System.out.println("Sorted by Name");
			//Functional interfaces have 1 (not default) method
			//we can do lambda w/ these
			Collections.sort(empList,(arg0,arg1)
					->{
						return arg0.getName().compareTo(arg1.getName()
								);}
					);
			for(Employee e: empList) {
				System.out.println(e);
			}
			
			System.out.println("=======<>=======");
			System.out.println("Sorted by Department");
			//Functional interfaces have 1 (not default) method
			//we can do lambda w/ these
			Collections.sort(empList,(arg0,arg1)
					->{
						return arg0.getDept().compareTo(arg1.getDept()
								);}
					);
			for(Employee e: empList) {
				System.out.println(e);
			}

	
			System.out.println("=======<>=======");
			Collections.sort(empList, new Employee());
			System.out.println("Sorted by Age");
			for(Employee e: empList) {
				System.out.println(e);
			}
			System.out.println("-----------------------------------------------");
			
			
			
		//Q8. ArrayList and saves all the palindromes in another ArrayList.
			System.out.println("");
			System.out.println("Q8.");
			ArrayList<String> strList = new ArrayList<String>();
			
			strList.add("karan");
			strList.add("madam");
			strList.add("tom");
			strList.add("civic");
			strList.add("radar");
			strList.add("jimmy");
			strList.add("kayak");
			strList.add("john");
			strList.add("refer");
			strList.add("billy");
			strList.add("did");
			
			System.out.println("Original List:");
			System.out.println(strList);
			
			Palindrome pal = new Palindrome();
			System.out.println("Palindrome List:");
			System.out.println(pal.findPalindrome(strList));
			System.out.println("-----------------------------------------------");
		
		 
		//Q9. prints out all the prime numbers to the console.
			System.out.println("");
			System.out.println("Q9.");
			
			PrimeNumber pnum = new PrimeNumber();
			pnum.runPrimecheck(100);
			System.out.println("-----------------------------------------------");
			
			
		//Q10. Find the minimum of two numbers using ternary operators.
			System.out.println("");
			System.out.println("Q9.");
			
			Ternary tny = new Ternary();
			System.out.println("10. "+ tny.findSmallestInt(108, 26)+" is larger");
			System.out.println("-----------------------------------------------");
			
		//Q11. Access two float-variables
			System.out.println("");
			System.out.println("Q11.");
			
			FunWithFloats fwf = new FunWithFloats();
			System.out.println("11. Floats from class in another package: "+ fwf.getA() +" & "+ fwf.getB());
			System.out.println("-----------------------------------------------");
		
		//Q12.  1 to 100 - Print out all the even numbers from the array.	
			System.out.println("");
			System.out.println("Q12.");
			
			eint.runMultiIsEven(100);
			System.out.println("-----------------------------------------------");
			
		//Q13.  Display the triangle on the console	
			System.out.println("");
			System.out.println("Q13.");
			
			DisplayPattern dp = new DisplayPattern();
			dp.runDisplayPattern(4);
			System.out.println("-----------------------------------------------");
			
		//Q14.  a program that demonstrates the switch case
			Scanner scnr = new Scanner(System.in);
			boolean boole = true;
			int cInt;
			
			do {
				
				System.out.println("");
				System.out.println("Q14.");
				System.out.println("              Please choose an Option: ");
				System.out.println("==========================<>==========================");
				System.out.println("1 - Find the square Root of a number");
				System.out.println("2 - Display today's date ");
				System.out.println("3 - Split string and store it in a string array ");
				System.out.println("4 - Exit");
				System.out.println("==========================<>==========================");
				System.out.println("Choice: ");
				switch (scnr.nextInt()) {
				
				
				
				case 1:
					System.out.println("Please enter a number: ");
					cInt = scnr.nextInt();
					System.out.println("The square root of " + cInt+ " is " +Math.sqrt(cInt));
					break;
				case 2:
					DateTimeFormatter getDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
					LocalDateTime now = LocalDateTime.now();  
					System.out.println(getDate.format(now)); 
					break;
				case 3:
					String splitStr = "I am learning Core Java";
					String[] splitStrs = splitStr.split(" ");
					System.out.println("Array of Strings: " + Arrays.toString(splitStrs));
					break;
				case 4:
					System.out.println("GoodBYE");
					boole = false;
					break;
				default:
					System.out.println("Please enter an interger for the list of options");
					break;
				
				}
				
			}while(boole);
			
			
			
			System.out.println("-----------------------------------------------");
			
			
			//Q15.  an interface having the following methods: addition, subtraction, multiplication, and division.
			System.out.println("");
			System.out.println("Q15.");
			
			DoOperation dop = new DoOperation();
			dop.addition();
			dop.subtraction();
			dop.multiplication();
			dop.division();
			

			System.out.println("-----------------------------------------------");
			
			//Q16. DONE IN CONSOLE
			
			//Q17. Simple Interest
			System.out.println("");
			System.out.println("Q17.");
			
			System.out.println("Please enter principal : ");
			double p = scnr.nextDouble();
			System.out.println("Please enter rate : ");
			double r = scnr.nextDouble();
			System.out.println("Please enter number of year(s) : ");
			int t = scnr.nextInt();
			
			SimpleInterest sConsole = new SimpleInterest();
					
			System.out.println("Simple Interest :  " + sConsole.calSimpleInterest(p, r, t));

			System.out.println("-----------------------------------------------");
			
			//Q18. subclass that inherits three abstract methods
			System.out.println("");
			System.out.println("Q18.");
			
			DoStringManipulation sm = new DoStringManipulation();
			String sms = "realJamRock";
			
			if(sm.upperCase(sms)) {}System.out.println(sms + " has at least 1 uppercase character"); //Check for uppercase characters in a string,
			
			System.out.println("String is:  " + sms);
			System.out.println("String in uppercase :  " + sm.upperCase(sms)); //Convert all of the lower case characters to uppercase
			
			sm.toInt("45");// Convert the input string to integer and add 10, output the result to the console.
			
			System.out.println("-----------------------------------------------");
			
			
			//Q19. subclass that inherits three abstract methods
			System.out.println("");
			System.out.println("Q19.");
			
			
			
			ArrayList<Integer> intList = new ArrayList<Integer>();
			for(int z = 1; z <= 10; z++) {intList.add(z);}
			
			System.out.println("Original List :  " + intList.toString());
			eint.displaySumEvenOdd(intList); //shows sum of even and Odd numbers
			
			System.out.println("Original List :  " + pnum.delPrimeNum(intList).toString());
			
			System.out.println("-----------------------------------------------");
			
			
			//Q20. program that would read from the file and print it out
			System.out.println("");
			System.out.println("Q20.");
			
			IOControl io= new IOControl();
			ArrayList<Person> personList = new ArrayList<Person>();
			io.readPersonFile();
			System.out.println(io.personList.toString());
		}
			
	
			
			
	}

}
