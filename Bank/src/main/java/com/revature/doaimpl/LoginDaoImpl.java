package com.revature.doaimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.dao.LoginDao;
import com.revature.dao.UserDao;
import com.revature.util.ConnFactory;

public class LoginDaoImpl implements LoginDao{
	
	static UserDoaImpl cm = new UserDoaImpl();
	Scanner sc = new Scanner(System.in);
	public static ConnFactory cf = ConnFactory.getInstance();
	
	
	@Override
	public void start() {
		System.out.println(" -----------------------------------------");
		System.out.println("|    Welcome to Bird is the Word Bank!    |");
		System.out.println("|    Do you have an existing account?     |");
		System.out.println("|         Please input Y or N:            |");
		System.out.println(" ----------------------------------------- ");
		String s = sc.next();
		System.out.println();
		if(s.equalsIgnoreCase("y")){
		login();
	}
		else if(s.equalsIgnoreCase("n")) {
			try {
				createNewUser();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Your bird was not the word.\n");
			System.out.println("Please try again.");
			start();
		}
		
	}
	public void login() {
		String userName;
		String password;
		System.out.println("Welcome please enter Username: ");
		userName= sc.next();
		System.out.println("Please enter Password: ");
		password =sc.next();
		System.out.println();
		try {
			verifyLogin(userName, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	@Override
	public void verifyLogin(String userName, String password) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "select * from project.users where userName =?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, userName);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			if (rs.getString(2).equals(userName) && rs.getString(3).equals(password)) {
				System.out.println("Login verified! Hello " + userName);
				cm.mainMenu(rs.getString(2), rs.getInt(1));
				
			}
			else if(rs.getString(2) != (userName)) { 
			System.out.println("Login incorrect! please try again");
			login();
		}
		}
		
	}
	@Override
	public void createNewUser() throws SQLException {
		System.out.println(" No account? no problem!");
		System.out.println("Bird is the Word Bank will \n help you create a new account!");
		System.out.println("Please enter new username:");
		String userName = sc.next();
		
		if(userNameAvailable(userName)==false) {
			System.out.println("Username is taken. Please choose again");
			createNewUser();
			
		}
		
		String pass1,pass2,password;
		password=null;

		while(password==null) {
			System.out.println("Please enter a new password:");
			pass1=sc.next();
			System.out.println("Please re-enter the password:");
			pass2=sc.next();
			if(pass1.equals(pass2)) {
				password=pass1;
				
				
			}else {
				System.out.println("The passwords you entered do not match.\n"
						+"Please try again.");
				continue;
			}
	}
		
		System.out.println("Please enter name:");
		String name =sc.next();
		
			Connection conn = cf.getConnection();
			String sql = "insert into project.users values(nextval(\'newuserseq\'),?,?,?,1)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.executeUpdate();
			createNewAccount();
		
			System.out.println("New User/Account created...\n ");
			System.out.println("Please log in if you would like to perform a transaction");
			start();
	}
	@Override
	public boolean userNameAvailable(String userName) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "select * from project.users where userName =?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,  userName);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			return false;
		}
			return true;
	}
	@Override
	public void createNewAccount() {
		
		Connection conn = cf.getConnection();
		String sql1 = "insert into project.accounts values(nextval(accountseq),true, true, 0.0,0.0)";
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement(sql1);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}
		
	
	

}
