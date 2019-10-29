package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.revature.beans.Person;
import com.revature.dao.PersonDao;
import com.revature.util.ConnFac;

public class PersonDaoImpl implements PersonDao {
	public static ConnFac cf = ConnFac.getInstance();
	public void insertPerson(Person p) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "insert into person values(default, ?, ?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,p.getFirstName());
		ps.setString(2, p.getLastName());
		ps.setString(3, p.getUsername());
		ps.setString(4,p.getPassword());
		ps.executeUpdate();
		System.out.println("Person added.");
	}
	public ArrayList<Person> getAllPersons() throws SQLException {
		ArrayList<Person> personList = new ArrayList<Person>();
		Connection conn = cf.getConnection();
		java.sql.Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from person");
			Person p = null;
			while(rs.next()) {
				p =new Person(rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(1));
				personList.add(p);
			}return personList;
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
		return null;
	}
	public Person getPersonById(int id) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "select * from person where user_id = ?";
		try {
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		Person p = null;
		while(rs.next()) {
			p = new Person(rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(1));
		}
		
		return p;
		} catch(SQLException e) {e.printStackTrace();}
		return null;
}
	public Person getPersonByUN(String un) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "select * from person where username = ?";
		try {
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,un);
		ResultSet rs = ps.executeQuery();
		Person p = null;
		while(rs.next()) {
			p = new Person(rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getInt(6),rs.getInt(1));
		}
		
		return p;
		} catch(SQLException e) {e.printStackTrace();}
		return null;
}
//	public void updatePerson(Person p) {
//		 Connection conn = cf.getConnection();
//		 String str = "update from accounts set balance =? where acct_id = ?";
//		 try {
//			 PreparedStatement ps = conn.prepareStatement(str);
//			 ps.setInt(2, p.getAccountId());
//			 ps.setDouble(1, p.getBalance());
//			 ps.execute();
//			 ps = conn.prepareStatement("commit");
//			 ps.execute();
//		 }catch(SQLException e) {
//			 e.printStackTrace();
//		 }
//	 }
	public boolean checkUser(String un, String pw) {
		 Connection conn = cf.getConnection();
		 String str = "SELECT * FROM person where username = ?";
		// String dot = "'"+un+"'";
		 try {	
			 PreparedStatement ps = conn.prepareStatement(str);
			 ps.setString(1, un);
			 ResultSet rs = ps.executeQuery();
			 while(rs.next()) {
				 if(rs.getString(5).equals(pw)) {
					 return true;
				 }
			 }
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }return false;
	}
	public boolean checkAvailability(String un) {
		Connection conn = cf.getConnection();
		try {
		String str = "select username from person";
		PreparedStatement ps = conn.prepareStatement(str);
		ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
				if(rs.equals(un)) { return false;	
				} else {return true;}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	 public void removeAcct(int id) {
		 Connection conn = cf.getConnection();
		 String str = "delete from person where user_id = ?";
		 try {
			 PreparedStatement ps = conn.prepareStatement(str);
			 ps.setInt(1, id);
			 ps.execute();
			 ps= conn.prepareStatement("commit");
			 ps.execute();
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	 }
	 public void removeAllAcct() {
		 Connection conn = cf.getConnection();
		 String str = "delete * from person";
		 try {
			 PreparedStatement ps = conn.prepareStatement(str);
		
			 ps.execute();
			 ps= conn.prepareStatement("commit");
			 ps.execute();
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
	 }
}
