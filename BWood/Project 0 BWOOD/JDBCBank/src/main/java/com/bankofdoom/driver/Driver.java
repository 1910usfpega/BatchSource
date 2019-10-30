package com.bankofdoom.driver;

import java.sql.SQLException;

import com.bankofdoom.bean.Account;
import com.bankofdoom.bean.User;
import com.bankofdoom.daoimpl.AccountDaoImpl;
import com.bankofdoom.daoimpl.UserDaoImpl;
import com.bankofdoom.display.MenuMethod;

public class Driver {
	

	
	public static void main(String[] args) {
		
		MenuMethod.displayLoginMenu();

	}
}
