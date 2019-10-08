package com.revature.bean;

/**
 * @author Bryan Wood
 *
 */
public class Person {
	//private fields
	private String name;
	private int age;
	private int weight;

	//No-arg Constructor (default constructor)
	public Person() {
		//super(); implicitly there
	}
	
	//Constructors
	public Person(String name, int age, int weight) {
	//this. referring to the object
		//=name is referring to the parameter
		this.setName(name);
		this.setAge(age);
		this.setWeight(weight);
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

}
