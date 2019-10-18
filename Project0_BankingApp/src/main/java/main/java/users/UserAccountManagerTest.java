package main.java.users;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import main.java.bean.User;

public class UserAccountManagerTest {
	
	private static final String userFile = "Users.txt";
	public static List<User> userList = new ArrayList<User>();
	
	//Write users to file
	public static void writeUserFile() {
		try(ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(userFile));){
			objectOut.writeObject(userList);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Read users from file
	public static void readUserFile() {
		try(ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(userFile));){
			userList = (ArrayList<User>) objectIn.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Read from file to validate users
	public static boolean isAccountValid(String user, String pw){
		readUserFile();
		//System.out.println(userList.get(0).getUser() + " !!!");
		//System.out.println("");
		//System.out.println(userList.get(0).getPw() + " !!!");
		for(int i = 0; i < userList.size(); i++) {
			if(userList.get(i).getUser().equals(user)) {
				if(userList.get(i).getPw().equals(pw)) {
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
	public static boolean isAccountValid(String username){
		return username;
	}
	public static String getAccountType(String username) {
		return username;
	}
}
