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
		//constructors
		public Person(String name, int age, int weight) {
			//this. is referring to the object
			//=name is referring to the parameter
			this.name=name;
			this.age=age;
			this.weight=weight;
		}
		//No-args Constructor - it is a good practice to pass libraries
		/*public Person() {
			//super();
		}*/
		public void setname(String name) {
			 this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setage(int age) {
			this.age = age;
		}
		public Integer getAge() {
			return age;
		}
		public void setweight(int weight){
			this.weight =  weight;
		}
		public Integer getweight() {
			return weight;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", homePlanet :" + homePlanet +"]";
		}
		
		/*
		 * Code blocks - {things between} 
		 * 
		 * 
		 */
		//Instance code block - it runs before the constructor
		{System.out.println("I'm in an instance code block!");}//static code block
		//static code block
		static {System.out.println("I'm in a static code block!");}
		public static void staticMethod() {
			System.out.println("Static Method!");
		}
}