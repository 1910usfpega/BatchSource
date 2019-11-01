package com.revature.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.revature.bean.Customer;
import com.revature.bean.Employee;
import com.revature.bean.bankAccount;
import com.revature.utills.ConnFactory;

import java.util.List;


import com.revature.*;


public class Customerdaoimpl {
	public static ConnFactory cf= ConnFactory.getInstance();
	
	static Customerdaoimpl a= new Customerdaoimpl();
	static BankDaoImpl b = new BankDaoImpl();
	
	public ArrayList<Customer> getAllCustomer() throws SQLException {
		ArrayList<Customer> CustomerList= new ArrayList<Customer>();
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from customer");
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			CustomerList.add(a);
		}
		return CustomerList;
	}
	
	public Customer getCustomerByName(String name) throws SQLException {
		List<Customer> CustomerList= new ArrayList<Customer>();
		Connection conn= cf.getConnection();
		String sql="select * from customer where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1, name);
		ResultSet rs= ps.executeQuery();
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			CustomerList.add(a);
		}
		
		return a;
	}
	
	public Employee getEmployeebyUsername(String username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="select * from employee where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,username);
		ResultSet rs= ps.executeQuery();
		Employee a=null;
		while(rs.next()) {
			a= new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		return a;
	}


	public boolean logIn(String username, String password) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="select * from customer where username = ? and pass = ?";
		PreparedStatement ps;
		
			ps = conn.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs= null;
			try {
			 rs= ps.executeQuery();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			 Customer a=null;
			
				while(rs.next()) {
					a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
					return true;
			}
				return false;
	
	}
	public String viewUser(String Username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="select * from customer where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,Username);
		ResultSet rs= ps.executeQuery();
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		return "name: "+a.getfName()+" "+a.getlName()+" Their username is: "+ a.getUserName();
	}

	public void deleteBankAccount(int accountNumber, String Username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="delete from owners where username = ? and accountnumber = ?";
		
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,Username);
		ps.setInt(2,accountNumber);
	    ps.execute();
	}

	public boolean loginForEmployees(String username, String password) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="select * from employee where username = ? and pass = ?";
		PreparedStatement ps;
		
			ps = conn.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			ResultSet rs= null;
			try {
			 rs= ps.executeQuery();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			 Customer a=null;
			
				while(rs.next()) {
					a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
					return true;
			}
				return false;

	}

	public void updateUserPassword(String password, String Username) throws SQLException {
		Connection conn= cf.getConnection();
		String sql="update customer set pass = ? where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,password);
		ps.setString(1,Username);
		ps.executeQuery();
	}
	
	public ArrayList<Customer> getCustomers() throws SQLException {
		ArrayList<Customer> CustomerList= new ArrayList<Customer>();
		Connection conn= cf.getConnection();
		Customer a;
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from customer");
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			CustomerList.add(a);
		}
		return CustomerList;
	}
	public ArrayList<bankAccount> bankAccountsOfUser() throws SQLException {
		ArrayList<bankAccount> BankApplicationList= new ArrayList<>();
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from customer");
		bankAccount a=null;
		while(rs.next()) {
			a= new bankAccount(rs.getInt(1),rs.getDouble(2));
			BankApplicationList.add(a);
		}
		return BankApplicationList;
}
	public Customer getCustomerbyUsername(String username) throws SQLException {
//		Customer customer= null;
		Connection conn= cf.getConnection();
		String sql="select * from customer where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,username);
		ResultSet rs= ps.executeQuery();
		Customer a=null;
		while(rs.next()) {
			a= new Customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			
		}
		return a;
	}

	public String getCustomerName(String Username) throws SQLException {  // get full name
		Customer Customer= null;
		Connection conn= cf.getConnection();
		String sql="select * from customer where username = ?";
		PreparedStatement ps= conn.prepareStatement(sql);
		ps.setString(1,Username);
		ResultSet rs= ps.executeQuery();
	
	return Customer.getfName() + " "+ Customer.getlName();
		
	}

	public boolean checkusername(ArrayList <Customer> a, String b) {
		for(Customer aa: a) {
			if(aa.getUserName().equals(b)) {
				return false;
			}
		}
		return true;
	}
	public List<bankAccount> getAllUserBankAccounts(String username) throws SQLException{
		return b.getAllAccounts(username);
		
	}
	public List<bankAccount> getAllUserBankAccountsforuser() throws SQLException{
		return b.getAllofAccounts();
		
	}
	public boolean createUsers(String name, String last, String username, String password) throws SQLException {
        Connection conn = cf.getConnection();
      
            String sql = "insert into customer (fname,lname,username, pass) Values(?,?,?,?)";
            
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, last);
                ps.setString(3, username);
                ps.setString(4, password);
                try {
                    ps.execute();
                    return true;
                } catch (Exception e) {
                   
                }
                return false;
             
    }
    public boolean createBankAccount(String username) throws SQLException {
        Connection conn = cf.getConnection();
        String sql = "insert into bankaccount (amount) Values(0)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.execute();
  return true;
    }
    
    

}


