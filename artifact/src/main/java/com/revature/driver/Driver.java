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
	static String username;
	static String password;
	static boolean login ;
	static Employee employee  = new Employee("","","","");
	static ArrayList<bankAccount> accounts = new ArrayList<>();
	static BankDaoImpl b = new BankDaoImpl();
    static Customer loggedInCustomer;
    static Customerdaoimpl a = new Customerdaoimpl();
    public static void main(String[] args) throws SQLException {
    	 boolean is_running = true;
    	 
    	while (is_running) {
    	System.out.println("Welcome");
        System.out.println("1: Sign In");
        System.out.println("2: Employee Sign In");
        System.out.println("3: Sign Up ");
        System.out.println("Choose Option: ");
       
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
                    	boolean logined = true;
                    	while(logined) {
                    	loggedInCustomer = a.getCustomerbyUsername(username);
                        System.out.println(": Welcome " + loggedInCustomer.getName()+ " " + loggedInCustomer.getLast());
                        System.out.println("----------------------------");
                        System.out.println("1: View Account");
                        System.out.println("2: Get Balance");
                        System.out.println("3: Withdraw");
                        System.out.println("4: Deposit");
                        System.out.println("5: Delete Account");
                        System.out.println("6: Change Account");
                        System.out.println("7: new account");
                        System.out.println("8: Logout");
                        input = scan.nextInt();
                        loggedInCustomer = a.getCustomerByName(username);
                        switch (input) {
                        
                        case 1:
							System.out.println("your accounts");
							accounts = a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							for(bankAccount number: accounts) {
								System.out.println(number.getAccountNumber());			
							}
							break;
						case 2:
							System.out.println("your accounts");
							accounts = a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							for(bankAccount d:accounts) {
								System.out.println(d.getAccountNumber());
							}
							System.out.println("enter the account number");
							int accountnumber = scan.nextInt();
							System.out.println(b.getAccount(accountnumber).getBalance());							
							break;

						case 3:
							System.out.println("your accounts");
							accounts = a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							for(bankAccount number: accounts) {
								System.out.println(number.getAccountNumber());}
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
							System.out.println("your accounts");
							accounts = a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							for(bankAccount number: accounts) {
								System.out.println(number.getAccountNumber());}
							a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							System.out.println("enter your account number");
							int asa = scan.nextInt();
							System.out.println("enter the deposit amount");
							int deposit = scan.nextInt();
							bankAccount tempp =b.getAccount(asa);
							b.deposit(deposit, tempp.getAccountNumber());
							
							break;
						case 5:		// fix					
							a.getAllUserBankAccounts(loggedInCustomer.getUsername());
							System.out.println("enter your account number");
							int d = scan.nextInt();
							bankAccount temppp =b.getAccount(d);
							if(temppp.getBalance() == 0) {
							a.deleteBankAccount(temppp.getAccountNumber(), loggedInCustomer.getUserName());
							}else {System.out.println("You need to empty your bankaccount to delete it.");}
						case 6:
							int temp1 =0;
							switch(temp1) {
							case 1:
							break;
							}
							break;
						case 7:
							a.createBankAccount(loggedInCustomer.getUsername());
							System.out.println("You made a new account bank acoount1");
							break;
						case 8:
							logined = false;
							loggedInCustomer = null;	
                        }
                        }
                        
                    }
                    else {
                    	  System.out.print("No user with that inforamtion");
                    }
                    break;
                case 2:
                    System.out.println("please enter username");
                    username = scan.next();
                    System.out.println("please enter your password");
                    password = scan.next();
                 if(a.loginForEmployees(username, password))
                	    loggedInCustomer = a.getCustomerByName(username);
                      if (loggedInCustomer != null) {
                        System.out.println(": Welcome "+ loggedInCustomer.getlName());
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
							b.getAllAccounts(a.getCustomerByName(username).getUsername());
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
							loggedInCustomer = null;
							break;}
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
                    worked = employee.createNewUser(username, fname, lname, password);	
                                 System.out.print("you made your new account! please enjoy!! ");
                    break;
                default:
            }
        }
    }
}