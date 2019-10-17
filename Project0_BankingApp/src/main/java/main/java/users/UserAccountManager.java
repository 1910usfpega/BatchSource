package main.java.users;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*  
 * NOTE: File is saved at root of project directory
 */

public class UserAccountManager {
	//Write users to file
	public static void CreateUser(String username, String Password, int accountType) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Users.txt", true));//File handler
			writer.append("Username: "+username+" Password: "+Password+" $"+accountType+"\n");//appends user to file
			writer.close();//Saves file changes
		} catch (IOException e) {//Handles exception if file cannot be found, or read/written to.
			e.printStackTrace();
		}
	}
	//Read from file to validate users
	public static boolean isAccountValid(String username, String Password){
		boolean foundUser = false;
		try {
			java.util.Scanner scanner = new java.util.Scanner(new FileReader("Users.txt"));
			//This loop check each line of the file for the corresponding user.
			do {
				String line = scanner.nextLine();
				if (line.contains(username) && line.contains(Password)) {
					foundUser = true;
					return true;
				}else {
					foundUser = false;
					return false;
				}
			} while (scanner.hasNextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return foundUser;
	}
	//Verify username ONLY
	public static boolean isAccountValid(String username){
		boolean foundUser = false;
		try {
			java.util.Scanner scanner = new java.util.Scanner(new FileReader("Users.txt"));
			//This loop check each line of the file for the corresponding user.
			do {
				String line = scanner.nextLine();
				if (line.contains(username)) {
					foundUser = true;
					return true;
				}else {
					foundUser = false;
					return false;
				}
			} while (scanner.hasNextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return foundUser;
	}
	public static String getAccountType(String username) {
		try {
			java.util.Scanner scanner = new java.util.Scanner(new FileReader("Users.txt"));
			do {
				String line = scanner.nextLine();
				if (line.contains("$1")) {
					//Administrators
					return "Administrator";
				}
				if (line.contains("$2")) {
					//Users
					return "Customer";
				}
				if (line.contains("$3")) {
					//Bank Employers
					return "Employee";
				}else {
					return "Error, invalid account type.";
				}
			} while (scanner.hasNextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;//Return nothing - Will never execute
	}
}
