package com.revature.beans;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.revature.accountsdaoimpl.AccountsDaoImpl;
import com.revature.usersdaoimpl.UsersDaoImpl1;
import com.revature.util.ConnFactory;

public class AdminMenu {
	public static ConnFactory cf = ConnFactory.getInstance();
	
	

	public static void adminmenu(Scanner in) {
		
		List<Users> usersList = new ArrayList<Users>();
		AccountsDaoImpl adi = new AccountsDaoImpl();
		UsersDaoImpl1 udi = new UsersDaoImpl1();
		Connection conn = cf.getConnection();
		System.out.println("Hello Valued Admin!");
		String user1, pass;
		System.out.println("Enter your username:");
		user1 = in.next();
		Properties pro = new Properties();
		try {
			pro.load(new FileReader("Database.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (user1.equals(pro.getProperty("adminusername"))) {
			System.out.println("Enter your password:");
			pass = in.next();
			if (pass.equals(pro.getProperty("adminpassword"))) {
				System.out.println("Welcome Admin!");

			} else {
				System.out.println("You have entered wrong  password:");
			}

		}

		else {
			System.out.println("You have entered wrong username");
		
		
		}
		
		
		
		
		System.out.println("Press 1 to view users");
		System.out.println("Press 2 to create a new user");
		System.out.println("Press 3 to delete users");
		System.out.println("Press 4 to update users");
		System.out.println("Press 5 to delete accounts");
		System.out.println("Press 6 to Log Out!");
	
		
		String key = in.next();
		switch (key) {
		case "1":
			//This is for viewing users
			
			try {
				for(int i=0; i < udi.getUsers().size(); i++) {
					System.out.println(udi.getUsers().get(i));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			break;
			
			case"2":
			//This is for creating a new user
			System.out.println("Please enter username,first name, last name, password, usertype, and user id");
			Scanner nuser = new Scanner(System.in);
            String users_username  = nuser.next();
            String users_fname = nuser.next();
            String users_lname = nuser.next();
            String users_pword = nuser.next();
            int users_usertype_id= nuser.nextInt();
            int user_id= nuser.nextInt();
            
            Users a = new Users();
            a.setUsers_username(users_username);
            a.setUsers_fname(users_fname);
            a.setUsers_lname(users_lname);
            a.setUsers_pword(users_pword);
            a.setUsers_userType(users_usertype_id);
            a.setUser_id(user_id);
            udi.addCustomer(a);
            System.out.println("New user created sucessfully!");
            
            break;
			
			case "3":
			//This is for deleting users
			System.out.println("Please Enter username that you want to delete");
			Scanner j = new Scanner(System.in);
			String username = j.next();
			try {
				udi.delete(username);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("User has been successfully deleted");
			
			break;
			
			case"4":
			//This is for updating users
			System.out.println("Please enter username of user that you want to update");
			Scanner u= new Scanner(System.in);
			String us= u.next();
			System.out.println("Enter 1 to change username\n Enter 2 to change password\n Enter 3 to change First Name\n Enter 4 to change Last Name:");
			int use=u.nextInt();
			
			if (use==1)	{
				System.out.println("Enter new username: ");
				String usern = u.next();
				try {
					udi.updateUsername(usern,us);
					System.out.println("Username succesfully updated!");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}else if (use==2)	{
				System.out.println("Enter new password: ");
				String passw = u.next();
				try {
					udi.updatePassword(passw,us);
					System.out.println("Password successfully updated!");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				}else if (use==3)	{
					System.out.println("Enter new First Name: ");
					String fname = u.next();
					try {
						udi.updateFirstName(fname,us);
						System.out.println("First Name successfully updated!");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(use==4)	{
					System.out.println("Enter new Last Name: ");
					String lname = u.next();
					try {
						udi.updateLastName(lname,us);
						System.out.println("Last Name successfully updated!");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
					
				}
			
					break;
					case"5":
						//This is for deleting accounts
						System.out.println("Please Enter account username that you want to delete");
						Scanner y = new Scanner(System.in);
						String username2 = y.next();
						try {
							udi.deleteaccounts(username2);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Account has been successfully deleted");
						
						break;
						case"6":
							
					System.out.println("You have successfully logged out!");
            
 
		}
	}
}


