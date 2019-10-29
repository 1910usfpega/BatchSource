package main.java.users;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*  
 * NOTE: File is saved at root of project directory
 */
import java.util.Scanner;

import main.java.bean.User;
import main.java.implementations.UserDaoImpl;

public class UserAccountManager {
	//Write users to file
	public static void CreateUser(String username, String Password, int accountType) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Users.txt", true));//File handler
			writer.append("Username: "+username+" Password: "+Password+" $"+accountType+"\n");//appends user to file
			writer.close();//Saves file changes
		} catch (IOException e) {//Handles exception if file cannot be found, or read/written to.
			e.printStackTrace();
		}
	}
	//Read from file to validate users
	public static boolean isAccountValid(String username, String Password){
		boolean foundUser = false;
		UserDaoImpl dao = new UserDaoImpl();
		try {
			List<User> userList = dao.getAllUsers();
			for (int i = 0; i < userList.size(); i++) {
				if(userList.get(i).getUser().equals(username) && userList.get(i).getPw().equals(Password)) {
						foundUser = true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return foundUser;
	}
	//Verify username ONLY
	public static boolean isAccountValid(String username){
		boolean foundUser = false;
		UserDaoImpl dao = new UserDaoImpl();
		try {
			List<User> userList = dao.getAllUsers();
			for (User user : userList) {
				if(user.getUser() == username) {
					foundUser = true;
				} else {
					foundUser = false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return foundUser;
	}
	public static int getAccountType(String username) {
		UserDaoImpl dao = new UserDaoImpl();
		try {
			List<User> userList = dao.getAllUsers();
			for (User user : userList) {
				if(user.getUser().equals(username)) {
					if(user.getAType() == 1) {
						return 1;
					}
					if(user.getAType() == 2) {
						return 2;
					}
					if(user.getAType() == 3) {
						return 3;
					} else {
						return 0;
					}
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return 0;//Return nothing - Will never execute
	}
	public static boolean usernameAvailability(String user){
		UserDaoImpl dao = new UserDaoImpl();
		try {
			List<User> userList = dao.getAllUsers();
			for (User users : userList) {
				if(users.getUser() == user) {
					return false;
				} else {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
