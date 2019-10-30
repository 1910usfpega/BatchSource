package com.revature.menuinterface;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bean.Account;
import com.revature.bean.Transaction;
import com.revature.bean.UserInfo;
import com.revature.daoimpl.InsertDaoImpl;
import com.revature.daoimpl.RemoveDaoImpl;
import com.revature.daoimpl.UpdateDaoImpl;
import com.revature.daoimpl.ViewDaoImpl;

public class UserMenu {
	
	public void runUserMenu(UserInfo ui, Scanner sc) {
		String input = "";
		
		
		while (input != "LOGOUT") {
			
			LogIn.clearScreen();
			
			System.out.println("||WELCOME User : "+ ui.getFirstName() );
			System.out.println("||*****************************************||");
			System.out.println("||     Please enter a menu option:         ||");
			System.out.println("||=================***=====================||");
			System.out.println("|| Press 1 - View All Accounts             ||");
			System.out.println("|| Press 2 - Create an account             ||");
			System.out.println("|| Press 3 - Delete account                ||");
			System.out.println("|| Press 4 - Deposit/Withdraw              ||");
			System.out.println("|| Press 5 - See Transaction History       ||");
			System.out.println("|| Press 6 - Log Off                       ||");
			System.out.println("||*****************************************||");

			input = sc.nextLine();

			switch (input) {
			case "1":
				viewAll(ui, sc);
				break;
			case "2":
				createAcc(ui, sc);
				break;
			case "3":
				deleteAcc(ui, sc);
				break;
			case "4":
				deleteAcc(ui, sc);
				break;
			case "5":
				showTrans(ui, sc);
				break;
			case "6":
				System.out.println("GoodBYE.");
				input = "LOGOUT";
				break;
			default:
				System.out.println("!!!!! INVALID INPUT !!!!!");
				System.out.println("(:--PLease Try Again--:)");
			}
		}
		
	}
	
	
	
	public void viewAll(UserInfo ui, Scanner sc) {
		
		List<Account> aList = new ArrayList<Account>();

		ViewDaoImpl viewI = new ViewDaoImpl();
		
		
		try {
			
			aList = viewI.getAllAccounts();
		} catch (SQLException e) {

			System.out.println("failed to get list of accounts");
			e.printStackTrace();
		}
		
		System.out.println("(:--List of Accounts--:)");
		
		for(Account a: aList) {
			if(a.getUser_ID() == ui.getUser_ID()) {
				System.out.println("====================================");
				System.out.println(" Account ID: " + a.getBank_Acc_ID());
				System.out.println(" Account Type: " + a.getAccountType());
				System.out.println(" User ID: " + a.getUser_ID());
				System.out.println(" Account Balance: " + a.getAccBalance());
				System.out.println("====================================");
				
				System.out.println(" ");
			}
			
		}
	}
	
	
	public void createAcc(UserInfo ui, Scanner sc) {
		
		InsertDaoImpl insI = new InsertDaoImpl();
		double r1;
		String input = "";
		Account a = new Account();
		
		while (input != "BACK") {
			
			LogIn.clearScreen();
			
			System.out.println("||WELCOME User : "+ ui.getFirstName() );
			System.out.println("||*****************************************||");
			System.out.println("||     Please enter a menu option:         ||");
			System.out.println("||=================***=====================||");
			System.out.println("|| Press 1 - Create Checking Acc           ||");
			System.out.println("|| Press 2 - Create Savings Acc            ||");
			System.out.println("||*****************************************||");

			input = sc.nextLine();

			switch (input) {
			case "1":
				System.out.println("how much money would you like to deposit: ");
				r1 = sc.nextDouble();
				a.setAccBalance(r1);
				a.setAccountType(1);
				a.setUser_ID(ui.getUser_ID());
				;
				try {
					insI.addAccount(a);
				} catch (SQLException e) {
					System.out.println("Records was NOT deleted");
					e.printStackTrace();
				}
				input = "BACK";
				break;
			case "2":
				System.out.println("how much money would you like to deposit: ");
				r1 = sc.nextDouble();
				
				a.setAccBalance(r1);
				a.setAccountType(2);
				a.setUser_ID(ui.getUser_ID());
				;
				try {
					insI.addAccount(a);
				} catch (SQLException e) {
					System.out.println("Records was NOT deleted");
					e.printStackTrace();
				}
				input = "BACK";
				break;
			default:
				System.out.println("!!!!! INVALID INPUT !!!!!");
				System.out.println("(:--PLease Try Again--:)");
			}
		}
		
		
	}
	
	
	
	public void deleteAcc(UserInfo ui, Scanner sc) {
		
		String input = "";
		Integer an;
		RemoveDaoImpl r = new RemoveDaoImpl();
			
		LogIn.clearScreen();
		
		System.out.println("to DELETE user please enter the account ID:");
		an = sc.nextInt();
		input = an.toString();
		
		try {
			if(isZero(an)) {
				r.removeRec("jdbc_bank.account", "bank_acc_id", input);
			}
			else {System.out.println("Account can NOT be deleted! Balance is greater than: 0");}
			
		} catch (SQLException e) {
			System.out.println("Record was NOT deleted");
			e.printStackTrace();
		}
		
		
	}
	
	public void doTrans(UserInfo ui, Scanner sc) {
		UpdateDaoImpl up = new UpdateDaoImpl();
		ViewDaoImpl viewI = new ViewDaoImpl();
		InsertDaoImpl insI = new InsertDaoImpl();
		
		Double r1;
		String r2, r3;
		Integer r4;
		String input = "";
		Account a = new Account();
		
		Transaction t = new Transaction();
		
		List<Account> aList = new ArrayList<Account>();

		
		
		
		try {
			
			aList = viewI.getAllAccounts();
		} catch (SQLException e) {

			System.out.println("failed to get list of accounts");
			e.printStackTrace();
		}
		
		
		while (input != "BACK") {
			
			LogIn.clearScreen();
			
			System.out.println("||WELCOME User : "+ ui.getFirstName() );
			System.out.println("||*****************************************||");
			System.out.println("||     Please enter a menu option:         ||");
			System.out.println("||=================***=====================||");
			System.out.println("|| Press 1 - Deposit                       ||");
			System.out.println("|| Press 2 - Whitdraw                      ||");
			System.out.println("|| Press 3 - End Transactions              ||");
			System.out.println("||*****************************************||");

			input = sc.nextLine();

			switch (input) {
			case "1":
				System.out.println("how much money would you like to deposit: ");
				r1 = sc.nextDouble();
				r2 = r1.toString(); 
				System.out.println("whats the account number: ");
				r4 = sc.nextInt();
				r3 = r4.toString();
				
				t.setBank_Acc_ID(r4);
				t.setTrans_Typ(1);
				t.setUser_ID(ui.getUser_ID());
				t.setTrans_Amt(r1);
				
				try {
					
						up.UpdateRec("JDBC_Bank.Account", "Balance",  r2, "Acc_Typ", r3);
						insI.addTransaction(t);
					
					
				} catch (SQLException e) {
					System.out.println("Records was NOT deleted");
					e.printStackTrace();
				}
				
				break;
			case "2":
				System.out.println("how much money would you like to withdraw: ");
				r1 = sc.nextDouble();
				r2 = r1.toString(); 
				System.out.println("whats the account number: ");
				r4 = sc.nextInt();
				r3 = r4.toString();
				
				t.setBank_Acc_ID(r4);
				t.setTrans_Typ(2);
				t.setUser_ID(ui.getUser_ID());
				t.setTrans_Amt(r1);
				
				try {
					if(canTransfer(r1, r4))
					{
						up.UpdateRec("JDBC_Bank.Account", "Balance",  r2, "Acc_Typ", r3);
						insI.addTransaction(t);
					}
				} catch (SQLException e) {
					System.out.println("Records was NOT deleted");
					e.printStackTrace();
				}
				
				break;
			case "3":

				input = "BACK";
				break;
			default:
				System.out.println("!!!!! INVALID INPUT !!!!!");
				System.out.println("(:--PLease Try Again--:)");
			}
		}
		
	}
	
	public void showTrans(UserInfo ui, Scanner sc) {
		List<Transaction> tList = new ArrayList<Transaction>();

		ViewDaoImpl viewI = new ViewDaoImpl();
		
		
		try {
			
			tList = viewI.getAllTransaction();
		} catch (SQLException e) {

			System.out.println("failed to get list of accounts");
			e.printStackTrace();
		}
		
		System.out.println("(:--Tansactions History--:)");
		
		for(Transaction t: tList) {
			if(t.getUser_ID() == ui.getUser_ID()) {
				System.out.println("========================================");
				System.out.println(" Transaction ID: " + t.getTrans_ID());
				System.out.println(" Account ID: " + t.getBank_Acc_ID());
				System.out.println(" Transaction Type: " + t.getTrans_Typ());
				System.out.println(" Tansaction Amount: " + t.getTrans_Amt());
				System.out.println("=========================================");
				
				System.out.println(" ");
			}
			
		}
	}
	
	public boolean isZero(int accNum) {
		List<Account> aList = new ArrayList<Account>();
		ViewDaoImpl viewI = new ViewDaoImpl();

		
		try {
			
			aList = viewI.getAllAccounts();
		} catch (SQLException e) {

			System.out.println("failed to get list of accounts");
			e.printStackTrace();
		}
		
		for(Account a: aList) {
			if(a.getBank_Acc_ID() == accNum){
				if(a.getAccBalance() ==0) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean canTransfer(double tamt, int accNum) {
		List<Account> aList = new ArrayList<Account>();
		ViewDaoImpl viewI = new ViewDaoImpl();

		
		try {
			
			aList = viewI.getAllAccounts();
		} catch (SQLException e) {

			System.out.println("failed to get list of accounts");
			e.printStackTrace();
		}
		
		for(Account a: aList) {
			if(a.getBank_Acc_ID() == accNum){
				if(a.getAccBalance() > tamt) {
					return true;
				}
			}
		}
		return false;

		
	}



	
	
	
	

}
