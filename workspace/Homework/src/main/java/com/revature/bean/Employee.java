package com.revature.bean;


public class Employee {

	private String name;
	private String company;
	private int age;
	
	
	
	
	
	
	public Employee(String name, String company, int age) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
	}






	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getCompany() {
		return company;
	}






	public void setCompany(String company) {
		this.company = company;
	}






	public int getAge() {
		return age;
	}






	public void setAge(int age) {
		this.age = age;
	}






	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", company=" + company + ", age=" + age + "]";
	}






	public int compareAge(Employee p) {
		return this.getAge()-p.getAge();
	}


	
	public int compareName(Employee p) {
		return this.getName().compareTo(p.getName());
	}


	public int compareCompany(Employee p) {
		// TODO Auto-generated method stub
		return (this.getCompany().compareTo(p.getCompany()));
	}
	
	
	
	
	
	

}
