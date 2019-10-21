package com.revature.employees;


//Q7. Sort two employees based on their  name, department, and age using the Comparator interface.

public class Employees implements Comparable<Employees> {
	
	String name;
	int department;
	int age;

	public Employees() {
		super();
	}
	
    public Employees(String name, int department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer  getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public Integer getAge() {
		return   age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", department=" + department + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Employees o) {
		// TODO Auto-generated method stub

		return this.getDepartment()-o.getDepartment();
	}
	

	
}

