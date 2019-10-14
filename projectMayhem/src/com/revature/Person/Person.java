package com.revature.Person;

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
