package com.revature.bean;
import java.io.Serializable;
import java.util.Date;
import java.util.List;



public class Customer extends User implements  Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Boolean status;
	private String username;
	private String password;
	private List<Account> accountList;
	
	
	public Customer(String firstName, String lastName, Date dateOfBirth, Boolean status, String username,
			String password, Integer accountNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.status = status;
		this.username = username;
		this.password = password;
		this.accountList = null;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Account> getAccountList() {
		return accountList;
	}


	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", status=" + status + ", username=" + username + ", password=" + password + ", accountNumber="
				+ accountList + "]";
	}
		
    


	
	 
}
