package com.revature.daoimpl;

import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import com.revature.bean.Customer;
import com.revature.dao.CustomerDao;
import com.revature.utills.BankConnection;

public class CustomerDaoImpl implements CustomerDao {
    public static BankConnection cf = BankConnection.getInstance();
    static CustomerDaoImpl a = new CustomerDaoImpl();

    private static final AtomicLong TS = new AtomicLong();

    public Customer login(String username, String password) throws SQLException {
        Connection conn = cf.getConnection();
        String sql = "select * from customer_table where user_name = ? and user_password = ?";
        PreparedStatement ps;

        ps = conn.prepareStatement(sql);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = null;
        try {
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Customer a = null;

        while (rs.next()) {
            a = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
            return a;
        }
        return null;

    }

    @Override
    public String viewUser(String Username) throws SQLException {
        Connection conn = cf.getConnection();
        String sql = "select * from \"customer_table\" where \"user_name\" = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, Username);
        ResultSet rs = ps.executeQuery();
        Customer a = null;
        while (rs.next()) {
            a = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
        }
        return "name: " + a.getfName() + " " + a.getlName() + " Their username is: " + a.getUserName();
    }

    @Override
    public void deleteAccount(int accountNumber) {
        try {
            Connection conn = cf.getConnection();
            String sql = "delete from \"customer_table\" where \"customer_id\" = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, accountNumber);
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Deleted account: " + accountNumber);
        }

        try {
            deleteBankAccount(accountNumber);
        } catch (Exception e) {
            System.out.println("Deleted bank account: " + accountNumber);
        }
    }

    @Override
    public void deleteBankAccount(int accountNumber) throws SQLException {
        Connection conn = cf.getConnection();
        String sql = "delete from \"baccount\" where \"account_number\" = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, accountNumber);
        ps.executeQuery();
    }

    @Override
    public void updateUserPassword(String password, String Username) throws SQLException {
        Connection conn = cf.getConnection();
        String sql = "update \"customer_table\" set pass = ? where \"user_name\" = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, password);
        ps.setString(1, Username);
        ps.executeQuery();
    }

    public ArrayList<Customer> getCustomers() throws SQLException {
        ArrayList<Customer> CustomerList = new ArrayList<Customer>();
        Connection conn = cf.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from customer_table");
        Customer a = null;
        while (rs.next()) {
            a = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
            CustomerList.add(a);
        }
        return CustomerList;
    }

    public Customer getCustomerbyUsername(String username) throws SQLException {
//		Customer customer= null;
        Connection conn = cf.getConnection();
        String sql = "select * from \"customer_table\" where \"user_name\" = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        Customer a = null;
        while (rs.next()) {
            a = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));

        }
        return a;
    }

    @Override
    public void updateUserFname(String name, String Username) throws SQLException { // check username if has been used
        Connection conn = cf.getConnection();
        String sql = "update \"customer_table\" set first_name = ? where \"user_name\" = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, Username);
        ps.executeQuery();
    }

    @Override
    public void updateUserLname(String name, String Username) throws SQLException {
        Connection conn = cf.getConnection();
        String sql = "update \"customer_table\" set last_name = ? where \"user_name\" = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, Username);
        ResultSet rs = ps.executeQuery();
    }

    public static long getUniqueTimestamp() {
        return System.currentTimeMillis();
    }

    public boolean createUsers(String name, String last, String username, String password) throws SQLException {
        Connection conn = cf.getConnection();
        if (a.checkusername(a.getCustomers(), username)) {
            String sql = "insert into customer_table (first_name,last_name,user_name, user_password, customer_id) "
                    + "Values(?,?,?,?, ?)";
            if (a.checkusername(a.getCustomers(), username)) {
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, last);
                ps.setString(3, username);
                ps.setString(4, password);
                int uniqueTimestamp = (int) getUniqueTimestamp();
                ps.setLong(5, Integer.parseInt("" + uniqueTimestamp));
                createBankAccount(uniqueTimestamp, 0F);
                try {
                    ps.execute();
                } catch (Exception e) {
                    return false;
                }
                return true;
            }
        }
        return false;

    }

    public boolean createBankAccount(Integer customerId, Float amount) throws SQLException {
        Connection conn = cf.getConnection();
        String sql = "insert into baccount (account_number, amount) "
                + "Values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, customerId);
        ps.setFloat(2, amount);
        try {
            ps.execute();
        } catch (Exception e) {
            return false;
        }
        return false;

    }

    public boolean checkusername(ArrayList<Customer> a, String b) {
        for (Customer aa : a) {
            if (aa.getUserName().equals(b)) {
                return false;
            }
        }
        return true;
    }
}
