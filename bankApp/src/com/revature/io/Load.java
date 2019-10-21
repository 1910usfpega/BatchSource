package com.revature.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.revature.bean.Customer;
import com.revature.bean.Employee;
import com.revature.bean.PendingAccount;
import com.revature.bean.bankAdmin;

public class Load {

	//Upon load, instantiate files containing data collections
	public static final File adminFile = new File("admins.txt");
	public static final File employeeFile = new File("employees.txt");
	public static final File customerFile = new File("customers.txt");
	public static final File pendingAccountsFile = new File("pendingAccounts.txt");

	//Upon load, instantiate the collections
	public static ArrayList<Customer> cus = new ArrayList<>();
	public static ArrayList<Employee> emp = new ArrayList<>();
	public static ArrayList<bankAdmin> adm = new ArrayList<>();
	public static ArrayList<PendingAccount> pen = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public static void readData() {

		//Read all admin objects and add them to the admin collection
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(adminFile))) {
			adm = (ArrayList<bankAdmin>) objIn.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//Read all employee objects and add them to the employee collection
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(employeeFile))) {
			emp = (ArrayList<Employee>) objIn.readObject();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//Read all customer objects and add them to the customer collection
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(customerFile))) {
			cus = (ArrayList<Customer>) objIn.readObject();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//Read all pending account objects and add them to the pending accounts collection
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(pendingAccountsFile))) {
			pen = (ArrayList<PendingAccount>) objIn.readObject();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}//End method readData()

}//End class Load
