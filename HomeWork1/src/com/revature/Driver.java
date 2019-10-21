package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.floating.FloatVariable;

public class Driver {
public static void main(String[] args) {
	System.out.println("Q1 BubbleSort" + "\n");
	BubbleSort bubble = new BubbleSort();
	bubble.bubbleSort();
	System.out.println("Q2 Fibbonacci" + "\n");
	Fibbonacci Fibbonacci = new Fibbonacci();
	Fibbonacci.fibbonacci();
	System.out.println("Q3 Reverse a String" + "\n");
	ReverseString ReverseString = new ReverseString();
	ReverseString.reverseString();
	System.out.println("Q4 Factorial" + "\n");
	Factorial Factorial = new Factorial();
	Factorial.factorialGo();
	System.out.println("Q5 SubString " + "\n");
	SubString SubString = new SubString();
	SubString.subStringer("Hello", 2);
	System.out.println("Q6 Integer is Even" + "\n");
	IntegerIsEven IntegerIsEven = new IntegerIsEven() ;
	IntegerIsEven.testEvenNumber(4);
	System.out.println("Q7 Sort Employee" + "\n");
	  List<Employee> employeeList = new ArrayList<Employee>();
	  employeeList.addAll(Arrays.asList(
  			new Employee[] {
  					new Employee(5,"ryan","dept798"),
  					new Employee(97,"pete","dept0"),
  					new Employee(30,"big bird","dept123"),		
  			}	
  			));
  	
  	  Collections.sort(employeeList, new EmployeeNameComparator());
      System.out.println("EMPLOYEE'S NAME");
      for (Employee Employee : employeeList) {
          System.out.println(Employee.toString());
      }

      Collections.sort(employeeList, new EmployeeAgeComparator());
      System.out.println("\nEMPLOYEES BY AGE");
      for (Employee Employee : employeeList) {
          System.out.println(Employee.toString());
      }

      Collections.sort(employeeList, new EmployeeDeptComparator());
      System.out.println("\nEMPLOYEES BY DEPARTMENT");
      for (Employee Employee : employeeList) {
          System.out.println(Employee.toString());
      }
      System.out.println(" ");
      System.out.println("Q8 Palindrome" + "\n");
      
      List<String> myArray = new ArrayList<String>();
      myArray.add("mike");
      myArray.add("ryan");
      myArray.add("klye");
      myArray.add("camri");
      Palindrome pal = new Palindrome();
      System.out.println("Array "+ myArray);
      System.out.println("Palindromes :");
      for (String entry : myArray) { 
          if (pal.isPalindrome(entry)) System.out.println(entry);
      }
      
      System.out.println(" ");
      System.out.println("Q9 PrimeNumbers in order" + "\n");
      PrimeNumberList PrimeNumberList = new PrimeNumberList();
      PrimeNumberList.isPrime();
      
      System.out.println(" ");
      System.out.println("Q10 Ternary " + "\n");
      TernaryOperators TernaryOperators = new TernaryOperators();
      TernaryOperators.ternary();
      
      
      System.out.println(" ");
      System.out.println("Q11 Float Variables");
      
      FloatVariable FloatVariable = new FloatVariable(2f,4f);
      
  		System.out.println(FloatVariable);
  	
  	 System.out.println(" ");
     System.out.println("Q12 Even Number in an Array" + "\n");
      
      EvenNumberArray EvenNumberArray = new EvenNumberArray();
      EvenNumberArray.evenNumber();
      
      System.out.println(" ");
      System.out.println("Q13 Triangle" + "\n");
     
      Triangle trio = new Triangle();
      trio.tri();
     
      System.out.println(" ");
      System.out.println("Q14" + "\n");
      
      ScannerCase scan = new ScannerCase();
      scan.scannery();
      
      System.out.println(" ");
      System.out.println("Q15 Operator Interface" + "\n");
      
      int a = 68;
      int b1 = 34;
      System.out.println("Numbers: "+ a+b1 );
      Operator q15 = new Operator();
      q15.addition(a,b1);
      q15.subtraction(a,b1);
      q15.multiplication(a,b1);
      q15.division(a,b1);
      
      System.out.println(" ");
      System.out.println("Q16 Character String Input" + "\n");
     
      
      ScannerInput input = new ScannerInput();
      input.scanner();
      
      System.out.println(" ");
      System.out.println("Q17 implement Interest" + "\n");
      
      ImplementInterest imp = new ImplementInterest();
      imp.implement();
      
      System.out.println(" ");
      System.out.println("Q18 Concrete Subclass,Abstract Super class" + "\n");
      
      System.out.println("done");
      
      System.out.println(" ");
      System.out.println("Q19 Odd Even and Prime" + "\n");
      OddEvenPrime oEp = new OddEvenPrime();
      oEp.test1();
      
      System.out.println(" ");
      System.out.println("Q20 MickeyMouse" + "\n");
      MickeyMouse MickeyMouse = new MickeyMouse();
      MickeyMouse.go();
}
}
