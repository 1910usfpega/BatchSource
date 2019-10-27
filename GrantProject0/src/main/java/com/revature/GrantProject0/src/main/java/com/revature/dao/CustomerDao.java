package com.revature.dao;

import java.sql.SQLException;
import java.util.List;
import com.revature.bean.Customer;

public interface CustomerDao {
	public  List<Customer> getCustomers() throws SQLException;
	public String viewUser(String Username)throws SQLException;
	public void deleteBankAccount(int accountNumber, String Username)throws SQLException;
	public void updateUserFname(String name, String Username)throws SQLException;
	public void updateUserLname(String name, String Username)throws SQLException;
	public void updateUserPassword(String name, String Username)throws SQLException;
}
