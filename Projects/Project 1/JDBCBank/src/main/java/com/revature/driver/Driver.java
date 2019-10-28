package com.revature.driver;

import com.revature.daoimpl.LoginDaoImpl;

public class Driver {

	static LoginDaoImpl ldi = new LoginDaoImpl();
	
	public static void main(String[] args) {
		ldi.welcomeScreen();
	}

}
