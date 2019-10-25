package com.revature.users;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.User;
import com.revature.programstart.ProgramStart;

public class UserAccountManagerTest {
	
	private static final String userFile = "Users.txt";
	public static List<User> userList = new ArrayList<User>();
	
	//Write users to file
	public static void writeUserFile() {
		try(ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(userFile));){
			objectOut.writeObject(userList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	//Read users from file
	@SuppressWarnings("unchecked")
	public static void readUserFile() {
		try(ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(userFile));){
			userList = (ArrayList<User>) objectIn.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//Read from file to validate users
	public static boolean isAccountValid(String user, String pw){
		readUserFile();
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUser().equals(user)) {
				if(userList.get(i).getPw().equals(pw)) {
					ProgramStart.currentUser = userList.get(i).getName();
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
	//Verify username ONLY
	public static boolean usernameAvailability(String user){
		readUserFile();
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUser().equals(user)) {
				return false;
			}
		}
		return true;
	}
	public static int getAccountType(String user) {
		readUserFile();
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUser().equals(user)) {
				return userList.get(i).getAType();
			}
		}
		return 0;
	}
}
