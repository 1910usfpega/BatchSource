package com.revature.bean;
import java.util.Date;

public class Person {

	private String FirstName;
	private String LastName;
	private Date DOB;
	private Boolean APPROVED;
	
	public Person () {
		FirstName = null;
		LastName = null;
		DOB = null;
		APPROVED = null;
	}

	public Person(String firstName, String lastName, Date Dob, Boolean Approved) {
		super();
		FirstName = firstName;
		LastName = lastName;
		DOB = Dob;
		APPROVED = Approved;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Boolean getAPPROVED() {
		return APPROVED;
	}

	public void setAPPROVED(Boolean aPPROVED) {
		APPROVED = aPPROVED;
	}
	
	 
}
