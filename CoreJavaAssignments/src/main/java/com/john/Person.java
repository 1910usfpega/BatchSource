package com.john;

public class Person {
	String name;
	String state;
	int age;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n Age: " + age + "\n State: " + state + " State" ;
	}

}
