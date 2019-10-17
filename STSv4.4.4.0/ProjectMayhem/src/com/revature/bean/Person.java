package com.revature.bean;

public class Person {
	
//	Code blocks- {things between}
	//Instance 
	{System.out.println("I'm in an instance code block!");}
	static {System.out.println("I'm in a static code block!");}
	
	public static void staticMethod() {
		System.out.println("Static Method!!!");
	}
	
	//private fields
	private String name;
	private int age;
	private int weight;
	public static String homePlanet="Earth";
	
	//Constructors
	//No-arg constructor
	public Person() {
		//super(); Implicitly there
	}
	
	public Person(String name, int age, int weight) {
		//this.name refers to the object name
		//name refers to the parameter
		this.name=name;
		this.age=age;
		this.weight=weight;
		System.out.println("Inside Person constructor");
	}
	
	// getters/setters (accessors/mutators)
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
	public int getWeight(){
		return weight;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
	
}
