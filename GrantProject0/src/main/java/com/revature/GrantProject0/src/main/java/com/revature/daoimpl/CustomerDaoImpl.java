package com.revature.daoimpl;

import java.sql.*;
import java.util.*;
import com.revature.bean.Customer;
import com.revature.dao.CustomerDao;
import com.revature.utills.BankConnection;

public class CustomerDaoImpl implements CustomerDao {
	public static BankConnection cf= BankConnection.getInstance();
	static CustomerDaoImpl a= new CustomerDaoImpl();
	
public boolean login(String username, String password) {
	Connection conn= cf.getConnection();
	String sql="select * from \"customer_table\" where \"user_name\" = ? and passWord = ?";
	PreparedStatement ps;
	try {
		ps = conn.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2,password);
		ResultSet rs= ps.executeQuery();
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			return true;
		}
		if(a == null) {
			return false;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return false;
}
	@Override
	public String viewUser(String Username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="select * from \"customer_table\" where \"user_name\" = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,Username);
		ResultSet rs= ps.executeQuery();
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		return "name: "+a.getfName()+" "+a.getlName()+" Their username is: "+ a.getUserName();
	}

	@Override
	public void deleteBankAccount(int accountNumber, String Username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="delete form \"owners\" where \"user_name\" = ? and "
				+ "account_number = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,Username);
		ps.setInt(1,accountNumber);
	    ps.executeQuery();
	}

	@Override
	public void updateUserPassword(String password, String Username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="update \"customer_table\" set pass = ? where \"user_name\" = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,password);
		ps.setString(1,Username);
		ps.executeQuery();
	}
	
	public ArrayList<Customer> getCustomers() throws SQLException {
		ArrayList<Customer> CustomerList= new ArrayList<Customer>();
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from \"customer_table\"");
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			CustomerList.add(a);
		}
		return CustomerList;
	}

	public String getCustomerbyUsername(String username) throws SQLException {
		Customer Customer= null;
		Connection conn= cf.getConnection();
		String sql="select * from \"customer_table\" where \"user_name\" = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,username);
		ResultSet rs= ps.executeQuery();
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			
		}
		return Customer;
	}

	public String getCustomerName(String Username) throws SQLException {  // get full name
		Customer Customer= null;
		Connection conn= cf.getConnection();
		String sql="select * from \"customer_table\" where \"user_name\" = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,Username);
		ResultSet rs= ps.executeQuery();
		// fix
		
	return Customer.getfName() + " "+ Customer.getlName();
		
	}

	@Override
		public void updateUserFname(String name, String Username) throws SQLException { // check username if has been used
			Connection conn= cf.getConnection();
			String sql="update \"customer_table\" set first_name = ? where \"user_name\" = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,Username);
			ps.executeQuery();		
	}

	@Override
	public void updateUserLname(String name, String Username) throws SQLException {
			Connection conn= cf.getConnection();
			String sql="update \"customer_table\" set last_name = ? where \"user_name\" = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,Username);
			ResultSet rs= ps.executeQuery();
	}

	public boolean createUsers(String name, String last, String username, String password) throws SQLException {
		Connection conn= cf.getConnection();
		if(a.checkusername(a.getCustomers(),username)) {
		String sql="insert into \"customer_table\"(first_name,last_name,user_name, user_password) "
				+ "Values(?,?,?,?)";
		if(a.checkusername(a.getCustomers(), username)) {
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,name);
		ps.setString(2,last);
		ps.setString(3,username);
		ps.setString(4,password);
		ps.execute();
		Customer asd = new Customer(name,last,username,password);
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
}
