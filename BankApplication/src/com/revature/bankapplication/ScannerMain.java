package com.revature.bankapplication;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.revature.account.Account;
import com.revature.account.Admin;
import com.revature.account.Customer;
import com.revature.account.Employee;

public class ScannerMain {

	public static ArrayList<Account> names = new ArrayList<Account>();

	public static void readCustomerObject() throws IOException, FileNotFoundException, ClassNotFoundException {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream("cust.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);
			ArrayList<Account> listOfCustomers = (ArrayList<Account>) objectInputStream.readObject();
			for (Account custm : listOfCustomers) {
				names.add(custm);
				System.out.println(custm.toString());
			}
		} finally {
			if (objectInputStream != null) {
				objectInputStream.close();
			}
		}
	}

	public static void writeCustomerObject() throws FileNotFoundException, IOException {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("cust.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			Account customer1 = new Account("Roman", "Ibba", 5555, "Zeus", 5000.0, 9999);
			Account customer2 = new Account("Steven", "McCarter", 2020, "Oden", 5000.0, 8888);
			ArrayList<Account> listCustomers = new ArrayList<Account>();
			listCustomers.add(customer1);
			listCustomers.add(customer2);

			objectOutputStream.writeObject(names);
		} finally {
			if (objectOutputStream != null) {
				objectOutputStream.close();
			}

		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// ScannerMain.findCustomer();

		ScannerMain deSerialization = new ScannerMain();
		deSerialization.readCustomerObject();

		ScannerMain serialization = new ScannerMain();
		serialization.writeCustomerObject();

		// Allows to log in as Customer, Employee or Admin
		boolean found = false;
		while (found == false) {
			System.out.println("Enter 1 for Customer, 2 for Employee, 3 for Admin or 4 to exit");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			if (num == 1) {
				System.out.println("Welcome Valued Customer!");
				System.out.println("Enter 1 to log in, 2 to apply for an account or 3 to join two existing accounts.");
				int n = in.nextInt();
				if (n == 1) {
					Customer.logIn(names);
				}
				if (n == 2) {
					Customer.apply(names);
				}
				if (n == 3) {
					Customer.join(names);
				}
			} else if (num == 2) {
				System.out.println("Welcome Employee!");
				Employee.employeeLogin(names);
			} else if (num == 3) {
				System.out.println("Welcome Admin!");
				System.out.println("Enter 1 to view/ edit all acounts and Enter 2 to approve/deny new accounts.");
				int n = in.nextInt();
				if (n == 1) {
					Admin.viewEdit(names);
				}
				if (n == 2) {
					Admin.appDeny(names);
				}
			} else if (num == 4) {
				found = true;
				System.out.println("Ended. Have a good day!");

			} else {
				System.out.println("Entered an incorect number, restart application and try again.");
			}

		}
	}

}
