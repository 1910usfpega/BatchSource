package com.revature.users;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserAccountManager {
	public static void CreateUser(String fullName, String Password) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Users.csv", true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
