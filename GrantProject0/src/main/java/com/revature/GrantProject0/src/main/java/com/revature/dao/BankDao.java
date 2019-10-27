package com.revature.dao;

import java.sql.SQLException;
import java.util.List;
import com.revature.bean.BankApplication;

public interface BankDao {
	public void deposit(double amount, int accountNumber) throws SQLException;
	public void withdraw(double amount, int accountNumber) throws SQLException;
	public double ViewAccount (int accountNumber) throws SQLException;
	public List<BankApplication> getAllAccounts(int accountNumber) throws SQLException;
}