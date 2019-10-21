package com.revature;

public class Employee{

	private String name;
	private String department;
	private int age;
	
	public Employee(String n, String dpt, int age) {
		this.name = n;
		this.department = dpt;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", age=" + age + "]";
	}

	

}
