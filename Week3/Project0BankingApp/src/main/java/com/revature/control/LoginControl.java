package com.revature.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.revature.control.FileReaderWriter;
import com.revature.model.Account;
import com.revature.model.CheckingAccount;
import com.revature.model.Employee;
import com.revature.model.SavingAccount;

public class LoginControl {
	
	private Map<String,Object> users = new HashMap<String,Object>();
	List<Account> accounts;
	List<Employee> employeeAccts;
	
	Account loggedInto;		
	Employee employeeLoggedIn;
	
//used for testing
	public void showTestView(){
		addAccounts();
		addEmployees();
		System.out.println(" OOOOOO  OO   OO  OOOOO    OOOOO      O     OO    OO  OO   OO         OOO ");
		System.out.println("   OO    OO   OO  OO       OO  OO    OOO    OOOO  OO  OO  OO        OOO ");
		System.out.println("   OO    OOOOOOO  OOOOO    OOOOO    OO OO   OOOOO OO  OOOO     OO  OOO ");
		System.out.println("   OO    OO   OO  OO       OO  OO  OOOOOOO  OO OOOOO  OO OOO   OOOOO ");
		System.out.println("   OO    OO   OO  OOOOOO   OOOOO  OO     OO OO   OOO  OO  OOO  OOO ");
		
		System.out.println("\n THE FOLLOWING ACCOUNT EXIST: ");
		System.out.println(" ================================= ");
		
		for(Account a : accounts){		
			System.out.println(a.getClass().getSimpleName() + " " +
					a.getUsername() + " " +
					a.isApproved() + " " +
					String.format("%.2f", a.getBalance()));
		}
		System.out.println("\n THE FOLLOWING EMPLOYEE ACCOUNT EXIST: ");
		System.out.println(" ================================= ");
		
		
		for (Employee e: employeeAccts) {
			System.out.println(e.getClass().getSimpleName() + " : " +
					e.getUsername() + " => " +
					e.isAdmin());
		}
	}
	//adds accounts to array list from accounts.txt
	private void addAccounts(){
		FileReaderWriter fr = new FileReaderWriter();
		fr.openFileForReading();
		accounts = fr.readFile();	
	}
	//employees array list from employees.txt
	private void addEmployees() {
		FileReaderWriter fr = new FileReaderWriter();
		fr.openEmployeesFile();
		employeeAccts = fr.readEmployeesFile();
	}
	//used to add a new account to the accounts.txt file when signing up
	private void addAccountToFile() {
		FileReaderWriter fr = new FileReaderWriter();
		fr.openFileForReading();
		fr.writeToAccountsFile(loggedInto);
	}
	//used to add a new Employee to the employees.txt file when signing up
	private void addEmployeeToFile() {
		FileReaderWriter fr = new FileReaderWriter();
		fr.openFileForReading();
		fr.writeToEmployeesFile(employeeLoggedIn);
	}
	//add to hashmap
	public void addToHashMap() {
		for (Account a: accounts) {
			users.put(a.getUsername(), a);
		}
		for (Employee e: employeeAccts) {
			users.put(e.getUsername(), e);
		}
	}

	//used to get username and password input
	private String getUsernameInput(){
		System.out.println("\n Enter a name to login: ");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
	private String getPasswordInput() {
		System.out.println("\n Enter your password: ");
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}
/* 
 	logs in from the users hash map, grabs key but fails at password
	public boolean login() {
		String userEntry = getUsernameInput();
		for(Map.Entry<String, Object> user : users.entrySet()) {	
		}
		if (!users.containsKey(userEntry)) {
			System.out.println("username not found");
			return false;
		} else {
			Object current = users.get(userEntry);
			String userPassword = getPasswordInput();		
		if (current.) {
			loggedInto = users.get(userEntry);
			return true;	
		} else {
			System.out.println("wrong password, try again");
			return false;
		}
		}
	}
	*/
	//used by the existing accounts to login
	public boolean loginToAccount(){
		String userEntry = getUsernameInput();
		for(Account a : accounts){
			if(!userEntry.equals(a.getUsername())){
				System.out.println("could not find username");
			} else {
				String userPassword = getPasswordInput();
				if (userPassword.equals(a.getPassword())) 
				loggedInto = a;
				return true;	
			}
		}
		return false;
	}
	//used in the signup process to login new account after registration automatically
	public boolean loginToAccount(String username, String password){
		for(Account a : accounts){
			if(username.equals(a.getUsername())) {				
				if (password.equals(a.getPassword())) 
				loggedInto = a;
				return true;		
			}
		}
		return false;
	}	
	//employee login method
	public boolean employeeLogin() {
		System.out.println("\t employees login");
		String userEntry = getUsernameInput();	
		for (Employee e: employeeAccts) {
			if(userEntry.equals(e.getUsername())){
				String userPassword = getPasswordInput();
				if (userPassword.equals(e.getPassword())) {
				employeeLoggedIn = e;
				return true;
				}
		}
		
		}
		return false;	
	}
	//employee login method called when registering a new user
		public boolean newEmployeeLogin(String username, String password) {	
			for (Employee e: employeeAccts) {
				if(username.equals(e.getUsername())){
					if (password.equals(e.getPassword())) {
					employeeLoggedIn = e;
					return true;
					}
			}
			}
			return false;	
		}
	//register account method 
	public void registerAccount() {
		Scanner scan = new Scanner(System.in);
		String acctType, username, password;
		double balance;
		boolean approved = false;
		System.out.println("Please input a username");
		username = scan.next();
		System.out.println("please input your password");
		password = scan.next();
		System.out.println("Select a starting amount to deposit");
		balance = scan.nextDouble();
		System.out.println("select your account type \"c\" for checking and \"s\" for savings");
		acctType = scan.next();
		if (acctType.equals("c")) {
			accounts.add(new CheckingAccount(username, password, approved, balance));
			//add account to file after creating it?
			
			loginToAccount(username, password);
			addAccountToFile();
			SessionControl s = new SessionControl(getLoggedInto(), getAccounts());
			while(s.getIsLoggedIn()) {
				s.displayOptions();
				s.getMenuInput();
			}
			
		} else if (acctType.equals("s")) {
			accounts.add(new SavingAccount(username, password, approved, balance));
			//add account to file after creating it?
			
			loginToAccount(username, password);
			addAccountToFile();
		}
	}
	//register employee method 
	public void registerEmployee() {
		Scanner scan = new Scanner(System.in);
		String username, password;
		boolean isAdmin = false;
		System.out.println("Please input a username: ");
		username = scan.next();
		System.out.println("please input your password: ");
		password = scan.next();
		
			employeeAccts.add(new Employee(username, password, isAdmin));
			//add account to file after creating it?
			
			newEmployeeLogin(username, password);
			addEmployeeToFile();
			SessionControl employeesession = new SessionControl(getEmployeeLoggedIn(), employeeAccts, accounts);
			while (employeesession.getisEmployeeLoggedin()) {
				employeesession.displayEmployeeOptions();
				employeesession.getEmployeeMenuInput();
			}
			
		} 
	//returns the logged into account
	public Account getLoggedInto(){
		return loggedInto;
	}
	//returns employee logged in
	public Employee getEmployeeLoggedIn() {
		return employeeLoggedIn;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public List<Employee> getEmployeeAccts() {
		return employeeAccts;
	}
	public void setEmployeeAccts(List<Employee> employeeAccts) {
		this.employeeAccts = employeeAccts;
	}
	//HASHMAP GETTERS AND SETTERS
	public Map<String, Object> getUsers() {
		return users;
	}	
}

