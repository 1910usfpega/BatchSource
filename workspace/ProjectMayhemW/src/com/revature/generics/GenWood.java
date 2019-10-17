package com.revature.generics;

public class GenWood<T> {
/*
 * Generics
 * Using a type as a parameter
 * write code that can handle different types of objects
 * use angle brackets<> to denote that something is a generic
 * Allows to ensure type safety
 * adds stability and reusability to our code
 * Placeholder(T,E,?,et.) - use instead of an explicit type
 */
	
//	declare an object of type 'T'
	T ob;
//	pass the constructor a reference to an object of type T
	GenWood(T o){
		ob = o;
	}
	T getOb() {
		return ob;
	}
//	show the type of T
	void showType() {
		System.out.println("Type of T is: "+ob.getClass().getName());
	}
	
	
}
