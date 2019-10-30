package com.bank.driver;

import java.sql.SQLException;

import com.bank.daoimpl.UsersDaoImpl;
import com.bank.login.Login;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsersDaoImpl getUsersList = new UsersDaoImpl();
		try {
			getUsersList.getAllUsers();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		Login.getLoginFromSC();

	}

}
