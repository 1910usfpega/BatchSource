package com.revature.flows;

import com.revature.bean.Person;

public class LoopyLoop {
	/* If statement
	 * For decision making
	 * provides multiple paths of execution
	 * 
	 * if(<conditional>){
	 * <what to do if true>
	 * }else if(<second conditional){
	 * <what to do if 2nd conditional is true>
	 * } else{
	 * <what to do if false>
	 * }
	 * 
	 * Switch Cases
	 * provides multiple paths of execution based on some value
	 * the "switch"  is based on an integer numeric, a string
	 * a char, a boolean, or enum.
	 * 
	 */
	public static void whatColor(String color) {
		switch (color) {
		default:
			System.out.println("You are a terrible human being");
			break;
		case "green":
			System.out.println("Hulk");
			break;//breaks out of loop
		case "purple":
			System.out.println("Thanos");
			break;
		case "crimson":
			System.out.println("Roll Tide");
			break;
		
		}
	}
	
	public static void ifStatement(int a) {
		if(a>5) {
			System.out.println("bigger than 5");
		}else if(a==5){
			System.out.println("a is 5");
		}else {
			System.out.println("Smaller than 5");
		}
	}
	/*For Loops
	 * for(a;b;c){do something}
	 * a is variable declaration (counter) 
	 * b is the condition that controls how far the loop the loop will go
	 * c is the incrementor/decrementor
	 */
	public static void forLoopFunness(int p) {
		for(int i=p;i>0;i--) {
			if(i==10) {
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
	/*Enhanced for loop aka for each
	 * for (x:<Array or Collection>){do thing}
	 * good for moving through collections, arrays and other iterables
	 * more CPU efficient
	 * no issues w/ index out of bounds- not size dependent
	 * good for access elements in one collection
	 * bad for adding and removing*/
	static int [] myArray= {11,25,78,65,34,81,92,44};
	public static void forEachFun(int[] a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	/*While loops
	 * while(<condition>){<do something>}
	 * 
	 * do while
	 * do {<do thing>} while (<condition>)
	 * */
	public static void wileyWhile(int i) {
		while(i++<10) {
			System.out.println("boring "+i);
			//i++;
		}
	}
	public static void doWileyWhile(int i) {
		do {
			System.out.println("not so boring");
		i++;
		}
		while(i<10);
	}
	
	
	public static void main(String[] args) {
		//ifStatement(5);
		//whatColor("potato");
		//forLoopFunness(15);
		//forEachFun(myArray);
		//wileyWhile(5);
		//doWileyWhile(100);
		 Person p= new Person("Lucy",45,773);
		 Person q= new Person("Lucy",45,773);
		 String s="dog";
		 String t="dog";
		/*
		 * System.out.println(s.equals(t)); System.out.println(p==p);
		 * System.out.println(p.hashCode()); System.out.println(q.hashCode());
		 */
		System.out.println(p.equals(q));
	}
	/*Conditionals
	 * Logical Operators
	 * < > <= >= != ==
	 *  OR 
	 *  a|b - bit wise
	 *  a||b- short circuit OR If a is true, return true w/o b
	 *  AND
	 *  a&b -bit wise
	 *  a&&b checks boths and evaluates true iff both are true
	 *  EQUALS
	 *  ==
	 *  compare values of primitives
	 *  compare the reference for objects. NOT THE CONTENTS
	 *  != is good for checking nulls
	 *  .equals()
	 *  method inherited Object
	 *  All reference types have it
	 *  looking at content
	 *  
	 *  
	 */
}
