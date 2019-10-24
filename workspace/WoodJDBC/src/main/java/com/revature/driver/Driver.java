package com.revature.driver;

import java.sql.SQLException;

import com.revature.bean.Bear;
import com.revature.daoimpl.BearDaoImpl;

public class Driver {

	public static void main(String[] args) {
		BearDaoImpl b = new BearDaoImpl();
		try {
			System.out.println(b.getAllBears());
		} catch (SQLException e) {
			System.out.println("DB not found!");
			e.printStackTrace();
		}

	}

	}


