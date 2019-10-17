package com.revature.people;

public class Administrator extends Employee {

	public Administrator(String name, String password, int socialsecnum) {
		super(name, password, socialsecnum);
		this.admin_auth = true;
		// TODO Auto-generated constructor stub
	}
	
	// Remove a client as well as their account
	public void remove_account(Client[] clients, String name, int value) {
		for(Client client : clients) {
			if(client.name == name) {
				// Insert code to remove client from Client list and their Account from Account list
			}
		}
		
	}
	
}
