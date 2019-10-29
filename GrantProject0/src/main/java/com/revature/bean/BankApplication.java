package com.revature.bean;
import com.revature.daoimpl.BankDaoImpl;

public class BankApplication {
    private double amount = 0;
    private int id;
    static BankDaoImpl adi = new BankDaoImpl();


    public BankApplication(double amount, int id) {
        super();
        this.amount = amount;
        this.id = id;
    }

    public double getAmount() {
        return this.amount;
    }
}
