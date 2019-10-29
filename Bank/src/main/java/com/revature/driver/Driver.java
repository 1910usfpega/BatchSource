package com.revature.driver;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.doaimpl.BankDoaImpl;
import com.revature.doaimpl.LoginDaoImpl;
import com.revature.doaimpl.UserDoaImpl;


public class Driver {
	public static void main(String[] args) {
	LoginDaoImpl log = new LoginDaoImpl();
	log.start();
}
}
