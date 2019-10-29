package com.revature.driver;

import java.sql.SQLException;
import java.util.Scanner;



public class Driver {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws SQLException {
		
/*
		 *if Admin:
		 *u- update user info
		 *d- delete user
		 */
		
		Switch s = new Switch();
		s.input();
		
	}
}
