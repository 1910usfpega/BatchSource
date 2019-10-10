package com.revature.bean;

//bean: an object that you model stuff after 

public class Person {
	private String name;
	private int age;
	private int weight;
	static String Homeplanet = "Earth";
	
	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	//no-arg constructor 
	public Person() {
		//super(); implicitly there
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
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
	
	public static String getHomeplanet() {
		return Homeplanet;
	}
	public static void setHomeplanet(String homeplanet) {
		Homeplanet = homeplanet;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
}
