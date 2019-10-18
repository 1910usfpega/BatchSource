package com.project.users;

import java.util.HashMap;

public abstract class Person {
	
	HashMap<String, String> cInfo = new HashMap<String,String>();
	
	public abstract double viewAccount();
	
	public boolean login(String user, String pw) {
		String temp = cInfo.get(user);
		if(temp == pw)
			return true;
		else
			return false;
	}
}
