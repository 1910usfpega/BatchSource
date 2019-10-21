package com.revature.bean;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	/*
	 * Q7. Sort two employees based on their  name, department, and age using the Comparator interface.
	 * 
	 * */
	private String name;
	private String dept;
	private int age;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String name, String dept, int age) {
		super();
		this.name = name;
		this.dept = dept;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}


	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getAge()-o2.getAge();
	}
	

	
	
	
	
	
		
	
	

}
