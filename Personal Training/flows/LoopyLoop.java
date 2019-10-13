package com.revature.flows;

import com.revature.bean.Person;

public class LoopyLoop {
/*If statement 
 * for decision making purpose
 * Provides multiple paths of execution
 * 
 * 
 * Switch cases
 * provides multiple paths of executions based on some value
 * the "switch" is based on an integer numeric, a string
 * a char, a boolean, or enum - options with special options
 * 
 * Enhanced for loop aka for each
 * for  (x:<Array or Collection>) {do thing}
 * good for moving collecitons, arrays and other iterables 
 * more CPU efficient 
 * no issues w/ index our of bounds - not size dependent 
 * food for access elements in one collection bad for adding and removing
 */
	
	
	
	
	
	
	
	public static void forLoopsFunness(int p) {
		for (int i = p; i > 0; i--) {
			if (i==10) {
				break;
			}
			System.out.println(i);
		}
	}
	
	
	
	
	public static void WhatColor(String color) {
		switch(color) {
		case "green":
			System.out.println("Hulk Smash");
			break;
			
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
		if (a > 5) {
			System.out.println("bigger than 5");
		} else if ( a == 5){
			System.out.println("a is 5");
		} else {
			System.out.println("a is smaller than 5");
		}
	}
	
	
	
	public static void wilieyWhile(int i) {
		while(i<10) {
			System.out.println("boring" + i);
			i++;
		}
	}
	
	
//	static int [] myArray = {12,324,45,5,67,34,56,678};
//	public static void forEachFun(int[] a) {
//		for(i:a) {
//			System.out.println(i);
//		}
//	}
	
	
	public static void doWilieyWhile(int i) {
		do { System.out.println( "not so boring"); i++; 
	}
		while(i<10);
	}

	
	
	
	
	
	
	public static void main(String[] args) {
//		ifStatement(-1);
//		WhatColor("green");
//		forLoopsFunness(15);
//		wilieyWhile(-300);
//		doWilieyWhile(100);
		
		Person p = new Person("Lucy", 45, 773);
		System.out.println(p.equals(new Person("Ryan", 2, 400)));
		Person q = new Person("Lucy", 45, 773);
		System.out.println(p.equals(q));
		String s = "dog";
		String t = "dog";
//		System.out.println(s.equals(t));
//		System.out.println(p==p);
//		System.out.println(t.hashCode());
//		System.out.println(s.hashCode());
		System.out.println(p.equals(q));
	}

}
