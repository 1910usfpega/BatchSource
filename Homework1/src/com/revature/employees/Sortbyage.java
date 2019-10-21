package com.revature.employees;

public class Sortbyage extends Comparator{
	public int compare(Employees a, Employees b) {
		return a.getAge() - b.getAge();
	}
}
