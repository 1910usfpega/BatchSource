package com.revature.flows;

import com.revature.bean.Person;

public class LoopyLoop {

	/*
	 * If Statement
	 * For decision making 
	 * provides multiple paths of execution
	 * 
	 * if(conditional) {
	 * <what to do if true>
	 * }
	 * else if (second conditional){
	 * <what to do if 2nd conditional is true>
	 * }
	 * else{
	 * <what to do if false>
	 * }
	 * 
	 * Switch Case
	 * provides multiple paths of execution based on some value
	 * the "switch" is based on an integer numeric, a string,
	 * a char, a boolean, or enum.
	 * 
	 * For Loop
	 * for(a;b;c){do things}
	 * a is variable declaration (counter)
	 * b is condition that controls how many iterations the loop will run
	 * c is the incrementor/decrementor
	 * 
	 * Enhanced For Loop (For Each)
	 * for (x:<Array or Collection>){do things}
	 * good for moving through collections, arrays and other iterables
	 * more CPU efficient
	 * no issues with index out of bounds- not size dependent
	 * good for accessing elements in one collection
	 * bad for adding/removing
	 * 
	 * While Loop
	 * while(<condition>){do things}
	 * 
	 * Do While
	 * do {do things} while (<condition>)
	*/
	
	public static void wileyWhile(int i) {
		while(i<10) {
			System.out.println("boring");
			i++;
		}
	}
	
	public static void doWileyWhile(int i) {
		do {System.out.println("not so boring");
		i++;
		}
		while(i<10);
	}
	
	//When declaring an array, either the array size or full value list must be declared
	static int[] myArray= {11, 25, 78, 65, 34, 81, 92, 44};
	
	public static void forEachFun(int[] a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	public static void forLoopFunness(int p) {
		for (int i=p; i>0; i--) {
			if(i==10) {
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void whatColor(String color) {
		switch(color) {
		case "green":
			System.out.println("Hulk");
			break;	//Exits the switch
		case "purple":
			System.out.println("Thanos");
			break;
		case "crimson":
			System.out.println("Roll Tide");
			break;
		default:
			System.out.println("You are a terrible human being");
		}
	}
	
	public static void ifStatement(int a) {
		if(a > 5) {
			System.out.println("bigger than 5");
		}
		else if(a==5){
			System.out.println("a is 5");
		}
		else {
			System.out.println("smaller than 5");
		}
	}
	
	public static void main(String[] args) {
		//ifStatement(8);
		//whatColor("potato");
		//forLoopFunness(15);
		//forEachFun(myArray);
		//wileyWhile(5);
		//doWileyWhile(100);
		
		Person p = new Person("Lucy", 45, 773);
		Person q = new Person("Lucy", 45, 773);
		System.out.println(p.equals(q));
	}
	
	/*
	 * Logical Operators
	 * < > <= >= != ==
	 * OR
	 * a|b - bit wise (Will always check both sides)
	 * a||b - short circuit OR If a is true, return true w/o checking b
	 * AND
	 * a&b - bit wise (Will always check both sides)
	 * a&&b - checks both and evaluates true if both are true
	 * EQUALS
	 * ==
	 * compare values of primitives
	 * compare the reference for objects, NOT THE CONTENTS
	 * != is good for checking nulls
	 * .equals()
	 * method inherited object
	 * All reference types have it
	 * looking at content
	 * 
	*/
	
}
