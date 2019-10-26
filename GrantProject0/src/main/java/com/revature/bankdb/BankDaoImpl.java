package com.revature.bankdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Customer;

public class BankDaoImpl implements BankDao {




	public static BankConnection cf= BankConnection.getInstance();

	@Override

	public List<Customer> getCustomers() throws SQLException {

		List<Customer> CustomerList= new ArrayList<Customer>();

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

	@Override

	public List<Customer> getCustomerName(String name) throws SQLException {

		List<Customer> CustomerList= new ArrayList<Customer>();

		Connection conn= cf.getConnection();

		String sql="select * from \"customer_table\" where \"first_name\" = ?";

		PreparedStatement ps= conn.prepareStatement(sql);

		ps.setString(1,name);

		ResultSet rs= ps.executeQuery();

		Customer a=null;

		while(rs.next()) {

			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));

			CustomerList.add(a);

		}

		return CustomerList;

	}
	
	
}
