package com.revature.control;

import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.util.ArrayList;
//import java.util.Formatter;
//import java.util.List;
import java.util.Scanner;

import com.revature.model.Account;
import com.revature.model.CheckingAccount;
import com.revature.model.Employee;
import com.revature.model.SavingAccount;

public class FileReaderWriter {

	private Scanner y;
	
	//top open accounts file
	public void openFileForReading(){
		try{
			y = new Scanner(new File("accounts.txt"));
		}catch(Exception e){
			System.out.println("Error reading file");
		}
	}	
	//open employees file
	public void openEmployeesFile() {
		try{
			y = new Scanner(new File("employees.txt"));
		}catch(Exception e){
			System.out.println("Error reading file");
		}
	}	
	//read employees
	public ArrayList<Employee> readEmployeesFile(){
		ArrayList<Employee> employeesAccounts = new ArrayList<Employee>();
		while(y.hasNext()){
			String username = y.next();
			String password = y.next();
			String level = y.next();
			Boolean isAdmin = Boolean.parseBoolean(level);
			if(isAdmin.equals(false))
				employeesAccounts.add(new Employee(username, password, false));
			else if(isAdmin.equals(true))
				employeesAccounts.add(new Employee(username, password, true));
		}
		return employeesAccounts;
	}
	//reads accounts file
	public ArrayList<Account> readFile(){
		ArrayList<Account> accounts = new ArrayList<Account>();
		while(y.hasNext()){
			String checkingOrSaving = y.next();
			String username = y.next();
			String password = y.next();
			String auth = y.next();
			Boolean approved = Boolean.parseBoolean(auth);
			String acctAmount = y.next();
			Double balance = Double.parseDouble(acctAmount);
			if(checkingOrSaving.equals("c"))
				accounts.add(new CheckingAccount(username, password, approved, balance));
			else if(checkingOrSaving.equals("s"))
				accounts.add(new SavingAccount(username, password, approved, balance));
		}
		return accounts;
	}
	//writing the accounts objects to the accounts.txt
	public void writeToAccountsFile(Account a) {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("accounts.txt", true));) {			
			writer.newLine();
			writer.write(a.toString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}	
	
	//writing the employee object to the employees.txt
		public void writeToEmployeesFile(Employee em) {
			
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt", true));) {			
				writer.newLine();
				writer.write(em.getUsername() + " " + em.getPassword() + " " + em.isAdmin());
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}	
	
}


