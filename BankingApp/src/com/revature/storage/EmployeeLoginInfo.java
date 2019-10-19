package com.revature.storage;

import java.util.HashMap;
import java.util.Map;

public class EmployeeLoginInfo {
private static Map<String,String> stored = new HashMap<>();
	
	public static boolean newEmployee(String username, String password) {
		if(stored.containsKey(username)==false) {
			stored.put(username, password);
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean alreadyUsed(String username) {
		if (stored.containsKey(username)==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkEmployee(String username,String password) {

		System.out.println(username);
		
		if (stored.containsKey(username) && stored.get(username).equals(password)) {
			return true;
		}else {
			return false;
		}
		 
	}
	
	public static Map<String, String> getLoginInfo() {
		return stored;
	}

	public static void setLoginInfo(Map<String, String> stored) {
		EmployeeLoginInfo.stored = stored;
	}

}
