package com.revature.bean;

import com.revature.classtypes.HuntW;

/**
 * @author Bryan Wood
 *
 */
public class Person implements HuntW {
	//private fields
	private String name;
	private int age;
	private int weight;
	static String homePlanet = "Earth";
	
	
	

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
	
	public static String getHomePlanet() {
		return homePlanet;
	}

	public static void setHomePlanet(String homePlanet) {
		Person.homePlanet = homePlanet;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

	public static void staticMethod() {
		System.out.println("Static Method!!!");
	}

	@Override
	public void findPrey() {
		System.out.println("I go to Whole Foods...");		
	}
}
