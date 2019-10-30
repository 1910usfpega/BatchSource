package com.revature.menuinterface;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bean.UserInfo;
import com.revature.daoimpl.RemoveDaoImpl;
import com.revature.daoimpl.UpdateDaoImpl;
import com.revature.daoimpl.ViewDaoImpl;

public class AdminMenu {
	
	public void runAdminMenu(UserInfo ui, Scanner sc) {
		String input = "";
		
		
		while (input != "LOGOUT") {
			
			LogIn.clearScreen();
			
			System.out.println("||WELCOME ADMIN : "+ ui.getFirstName() );
			System.out.println("||*****************************************||");
			System.out.println("||     Please enter a menu option:         ||");
			System.out.println("||=================***=====================||");
			System.out.println("|| Press 1 - View All Users                ||");
			System.out.println("|| Press 2 - Create User                   ||");
			System.out.println("|| Press 3 - Update User                   ||");
			System.out.println("|| Press 4 - Delete User                   ||");
			System.out.println("|| Press 5 - Log Off                       ||");
			System.out.println("||*****************************************||");

			input = sc.nextLine();

			switch (input) {
			case "1":
				viewAll();
				break;
			case "2":
				createUser(sc);
				break;
			case "3":
				deleteUser(ui, sc);
				break;
			case "4":
				deleteUser(ui,sc);
				break;
			case "5":
				System.out.println("GoodBYE.");
				input = "LOGOUT";
				break;
			default:
				System.out.println("!!!!! INVALID INPUT !!!!!");
				System.out.println("(:--PLease Try Again--:)");
			}
		}
	}
	
	
	public void viewAll() {
		
		List<UserInfo> uiList = new ArrayList<UserInfo>();
		//UserInfo u = new UserInfo();
		
		ViewDaoImpl viewI = new ViewDaoImpl();
		
		
		try {
			
			uiList = viewI.getAllUserInfo();
		} catch (SQLException e) {

			System.out.println("failed to get list of current user info");
			e.printStackTrace();
		}
		
		System.out.println("(:--List of Users--:)");
		
		for(UserInfo u: uiList) {
			System.out.println("====================================");
			System.out.println(" User id: " + u.getUser_ID());
			System.out.println(" User Type: " + u.getUser_Typ());
			System.out.println(" User First Name: " + u.getFirstName());
			System.out.println(" User Last Name: " + u.getLastName());
			System.out.println(" User email: " + u.getEmail());
			System.out.println(" User Address: " + u.getAddressln());
			System.out.println(" User city: " + u.getCity());
			System.out.println(" User state: "+ u.getState()) ;
			System.out.println(" User zip: " + u.getZip());
			System.out.println(" User Contact #: " + u.getContact_num());
			System.out.println("====================================");
			
			System.out.println(" ");
		}
	}
	
	
	public void createUser(Scanner sc) {
		Registration r = new Registration();
		r.register(sc);
	}
	
	public void updateUser(UserInfo ui, Scanner sc) {
		String input = "";
		String r1, r2;
		UpdateDaoImpl up = new UpdateDaoImpl();
		
		while (input != "BACK") {
			
			LogIn.clearScreen();
			
			System.out.println("||WELCOME ADMIN : "+ ui.getFirstName() );
			System.out.println("||*****************************************||");
			System.out.println("||     Please enter a menu option:         ||");
			System.out.println("||=================***=====================||");
			System.out.println("|| Press 1 - Delete All User               ||");
			System.out.println("|| Press 2 - Delete 1 user                 ||");
			System.out.println("||*****************************************||");

			input = sc.nextLine();

			switch (input) {
			case "1":
				System.out.println("Enter New first name: ");
				r1 = sc.nextLine();
				System.out.println("Enter user ID: ");
				r2 = sc.nextLine();
				try {
					up.UpdateRec("JDBC_Bank.User_Info", "FirstName", r1, "user_id", r2);  
				} catch (SQLException e) {
					System.out.println("Records was NOT updated");
					e.printStackTrace();
				}
				input = "BACK";
				break;
			case "2":
				System.out.println("Enter New last name: ");
				r1 = sc.nextLine();
				System.out.println("Enter user ID: ");
				r2 = sc.nextLine();
				try {
					up.UpdateRec("JDBC_Bank.User_Info", "LastName", r1, "user_id", r2);  
				} catch (SQLException e) {
					System.out.println("Record was NOT updated");
					e.printStackTrace();
				}
				input = "BACK";
				break;
			case "3":
				System.out.println("Enter New user type: ");
				r1 = sc.nextLine();
				System.out.println("Enter user ID: ");
				r2 = sc.nextLine();
				try {
					up.UpdateRec("JDBC_Bank.User_Info", "User_Typ", r1, "user_id", r2);  
				} catch (SQLException e) {
					System.out.println("Record was NOT updated");
					e.printStackTrace();
				}
				input = "BACK";
				break;
			default:
				System.out.println("!!!!! INVALID INPUT !!!!!");
				System.out.println("(:--PLease Try Again--:)");
			}
		}
		
	}
	
	public void deleteUser(UserInfo ui, Scanner sc) {
		String input = "";
		RemoveDaoImpl r = new RemoveDaoImpl();
		
		while (input != "BACK") {
			
			LogIn.clearScreen();
			
			System.out.println("||WELCOME ADMIN : "+ ui.getFirstName() );
			System.out.println("||*****************************************||");
			System.out.println("||     Please enter a menu option:         ||");
			System.out.println("||=================***=====================||");
			System.out.println("|| Press 1 - Update User first name        ||");
			System.out.println("|| Press 2 - Update User last name         ||");
			System.out.println("|| Press 2 - Update User type              ||");
			System.out.println("||*****************************************||");

			input = sc.nextLine();

			switch (input) {
			case "1":
				try {
					r.removeRecAll("JDBC_Bank.User_Info");
				} catch (SQLException e) {
					System.out.println("Records was NOT deleted");
					e.printStackTrace();
				}
				input = "BACK";
				break;
			case "2":
				System.out.println("to DELETE user please enter the user ID:");
				input = sc.nextLine();
				try {
					r.removeRec("jdbc_bank.user_info", "user_id", input);
				} catch (SQLException e) {
					System.out.println("Record was NOT deleted");
					e.printStackTrace();
				}
				input = "BACK";
				break;
			default:
				System.out.println("!!!!! INVALID INPUT !!!!!");
				System.out.println("(:--PLease Try Again--:)");
			}
		}
	}
	

}
