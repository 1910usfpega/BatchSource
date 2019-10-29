package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.CustomerBean;
import com.revature.util.ConnFactory;
import com.revature.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao {
	public static ConnFactory cf = ConnFactory.getInstance();
	
	@Override
	public List<CustomerBean> getAllCustomers() {
		List<CustomerBean> customerList=new ArrayList<CustomerBean>();
		Connection conn= cf.getConnection();
		java.sql.Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from bank_customers");
			CustomerBean c = null;
			while (rs.next()) {
				c=new CustomerBean(rs.getString(2),rs.getString(3));
				customerList.add(c);
			}
			return customerList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	


	@Override
	public CustomerBean getCustomerByUsername(String usernm) {
		Connection conn= cf.getConnection();
		String sql = "select * from bank_customers where username = ?";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, usernm);
			ResultSet rs= ps.executeQuery();
			CustomerBean c = null;
			while (rs.next()) {
				c=new CustomerBean(rs.getString(2),rs.getString(3));
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}


	
	
	@Override
	public void addCustomerToDatabase(CustomerBean cust) {
		Connection conn = cf.getConnection();
		String str = "insert into bank_customers values (nextval('custseq'),?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(str);
			ps.setString(1, cust.getUsername());
			ps.setString(2, cust.getPassword());
			ps.execute();
			ps=conn.prepareStatement("commit");
			ps.execute();
			System.out.println("Successfully added application");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	//@Override TODO add this to the customerdao
	public void removeCustomerFromDatabase(String name) {
		Connection conn = cf.getConnection();
		String str1 = "delete from bank_accounts where username = ?";
		String str2 = "delete from bank_customers where username = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(str1);
			ps.setString(1, name);
			ps.execute();
			ps = conn.prepareStatement(str2);
			ps.setString(1, name);
			ps.execute();
			ps=conn.prepareStatement("commit");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
}
