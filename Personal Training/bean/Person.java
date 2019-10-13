package com.revature.bean;

//obj you model yourself after
public class Person {
	private String name;
	private int age;
	private int weight;
	static String homePlanet = "Earth";
	//∆ this ∆s everything
	
	
	public Person() {
		//super(); implicitly here
	}

	public Person(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		;
		
	}
	public void setName(String name) {
		this.name=name;
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
