package com.revature.dao;

import java.sql.SQLException;
import java.util.List;
import com.revature.bean.BankApplication;

public interface BankDao {
	public void updateBankAccount(double amount, int accountNumber) throws SQLException;

	BankApplication getBankAccount(Integer customerId) throws SQLException;
}