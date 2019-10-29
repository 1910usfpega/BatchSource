package main.java.bean;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 3787308024279877929L;
	
	//private fields
		private String user;
		private String pw;
		private String name;
		private int aType;
		//Constructors
		public User(String user, String pw, String name, int aType) {

			this.user = user;
			this.pw = pw;
			this.name = name;
			this.aType = aType;
		}
		
		//No-arg Constructor (Default Constructor)
		public User() {
			//super(); implicitly there
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAType() {
			return aType;
		}

		public void setAType(int aType) {
			this.aType = aType;
		}

		@Override
		public String toString() {
			return "Customer [Username = " + user + ", Password = " + pw + ", Name = " + name + ", Account Type = " + aType + "]";
		}
		
		
	}
