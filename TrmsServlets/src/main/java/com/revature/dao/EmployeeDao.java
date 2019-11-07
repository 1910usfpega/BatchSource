package com.revature.dao;

import java.util.ArrayList;

import com.revature.bean.EmployeeBean;

public interface EmployeeDao {
	public EmployeeBean getEmployee(int employeeID);
	public ArrayList<EmployeeBean> getAllEmployees();

}