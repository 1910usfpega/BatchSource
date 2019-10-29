package main.java.implementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.validator.PublicClassValidator;

import main.java.accounts.Account;
import main.java.bean.User;
import main.java.dao.AccountDao;
import main.java.util.ConnFactory;

public class AccountDaoImpl implements AccountDao{
	ConnFactory cf = ConnFactory.getInstance();

	@Override
	public List<Account> getAllAccounts() throws SQLException {
		List<Account> accountList = new ArrayList<Account>();
		Connection connection = cf.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"p0_accounts\"");
		Account a = null;
		while(rs.next()) {
			a = new Account(rs.getString(2), rs.getString(3), rs.getDouble(4));
			accountList.add(a);
		}
		return accountList;

	}

	@Override
	public void addAccount(String accountType, String username, Double accountBalance) throws SQLException {
		Connection conn= cf.getConnection();
		String sql= "insert into p0_accounts values(nextval (\'bankseq\'),?,?,?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, accountType);
		ps.setString(2, username);
		ps.setDouble(3, accountBalance);
		ps.executeUpdate();
	}
	public void updateBalance(String accountType, String username, double balance) {
		try {
			Connection conn= cf.getConnection();
			List<Account> accountsList = this.getAllAccounts();
			String sql= "UPDATE p0_accounts "+
						"SET \"accountbalance\" = ? "+
						"WHERE username = ? "+
						"AND accounttype = ?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setDouble(1, balance);
			ps.setString(2, username);
			ps.setString(3, accountType);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteBankAccount(String username) throws SQLException{
		Connection conn= cf.getConnection();
		String sql= "delete from p0_accounts where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.executeUpdate();
	}
}
