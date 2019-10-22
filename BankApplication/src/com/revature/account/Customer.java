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

import com.revature.account.Account;
import com.revature.bankapplication.ScannerMain;

public class Customer extends Account {

	static ArrayList<Account> listOfCustomers = new ArrayList<Account>();
	// use serialization for input output
	// make maven branch
	// github base branch
	// explain how implemented

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

	public static void logIn(ArrayList<Account> cus) throws FileNotFoundException, IOException {

		for (Account cust : cus) {
			listOfCustomers.add(cust);
		}

		System.out.println("Enter Last name and SSN ");
		Account the_one = null;
		boolean found = false;
		while (found == false) {
			Scanner c = new Scanner(System.in);
			String last = c.next();
			int ssn = c.nextInt();

			for (int i = 0; i < listOfCustomers.size(); i++) {

				if (listOfCustomers.get(i).getLast().equals(last) && listOfCustomers.get(i).getSsn() == ssn) {
					System.out.println(listOfCustomers.get(i));
					the_one = listOfCustomers.get(i);
					found = true;
					boolean cust = false;
					while (cust == false) {
						System.out.println(
								"Enter 1 to withdraw, 2 to deposit ,3 to transfer funds or 4 to save and end transaction");
						Scanner n = new Scanner(System.in);
						int num = n.nextInt();
						if (num == 1) {
							System.out.println("Enter amount to withdraw: ");
							num = n.nextInt();
							listOfCustomers.get(i).setWithdraw(num);
						} else if (num == 2) {
							System.out.println("Enter amout to deposit: ");
							num = n.nextInt();
							listOfCustomers.get(i).setDeposit(num);
							System.out.println(listOfCustomers.toString());
						} else if (num == 3) {
							for (int z = 0; z < listOfCustomers.size(); z++) {
								int f = listOfCustomers.get(i).getAccountNumber();
								int s = listOfCustomers.get(z).getAccountNumber();
								if (f == s && listOfCustomers.get(i).getSsn() != listOfCustomers.get(z).getSsn()) {
									System.out.println("How much do you want deposit into: " + listOfCustomers.get(z));
									double tran = Double.parseDouble(n.next());
									listOfCustomers.get(z).setDeposit(tran);
									listOfCustomers.get(i).setWithdraw(tran);
								} else {
									System.out.println("No joint accounts.");
								}
							}

						} else if (num == 4) {
							cust = true;
							Customer serialization = new Customer();
							Customer.writeCustomerObject();
							System.out.println("Have a good rest of the day!");
						} else {
							System.out.println("Invalid entry");
						}
					}

				}
			}
			if (the_one == null) {
				System.out.println("User not found, try again");
				System.out.println("Enter Last name and SSN");
			}
		}
	}

	public static void apply(ArrayList<Account> app) throws FileNotFoundException, IOException {

		for (Account cust : app) {
			listOfCustomers.add(cust);
		}

		System.out.println("Enter First name, Last name, SSN and First deposit amount ");
		Scanner c = new Scanner(System.in);
		String first = c.next();
		String last = c.next();
		int ssn = c.nextInt();
		int deposit = c.nextInt();

		listOfCustomers.add(new Account(first, last, ssn, deposit, true));
		System.out.println("Your application successfully submitted!");

		Customer.writeCustomerObject();

	}

	public static void join(ArrayList<Account> joi) throws FileNotFoundException, IOException {

		for (Account cust : joi) {
			listOfCustomers.add(cust);
		}

		int a = -1;
		boolean found = false;
		while (a == -1) {
			System.out.println("Enter last name and SSN of first account to log in");
			Scanner j = new Scanner(System.in);
			String last = j.next();
			int ssn = j.nextInt();

			for (int i = 0; i < listOfCustomers.size(); i++) {

				if (listOfCustomers.get(i).getLast().equals(last) && listOfCustomers.get(i).getSsn() == ssn) {
					System.out.println("First account: " + listOfCustomers.get(i));
					a = i;

					int b = 0;
					while (b == 0) {
						System.out.println("Enter last name and SSN of second account");
						// Scanner j = new Scanner(System.in);
						String last2 = j.next();
						int ssn2 = j.nextInt();

						for (int y = 0; y < listOfCustomers.size(); y++) {

							if (listOfCustomers.get(y).getLast().equals(last2)
									&& listOfCustomers.get(y).getSsn() == ssn2) {
								int original = listOfCustomers.get(i).getAccountNumber();
								listOfCustomers.get(y).setAccountNumber(original);
								System.out.println("Second account: " + listOfCustomers.get(y));
								b = 1;
							}
						}
						if (b == 0) {
							System.out.println("Not found, try again");
						}
					}

					Customer.writeCustomerObject();
					System.out.println("Accounts are now joined! Re-log it if you wish to transfer funds!");
				}

			}

		}
		if (a == -1) {
			System.out.println("Not found, try again");
		}
	}

}
