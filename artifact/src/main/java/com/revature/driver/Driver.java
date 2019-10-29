package com.revature.driver;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.bean.Customer;
import com.revature.bean.Employee;
import com.revature.bean.bankAccount;
import com.revature.daoimpl.BankDaoImpl;
import com.revature.daoimpl.Customerdaoimpl;
public class Driver {
	static Scanner scan = new Scanner(System.in);
	static String username = null;
	static String password = null;
	static boolean login = false;
	static Employee employee = null;
	static ArrayList<bankAccount> accounts = null;
	static BankDaoImpl b = new BankDaoImpl();
    static Customer loggedInCustomer = null;
    static Customerdaoimpl a = new Customerdaoimpl();
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome");
        System.out.println("1: Sign In");
        System.out.println("2: Employee Sign In");
        System.out.println("3: Sign Up ");
        System.out.println("Choose Option: ");
        boolean is_running = true;
        while (is_running) {
            int input = scan.nextInt();
             switch (input) {
                case 1:
                    System.out.println("please enter username");
                    username = scan.next();
                    System.out.println("please enter your password");
                    password = scan.next();
                    if( a.logIn(username, password)) 
                    loggedInCustomer = a.getCustomerByName(username);
                    if (loggedInCustomer != null) {
                    	loggedInCustomer = a.getCustomerbyUsername(username);
                        System.out.println(": Welcome " + loggedInCustomer.getfName()+ " " + loggedInCustomer.getLast());
                        System.out.println("----------------------------");
                        System.out.println("1: View Account");
                        System.out.println("2: Get Balance");
                        System.out.println("3: Withdraw");
                        System.out.println("4: Deposit");
                        System.out.println("5: Delete Account");
                        System.out.println("6: Change Account");
                        System.out.println("7: Logout");
                        input = scan.nextInt();
                        loggedInCustomer = a.getCustomerByName(username);
                        switch (input) {
                        
                        case 1:
							System.out.println("your accounts");
							a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							break;
						case 2:
							System.out.println("your accounts");
							accounts = a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							for(bankAccount d:accounts) {
								System.out.println(d.getAccountNumber());
							}
							System.out.println("enter the account number");
							int accountnumber = scan.nextInt();
							System.out.println(b.getAccount(accountnumber));							
							break;

						case 3:
							a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							System.out.println("enter bankaccount number");
							int as = scan.nextInt();
							System.out.println("enter amount to with draw");
							int withdraw  = scan.nextInt();
							bankAccount temp =b.getAccount(as);
							b.withdraw(withdraw, temp.getAccountNumber());;
							break;
						// exit system
						case 4:
							//deposit
							a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							System.out.println("enter your account number");
							int asa = scan.nextInt();
							System.out.println("enter the deposit amount");
							int deposit = scan.nextInt();
							bankAccount tempp =b.getAccount(asa);
							b.deposit(deposit, tempp.getAccountNumber());
							
							break;
						case 5:							
							a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							System.out.println("enter your account number");
							int d = scan.nextInt();
							bankAccount temppp =b.getAccount(d);
							a.deleteBankAccount(temppp.getAccountNumber(), loggedInCustomer.getUserName());
						case 6:
							break;
						case 7:
							login = false;					
                        }
                    }
                    System.out.print("");
                    break;
                case 2:
                    System.out.println("please enter username");
                    username = scan.next();
                    System.out.println("please enter your password");
                    password = scan.next();
                 if(a.loginForEmployees(username, password))
                	    loggedInCustomer = a.getCustomerByName(username);
                      if (loggedInCustomer != null) {
                        System.out.println(": Welcome " + loggedInCustomer.getfName() + " " + loggedInCustomer.getlName());
                        System.out.println("----------------------------");
                        System.out.println("1: View User Account");
                        System.out.println("2: Check User's Balance");
                        System.out.println("3: Delete a User's Account");
                        System.out.println("4: Update a User's Account");
                        System.out.println("5: Logout");
                        switch (input) {
                            // Login log out
                        case 1:
							System.out.println("what username to see inforamtion on?");
							username = scan.next();
							employee.viewPersonal(a.getCustomerByName(username));
							break;
						
						case 2:
							System.out.println("what username to see on-hand cash from");
							username = scan.next();
							employee.viewAccount(a.getCustomerByName(username));
							break;
						// create admin account
						case 3:
							
							System.out.println("what username would you like to delete account from");
							username = scan.next();
							System.out.println("what is the account number to be deleted");
							int asd = scan.nextInt();
							a.deleteBankAccount(asd, username);
				
							break;
					
						case 4:
							
							break;
							
						case 5:
							login = false;
                        }
                    }
                    break;
                case 3:
                	System.out.println("what is your first name?");
					String fname = scan.next();
					System.out.println("what is your last name?");
					String lname = scan.next();
					System.out.println("what would you like your username to be?");
					String username = scan.next();
					System.out.println("5: please enter your password");
					String password = scan.next();
					boolean worked = false;
					try {
                     worked = employee.createNewUser(username, fname, lname, password, false);
					}
					catch(Exception e) {}
                    while (!worked) {
                        System.out.print("please enter another username that one was taken");
                        username = scan.next();
                        try {
                            worked = employee.createNewUser(username, fname, lname, password, false);
       					}
       					catch(Exception e) {}
                    }
                    System.out.print("you made your new account! you will not reget it!!! ");
                    break;
                default:
            }
        }
    }
}