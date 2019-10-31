package com.jdbc.bank.driver;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jdbc.bank.bean.Account;
import com.jdbc.bank.bean.User;
import com.jdbc.bank.daoimple.AccountDoaImple;
import com.jdbc.bank.daoimple.UserDoaImple;
import com.jdbc.bank.exception.OverDraftException;

public class Driver {

	public static void main(String[] args) throws SQLException {
//		UserDoaImple t1 = new UserDoaImple();
//		
//		
//		
		User test = new User();			
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");
//		
//		Date date = new Date(System.currentTimeMillis());
//		
//		test.setAddress("356 Honey Trail Garden AL, 534-453-3453");
//		test.setEmail("sample_user@somemail.edu");
		test.setFullName("sample manning");
//		test.setPassword(2343423);
//		test.setUName("testing for QC");
//		test.setPhoneNumber("205-234-2345");
//		
//		System.out.println(test);
//		t1.createsUser(test);
		
		List<Account> account = new ArrayList<Account>();
		AccountDoaImple accTest = new AccountDoaImple();
		Account test2 = new Account();
//		
		test2.setAccID(3);
//		test2.setAccType(true);
//		test2.setFullName("sample manning");
//		test2.setBalance(0);
//		System.out.println(test2);
//		accTest.createAccounts(test2);
//		
		
		Account test3 = new Account();
		test3.setAccID(2);
		test3.setBalance(500);
		try {
			account = AccountDriver.transfer(test3, test2, 50);
		} catch (OverDraftException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		if (test3.getBalance() == 0) {
//			
//		}
		accTest.getAllAccId(test);
		System.out.println(test3);
		accTest.reviseAccountBalance(account.get(0));
		accTest.reviseAccountBalance(account.get(1));
		
		
		
	}

}
