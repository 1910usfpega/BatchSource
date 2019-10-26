package com.revature.bankdb;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.Customer;

public interface BankDao {

	public List<Customer> getCustomers() throws SQLException;

	public List<Customer> getCustomerName(String name)throws SQLException;
	
}
