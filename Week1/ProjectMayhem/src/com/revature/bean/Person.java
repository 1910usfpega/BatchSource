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
