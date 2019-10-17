package com.revature.Driver;

public class Driver {
	 public static void main(String args[]) {
	      /* Creating ArrayList of type "String" which means
	       * we can only add "String" elements
	       */
	      ArrayList<Client> Clients = new ArrayList<Client>();
	      ArrayList<Employee>  = new ArrayList<Employee>();
	      
	      /*
	       * Steps for what to ask
	       * 
	       * 1) ask if the user is an employee or a client
	       * 
	       * 2) ask if the user wants to create a new account or log into an already existing one
	       * 
	       * 3a) if user wants to create a new account, the information needed depends on if they are an employee or client
	       * 
	       * If Client:					If Employee:
	       * 	Name:					Name:
	       * 	Password:				Password:
	       * 	Retype Password:		Retype Password:
	       * 	SSN:					SSN:
	       * 	Credit:			
	       * 	Starting Input:
	       * 
	       * 3b) If user wants to log in, just ask for their name and password
	       * 
	       * If Client:					If Employee:
	       * 	Name:					Name:
	       * 	Password:				Password:
	       * 
	       * 4) Give options for what they want to do. If they are Employees, they need to first ge
	       * 
	       * If Client:							If Employee:
	       * 	1) Look at account				What Account do you want to look at?
	       * 	2) Withdraw					
	       * 	3) Deposit				   		> After they select an account, they have the same
	       * 	4) Transfer to(ask who to) 		> options on it that the Client would but an Admin
	       * 	5) Transfer from(ask who to)	> can also choose 6) Remove Account
	       * 
	       * 
	       * 
	       */
	
}
