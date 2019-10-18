package com.revature.bean;
import java.io.Serializable;
import java.util.Date;



public class Customer implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String FirstName;
	private String LastName;
	private Date DOB;
	private Boolean status;
	private String Username;
	private String Password;
	private Integer AccountNumber;
		
	public Customer() {
		FirstName = null;
		LastName = null;
		DOB = null;
		status = null;
		Username = null;
		Password = null;
		AccountNumber = null;
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Integer getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		AccountNumber = accountNumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Customer [FirstName=" + FirstName + ", LastName=" + LastName + ", DOB=" + DOB + ", status=" + status
				+ ", Username=" + Username + ", Password=" + Password + ", AccountNumber=" + AccountNumber + "]";
	}

	

	
	 
}
