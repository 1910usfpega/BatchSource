package com.revature.dao;

//import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import com.revature.beans.BankAccount;

public interface BankAccountDao {
	//CRUD OPS
	public List<BankAccount> getAllBankAccounts() throws SQLException;
	public BankAccount getBankAccountByNum(int account_num) throws SQLException;
	public List<BankAccount> getBankAccountsByCustomerUser(String user) throws SQLException;
	public List<BankAccount> addNewBankAccount(String user) throws SQLException;
	public List<BankAccount> deleteEmptyAccount(BankAccount account, String user) throws SQLException;
	public void updateAccountBalance(BankAccount account, double amount) throws SQLException;
	
}
