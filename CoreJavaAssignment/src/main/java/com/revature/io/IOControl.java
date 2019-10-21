package com.revature.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.revature.bean.Person;

public class IOControl {
	
	private static final String dataFile="Data.txt";
	public static List<Person> personList= new ArrayList<Person>();
	
	
	public static void writePersonFile() {
	try (ObjectOutputStream  objectOut = new ObjectOutputStream(new FileOutputStream(dataFile));){
		
		objectOut.writeObject(personList);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
	@SuppressWarnings("unchecked")
	public void readPersonFile() {
		 
		try (ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(dataFile));){
			
			personList= (ArrayList<Person>)objectIn.readObject();
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

}
