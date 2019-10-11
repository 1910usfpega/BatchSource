package com.revature.flows;

import com.revature.bean.Person;

public class LoopyLoops {
	
	public static void forLoopFunness(int p) {
		for (int i=p;i>0;i--) {
			System.out.println(i);
		}
	}
	
	
	/*
	 * If Statements 
	 * used for decision making purposes.
	 * provides multiple paths of execution
	 */
	
	public static void ifStatement(int a) {
		if (a>5) {
			System.out.println("Greater than 5");
		} else {
			System.out.println("Smaller than 5");
		}
	}
	
	//Switch Cases
	/*
	 * provides multiple paths of execution based on some value
	 * the "switch" is based on an integer numeric, a string 
	 * a char, a boolean, or enum.
	 */
	public static void whatColor(String color) {
		switch(color) {
		case "green":
			System.out.println("Hulk");
			break;
		case "purple" :
			System.out.println("Thanos");
			break;
		case "crimson" : 
			System.out.println("Roll Tide");
			break;
		default:
			System.out.println("no color, pick one");
			
		}
	}
	
	
	//Enhanced for loop aka for each
	/*
	 * good for moving through collections, arrays and other iterables 
	 * no issue with indexe out of bound, not size dependent,
	 * good for accessing elements in a collection
	 * bad for adding and removing
	 */
	//array creation to use with enhanced for loop
	static int [] myArray= {1,2,3,4,5,6,7,8,9,10};
	
	public static void forEachFun(int[] a) {
		for (int i: a) {
			System.out.println(i);
		}
		
	}
	
	//while loops
	//while(<condition>) {<do something>}
	
	public static void whileyWhile(int i) {
		while (i<10) {
			System.out.println("boring");
			i++;
		}
	}
	
	
	//do while - code block runs at least once. 
	//do (<do thing>) while (<condition>)
	public static void doWhileyWhile(int i) {
		do {System.out.println("not so boring");
		i++;}
		while (i<10);
	}

	
	public static void main(String[] args) {
		//ifStatement(8);		
		//whatColor("green");		
		//forLoopFunness(15);		
		//forEachFun(myArray);
		//whileyWhile(5);
		//doWhileyWhile(8);
		
		Person p = new Person("Lucy",45,773);
		Person q = new Person("Lucy",45,773);
		
		//System.out.println(p.equals(new Person("Ryan",2,400)));
		
		System.out.println(p.equals(q));
		
		
	}

} 
