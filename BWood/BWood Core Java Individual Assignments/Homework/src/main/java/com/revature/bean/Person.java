package com.revature.bean;

public class Person {

	String name;
	String state;
	int age;
	
	@Override
	public String toString() {
		return "Name: " + name + "\n"
				+"State: " + state +" State"+ "\n"+"Age: " + age;
	}

	public Person(String name, String state, int age) {
		super();
		this.name = name;
		this.state = state;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

}
