package com.revature.employees;

public abstract class Sortbyname implements Comparator{
	public int compare(Employees a, Employees b) {
		return a.getName().compareTo(b.getName());
	}
}
