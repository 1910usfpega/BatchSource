package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.floaty.FloatVariables;


public class Driver {
public static void main(String[] args) {
	System.out.println("Q1 BubbleSort" + "\n"+ "--------------------");
	BubbleSort b = new BubbleSort();
	b.bubbleSort();
	System.out.println("Q2 Fibbonacci" + "\n"+ "--------------------");
	Fibbonacci f = new Fibbonacci();
	f.fibbonacci();
	System.out.println("Q3 Reverse a String" + "\n"+ "--------------------");
	ReverseString r = new ReverseString();
	r.reverseString();
	System.out.println("Q4 Factorial" + "\n"+ "--------------------");
	Factorial fac = new Factorial();
	fac.factorialGo();
	System.out.println("Q5 SubString " + "\n"+ "--------------------");
	SubString sub = new SubString();
	sub.subStringer("Hello", 2);
	System.out.println("Q6 Integer is Even" + "\n"+ "--------------------");
	IntegerIsEven ise = new IntegerIsEven() ;
	ise.testEvenNumber(4);
	
	System.out.println("Q7 Sort Employee" + "\n"+ "--------------------");
	
	  List<Employee> employeeList = new ArrayList<Employee>();
	  employeeList.addAll(Arrays.asList(
  			new Employee[] {
  					new Employee(25,"matt","dept3"),
  					new Employee(7,"ben","dept1"),
  					new Employee(3,"darren","dept2"),		
  			}	
  			));
  	
  	  Collections.sort(employeeList, new EmployeeNameComparator());
      System.out.println("====================\nEMPLOYEES BY NAME");
      for (Employee emp : employeeList) {
          System.out.println(emp.toString());
      }

      Collections.sort(employeeList, new EmployeeAgeComparator());
      System.out.println("====================\nEMPLOYEES BY AGE");
      for (Employee emp : employeeList) {
          System.out.println(emp.toString());
      }

      Collections.sort(employeeList, new EmployeeDeptComparator());
      System.out.println("====================\nEMPLOYEES BY DEPT");
      for (Employee emp : employeeList) {
          System.out.println(emp.toString());
      }
      System.out.println(" ");
      System.out.println("Q8 Palindrome" + "\n"+ "--------------------");
      
      List<String> myArray = new ArrayList<String>();
      myArray.add("karan");
      myArray.add("madam");
      myArray.add("tom");
      myArray.add("civic");
      myArray.add("momom");
      
      Palindrome pal = new Palindrome();
      System.out.println("myArray "+ myArray);
      System.out.println("My Palindromes :");
      for (String entry : myArray) { 
          if (pal.isPalindrome(entry)) System.out.println(entry);
      }
      
      System.out.println(" ");
      System.out.println("Q9 PrimeNumberList" + "\n"+ "--------------------");
      PrimeNumberList pNL = new PrimeNumberList();
      pNL.isPrime();
      
      System.out.println(" ");
      System.out.println("Q10 Ternary Operators" + "\n"+ "--------------------");
      TernaryOperators tern = new TernaryOperators();
      tern.ternary();
      
      
      System.out.println(" ");
      System.out.println("Q11 Float Variables" + "\n"+ "--------------------");
      
      FloatVariables ace = new FloatVariables(2f,4f);
      
  		System.out.println(ace);
  	
  	 System.out.println(" ");
     System.out.println("Q12 Even Number in an Array" + "\n"+ "--------------------");
      
      EvenNumberArray even1 = new EvenNumberArray();
      even1.evenNumber();
      
      System.out.println(" ");
      System.out.println("Q13 Triangle" + "\n"+ "--------------------");
     
      Triangle trio = new Triangle();
      trio.tri();
     
      System.out.println(" ");
      System.out.println("Q14" + "\n"+ "--------------------");
      
      ScannerCase scan = new ScannerCase();
      scan.scannery();
      
      System.out.println(" ");
      System.out.println("Q15 Operator Interface" + "\n"+ "--------------------");
      
      int a = 68;
      int b1 = 34;
      System.out.println("Numbers: "+ a+b1 );
      Operator q15 = new Operator();
      q15.addition(a,b1);
      q15.subtraction(a,b1);
      q15.multiplication(a,b1);
      q15.division(a,b1);
      
      System.out.println(" ");
      System.out.println("Q16 Character String Input" + "\n"+ "--------------------");
     
      
      ScannerInput input = new ScannerInput();
      input.scannery();
      
      System.out.println(" ");
      System.out.println("Q17 Implement Interest" + "\n"+ "--------------------");
      
      ImplementInterest imp = new ImplementInterest();
      imp.implement1();
      
      System.out.println(" ");
      System.out.println("Q18 Concrete Subclass,Abstract Super class" + "\n"+ "--------------------");
      
      System.out.println("done");
      
      System.out.println(" ");
      System.out.println("Q19 Odd Even and Prime" + "\n"+ "--------------------");
      OddEvenPrime oEp = new OddEvenPrime();
      oEp.test1();
      
      System.out.println(" ");
      System.out.println("Q20 MickeyMouse" + "\n"+ "--------------------");
      MickeyMouse m = new MickeyMouse();
      m.doTheThing();
      
			
			
			
			
}
}
