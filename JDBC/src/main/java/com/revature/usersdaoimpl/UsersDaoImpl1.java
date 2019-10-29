package com.revature.usersdaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.accountsdaoimpl.AccountsDaoImpl;
import com.revature.beans.CustomerMenu;
import com.revature.beans.Users;
import com.revature.userdao.UsersDao1;
import com.revature.util.ConnFactory;

public class UsersDaoImpl1 implements UsersDao1 {
	public static ConnFactory cf = ConnFactory.getInstance();

	public List<Users> getUsersByusers_username(String users_username) throws SQLException {
		List<Users> usersList = new ArrayList<Users>();

		Connection conn = cf.getConnection();
		String sql = "select * from Users where Users_username=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, users_username);
		ResultSet rs = ps.executeQuery();
		Users a = null;
		while (rs.next()) {
			a = new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),rs.getInt(6));
			usersList.add(a);
		}
		return usersList;
	}

	public static void customerlogin(Scanner in) {
		Connection conn = cf.getConnection();
		System.out.println("Hello Valued Customer!");
		String user, pass;
		System.out.println("Enter your username:");
		user = in.next();
		System.out.println("Enter your password:");
		pass = in.next();

		String sql = "select * from Users where Users_username=?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (pass.equals(rs.getString(4))) {
					System.out.println("You have successfully logged in");

					AccountsDaoImpl adi = new AccountsDaoImpl();
					ArrayList accounts = adi.getAccounts(user);
					System.out.println(accounts.toString());
					CustomerMenu.customermenu(in, user);

				} else {
					System.out.println("Failed to Log in");

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addCustomer(Users a) {
		Connection conn = cf.getConnection();
		String str = "insert into users values (?,?,?,?,?,nextval('usersseq'))";
		try {
			PreparedStatement ps = conn.prepareStatement(str);
			ps.setString(1, a.getUsers_username());
			ps.setString(2, a.getUsers_fname());
			ps.setString(3, a.getUsers_lname());
			ps.setString(4, a.getUsers_pword());
			ps.setInt(5, 1);
			ps.execute();
			ps = conn.prepareStatement("commit");
			ps.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Users> getAllUsers() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	public List<Users> getUsers() throws SQLException {
		List<Users> usersList = new ArrayList<Users>();

		Connection conn = cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from \"users\"");
		Users a = null;
		while (rs.next()) {
			a = new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),rs.getInt(6));
			usersList.add(a);
		}
		return usersList;
	}
	public void delete(String username) throws SQLException {
        Connection conn = cf.getConnection();

        String sql = "Delete from users where users_username=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, username);
        ps.executeUpdate();
    }

	public void deleteaccounts(String username) throws SQLException {
        Connection conn = cf.getConnection();

        String sql = "Delete from accounts where accounts_username=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, username);
        ps.executeUpdate();
    }

	public void updateUsername(String username, String oldusername) throws SQLException{
		Connection conn = cf.getConnection();
		
		String sql = "Update users set users_username=? where users_username=?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, oldusername);
		ps.executeUpdate();
		
	}
	public void updatePassword(String password, String oldpassword) throws SQLException{
		Connection conn = cf.getConnection();
		
		String sql = "Update users set users_pword=? where users_username=?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, password);
		ps.setString(2, oldpassword);
		ps.executeUpdate();
	}
	public void updateFirstName(String FirstName, String oldFirstName) throws SQLException{
		Connection conn = cf.getConnection();
		
		String sql = "Update users set users_fname=? where users_username=?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, FirstName);
		ps.setString(2, oldFirstName);
		ps.executeUpdate();
	}
	public void updateLastName(String LastName, String oldLastName) throws SQLException{
		Connection conn = cf.getConnection();
		
		String sql = "Update users set users_lname=? where users_username=?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, LastName);
		ps.setString(2, oldLastName);
		ps.executeUpdate();
	}
}
