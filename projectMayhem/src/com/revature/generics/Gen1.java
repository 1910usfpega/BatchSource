package com.revature.generics;

public class Gen1<T> {
	
	/*
	 * generics
	 * using a tyoe as parameter
	 * write code that can handle diff types of objects
	 * use angle brackets <> to denote that something is a generic 
	 * Allows us to ensure type safety 
	 * adds stability and reusability to our code
	 * Placeholder(T,E,?,etc...)-use instead of an explicit type
	 */
	
	//declare an object of type T
	T ob;
	//pas the construcot a reference to an object of type T
	Gen1(T o){
		ob=o;
	}
	//getter
	T getOb() {
		return ob;
	}
	//Show the type of T
	void showType() {
		System.out.println("Type of T is:" + ob);
	}
	

}
