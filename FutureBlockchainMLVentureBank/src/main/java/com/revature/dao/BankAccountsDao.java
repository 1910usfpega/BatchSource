package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.AccountInfo;
import com.revature.beans.BankAccount;

public interface BankAccountsDao {
	public void cancelAccount(Integer accountNumber);
	public void cancelAccount(BankAccount account);
	public BankAccount getBankAccountByNumber(Integer accountNumber);
	public int createNewBankAccountAndReturnId(String accountName) throws SQLException;
	public void attachAccountToCustomer(int account_number, int customer_id);
	public List<BankAccount> getBankAccountByUserId(int user_id);
	public void deposit(BankAccount account, Double amountToDeposit);
	public void deposit(Integer accountNumber, Double amountToDeposit);
	public int countOfAccountsWithStatus(String status);
	public List<AccountInfo> getAllAccountsWithStatus(String status);
	public void approveAccount(Integer accountNumber);
	public void approveAccount(BankAccount account);
}
