package com.revature.driver;
//package com.revature.driver;
//import java.util.Scanner;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import com.revature.beans.Admin;
//import com.revature.beans.Customer;
//import com.revature.beans.Employee;
//
//import com.revature.beans.Users;
//
//
//public class IOUser {
//	public static List<Users> userList = new ArrayList <Users>();
//	private static final String inFile= "Baby.txt";
//	

//public static List<Users>  readUserFile() {
//        
//        try(ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(inFile));) {
//            
//            userList = (ArrayList<User>)objectIn.readObject();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        for (User i:userList) {
//        	System.out.println(i.toString());
//        }
//		return Users;
        
    
  //  }
//public static void writeUserFile() {
//    ObjectOutputStream objectOut;
//   
//    try {objectOut = new ObjectOutputStream(new FileOutputStream(inFile, true));
//        objectOut.writeObject(userList);
//
//    } catch (FileNotFoundException e) {
//        e.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//
//}	
//	public static void customerinfo() {
//		Users e= new Users(); 
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter First name");
//		e.setUsers_fname(in.next());
//		System.out.println("Please enter Last name");
//		e.setUsers_lname(in.next());
//		System.out.println("Please Choose a Username:");
//		e.setUsers_username(in.next());
//		System.out.println("Please Choose a Password:");
//		e.setUsers_pword(in.next());
//		System.out.println("Please retype your password");
//		userList.add(e);
//		String password1 = in.next();
//		String password2 = in.next();
//		if (password1.equals(password2)) {
//			password2=password1;
//		}else {
//			System.out.println("Passwords do not match, Please try again");
//			
//		}
//		System.out.println("You have successfully created your log in!" );
//	}
//}
	


		
		
		
//	}
//	public static void newuserlogin() {
//		
//		
//		
//		System.out.println("Welcome New Customer!");
//		System.out.println("Please Choose a Username:");
//		Scanner in= new Scanner(System.in);
//		String username = in.next();
//		String password = null;
//		while (password == null){
//			System.out.println("Please Choose a Password:");
//			String password1 = in.next();
//			System.out.println("Please retype your password");
//			String password2 = in.next();
//			
//			if (password1.equals(password2)) {
//				password=password1;
//			}else {
//				System.out.println("Passwords do not match, Please try again");
//				
//			}
//			
//		}
//		System.out.println("You have successfully created your log in!" );
//		
//		
//	}
//
//
//		
//}
//
//
//
//
//
//
//
