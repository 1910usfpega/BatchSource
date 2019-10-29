package com.revature.dao;

import java.util.List;

import com.revature.beans.CustomerBean;

public interface CustomerDao {
	public List<CustomerBean> getAllCustomers();
	public CustomerBean getCustomerByUsername(String usernm);
	public void addCustomerToDatabase(CustomerBean cust);
	void removeCustomerFromDatabase(String name);
	
}
