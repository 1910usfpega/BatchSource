package com.revature.menuinterface;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bean.User;
import com.revature.bean.UserInfo;
import com.revature.daoimpl.ViewDaoImpl;

public class LogIn {
	
	
	public void logInto(Scanner sc)
	{
		List<User> uList = new ArrayList<User>();
		List<UserInfo> uiList = new ArrayList<UserInfo>();
		UserInfo ui = new UserInfo();
		AdminMenu am = new AdminMenu();
		UserMenu um = new UserMenu();
		
		
		ViewDaoImpl viewI = new ViewDaoImpl();
		
		boolean valid = false;
		
		try {
			uList = viewI.getAllUsers();
			uiList = viewI.getAllUserInfo();
		} catch (SQLException e) {

			System.out.println("failed to get list of current users and user info");
			e.printStackTrace();
		}
		
		String r1, r2;
		do{
			clearScreen();
			
			System.out.println("(Enter \"back\" to go back)");
			System.out.println("Please enter an email as username: ");
			r1 = sc.nextLine();
			System.out.println("Please enter an email as password: ");
			r2 = sc.nextLine();
			
			if ((r1.toLowerCase().equals("back"))||(r2.toLowerCase().equals("back"))) {
				return;
			} else {
				for(int i = 0; i < uList.size(); i++) {
					if((uList.get(i).getUsername().equals(r1)) && (uList.get(i).getPassword().equals(r2))) {
						for(int n = 0; n < uiList.size(); n++) {
							if(uList.get(i).getUsername().equals(uiList.get(n).getUser_Name()))
							{
								valid = true;
								ui = uiList.get(i);
								break;
							}
						}
						
					}
				}
			}	
				
		}while( valid == false);
		
		if(valid)
		{
			if(ui.getUser_Typ()==1)
			{
				clearScreen();
				am.runAdminMenu(ui, sc);
			}
			else {
				clearScreen();
				um.runUserMenu(ui, sc);
			}
		}
		
	}
	
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();
	    
	}

}
