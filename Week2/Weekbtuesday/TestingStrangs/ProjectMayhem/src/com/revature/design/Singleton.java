package com.revature.design;

public class Singleton {
	private static Singleton instance;
	//private constructor
	private Singleton() {
		//logic here
	}
	//public static synchronized method to get the unique instance.
	//if it does not exist, we will create it.
	public static synchronized Singleton getInstance() {
		if (instance==null) {
			instance=new Singleton();
			
		}
		return instance; 
	}
	
public void doSomething() {
}
}
