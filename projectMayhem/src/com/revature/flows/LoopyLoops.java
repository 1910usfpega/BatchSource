package com.revature.flows;

import com.revature.Person.Person;

/*
 * 
 * 
 * switch cases
 * privides multiple paths of execution based on some value 
 * the 'switch' is based on an integer numeric, a string a car, a boolean, or enum
 * enum is a collection of constants and methods
 */
public class LoopyLoops {

public static void WhatColor(String color) {
	switch (color) {
	case "green":
		System.out.println("Hulk");
		break;//breaks out of the loop
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
	if(a>5) {
		System.out.println("if True");
		return;
	}
	else if(a==5) {
		System.out.println("a is 5");
	}
	else {
		System.out.println("smaller than 5");
	}
	
}



public static void main(String[] args) {
//	ifStatement(5);
//	WhatColor("green");
//  forLoopFunness(15);
//  forEachFun(myArray);
//	wileyWhile(-300);
//	dowileyWhile(100);
	Person p = new Person("Lucy", 45,773);
	Person q = new Person("Lucy", 45,773);
	System.out.println(p.equals(q));//equals method will result to a boolean comparing objects
	System.out.println(p==p);//we are comparing the memory allocation of the objects not the values 
	System.out.println(p.hashCode());
	System.out.println(q.hashCode());
}
/*
 * For loops
 * for(a;b;c){do something}
 * a is variable declaration (counter)
 * b is the condition that controls how far the loop will go 
 * c is the incrementor/decrementor
 */
public static void forLoopFunness(int p) {
	for(int i=p;i>0;i--) {
		if(i==10) {
			//break
			continue;//it is going to skip value 10 
		}
		System.out.println(i);
	}
}
 /*
  * Enhanced for loop aka for each 
  * for (x:,Array or Colection>){do thing}
  * good for moving through collections, arrays and other iterables
  * more CPU efficient
  * no issues w/ index out of bounds- not size dependent
  * good for access elements in one collection 
  * bad for adding and removing 
  */
static int[]myArray = {11,25,78,65,34,81,92,44};
public static void forEachFun(int[] a) {
	for(int i:a) {
		System.out.println(i);
	}
}

/*
 * While loops
 * while(condition>){<do something>}
 * 
 * do while
 * do {<do thing>} while (<condition>)
 */

public static void wileyWhile(int i) {
	while(i<10) {
		System.out.println("boring");
		i++;
	}
}
public static void dowileyWhile(int i) {
	do {
		System.out.println("not so boring");
	}
	while (i<100) ; 
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

