package com.revature.daoImpl;

//import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.BankAccount;
import com.revature.dao.BankAccountDao;
import com.revature.util.ConnFactory;

public class BankAccountDaoImpl implements BankAccountDao{
	//Get database connection object
	ConnFactory cf = ConnFactory.getInstance();
	
	@Override
	public List<BankAccount> getAllBankAccounts() throws SQLException {
		//Declarations for connection and query
		List<BankAccount> accountList = new ArrayList<BankAccount>();
		Connection conn = cf.getConnection();
		String sql = "Select * from \"MakinBank\".bankaccount";
		
		//Generate query and return data from the database
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		BankAccount b = null;
		while(rs.next()) {
			//Populate list with data from all customers in database
			b = new BankAccount(rs.getInt(1), rs.getDouble(2), rs.getString(3));
			accountList.add(b);
		}
		return accountList;
	}//End method getAllBankAccounts

	@Override
	public BankAccount getBankAccountByNum(int account_num) throws SQLException {
				//Declarations for connection and query
				Connection conn = cf.getConnection();
				String sql = "Select * from \"MakinBank\".bankaccount where account_num = ?";
				
				//Generate query and return data from the database
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, account_num);
				ResultSet rs = ps.executeQuery();
				BankAccount b = null;
				while(rs.next()) {
					//Populate list with data from all customers in database
					b = new BankAccount(rs.getInt(1), rs.getDouble(2), rs.getString(3));
				}
				return b;
	}//End method getBankAccountById

	@Override
	public List<BankAccount> getBankAccountsByCustomerUser(String user) throws SQLException {
		//Declarations for connection and query
				List<BankAccount> accountList = new ArrayList<BankAccount>();
				Connection conn = cf.getConnection();
				String sql = "Select * from \"MakinBank\".bankaccount where customer_user = ?";
				
				//Generate query and return data from the database
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, user);
				ResultSet rs = ps.executeQuery();
				BankAccount b = null;
				while(rs.next()) {
					//Populate list with data from all customers in database
					b = new BankAccount(rs.getInt(1), rs.getDouble(2), rs.getString(3));
					accountList.add(b);
				}
				return accountList;
	}//End of method getBankAccountsByCustomerUser

	@Override
	public List<BankAccount> addNewBankAccount(String user) throws SQLException {
		Connection conn = cf.getConnection();
		List<BankAccount> accountList = new ArrayList<BankAccount>();
		BankAccount a = null;
		//Method call
		String sql = "select \"MakinBank\".createaccount(?);";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user);
		ps.execute();
		ps = conn.prepareStatement("commit");
		ps.execute();
		ps = conn.prepareStatement("select * from \"MakinBank\".bankaccount where customer_user = ?");
		ps.setString(1, user);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			a = new BankAccount(rs.getInt(1), rs.getDouble(2), rs.getString(3));
			accountList.add(a);
		}
		
		return accountList;
	}//End of method addNewBankAccount

	@Override
	public List<BankAccount> deleteEmptyAccount(BankAccount account, String user) throws SQLException {
		Connection conn = cf.getConnection();
		//Method call
		PreparedStatement ps = conn.prepareStatement("select \"MakinBank\".deleteaccount(?);");
		ps.setInt(1, account.getAccount_num());
		ps.execute();
		ps = conn.prepareStatement("commit");
		ps.execute();
		
		ps = conn.prepareStatement("select * from \"MakinBank\".bankaccount where customer_user = ?");
		ps.setString(1, user);
		
		List<BankAccount> accountList = new ArrayList<BankAccount>();
		BankAccount b = null;
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			b = new BankAccount(rs.getInt(1), rs.getDouble(2), rs.getString(3));
			accountList.add(b);
		}
		return accountList;
	}//End of method deleteEmptyAccount

	@Override
	public void updateAccountBalance(BankAccount account, double amount) throws SQLException {
		Connection conn = cf.getConnection();
		//Method call
		String sql = "update \"MakinBank\".bankaccount " + 
					"set balance = ?" + 
					"where account_num = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, account.getBalance());
		ps.setInt(2, account.getAccount_num());
		ps.execute();
		
		ps = conn.prepareStatement("commit");
		ps.execute();
		//ps.execute("commit");
		
	}//End of method deleteEmptyAccount
	
}//End Class BankAccountDaoImpl