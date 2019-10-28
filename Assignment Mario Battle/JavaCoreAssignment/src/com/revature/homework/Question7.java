package com.revature.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Question7 implements Comparable<Question7> {
	public static void sortEmOut(List<Question7> employeeList) {
		Collections.sort(employeeList);
		System.out.println("Question 7 sort by age");
		for(Question7 i : employeeList) {
			System.out.println(i);
		}
		System.out.println("Question 7 sort by department");
		Collections.sort(employeeList,(o1,o2)
			-> {
				return o1.getDepartment().compareTo((o2.getDepartment())
						);}
			);
		for(Question7 i: employeeList) {
			System.out.println(i);
			}
		System.out.println("Question 7 sort by Name");
		Collections.sort(employeeList,(o1,o2)
				-> {
					return o1.getName().compareTo((o2.getName())
							);}
				);
			for(Question7 i: employeeList) {
				System.out.println(i);
				}
	}
	
	
  //class Employee implements Comparable<Employee>{
	 private String name;
	 private String department;
	 private int age;
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
	public Question7(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}
	public Question7() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Question7 o) {
		// TODO Auto-generated method stub
		return this.getAge()-o.getAge();
	}
	
 
 
 public int compare(Question7 o1, Question7 o2) {
		
		return (int) ((o1.getAge()-o2.getAge()));
	}
//
//@Override
//public int compare(Employee o1, Employee o2) {
//	// TODO Auto-generated method stub
//	return 0;
//}
}
