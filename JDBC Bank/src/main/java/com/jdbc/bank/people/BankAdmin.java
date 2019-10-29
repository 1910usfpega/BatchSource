package com.jdbc.bank.people;

import java.text.DateFormat;

public class BankAdmin extends Customer {

	public BankAdmin() {
		super();
	}

	public BankAdmin(String uName, double password, DateFormat dateOfBirth, String firstName, String lastName,
			String email, String address, String phoneNumber) {
		super(uName, password, dateOfBirth, firstName, lastName, email, address, phoneNumber);
	}
	
	
}
