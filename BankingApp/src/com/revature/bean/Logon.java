package com.revature.bean;

import java.util.List;
import java.util.Scanner;

public class Logon {

	public static Scanner sc= new Scanner(System.in);
	
	
	public static String getLogonFromSC(){
		String contents;
		System.out.println("Type the NewUsername");
		contents = sc.nextLine();
		return contents;

	}
	
	public static String getLogonPasswordFromSC(){
		String contents;
		System.out.println("Type the NewPassword");
		contents = sc.nextLine();
		return contents;
		
	
	}
	
	public static String getLogonFirstNameFromSC(){
		String contents;
		System.out.println("Type the FirstName");
		contents = sc.nextLine();
		return contents;
		
	}
	
	public static String getLogonLastNameFromSC(){
		String contents;
		System.out.println("Type the LastName");
		contents = sc.nextLine();
		return contents;
		
	}
	
	public static String getLogonDobFromSC(){
		String contents;
		System.out.println("Type the Date Of Birth");
		contents = sc.nextLine();
		return contents;
		
	}
	
	
	
	public static User logonProcess(List<User> usersList) {
		
		User newUser = null;
		
		while (newUser==null)	{
			String login =  Logon.getLogonFromSC();
			String pass = Logon.getLogonPasswordFromSC();
			String firstname = Logon.getLogonFirstNameFromSC();
			String lastname = Logon.getLogonLastNameFromSC();
//			String dateOfBirth = (Date) Logon.getLogonDobFromSC();
			
			
			
					
			newUser = new  Customer( firstname,  lastname, null ,  true,  login, pass);

			return newUser; 
			
			
		}
		return newUser;
	}


}
