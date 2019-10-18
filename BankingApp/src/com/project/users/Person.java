package com.project.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Person {
	
	static HashMap<String, String> cInfo = new HashMap<String,String>();
	
	public abstract double viewAccount(bankAccount a);
	
	public static boolean login(String user, String pw) {
		String temp = cInfo.get(user);
		if(temp == pw)
			return true;
		else
			return false;
	}
	
	public static boolean userCheck(String user) {
		if(cInfo.containsKey(user) == true)
			return true;
		else
			return false;
	}
	
}
