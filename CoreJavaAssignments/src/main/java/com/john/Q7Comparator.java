package com.john;

import java.util.Comparator;

public class Q7Comparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	


class Employee {
	
	String name, dept;
	Integer age;
	
public Employee(String name, String dept, int age) {
		super();
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}

}

		// sorting classes
			//static was required to satisfy the error "no enclosing instance of type is accessible 
		final class Q7SortByName implements Comparator<Employee> {
		//not sure why the names are out of order
			@Override
			public int compare(Employee ename, Employee ename2) {
				return ename.name.compareTo(ename.name);
			}
		}
			
		final class Q7SortByDept implements Comparator<Employee> {
		
			@Override
			public int compare(Employee dept1, Employee dept2) {
				return dept1.dept.compareTo(dept2.dept);
			}
		}
		
		final class Q7SortByAge implements Comparator<Employee> {
		
			@Override
			public int compare(Employee age1, Employee age2) {
				return age1.age.compareTo(age2.age);
			}
		}
	
			

