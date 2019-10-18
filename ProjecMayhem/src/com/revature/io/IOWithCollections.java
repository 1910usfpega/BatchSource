package com.revature.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Person;

public class IOWithCollections {
	private static final String personFile="person.txt";
	public static List<Person> personList = new ArrayList<Person>();
	
	public static void writePersonFile() {
		try (ObjectOutputStream objectOut = new ObjectOutputStream(
				new FileOutputStream(personFile));){
			
			objectOut.writeObject(personList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static void readPersonFile() {
		try (ObjectInputStream objectIn = new ObjectInputStream(
				new FileInputStream(personFile));) {
			
			personList = (ArrayList<Person>) objectIn.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
