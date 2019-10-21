package com.revature.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.account.Account;

public class IOWithCollections {
	private static final String accountFile= "account.txt";
	public static List<Account> accountList = new ArrayList<Account>();
	//objectOut.writeObject(personList);
	//public static void readPersonFile() {
	//ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(personFile)); 
	public static void writePersonFile() {
		try(ObjectOutputStream objectOut = new  ObjectOutputStream(new FileOutputStream(accountFile));){
			
			objectOut.writeObject(accountList);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void readPersonFile() {
		try(ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(accountFile));){
			accountList = (ArrayList<Account>)objectIn.readObject(); 
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
		
}


