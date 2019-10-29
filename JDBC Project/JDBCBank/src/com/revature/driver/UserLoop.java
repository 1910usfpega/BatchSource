package com.revature.driver;

import java.util.Scanner;

import com.revature.bean.Users;
import com.revature.daoimpl.JDBCDaoImpl;

public class UserLoop {
//	public static List<Users> userList = new ArrayList<Users>();
//	private static final String inFile = "Baby.txt";
//
//	public static Users Search(String username) {
//		for (Users users : userList) {
//			if (users.getUsername().equals(username)) {
//				return users;
//			}
//		}
//		return null;
//
//	}

//	public static List<Users> readUserFile() {
//
//		try (ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(inFile));) {
//
//			userList = (ArrayList<Users>) objectIn.readObject();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		for (Users i : userList) {
//			System.out.println(i.toString());
//		}
//		return userList;



	/*
	 * public static void writeUserFile() { ObjectOutputStream objectOut;
	 * 
	 * try { objectOut = new ObjectOutputStream(new FileOutputStream(inFile, true));
	 * objectOut.writeObject(userList);
	 * 
	 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
	 * e) { e.printStackTrace(); }
	 */

	// }

//	public static void customerinfo() {
//		Users e = new Users();
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter First name");
//		e.setFirstName(in.next());
//		System.out.println("Please enter Last name");
//		e.setLastName(in.next());
//		System.out.println("Please enter User Type");
//		e.setUserType(in.next());
//		System.out.println("Please enter Address");
//		e.setAddress(in.next());
//
//		userList.add(e);
//
//	}

	public static boolean newuserlogin() {

		System.out.println("Welcome New Customer!");
		System.out.println("Please Choose a Username:");
		Scanner in = new Scanner(System.in);
		String username = in.next();
		String password = null;
		while (password == null) {
			System.out.println("Please Choose a Password:");
			String password1 = in.next();
			System.out.println("Please retype your password");
			String password2 = in.next();

			if (password1.equals(password2)) {
				password = password1;
			} else {
				System.out.println("Passwords do not match, Please try again");
				return false;
			}

		}
		Users u = new Users();
		u.setUsername(username);
		u.setPassword(password);
		JDBCDaoImpl jdi2 = new JDBCDaoImpl();
			jdi2.uploadNewUser(u);	
		System.out.println("You have successfully created your log in!");
		return true;
	}

}
