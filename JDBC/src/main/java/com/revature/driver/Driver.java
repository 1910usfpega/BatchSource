package com.revature.driver;

import java.sql.SQLException;

import com.revature.accountsdaoimpl.AccountsDaoImpl;
import com.revature.usersdaoimpl.UsersDaoImpl1;


public class Driver {
	
	public static void main(String[] args) {
		UsersDaoImpl1 udi = new UsersDaoImpl1();
		AccountsDaoImpl adi = new AccountsDaoImpl();
		

		try {
			//udi.insertUsers("tik", "Kevin", "Garnett", "5678", 3);
			System.out.println(udi.getUsersByusers_username("kans"));
		

		} catch (SQLException e) {

			e.printStackTrace();
		}
	
		
		//(adi.getAlbumsById(22));
//	{
	try {
			adi.insertaccounts("kooly", 2219, 700.00, "checking");

	} catch (SQLException e) {

			e.printStackTrace();
		}
//	}
//	}
//	{



}
}
	

		