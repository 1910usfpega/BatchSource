package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.BankAccount;
import com.revature.beans.Customer;
import com.revature.dao.BankAccountsDao;
import com.revature.exceptions.AccountOverdraftException;
import com.revature.util.AccountInfo;
import com.revature.util.ConnFactory;

public class AccountDaoImpl implements BankAccountsDao {
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public int createNewBankAccountAndReturnId(String accountName) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO bank_account(account_name) VALUES ( ? ) RETURNING account_number AS id;";
		PreparedStatement ps;
		ps = conn.prepareStatement(sql);
		ps.setString(1, accountName);
		ResultSet rs = ps.executeQuery();
		while (rs.next() ) {
			return rs.getInt(1);
		}
		
		return 0;
	}

	@Override
	public List<BankAccount> getBankAccountByUserId(int user_id){
		List<BankAccount> accountsList = new ArrayList<BankAccount>();
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM bank_account \n" + 
				"INNER JOIN bank_user_bank_account \n" + 
				"ON bank_user_bank_account.account_number=bank_account.account_number\n" + 
				"WHERE bank_user_bank_account.user_id=?"; // TODO Implement SQL SELECT
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, user_id);
			
			ResultSet rs = ps.executeQuery();
			BankAccount ba = null;
			
			while (rs.next() ) {
				ba = new BankAccount(
						rs.getString("account_name"), 
						rs.getDouble("balance"), 
						rs.getString("account_status"),
						rs.getInt("account_number")
						);
				accountsList.add(ba);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return accountsList;
	}

	@Override
	public void attachAccountToCustomer(int account_number, int customer_id) {
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO bank_user_bank_account(account_number, user_id) VALUES (?, ?);";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, account_number);
			ps.setInt(2, customer_id);
//			ps.executeQuery();
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public BankAccount getBankAccountByNumber(Integer accountNumber) {
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM bank_account WHERE account_number=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, accountNumber);
			
			ResultSet rs = ps.executeQuery();
			BankAccount ba = null;
			
			while (rs.next() ) {
				ba = new BankAccount(
						rs.getString("account_name"), 
						rs.getDouble("balance"), 
						rs.getString("account_status"),
						rs.getInt("account_number")
						);
				return ba;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void cancelAccount(Integer accountNumber) {
		Connection conn = cf.getConnection();
		String sql = "UPDATE bank_account SET account_status='canceled' WHERE account_number=?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, accountNumber);
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void cancelAccount(BankAccount account) {
		Connection conn = cf.getConnection();
		String sql = "UPDATE bank_account SET account_status='canceled' WHERE account_number=?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, account.getAccountNumber());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deposit(BankAccount account, Double amountToDeposit) {
		Connection conn = cf.getConnection();
		String sql = "UPDATE bank_account SET balance = balance + ? WHERE account_number=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1, amountToDeposit);
			ps.setInt(2, account.getAccountNumber());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deposit(Integer accountNumber, Double amountToDeposit) {
		Connection conn = cf.getConnection();
		String sql = "UPDATE bank_account SET balance = balance + ? WHERE account_number=?";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1, amountToDeposit);
			ps.setInt(2, accountNumber);
			ps.execute();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public int countOfAccountsWithStatus(String status) {
		Connection conn = cf.getConnection();
		String sql = "SELECT \n" + 
				"	count(bank_account.account_number) \n" + 
				"FROM bank_account \n" + 
				"INNER JOIN bank_user_bank_account \n" + 
				"	ON bank_user_bank_account.account_number=bank_account.account_number\n" + 
				"INNER JOIN bank_user \n" + 
				"	ON bank_user.user_id=bank_user_bank_account.user_id\n" + 
				"WHERE account_status=?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, status);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next() ) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			return 0;
		}
		return 0;
	}

	@Override
	public List<AccountInfo> getAllAccountsWithStatus(String status) {
		List<AccountInfo> accounts= new ArrayList<AccountInfo>();
		Connection conn = cf.getConnection();
		String sql = "SELECT \n" + 
				"	bank_account.account_number, \n" + 
				"	bank_account.account_name, \n" + 
				"	bank_account.balance,\n" + 
				"	bank_account.account_status,\n" + 
				"	bank_user.user_id,\n" + 
				"	bank_user.user_name,\n" + 
				"	bank_user.user_firstname,\n" + 
				"	bank_user.user_lastname,\n" + 
				"	bank_user.user_type,\n" + 
				"	bank_user.user_status \n" + 
				"FROM bank_account \n" + 
				"INNER JOIN bank_user_bank_account \n" + 
				"	ON bank_user_bank_account.account_number=bank_account.account_number\n" + 
				"INNER JOIN bank_user \n" + 
				"	ON bank_user.user_id=bank_user_bank_account.user_id\n" + 
				"WHERE account_status='pending';";
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next() ) {
				BankAccount ba = new BankAccount(
						rs.getString("account_name"), 
						rs.getDouble("balance"), 
						rs.getString("account_status"),
						rs.getInt("account_number")
						);
				Customer customer = new Customer(
						rs.getInt("user_id"), 
						rs.getString("user_name"), 
						rs.getString("user_type"), 
						rs.getString("user_firstname"), 
						rs.getString("user_lastname"), 
						rs.getBoolean("user_status")
						);
				AccountInfo ai = new AccountInfo(ba, customer);
				accounts.add(ai);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accounts;
	}

	@Override
	public void approveAccount(Integer accountNumber) {
		Connection conn = cf.getConnection();
		String sql = "UPDATE bank_account SET account_status='approved' WHERE account_number=?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, accountNumber);
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void approveAccount(BankAccount account) {
		Connection conn = cf.getConnection();
		String sql = "UPDATE bank_account SET account_status='approved' WHERE account_number=?;";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, account.getAccountNumber());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void withdraw(Integer accountNumber, Double amount) throws AccountOverdraftException {
		Connection conn = cf.getConnection();
		String sql = "SELECT * FROM withdraw(?, ?);";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, accountNumber);
			ps.setDouble(2, amount);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next() ) {
				if (rs.getInt(1) == 0) {
					throw new AccountOverdraftException("Not enough money :(");
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
