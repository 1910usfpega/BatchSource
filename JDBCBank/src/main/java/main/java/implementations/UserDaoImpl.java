package main.java.implementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.java.bean.User;
import main.java.dao.UserDao;
import main.java.util.ConnFactory;

public class UserDaoImpl implements UserDao{
	ConnFactory cf = ConnFactory.getInstance();

	@Override
	public List<User> getAllUsers() throws SQLException {
		List<User> userList = new ArrayList<User>();
		Connection connection = cf.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("select * from \"p0_users\"");
		User u = null;
		while(rs.next()) {
			u = new User(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
			userList.add(u);
		}
		return userList;
	}

	@Override
	public void insertAccount(String user, String pw, String fName, int aType) throws SQLException {
		Connection conn= cf.getConnection();
		String sql= "insert into p0_users values(nextval (\'acctseq\'),?,?,?,?)";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, user);
		ps.setString(2, pw);
		ps.setString(3, fName);
		ps.setInt(4, aType);
		ps.executeUpdate();
	}
	public void deleteAccount(String username) throws SQLException{
		Connection conn= cf.getConnection();
		String sql= "delete from p0_users where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.executeUpdate();
	}
}
