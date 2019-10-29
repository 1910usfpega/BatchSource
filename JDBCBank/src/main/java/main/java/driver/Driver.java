package main.java.driver;

import java.sql.SQLException;

import main.java.accounts.AccountManagement;
import main.java.bean.User;
import main.java.implementations.UserDaoImpl;
import main.java.programstart.ProgramStart;
import main.java.users.UserAccountManager;
import main.java.users.UserAccountManagerTest;

public class Driver {
	public static void main(String[] args) {
		UserDaoImpl dao = new UserDaoImpl();
		try {
			System.out.println(dao.getAllUsers());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ProgramStart.startProgram();
	}
}