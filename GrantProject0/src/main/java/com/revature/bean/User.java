package com.revature.bean;

import java.util.HashMap;

public abstract class User {
		private String userName;
		private String fName;
		private String lName;
		
		static HashMap<String,String> logIn = new HashMap<>();
		
		
		
		
		
		public static boolean logIn (String userName,String passWord) {
			String temp = logIn.get(userName);
			if(temp.equals(passWord)) {
				return true;
			}
			return false;
		}
		
		public static boolean userNameCheck(String userName) {
				if(logIn.containsKey(userName)) {
					return true;
				}
				return false;
			}
		
		
		
		
		
		public User(String userName, String fName, String lName,String passWord) {
			super();
			this.userName = userName;
			this.fName = fName;
			this.lName = lName;
			logIn.put(userName, passWord);
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
		}
		@Override
		public String toString() {
			return "User [userName=" + userName + ", fName=" + fName + ", lName=" + lName + "]";
		}
		
}
