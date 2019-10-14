package com.revature.bean;

public class Person{
private String name;
private int age;

public Person (){
	
}	
public Person(String name, int age) {
	//this. referring to the object
		//=name is referring to the parameter
		this.setName(name);
		this.setAge(age);
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
/*
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
*/	
	//public static String getHomePlanet() {
		//return homePlanet;
	//}

//	public static void setHomePlanet(String homePlanet) {
//		Person.homePlanet = homePlanet;
//	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight= + weight + ]";
	}
}
