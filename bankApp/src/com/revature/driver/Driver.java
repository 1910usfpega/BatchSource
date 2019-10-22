package com.revature.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.revature.bean.Customer;
import com.revature.bean.Employee;
//import com.revature.bean.Employee;
import com.revature.bean.Person;
import com.revature.bean.bankAccount;
import com.revature.bean.bankAdmin;
//import com.revature.bean.bankAccount;

public class Driver {

	public static Scanner input = new Scanner(System.in);
	public static String uInput, uPassword, first, last;
	public static double amount;
	// public static int tempAccount, tempAccount2;
	static Customer user = null;
	static Employee employee = null;
	static bankAdmin bAdmin = null;
	public static int valid;
	public static boolean badInput = true;
	public static boolean uCheck = true;

	public static void main(String[] args) {

		do {
			System.out.println("What would you like to do today?");
			System.out.println("================================");
			System.out.println("1. Existing User");
			System.out.println("2. Create an Account");
			System.out.println("3. Employee Login");
			System.out.println("4. Bank Admin Login");
			System.out.println("5. Exit");
			System.out.print("Enter: ");

			try {
				uInput = input.next();
				valid = Integer.parseInt(uInput);
				if (valid > 0 && valid < 5) {
					badInput = false;
				} else
					badInput = true;

			} catch (Exception e) {
				System.out.println("\nEnter a valid option.");
				badInput = true;
			}
		} while (badInput);

		switch (valid) {
		case 1: // Create an account
			int invalid = 0;
			boolean cCheck = true;
			System.out.print("Existing User");
			System.out.print("\nUsername: ");
			uInput = input.next();

			do {
				System.out.print("Password: ");
				uPassword = input.next();
				if (Person.login(uInput, uPassword)) {
					// login
					do {
						System.out.println("What would you like to do");
						System.out.println("a. View Account Information");
						System.out.println("b. Withdraw Money");
						System.out.println("c. Transfer Money");
						System.out.println("d. Merge Accounts");
						System.out.println("e. Quit");
						uInput = input.next();
						uCheck = true;

						switch (uInput) {
						case "a":
							user.viewAccount();
							uCheck = true;
							break;
						case "b":
							System.out.print("Enter your account number: ");
							int temp = input.nextInt();
							if (bankAccount.checkAccountExist(temp)) {
								bankAccount aObject = bankAccount.getBankAccount(temp);
								System.out.println("Balance: " + aObject.getBalance());
								System.out.println("Enter the amount to withdraw");
								int money = input.nextInt();
								if (aObject.checkMoney(money)) {
									// withdraw
									aObject.withdraw(money);
								}
							} else {
								System.out.println("Not the right bank account");
								break;
							}
							uCheck = true;
							break;
						case "c":
							// Transfer Money
							user.viewAccount();
							System.out.print("Enter your account number: ");
							int temp2 = input.nextInt();
							if (bankAccount.checkAccountExist(temp2)) {
								bankAccount aObject = bankAccount.getBankAccount(temp2);
								System.out.println("Enter the account number to transfer money to: ");
								int temp3 = input.nextInt();
								if (bankAccount.checkAccountExist(temp3)) {
									bankAccount bObject = bankAccount.getBankAccount(temp3);
									System.out.println("Enter the amount: ");
									amount = input.nextInt();
									if (aObject.checkMoney(amount)) {
										if (aObject.withdraw(amount))
											bObject.deposit(amount);
										else {
											System.out.println("Not working ATM");
											break;
										}
									}
								}
							}
							uCheck = true;
							break;
						case "d":
							// Merge Accounts
							user.viewAccount();
							System.out.print("Enter your account number: ");
							int aNum = input.nextInt();
							if (bankAccount.checkAccountExist(aNum)) {
								bankAccount merge = bankAccount.getBankAccount(aNum);
								user.jointAccount(merge);
							}
							uCheck = true;
							break;
						case "e":
							System.out.println("Quitting...");
							uCheck = false;
							break;
						default:
							System.out.println("Invalid Input");
							uCheck = true;
							break;
						}
					} while (uCheck);
				} else {
					System.out.println("Invalid.");
					if (invalid > 3) {
						System.out.println("Too many invalid inputs. Please try again later.");
						cCheck = false;
						break;
					}
					invalid++;
				}
			} while (cCheck);
			break;
		case 2: // Login account
			System.out.println("Creating an Account: ");
			System.out.print("Enter your first name: ");
			first = input.next();
			System.out.print("Enter your last name: ");
			last = input.next();

			do {
				System.out.print("Pick a username: ");
				uInput = input.next();
				uCheck = Person.userCheck(uInput);
				do {
					System.out.print("Pick a password: ");
					uInput = input.next();
					// check password limitations?
					// if password limitation is okay, break and write creation to file
				} while (!uCheck);
			} while (!uCheck);

			// Limit the password length
			System.out.print("Enter a password: ");
			uPassword = input.next();

			// Write username and password to a file
			// Call another menu
			break;
		case 3: // Employee Login
			int invalid2 = 0;
			uCheck = true;
			boolean eCheck = true;

			System.out.print("Employee Login");
			System.out.print("\nEmployee Username: ");
			uInput = input.next();
			do {
				System.out.print("Password: ");
				uPassword = input.next();

				if (uCheck = Person.login(uInput, uPassword)) {
					do {
						System.out.println("What would you like to do");
						System.out.println("a. View Customer Information");
						System.out.println("b. Quit");
						uInput = input.next();

						switch (uInput) {
						case "a":
							// View customer information
							user.viewAccount();
							System.out.println("View which user: ");
							String uName = input.next();
							if (Customer.userCheck(uName)) {
								Customer tempName = Customer.getCustomer(uName);
								employee.viewPersonal(tempName);
								employee.viewAccount(tempName);
							}
							eCheck = true;
							break;
						case "b":
							System.out.println("Quitting...");
							eCheck = false;
							break;
						default:
							System.out.println("Invalid Input");
							uCheck = true;
							break;
						}
					} while (eCheck);
				} else {
					System.out.println("Invalid.");
					if (invalid2 > 3) {
						System.out.println("Too many invalid inputs. Please try again later.");
						break;
					}
					invalid2++;
				}
			} while (!uCheck);
			break;
		case 4: // BankAdmin login
			int invalid3 = 0;
			uCheck = true;
			boolean bCheck = true;

			System.out.print("Admin Login");
			System.out.print("\nAdmin Username: ");
			uInput = input.next();
			do {
				System.out.print("Password: ");
				uPassword = input.next();

				if (uCheck = Person.login(uInput, uPassword)) {
					do {
						System.out.println("What would you like to do");
						System.out.println("a. Approve/Deny Account");
						System.out.println("b. Withdraw from an account");
						System.out.println("c. Deposit to account");
						System.out.println("d. Transfer money");
						System.out.println("e. Cancel an account");
						System.out.println("f. Quit");
						uInput = input.next();

						switch (uInput) {
						case "a":
							// deny/approve account creation
							ArrayList<Customer> newC = Customer.pending();
							int i = 0;
							while (!newC.isEmpty()) {
								Customer temp = newC.get(i);
								System.out.print("Pending account: " + temp.getUsername());
								System.out.println("Approve(Y)/Deny(N)");
								String approval = input.next();
								switch (approval) {
								case "y":
								case "Y":
									temp.addBankAccount();
									break;
								case "n":
								case "N":
									break;
								default:
									break;
								}
								newC.remove(i);
								i++;
							}
							bCheck = true;
							break;
						case "b":
							// Deny/Approve joint
							//HashMap<Customer, bankAccount> joining = Person.joint();
							bAdmin.jPending();
							bCheck = true;
							break;
						case "c":
							// Withdraw
							bCheck = true;
							break;
						case "d":
							// Deposit
							System.out.println("Transfer how much: ");
							amount = input.nextInt();
							/*
							 * if (user.transfer(amount, takeAccount, giveAccount)) {
							 * System.out.print("Transferring " + amount + " from account number: " +
							 * giveAccount + " to " + takeAccount); } else {
							 * System.out.println("Insufficient balance."); }
							 */
							bCheck = true;
							break;
						case "e":
							// Transfer
							bCheck = true;
							break;
						case "f":
							// Cancel Account
							System.out.println("Account to delete: ");
							String cName = input.next();
							if (Person.userCheck(cName)) {
								user.viewAccount();
								System.out.println("Account Number: ");
								int cNumber = input.nextInt();
								Customer deletingC = Customer.getCustomer(cName);
								bankAccount deletingN = bankAccount.getBankAccount(cNumber);
								bAdmin.removeAccount(deletingN, deletingC);
							}
							bCheck = true;
							break;
						case "g":
							System.out.println("Quitting...");
							bCheck = false;
							break;
						default:
							System.out.println("Invalid Input");
							uCheck = true;
							break;
						}
					} while (bCheck);
				} else {
					System.out.println("Invalid.");
					if (invalid3 > 3) {
						System.out.println("Too many invalid inputs. Please try again later.");
						break;
					}
					invalid3++;
				}
			} while (!uCheck);
			break;
		case 5: // Exit program
			System.out.println("\nExiting...");
			break;
		default:
			break;
		}
	}
}
