package com.revature.bean;

import java.io.Serializable;

public class Person implements Serializable{
	
//	Q20. Create a notepad file called Data.txt and enter the following:
//		Mickey:Mouse:35:Arizona
//		Hulk:Hogan:50:Virginia
//		Roger:Rabbit:22:California
//		Wonder:Woman:18:Montana
//		 
//		Write a program that would read from the file and print it out to the screen in the following format:
//		 
//		Name: Mickey Mouse
//		Age: 35 years
//		State: Arizona State
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String state;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, int age, String state) {
		super();
		this.name = name;
		this.age = age;
		this.state = state;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", state=" + state + "]";
	}
	
	
	

}

