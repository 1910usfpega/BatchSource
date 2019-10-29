package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.LoginDaoImpl;

public class Driver {

	static LoginDaoImpl ldi = new LoginDaoImpl();
	
	public static void main(String[] args) throws SQLException {
		ldi.welcomeScreen();
	}

}
