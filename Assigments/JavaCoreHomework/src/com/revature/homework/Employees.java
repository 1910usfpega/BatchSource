package com.revature.homework;

public class Employees implements Comparable<Employees> {
	
	
	
	private String name;
	private String department;
	private int age;
	public Employees() {
		super();
	}
	public Employees(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}
	
		// TODO Auto-generated constructor stub
	
	
	
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
		return "Q7 [name=" + name + ", department=" + department + ", age=" + age + "]";
	}
	
	
	@Override
	public int compareTo(Employees o) {
		
		return this.getAge()-o.getAge();
	
	
		
	}
	

}
