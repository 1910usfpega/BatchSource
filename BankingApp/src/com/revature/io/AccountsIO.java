package com.revature.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Account;

public class AccountsIO {
	private static final String ioFile="accounts.txt";
	public static List<Account> accountList = new ArrayList<Account>();
	
	public static void writeToFile() {
		try (ObjectOutputStream objectOut = new ObjectOutputStream(
				new FileOutputStream(ioFile));){
			objectOut.writeObject(accountList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static void readUserFile() {
		try (ObjectInputStream objectIn = new ObjectInputStream(
				new FileInputStream(ioFile));) {
			
			accountList = (ArrayList<Account>) objectIn.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
