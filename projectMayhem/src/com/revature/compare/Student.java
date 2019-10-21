package com.revature.compare;

public class Student implements Comparable<Student>{
	//1st method of comparing  - Implement Comparables 
	private int studentID;
	private String lablel;
	private double gpa;
	public Student() {
		super();
	}
	
	public Student(int studentID, String lablel, double gpa) {
		super();
		this.studentID = studentID;
		this.lablel = lablel;
		this.gpa = gpa;
	}

	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getLablel() {
		return lablel;
	}
	public void setLablel(String lablel) {
		this.lablel = lablel;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", lablel=" + lablel + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.getStudentID()-o.getStudentID();
	}
	
	
}

