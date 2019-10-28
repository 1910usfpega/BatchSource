package com.revature.bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.revature.daoimpl.CustomerDaoImpl;

public abstract class User {
		private String userName;
		private String fName;
		private String lName;
		static CustomerDaoImpl a= new CustomerDaoImpl();
		
		static HashMap<String,String> logIn = new HashMap<>();
		public static boolean logIn (String userName,String passWord) {
			try {
				if(a.login(userName, passWord)) {
					return true;
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return false;
		}
		
		public boolean userNameCheck(String userName) {
				try {
					if(a.checkusername(a.getCustomers(), userName)) {
						return true;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return false;
			}
		public boolean createNewUser(String userName, String fName, String lName,String passWord, boolean Employee) throws SQLException {
			if(this.userNameCheck(userName)) {
				if(Employee) {
					a.createUsers(fName,lName,userName,passWord);	
				Employee aa = new Employee(fName,lName,userName,passWord);	
				return true;
				}
				else {
					Customer aa = new Customer(fName,lName,userName,passWord);	
					return true;
				}
			}
			return false;
			
		}
		
		protected User(String userName, String fName, String lName,String passWord) {
			super();
			this.userName = userName;
			this.fName = fName;
			this.lName = lName;
			
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
