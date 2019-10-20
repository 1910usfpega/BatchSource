package com.project0.accounts;

import java.util.Scanner;

public class Customer extends User {

	protected String firstName;
	protected String lastName;
	protected double balance;
	protected double withdraw;
	protected double deposit;

	public static Scanner sc = new Scanner(System.in);

	@Override
	public void register() {
		// TODO Auto-generated method stub

	}

	@Override
	public void logIn() {
		// TODO Auto-generated method stub

	}

	public static void openAccount() {
		System.out.println("Username: ");
		sc.nextLine();
		System.out.println("I opened a new account");
	}

	public static void depositFromAccount() {

	}

	public static void withdrawFromAccount() {

	}

}
