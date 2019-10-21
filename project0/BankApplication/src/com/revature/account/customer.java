package com.revature.account;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.account.Account;

public class Customer extends Account {

	public static void logIn() {
		ArrayList<Account> customer = new ArrayList<Account>();
		String strin = "";
		try {
			InputStream in = new FileInputStream(new File("Customer.txt"));
			int str;

			while ((str = in.read()) != -1) {
				char let = (char) str;
				strin += let;
			}
			in.close();
		} catch (IOException e) {
		}
		String[] customers = strin.split("\n");

		for (String n : customers) {
			String[] info = n.split(":");
			String first = info[0];
			String last = info[1];
			int ssn = Integer.parseInt(info[2]);
			String employee = info[3];
			double balance = Double.parseDouble(info[4]);
			int account = Integer.parseInt(info[5].trim());
			customer.add(new Account(first, last, ssn, employee, balance, account));
		}
		System.out.println("Enter Last name and SSN ");
		Account the_one = null;
		boolean found = false;
		while (found == false) {
			Scanner c = new Scanner(System.in);
			String last = c.next();
			int ssn = c.nextInt();

			for (int i = 0; i < customer.size(); i++) {

				if (customer.get(i).getLast().equals(last) && customer.get(i).getSsn() == ssn) {
					System.out.println(customer.get(i));
					the_one = customer.get(i);
					found = true;
					boolean cust = false;
					while (cust == false) {
						System.out.println(
								"Enter 1 to withdraw, 2 to deposit ,3 to transfer funds or 4 to end transaction");
						Scanner n = new Scanner(System.in);
						int num = n.nextInt();
						if (num == 1) {
							System.out.println("Enter amount to withdraw: ");
							num = n.nextInt();
							customer.get(i).setWithdraw(num);
						} else if (num == 2) {
							System.out.println("Enter amout to deposit: ");
							num = n.nextInt();
							customer.get(i).setDeposit(num);
							System.out.println(customer.toString());
						} else if (num == 3) {
							for (int z = 0; z < customer.size(); z++) {
								int f = customer.get(i).getAccountNumber();
								int s = customer.get(z).getAccountNumber();
								if (f == s && customer.get(i).getSsn() != customer.get(z).getSsn()) {
									System.out.println("How much do you want deposit into: " + customer.get(z));
									double tran = Double.parseDouble(n.next());
									customer.get(z).setDeposit(tran);
									customer.get(i).setWithdraw(tran);
								}
							}

						} else if (num == 4) {
							cust = true;
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

		String tempString = "";
		ArrayList<String> returns = new ArrayList<String>();
		for (Account c : customer) {
			tempString = "";
			tempString += c.getFirst();
			tempString += ":";
			tempString += c.getLast();
			tempString += ":";
			tempString += c.getSsn();
			tempString += ":";
			tempString += c.getEmployee();
			tempString += ":";
			tempString += c.getBalance();
			tempString += ":";
			tempString += c.getAccountNumber();
			returns.add(tempString);
		}

		try (OutputStream out = new FileOutputStream(new File("customer.txt"), false);) {
			for (String s : returns) {
				out.write((s + "\n").getBytes());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void apply() {

		ArrayList<Account> customerApplication = new ArrayList<Account>();

		System.out.println("Enter First name, Last name, SSN and First deposit amount ");
		Scanner c = new Scanner(System.in);
		String first = c.next();
		String last = c.next();
		int ssn = c.nextInt();
		int deposit = c.nextInt();

		customerApplication.add(new Account(first, last, ssn, deposit));
		System.out.println("Your application successfully submitted!");
		System.out.println(customerApplication.get(0) + " First Deposit: " + deposit);

		String tempString = "";
		ArrayList<String> returns = new ArrayList<String>();

		tempString = "";
		tempString += customerApplication.get(0).getFirst();
		tempString += ":";
		tempString += customerApplication.get(0).getLast();
		tempString += ":";
		tempString += customerApplication.get(0).getSsn();
		tempString += ":";
		tempString += customerApplication.get(0).getEmployee();
		tempString += ":";
		tempString += customerApplication.get(0).getBalance();
		tempString += ":";
		tempString += customerApplication.get(0).getAccountNumber();
		returns.add(tempString);

		try (OutputStream out = new FileOutputStream(new File("application.txt"), false);) {
			for (String s : returns) {
				out.write((s + "\n").getBytes());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void join() {
		ArrayList<Account> customer = new ArrayList<Account>();
		String strin = "";
		try {
			InputStream in = new FileInputStream(new File("Customer.txt"));
			int str;

			while ((str = in.read()) != -1) {
				char let = (char) str;
				strin += let;
			}
			in.close();
		} catch (IOException e) {
		}
		String[] customers = strin.split("\n");

		for (String n : customers) {
			String[] info = n.split(":");
			String first = info[0];
			String last = info[1];
			int ssn = Integer.parseInt(info[2]);
			String employee = info[3];
			double balance = Double.parseDouble(info[4]);
			int account = Integer.parseInt(info[5].trim());
			customer.add(new Account(first, last, ssn, employee, balance, account));
		}

		int a = -1;
		boolean found = false;
		while (a == -1) {
			System.out.println("Enter last name and SSN of first account");
			Scanner j = new Scanner(System.in);
			String last = j.next();
			int ssn = j.nextInt();

			for (int i = 0; i < customer.size(); i++) {

				if (customer.get(i).getLast().equals(last) && customer.get(i).getSsn() == ssn) {
					System.out.println("First account: " + customer.get(i));
					a = i;

					int b = 0;
					while (b == 0) {
						System.out.println("Enter last name and SSN of second account");
						// Scanner j = new Scanner(System.in);
						String last2 = j.next();
						int ssn2 = j.nextInt();

						for (int y = 0; y < customer.size(); y++) {

							if (customer.get(y).getLast().equals(last2) && customer.get(y).getSsn() == ssn2) {
								int original = customer.get(i).getAccountNumber();
								customer.get(y).setAccountNumber(original);
								System.out.println("Second account: " + customer.get(y));
								b = 1;
							}
						}
						if (b == 0) {
							System.out.println("Not found, try again");
						}
					}
					System.out.println("Accounts are now joined ");
				}

			}

		}
		if (a == -1) {
			System.out.println("Not found, try again");
		}

		String tempString = "";
		ArrayList<String> returns = new ArrayList<String>();
		for (Account c : customer) {
			tempString = "";
			tempString += c.getFirst();
			tempString += ":";
			tempString += c.getLast();
			tempString += ":";
			tempString += c.getSsn();
			tempString += ":";
			tempString += c.getEmployee();
			tempString += ":";
			tempString += c.getBalance();
			tempString += ":";
			tempString += c.getAccountNumber();
			returns.add(tempString);
		}

		try (OutputStream out = new FileOutputStream(new File("customer.txt"), false);) {
			for (String s : returns) {
				out.write((s + "\n").getBytes());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
