package com.revature.compare;

public class Student implements Comparable<Student>{

	//First step of comparing -- Implement Comparable and compareTo()
	
	private int StudentID;
	private String label;
	private double GPA;
	
	public Student() {
		super();
	}
	
	public Student(int studentID, String label, double gPA) {
		super();
		StudentID = studentID;
		this.label = label;
		GPA = gPA;
	}

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(int gPA) {
		GPA = gPA;
	}

	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", label=" + label + ", GPA=" + GPA + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.getStudentID()-o.getStudentID();
	}
	//0,1,2,3
	
}
