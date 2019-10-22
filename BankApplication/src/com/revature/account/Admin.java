package com.revature.account;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Employee {

	static ArrayList<Account> listOfCustomers = new ArrayList<Account>();
	static ArrayList<Account> admin = new ArrayList<Account>();

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

	public static void viewEdit(ArrayList<Account> v) throws FileNotFoundException, IOException {

		for (Account loo : v) {
			listOfCustomers.add(loo);
		}
		admin.add(new Account("The", "Boss", "Power"));

		System.out.println("Enter Admin last name and Password: ");
		boolean found = false;
		while (found == false) {
			Scanner c = new Scanner(System.in);
			String alast = c.next();
			String apassword = c.next();

			for (int i = 0; i < admin.size(); i++) {

				if (admin.get(i).getLast().equals(alast) && admin.get(i).getPassword().equals(apassword)) {
					System.out.println("Welcome, here are all active accounts: ");
					for (Account a : listOfCustomers) {
						System.out.println(a);
						System.out.println("============================");
					}
					found = true;
					boolean cust = false;
					while (cust == false) {
						System.out.println("Enter 1 to edit an account, 2 to save and exit");
						int in = c.nextInt();
						if (in == 1) {
							System.out.println("Enter last name and SSN of account you want to edit");
							String la = c.next();
							int las = c.nextInt();
							for (int ii = 0; ii < listOfCustomers.size(); ii++) {
								if (listOfCustomers.get(ii).getLast().equals(la)
										&& listOfCustomers.get(ii).getSsn() == las) {
									System.out.println(
											"Enter 1 to withdraw, 2 to deposit, 3 to transfer funds or 4 to delete account");
									int ll = c.nextInt();
									if (ll == 1) {
										System.out.println("Enter withdraw amount: ");
										double w = Double.parseDouble(c.next());
										listOfCustomers.get(ii).setWithdraw(w);
										System.out.println("New Balance " + listOfCustomers.get(ii).toString());
									} else if (ll == 2) {
										System.out.println("Enter deposit amount: ");
										double d = Double.parseDouble(c.next());
										listOfCustomers.get(ii).setDeposit(d);
										System.out.println("New Balance " + listOfCustomers.get(ii).toString());
									} else if (ll == 3) {
										System.out
												.println("Enter last name and SSN of account you want to transfer to");
										String llast = c.next();
										int sssn = c.nextInt();
										for (int y = 0; y < listOfCustomers.size(); y++) {
											if (listOfCustomers.get(y).getLast().equals(llast)
													&& listOfCustomers.get(y).getSsn() == sssn) {
												System.out.println("Enter amount you want to transfer into:"
														+ listOfCustomers.get(y).toString());
												double dub = Double.parseDouble(c.next());
												listOfCustomers.get(ii).setWithdraw(dub);
												listOfCustomers.get(y).setDeposit(dub);
												System.out.println("Transfer successful new account balances:");
												System.out.println(listOfCustomers.get(ii).toString());
												System.out.println(listOfCustomers.get(y).toString());
											}

										}
									} else if (ll == 4) {
										System.out.println("Enter 1 if you are sure you want to delete, 2 to go back");
										int inn = c.nextInt();
										if (inn == 1) {
											listOfCustomers.remove(ii);
											System.out.println("Account removed.");
										} else {
											continue;
										}
									}
								}
							}
						} else if (in == 2) {
							cust = true;
							Admin serial2 = new Admin();
							serial2.writeCustomerObject();
						}
					}
				}
			}

		}
	}

	public static void appDeny(ArrayList<Account> a) throws FileNotFoundException, IOException {
		for (Account loo : a) {
			listOfCustomers.add(loo);
		}
		admin.add(new Account("The", "Boss", "Power"));

		boolean found = false;
		while (found == false) {
			System.out.println("Enter Admin last name and Password: ");
			Scanner c = new Scanner(System.in);
			String alast = c.next();
			String apassword = c.next();

			for (int i = 0; i < admin.size(); i++) {

				if (admin.get(i).getLast().equals(alast) && admin.get(i).getPassword().equals(apassword)) {
					System.out.println("Welcome");
					found = true;

					System.out.println("Viewing applications by submission order: ");

					for (int x = 0; x < listOfCustomers.size(); x++) {
						if (listOfCustomers.get(x).isOpenApp()) {
							System.out.println("Would you like to approve this application? 1 for yes, 2 for no");
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
							}
						}
					}
				}

			}
			Admin.writeCustomerObject();
		}

	}
}
