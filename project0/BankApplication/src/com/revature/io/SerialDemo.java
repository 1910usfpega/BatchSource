package com.revature.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream; 

import java.util.Scanner;

import com.revature.account.Account;

public class SerialDemo {
	
	private static final String accountFile= "account.txt";

	
	//public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	SerialDemo demo = new SerialDemo();
	Account customer = new Account("Romann", "Ibba", 5555, "Zeus", 1000);
	demo.WriteObjectToFile(accountFile, customer);
	
	Account p1 = (Account) demo.ReadObjectFromFile(accountFile);
	System.out.println(p1);
	}
	
	public void WriteObjectToFile(String accountFile, Object serObj) {
		try {
			 
            FileOutputStream fileOut = new FileOutputStream(accountFile, true);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
 
    public Object ReadObjectFromFile(String filepath) {
 
        try {
 
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            Object obj = objectIn.readObject();
 
            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;
 
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
	
//	Account p1 = new Account("Roman","Ibba", 5555, "Zeus", 1000);
//	Account p2 = new Account("Steven", "Mc", 2020, "Oden", 1000);
//	IOWithCollections.accountList.add(p1);
//	IOWithCollections.accountList.add(p2);
//	IOWithCollections.writePersonFile();
	//IO io = new IO();
	/* if output.txt does not exist, it will create it!
	 * if doesn't exist, run it, and the refresh the 
	 * project explorer to see it
	 */
	
	//adds text to output.txt file
	//System.out.println("What would you like to write?");
	//String s = sc.nextLine();
	//io.writeOutputStreamContents(s);
	
	//System.out.println(io.readInputStreamContents());
	
	
	
//	IOWithCollections.readPersonFile(); 
//	System.out.println(IOWithCollections.accountList.toString());
//	
	
//	}
//
//}
