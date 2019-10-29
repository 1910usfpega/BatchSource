package com.revature.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.revature.bean.Customer;
import com.revature.bean.bankAccount;

import java.util.List;


import com.revature.*;
import com.revature.utils.ConnFactory;


public class Customerdaoimpl {
	static Customerdaoimpl a= new Customerdaoimpl();
	static BankDaoImpl b = new BankDaoImpl();
		public static ConnFactory cf= ConnFactory.getInstance();
		public List<Customer> getAllAlbums() throws SQLException {
			List<Customer> CustomerList= new ArrayList<Customer>();
			Connection conn= cf.getConnection();
			Statement stmt= conn.createStatement();
			ResultSet rs= stmt.executeQuery("select * from \"customer\"");
			Customer a=null;
			while(rs.next()) {
				a= new Customer(rs.getNString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				CustomerList.add(a);
			}
			return CustomerList;
		}
		public Customer getCustomerByName(String name) throws SQLException {
			List<Customer> CustomerList= new ArrayList<Customer>();
			Connection conn= cf.getConnection();
			String sql="select * from \"customer\" where \"fname\" = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs= ps.executeQuery();
			Customer a=null;
				a= new Customer(rs.getNString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				CustomerList.add(a);
			
			return a;
		}

	
public boolean login(String username, String password) throws SQLException {
	Connection conn= cf.getConnection();
	String sql="select * from customer_table where user_name = ? and user_password = ?";
	PreparedStatement ps;
	
		ps = conn.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2,password);
		ResultSet rs= null;
		try {
		 rs= ps.executeQuery();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 Customer a=null;
		
			while(rs.next()) {
				a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				return true;
		}
			return false;

}
	public String viewUser(String Username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="select * from customer where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,Username);
		ResultSet rs= ps.executeQuery();
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		return "name: "+a.getfName()+" "+a.getlName()+" Their username is: "+ a.getUserName();
	}

	public void deleteBankAccount(int accountNumber, String Username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="delete form owners where username = ? and "
				+ "account_number = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,Username);
		ps.setInt(1,accountNumber);
	    ps.executeQuery();
	}

	
	public void updateUserPassword(String password, String Username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="update customertable set pass = ? where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,password);
		ps.setString(1,Username);
		ps.executeQuery();
	}
	
	public ArrayList<Customer> getCustomers() throws SQLException {
		ArrayList<Customer> CustomerList= new ArrayList<Customer>();
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from customer");
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			CustomerList.add(a);
		}
		return CustomerList;
	}

	public Customer getCustomerbyUsername(String username) throws SQLException {
//		Customer customer= null;
		Connection conn= cf.getConnection();
		String sql="select * from customer where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,username);
		ResultSet rs= ps.executeQuery();
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			
		}
		return a;
	}

	public String getCustomerName(String Username) throws SQLException {  // get full name
		Customer Customer= null;
		Connection conn= cf.getConnection();
		String sql="select * from customer where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,Username);
		ResultSet rs= ps.executeQuery();
		// fix
		
	return Customer.getfName() + " "+ Customer.getlName();
		
	}

	
		public void updateUserFname(String name, String Username) throws SQLException { // check username if has been used
			Connection conn= cf.getConnection();
			String sql="update customer set first_name = ? where username = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,Username);
			ps.executeQuery();		
	}

	
	public void updateUserLname(String name, String Username) throws SQLException {
			Connection conn= cf.getConnection();
			String sql="update customer set lastname = ? where username = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,Username);
			ResultSet rs= ps.executeQuery();
	}
	public boolean createUsers(String name, String last, String username, String password) throws SQLException {
		Connection conn= cf.getConnection();
		if(a.checkusername(a.getCustomers(),username)) {
			String sql="insert into customer (fname,lname,username, pass) "
					+ "Values(?,?,?,?)";
			if(a.checkusername(a.getCustomers(), username)) {
				PreparedStatement ps= conn.prepareStatement(sql);
				ps.setString(1,name);
				ps.setString(2,last);
				ps.setString(3,username);
				ps.setString(4,password);
				try{ps.execute();}
				catch(Exception e) {
					return false;
				}
				return true;
			}
		}
		return false;
	
}
	public boolean checkusername(ArrayList <Customer> a, String b) {
		for(Customer aa: a) {
			if(aa.getUserName().equals(b)) {
				return false;
			}
		}
		return true;
	}
	public ArrayList<bankAccount> getAllUserBankAccounts(String username){
		return b.getAllAccounts(username);
		
	}
}


