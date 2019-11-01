package com.revature.driver;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bean.Customer;
import com.revature.bean.Employee;
import com.revature.bean.bankAccount;
import com.revature.daoimpl.BankDaoImpl;
import com.revature.daoimpl.Customerdaoimpl;
import com.revature.daoimpl.EmployeeDaoimpl;
public class Driver {
	static Scanner scan = new Scanner(System.in);
	static String username;
	static String password;
	static boolean login ;
	static Employee employee  = new Employee("","","","");
	static List<bankAccount> accounts = new ArrayList<bankAccount>();
	static BankDaoImpl b = new BankDaoImpl();
    static Customer loggedInCustomer;
    static Customerdaoimpl a = new Customerdaoimpl();
    static EmployeeDaoimpl e = new EmployeeDaoimpl();
    
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
                        System.out.println(": Welcome " + username);
                        System.out.println("----------------------------");
                        System.out.println("1: View Account");
                        System.out.println("2: Get Balance");
                        System.out.println("3: Withdraw");
                        System.out.println("4: Deposit");
                        System.out.println("5: Delete Account");
                        System.out.println("6: new account");
                        System.out.println("7: Logout");
                        input = scan.nextInt();
                        loggedInCustomer = a.getCustomerByName(username);
                        switch (input) {
                        
                        case 1:
							Driver.getallAccountForuser();
							break;
						case 2:
							Driver.getallAccountForuser();
							System.out.println("enter the account number");
							int accountnumber = scan.nextInt();
							try {
							System.out.println(b.getAccount(accountnumber, username).getBalance());							
							}catch(Exception e){System.out.println("no account with user");}
							break;

						case 3:
							Driver.getallAccountForuser();
							System.out.println("enter bankaccount number");
							int as = scan.nextInt();
							System.out.println("enter amount to with draw");
							int withdraw  = scan.nextInt();
							bankAccount temp =b.getAccount(as, username);
							b.withdraw(withdraw, temp.getAccountNumber());;
							break;
						// exit system
						case 4:
							//deposit
							Driver.getallAccountForuser();
							System.out.println("enter your account number");
							int asa = scan.nextInt();
							System.out.println("enter the deposit amount");
							int deposit = scan.nextInt();
							bankAccount tempp =b.getAccount(asa, username);
							try {
							b.deposit(deposit, tempp.getAccountNumber());
							}catch(Exception e) {}
							break;
						case 5:		// fix					
							Driver.getallAccountForuser();
							System.out.println("enter your account number you would like to delete");
							int d = scan.nextInt();
							bankAccount temppp =b.getAccount(d, username);
							if(temppp.getBalance() == 0) {
							a.deleteBankAccount(temppp.getAccountNumber(), username);
							}else {System.out.println("You need to empty your bankaccount to delete it.");}
							break;
					
						case 6:
							a.createBankAccount(username);
							b.addaccounttouser(username);
							System.out.println("You made a new account bank account");
							break;
						case 7:
							logined = false;
							loggedInCustomer = null;
							break;
						default:
							System.out.print("outside of valid range. please try again");
							break;
                        }
                        }
                        
                    }
                    else {
                    	  System.out.println("No user with that inforamtion    ");
                    }
                    break;
                case 2:
                    System.out.println("please enter username");
                    username = scan.next();
                    System.out.println("please enter your password");
                    password = scan.next();
               	 boolean loggedin = true;
                 if(a.loginForEmployees(username, password)) {
                	  employee = a.getEmployeebyUsername(username);
             	while(loggedin) {
                   
                      if (employee != null) {
                        System.out.println(":    Welcome "+ employee.getName() + " " +employee.getLast());
                        System.out.println("----------------------------");
                        System.out.println("1: View User Account");
                        System.out.println("2: Check User's Balance");
                        System.out.println("3: Delete a User's Account");
                        System.out.println("4: Delete a User");
                        System.out.println("5: Update a User's Account");
                        System.out.println("6: Logout");
                        input = scan.nextInt();
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
							try {
							accounts =b.getAllAccounts(a.getCustomerByName(username).getUsername());
							for(bankAccount x:accounts)
								System.out.println(x.getAccountNumber()+ " - " +x.getBalance());
							}catch(Exception e) {
								System.out.println("no accounts to veiw ");
							}
							
							break;
						case 3:
							System.out.println("what username would you like to delete account from");
							username = scan.next();
							accounts =a.getAllUserBankAccounts(username);
							for(bankAccount q :accounts) {
								System.out.println(q.getAccountNumber());
							}
							System.out.println("what is the account number to be deleted");
							int asd = scan.nextInt();
							a.deleteBankAccount(asd, username);
							break;
					
						case 4:
							System.out.println("what username would you like to delete account from");
							username = scan.next();
						    employee.deleteUserAccount(username);
							
							
							break;
						case 5:
							System.out.println(" which user to update user/create");
							username = scan.next();
							   System.out.println("1: Change first name");
		                        System.out.println("2: Change last name");
		                        System.out.println("3: Change password");
		                        System.out.println("4: Create New user");
							System.out.println("Please enter a number");
							input = scan.nextInt();
							
							switch(input) {
							case 1:
								System.out.print("enter your new first name ");
								String temp = scan.next();
								try{
								e.updateUserFname(temp, username);
							
								}catch(Exception e) {
									System.out.print("wrong info ");
								}
								break;
							case 2:
								System.out.print("enter their new last name ");
								 temp = scan.next();
								e.updateUserLname(temp, username);
								System.out.print("enter your new password ");
								break;
							case 3:System.out.print("enter their new password ");
								 temp = scan.next();
								e.updateUserPassword(temp,username);
								
							case 4:
						
			                	System.out.println("what is your first name? ");
								String fname = scan.next();
								System.out.println("what is your last name? ");
								String lname = scan.next();
								System.out.println("what would you like your username to be? ");
								String username = scan.next();
								System.out.println("5: please enter your password");
								String password = scan.next();
										
								boolean worked = false;
			                    worked = employee.createNewUser(username, fname, lname, password);	
			                                 System.out.print("you made your new account! please enjoy!! ");
			                    break;

							default:
								System.out.print("outside of valid range. please try again ");
								break;							
							}
							break;
						case 6:
							loggedin = false;
							employee = null;
							break;
						default:
							System.out.print("outside of valid range. please try again  ");
							break;
                    }}}}
                 else{
                	 System.out.println("No employeed with that information ");
                 }
                 	break;
                case 3:
                	System.out.println("what is your first name? ");
					String fname = scan.next();
					System.out.println("what is your last name? ");
					String lname = scan.next();
					System.out.println("what would you like your username to be ?");
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
    public static void getallAccountForuser() {
    	System.out.println("your accounts");
		try {
			accounts = a.getAllUserBankAccounts(loggedInCustomer.getUsername());
		for(bankAccount number: accounts) {
			System.out.println(number.getAccountNumber());	
		}
		}catch (SQLException e) {
			System.out.print("problem getting accounts");
			e.printStackTrace();
		
		}}
}