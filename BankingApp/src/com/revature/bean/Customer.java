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
	private List<Account> accountList;
	
	
	public Customer(String firstName, String lastName, Date dateOfBirth, Boolean status, String username,
			String password) {
		super(username, password, "customer");
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.status = status;
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
				+ ", status=" + status + ", username=" + getUsername() + ", password=" + getPassword() + ", accountNumber="
				+ accountList + "]";
	}
		
    @Override
    public void showMenu() {
    	System.out.println("Customer: " + this.getFirstName() + " " + this.getLastName());
    	System.out.println("Accounts:");
    	if (this.accountList == null) {
    		System.out.println("No accounts");
    	} else {
    		
    	}
    	
    	/*
    	 * Customer: Iskandar B
    	 * Accounts:
    	 * 1. AccountName (num:1234) - $5000.00
    	 * 2. CHECKING (num: 2434) - pending
    	 * 
    	 * Which account you want work with? (input 1-2)
    	 */
    }


//	public static User logon( String firstName, String lastName, String username, String password, Date dateOfBirth, List<User> usersList) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	


}
