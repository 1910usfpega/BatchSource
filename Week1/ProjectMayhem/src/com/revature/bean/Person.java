package com.revature.bean;

public class Person {
	
	
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
			
			//comment test
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
}
