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
	public static void CreateUser(String username, String Password) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Users.txt", true));//File handler
			writer.append("Username: "+username+" Password: "+Password+"\n");//appends user to file
			writer.close();//Saves file changes
		} catch (IOException e) {//Handles exception if file cannot be found, or read/written to.
			e.printStackTrace();
		}
	}
	//Read from file to validate users
	public static boolean isAccountValid(String username, String Password) throws Exception{
		boolean foundUser = false;
		try {
			java.util.Scanner scanner = new java.util.Scanner(new FileReader("Users.txt"));
			//This loop check each line of the file for the corresponding user.
			do {
				if (scanner.next().contains(username) && scanner.next().contains(Password)) {
					foundUser = true;
					return true;
				}else {
					throw new Exception("User not found");//Throw exception if user not found.
				}
			} while (scanner.hasNext());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return foundUser;
	}
}
