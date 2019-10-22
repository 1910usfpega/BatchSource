package com.revature.storage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.revature.user.Account;
import com.revature.user.Customer;
import com.revature.user.Employee;

public class Bank implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7205032192287892379L;

	//Account storage:
	private  ArrayList<Account> allAccounts = new ArrayList<Account>();
	
	//Customer Storage:
	private  Map<String,Customer> allCustomers = new HashMap<>();
	
	//Employee login info:
	private  Map<String,String> empStored = new HashMap<>();

	//Employee storage:
	private  Map<String,Employee> allEmployees = new HashMap<>();
	
	//Customer Login info
	private  Map<String,String> custStored = new HashMap<>();
	
	//Open applications
	private  ArrayList<Account> allApplications = new ArrayList<>();

	
	////////////////////////////////////////////
	
	// account storage methods:

	public  void addAccount(Account acct) {
		this.allAccounts.add(acct);
	}

	
	public  void removeAccount(Account acct) {
		this.allAccounts.remove(acct);
	}
	
	
	
	public  ArrayList<Account> getAllAccounts() {
		return allAccounts;
	}
	
	public  ArrayList<Integer> getAllAccountNumbers() {
		ArrayList<Integer> allAccountNums= new ArrayList<Integer>();
		for (Account x:allAccounts) {
			allAccountNums.add(x.getAccountNumber());
		}
		return allAccountNums;
	}

	public  void setAllAccounts(ArrayList<Account> allAccounts) {
		this.allAccounts = allAccounts;
	}
	
	public  boolean acctNumAlreadyUsed(int acctNum) {
		boolean found=false;
		for(Account x:allAccounts) {
			if (x.getAccountNumber()==acctNum) {
				found=true;
			}
		}
		return found;
	}
	
	public  Account getThisAccount(int acctNum) {
		for(Account x:allAccounts) {
			if(x.getAccountNumber()==acctNum) {
				return x;
			}
		}
		return null;
	}
	
	 
//////////////////////////////////////////////
	//customer storage methods
	

	public  void removeCust(String cust) {
		allCustomers.remove(cust);
	}

	public  void addCust(Customer cust) {
		allCustomers.put(cust.getUsername(),cust);
	}
	public  Customer getThisCustomer(String user) {
		return allCustomers.get(user);
	}
	
	
	public  Map<String,Customer>  getAllCustomers() {
		return allCustomers;
	}

	public  Collection<Customer> getOnlyCustomers() {
		return allCustomers.values();
		
	}
	
	public  void setAllCustomers(Map<String,Customer> allCustomers) {
		this.allCustomers = allCustomers;
	}



	///////////////////////////////////////////////////////
	//Employee login info methods
	
	public  boolean newEmployee(String username, String password) {
		if(empStored.containsKey(username)==false) {
			empStored.put(username, password);
			return true;
		}else {
			return false;
		}
	}
	
	public  boolean empAlreadyUsed(String username) {
		if (empStored.containsKey(username)==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public  boolean checkEmployee(String username,String password) {

		System.out.println(username);
		
		if (empStored.containsKey(username) && empStored.get(username).equals(password)) {
			return true;
		}else {
			return false;
		}
		 
	}
	
	public  Map<String, String> getEmpLoginInfo() {
		return empStored;
	}

	public  void setLoginInfo(Map<String, String> empStored) {
		this.empStored = empStored;
	}

	
	
	////////////////////////////////////////////////////////
	//Employee storage methods
	
	public  void remove(String emp) {
		allEmployees.remove(emp);
	}

	public  void addEmp(Employee emp) {
		allEmployees.put(emp.getUsername(),emp);
	}
	public  Employee getThisEmployee(String emp) {
		return allEmployees.get(emp);
	}
	
	
	public  Map<String,Employee>  getAllEmployees() {
		return allEmployees;
	}

	public  void setAllEmployees(Map<String,Employee> allEmployees) {
		this.allEmployees = allEmployees;
	}

	
	////////////////////////////////////////////////
	//Login info methods
	
	
	public  boolean newUser(String username, String password) {
		if(custStored.containsKey(username)==false) {
			custStored.put(username, password);
			return true;
		}else {
			return false;
		}
	}
	
	public  boolean custAlreadyUsed(String username) {
		if (custStored.containsKey(username)==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public  boolean checkUser(String username,String password) {
		if (custStored.containsKey(username) && custStored.get(username).equals(password)) {
			return true;
		}else {
			return false;
		}
		 
	}
	
	public  Map<String, String> getLoginInfoCust() {
		return custStored;
	}

	public  void setLoginInfoCust(Map<String, String> custStored) {
		this.custStored = custStored;
	}
	
	
	///////////////////////////////////
	// Open applications
	

	public  void addApplication(Account acct) {
		allApplications.add(acct);
	}
	
	public  void removeApplication(Account acct) {
		allApplications.remove(acct);
	}
	
	public  Account getThisApplication(int acctNum) {
		for(Account x:allApplications) {
			if(x.getAccountNumber()==acctNum) {
				return x;
			}
		}
		return null;
	}

	public  boolean openAcctNumAlreadyUsed(int acctNum) {
		boolean found=false;
		for(Account x:allApplications) {
			if (x.getAccountNumber()==acctNum) {
				found=true;
			}
		}
		return found;
	}
	
	public  ArrayList<Account> getAllApplications() {
		return allApplications;
	}

	public  void setAllApplications(ArrayList<Account> allApplications) {
		this.allApplications = allApplications;
	}
	

	
	
	

	
	
	
	
}
