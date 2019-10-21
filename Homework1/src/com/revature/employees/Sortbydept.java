package com.revature.employees;

public class Sortbydept implements Comparator{
	public int compare(Employees a, Employees b) {
		return a.getDepartment().compareTo(b.getDepartment());
	}
}
