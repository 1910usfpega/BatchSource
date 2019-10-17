package com.revature.bean;

import java.io.Serializable;

import com.revature.classtypes.Hunt;

public class Person implements Hunt,Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8959522904786262687L;
	//private fields
	private String name;
	private int age;
	private int weight;
	public static String homePlanet="Earth";
	public static String getHomePlanet() {
		return homePlanet;
	}
	public static void setHomePlanet(String homePlanet) {
		Person.homePlanet = homePlanet;
	}
		//Constructors
		public Person(String name, int age, int weight) {
			//this. is referring to the object
			//=name is referring to the parameter
			System.out.println("inside Person constructor");
			this.name=name;
			this.age=age;
			this.weight=weight;
		}
		//No-arg Constructor
		public Person() {
			//super(); implicitly there
		}
	public void setName(String name) {
		this.name=name;
		int i;
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

	
	  @Override public String toString() { return "Person [name=" + name + ", age="
	  + age + ", weight=" + weight + "]"; }
	 
	/*Code blocks- {things between}
	 * 
	 */
	//Instance code block
	{System.out.println("I'm in an instance code block!");}
	//Static code block
	static {System.out.println("Im in a static code block!");}
	public static void staticMethod() {
		System.out.println("Static Method!!!");
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
	@Override
	public void findPrey() {
		System.out.println("I go to Whole Foods");
		
	}
	
	
}
