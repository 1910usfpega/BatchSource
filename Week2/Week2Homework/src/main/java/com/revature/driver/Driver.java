package com.revature.driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.revature.exercises.Q1;
import com.revature.exercises.Q10;
import com.revature.exercises.Q12;
import com.revature.exercises.Q13;
import com.revature.exercises.Q14;
import com.revature.exercises.Q14Input;
import com.revature.exercises.Q15Implementation;
import com.revature.exercises.Q16;
import com.revature.exercises.Q17;
import com.revature.exercises.Q19;
import com.revature.exercises.Q2;
import com.revature.exercises.Q20;
import com.revature.exercises.Q3;
import com.revature.exercises.Q4;
import com.revature.exercises.Q5;
import com.revature.exercises.Q6;
import com.revature.exercises.Q7;
import com.revature.exercises.Q7Employee;
import com.revature.exercises.Q8;
import com.revature.exercises.Q9;
import com.revature.float11.Q11Float;
import com.revature.q18.Q18SubClass;


public class Driver {
public static void main(String[] args) {
	
	System.out.println("Question 1");
	Q1.sort();
	
	System.out.println("Question 2");
	Q2.fibb();
	
	System.out.println("Question 3");
	Q3.reverseMe("reverse me now");
	
	System.out.println("Question 4");
	Q4.factorial();
	
	System.out.println("Question 5");
	Q5.subStringer("breakmeinhalf", 2);
	
	System.out.println("Question 6");
	Q6.testEvenNumber(10);
	
	System.out.println("Question 7");
	  List<Q7Employee> employeeList = new ArrayList<Q7Employee>();
	  employeeList.addAll(Arrays.asList(
  			new Q7Employee[] {
  					new Q7Employee(25,"matt","dept3"),
  					new Q7Employee(7,"ben","dept1"),
  					new Q7Employee(3,"darren","dept2"),		
  			}	
  			));
  	
  	  Collections.sort(employeeList, new Q7());
      System.out.println("\nQ7 EMPLOYEES BY NAME");
      for (Q7Employee emp : employeeList) {
          System.out.println(emp.toString());
      }

      Collections.sort(employeeList, new Q7());
      System.out.println("\nQ7  EMPLOYEES BY AGE");
      for (Q7Employee emp : employeeList) {
          System.out.println(emp.toString());
      }

      Collections.sort(employeeList, new Q7());
      System.out.println("\nQ7 EMPLOYEES BY DEPT");
      for (Q7Employee emp : employeeList) {
          System.out.println(emp.toString());
      }
      
      System.out.println(" ");
      System.out.println("Question 8");
      List<String> myArray = new ArrayList<String>();
      myArray.add("andy");
      myArray.add("alex");
      myArray.add("juan");
      myArray.add("travis");
      System.out.println("myArray "+ myArray);
    
      for (String entry : myArray) { 
          if (Q8.isPalindrome(entry)) 
        	  System.out.println(entry);
      }
      
      System.out.println(" ");
      System.out.println("Question 9");
      Q9.isPrime();
      
      System.out.println(" ");
      System.out.println("Question 10");
      Q10.ternary();
      
      System.out.println(" ");
      System.out.println("Question 11");
      Q11Float floatObject = new Q11Float(3f,3f);
  		System.out.println(floatObject);
  	
  	 System.out.println(" ");
     System.out.println("Question 12");
      Q12.evenNumber();
      
      System.out.println(" ");
      System.out.println("Question 13");
      Q13.triangle();
     
      System.out.println(" ");
      System.out.println("Question 14");
      Q14.scanning();
      
      System.out.println(" ");
      System.out.println("Question 15");     
      int a = 150;
      int b = 340;
      System.out.println("Numbers: "+ a+b );
      Q15Implementation q15 = new Q15Implementation();
      q15.add(a,b);
      q15.subtract(a,b);
      q15.division(a,b);
      q15.multiply(a,b);
      
      System.out.println(" ");
      System.out.println("Question 16");
     Q16.stringScan();
      
      System.out.println(" ");
      System.out.println("Question 17");
      
     Q17.calculator();
      System.out.println(" ");
      System.out.println("Question 18 in separate package and driver");
      System.out.println("done");
      
      System.out.println(" ");
      System.out.println("Question 19");
  
      Q19.test();
      
      System.out.println(" ");
      System.out.println("Question 20");
      Q20.doTheThing();
     
			
}
}
