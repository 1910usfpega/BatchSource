package com.revature.driver;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bean.Admin;
import com.revature.bean.Customer;
import com.revature.bean.Employee;

import com.revature.bean.User;

public class IOUser {
	public static List<User> userList = new ArrayList <User>();
	private static final String inFile= "Baby.txt";
	

public static List<User>  readUserFile() {
        
        try(ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(inFile));) {
            
            userList = (ArrayList<User>)objectIn.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (User i:userList) {
        	System.out.println(i.toString());
        }
		return userList;
        
    
    }
public static void writeUserFile() {
    ObjectOutputStream objectOut;
   
    try {objectOut = new ObjectOutputStream(new FileOutputStream(inFile, true));
        objectOut.writeObject(userList);

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

}	
	public static void customerinfo() {
		User e= new User(); 
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter First name");
		e.setFirstName(in.next());
		System.out.println("Please enter Last name");
		e.setLastName(in.next());
		System.out.println("Please enter User Type");
		e.setUserType(in.next());
		System.out.println("Please enter Address");
		e.setAddress(in.next());
		
		userList.add(e);
		
	}
	public static void newuserlogin() {
		
		
		
		System.out.println("Welcome New Customer!");
		System.out.println("Please Choose a Username:");
		Scanner in= new Scanner(System.in);
		String username = in.next();
		String password = null;
		while (password == null){
			System.out.println("Please Choose a Password:");
			String password1 = in.next();
			System.out.println("Please retype your password");
			String password2 = in.next();
			
			if (password1.equals(password2)) {
				password=password1;
			}else {
				System.out.println("Passwords do not match, Please try again");
				
			}
			
		}
		System.out.println("You have successfully created your log in!" );
		
		
	}


		
}







