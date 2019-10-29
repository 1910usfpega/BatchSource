package com.revature.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.daoimpl.CustomerDaoImpl;

public class Customer extends User {
    private final Integer customerId;
    String userName;
    String lName;
    String fName;
    String passWord;
    static CustomerDaoImpl a = new CustomerDaoImpl();

    public Customer(String userName, String fName, String lName, String passWord, Integer customerId) {
        super(userName, fName, lName, passWord);
        this.userName = userName;
        this.fName = fName;
        this.lName = lName;
        this.passWord = passWord;
        this.customerId = customerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", userName='" + userName + '\'' +
                ", lName='" + lName + '\'' +
                ", fName='" + fName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public ArrayList<Customer> getAllCustomer() {
        try {
            return a.getCustomers();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }




}
