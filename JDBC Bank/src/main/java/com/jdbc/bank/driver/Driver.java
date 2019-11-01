package com.jdbc.bank.driver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.bean.User;
import com.jdbc.bank.controller.Menu;
import com.jdbc.bank.daoimple.AccountDoaImple;
import com.jdbc.bank.exception.OverDraftException;

public class Driver {

	public static void main(String[] args) throws SQLException {
		Menu session = new Menu();
		session.initialMenu();		
	}
}
		
		

		

