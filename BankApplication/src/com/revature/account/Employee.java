package com.revature.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.bankapplication.ScannerMain;
import com.revature.account.Account;

public class Employee extends Account {

	static ArrayList<Account> listOfCustomers = new ArrayList<Account>();

	public static void writeCustomerObject() throws FileNotFoundException, IOException {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("cust.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(listOfCustomers);
			System.out.println("Success");
		} finally {
			if (objectOutputStream != null) {
				objectOutputStream.close();
			}

		}
	}

	public static void employeeLogin(ArrayList<Account> emp) throws FileNotFoundException, IOException {
		for (Account cust : emp) {
			listOfCustomers.add(cust);
		}

		ArrayList<Account> employees = new ArrayList<Account>();

		employees.add(new Account("Zayum", "Zeus", "Password"));
		employees.add(new Account("Ohboy", "Oden", "Letsgo"));

		System.out.println("Enter last name and Password: ");
		boolean found = false;
		while (found == false) {
			Scanner c = new Scanner(System.in);
			String elast = c.next();
			String epassword = c.next();

			for (int i = 0; i < employees.size(); i++) {

				if (employees.get(i).getLast().equals(elast) && employees.get(i).getPassword().equals(epassword)) {
					System.out.println("Welcome Zeus");
					found = true;
					boolean cust = false;
					while (cust == false) {
						System.out.println(
								"Enter 1 to view all your customer's info, Enter 2 view applicants, Enter 3 to exit");
						Scanner n = new Scanner(System.in);
						int num = n.nextInt();
						if (num == 1) {
							int tracker = 0;
							for (Account a : listOfCustomers) {
								if (employees.get(i).getLast().equals(a.getEmployee())) {
									System.out.println("Customer: " + a);
									tracker++;
								}
							}
							if (tracker == 0) {
								System.out.println("You are assigned no customers.");
							}

						} else if (num == 2) {

							System.out.println("Viewing applications by submission order: ");

							for (int x = 0; x < listOfCustomers.size(); x++) {
								if (listOfCustomers.get(x).isOpenApp()) {
									System.out
											.println("Would you like to approve this application? 1 for yes, 2 for no");
									System.out.println(
											listOfCustomers.get(x).toString() + " First deposit amount over $1000? ->  "
													+ listOfCustomers.get(x).getFirstDeposit());
									Scanner ne = new Scanner(System.in);
									int q = ne.nextInt();
									if (q == 1) {
										listOfCustomers.get(x).setOpenApp(false);
										listOfCustomers.get(x).setBalance(listOfCustomers.get(x).getFirstDeposit());
									} else {
										listOfCustomers.remove(x);
										continue;
									}
								}
							}

						} else if (num == 3) {
							cust = true;
							Employee serial = new Employee();
							serial.writeCustomerObject();
						}
					}
				}
			}

		}
		System.out.println("Have a good day.");
	}

}
