package com.revature.text;

public class Citizen {
	private String first_name;
	private String last_name;
	private int age;
	private String state;
	
	public Citizen(String first_name, String last_name, int age, String state) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.state = state;
	}
	
	public void give_info() {
		System.out.println("Name: " + first_name + " " + last_name);
		System.out.println("Age: " + age + " years");
		System.out.println("State: " + state + " State");
	}
}
