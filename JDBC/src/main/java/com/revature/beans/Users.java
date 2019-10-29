package com.revature.beans;

import java.util.Scanner;

import com.revature.usersdaoimpl.UsersDaoImpl1;

public class Users {

	private String users_username;
	private String users_fname;
	private String users_lname;
	private String users_pword;
	private int users_usertype_id;
	private int user_id;
	

	public Users(String users_username, String users_fname, String users_lname, String users_pword, int users_usertype_id, int user_id) {
		super();
		this.users_username = users_username;
		this.users_fname= users_fname;
		this.users_lname = users_lname;
		this.users_pword = users_pword;
		this.users_usertype_id = users_usertype_id;
		this.user_id= user_id; }

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Users() {
		// TODO Auto-generated constructor stub
	}

	public String getUsers_username() {
		return users_username;
	}

	public void setUsers_username(String users_username) {
		this.users_username = users_username;
	}

	public String getUsers_pword() {
		return users_pword;
	}

	public void setUsers_pword(String users_pword) {
		this.users_pword = users_pword;
	}

	public String getUsers_fname() {
		return users_fname;
	}

	public void setUsers_fname(String users_fname) {
		this.users_fname = users_fname;
	}

	public String getUsers_lname() {
		return users_lname;
	}

	public void setUsers_lname(String users_lname) {
		this.users_lname = users_lname;
	}

	public int getUsers_userType() {
		return users_usertype_id;
	}

	public void setUsers_userType(int users_userType) {
		this.users_usertype_id = users_userType;
	}

	@Override
	public String toString() {
		return "Users [users_username=" + users_username + ", users_fname=" + users_fname + ", users_lname="
				+ users_lname + ", users_pword=" + users_pword + ", users_usertype_id=" + users_usertype_id
				+ ", user_id=" + user_id + "]";
	}


	//Method for new users
public static void customerinfo() {
		String password1 = "";
		String password2 = "";
		Users a = new Users();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter First name");
		a.setUsers_fname(in.next());
		System.out.println("Please enter Last name");
		a.setUsers_lname(in.next());
		System.out.println("Please Choose a Username:");
		a.setUsers_username(in.next());
		

		do {
			System.out.println("Please Choose a Password:");
			password1 = in.next();
			System.out.println("Please retype your password:");
			password2 = in.next();

		if (!password1.equals(password2)) {
			System.out.println("Passwords do not match, Please try again");
		}
		}while(!password1.equals(password2));
		
		a.setUsers_pword(password1);
		UsersDaoImpl1 udi= new UsersDaoImpl1();
		udi.addCustomer(a);
		System.out.println("You have successfully created your log in!");
		
	}
	}
