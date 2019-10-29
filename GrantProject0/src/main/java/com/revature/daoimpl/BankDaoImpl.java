package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.revature.bean.BankApplication;
import com.revature.dao.BankDao;
import com.revature.utills.BankConnection;

public class BankDaoImpl implements BankDao {
    public static BankConnection cf = BankConnection.getInstance();

    @Override
    public BankApplication getBankAccount(Integer accountNumber) throws SQLException {
        Connection conn = cf.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "select * from \"baccount\" where account_number = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, accountNumber);
        ResultSet rs = ps.executeQuery();
        BankApplication a = null;
        while (rs.next()) {
            double amount = rs.getDouble(2);
            int customer_id = rs.getInt(1);
            return new BankApplication(amount, customer_id);
        }

        return null;
    }

    @Override
    public void updateBankAccount(double amount, int accountNumber) {
        try {
            Connection conn = cf.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "update \"baccount\" set amount =  ? where account_number = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, amount);
            ps.setInt(2, accountNumber);
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Done");
        }
    }



}
