package com.revature.bankdb;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.Customer;

public interface BankDao {

	public List<Customer> getAllAlbums() throws SQLException;

	public List<Customer> getAlbumsById(int id)throws SQLException;
	
}
