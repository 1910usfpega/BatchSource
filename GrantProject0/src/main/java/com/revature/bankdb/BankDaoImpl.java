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

	public List<Customer> getAllAlbums() throws SQLException {

		List<Customer> CustomerList= new ArrayList<Customer>();

		Connection conn= cf.getConnection();

		Statement stmt= conn.createStatement();

		ResultSet rs= stmt.executeQuery("select * from \"Customer\"");

		Customer a=null;

		while(rs.next()) {

			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));

			CustomerList.add(a);

		}

		return CustomerList;

	}

	@Override

	public List<Customer> getAlbumsById(int id) throws SQLException {

		List<Customer> CustomerList= new ArrayList<Customer>();

		Connection conn= cf.getConnection();

		String sql="select * from \"Customer\" where \"ArtistId\" = ?";

		PreparedStatement ps= conn.prepareStatement(sql);

		ps.setInt(1,id);

		ResultSet rs= ps.executeQuery();

		Customer a=null;

		while(rs.next()) {

			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));

			CustomerList.add(a);

		}

		return CustomerList;

	}
	
	
}
