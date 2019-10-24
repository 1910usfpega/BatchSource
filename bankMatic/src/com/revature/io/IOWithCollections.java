package com.revature.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.User;

public class IOWithCollections {
	private static final String userFile="users.txt";
	public static List<User> usersList = new ArrayList<User>();
	
	public static void writeUserFile() {
		try (ObjectOutputStream objectOut = new ObjectOutputStream(
				new FileOutputStream(userFile));){
			
			objectOut.writeObject(usersList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static void readUserFile() {
		try (ObjectInputStream objectIn = new ObjectInputStream(
				new FileInputStream(userFile));) {
			
			usersList = (ArrayList<User>) objectIn.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
