package com.revature.driver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.bean.Admin;
import com.revature.bean.BankAccount;
import com.revature.bean.Customer;
import com.revature.bean.Employee;
import com.revature.bean.Person;
import com.revature.daoimpl.AdminDaoImpl;
import com.revature.daoimpl.BankAccountDaoImpl;
import com.revature.daoimpl.CustomerDaoImpl;
import com.revature.daoimpl.EmployeeDaoImpl;
import com.revature.daoimpl.PersonDaoImpl;

public class ScannerMain {
	static Scanner myObj = new Scanner(System.in);

	public static PersonDaoImpl persdi = new PersonDaoImpl();
	public static CustomerDaoImpl custdi = new CustomerDaoImpl();
	public static EmployeeDaoImpl empdi = new EmployeeDaoImpl();
	public static AdminDaoImpl admindi = new AdminDaoImpl();
	public static BankAccountDaoImpl bankdi = new BankAccountDaoImpl();
	
	
	public static ArrayList<Customer> current_customers = new ArrayList<Customer>();
	public static ArrayList<Customer> pending_customers = new ArrayList<Customer>();
	public static ArrayList<BankAccount> all_accounts = new ArrayList<BankAccount>();
	public static ArrayList<Admin> admins = new ArrayList<Admin>();
	public static ArrayList<Employee> employees = new ArrayList<Employee>();
	public static ArrayList<Person> allpeople = new ArrayList<Person>();

	private static Scanner in;

	private static Scanner login;
	
	public static void main(String[] args) throws SQLException {
		Scanner in = new Scanner(System.in);
		
		int person_type;
		int logornew;
		int option;
		
		int place_on_list = -20;
		
		System.out.println("Who are you");
		System.out.println("1: Customer");
		System.out.println("2: Employee");
		System.out.println("3: Admin");
		person_type = in.nextInt();
		
		
		if(person_type == 1) {
			
			// Customer info
			System.out.println("Enter options");
			System.out.println("1: login");
			System.out.println("2: new account");
			logornew = myObj.nextInt();
			
			try {
				
				if(logornew == 1) {
					
					
					place_on_list = login(current_customers);
					
					// options for Customer
					Customer.get_all_options();
					option = myObj.nextInt();
							
					
					
					boolean customer_logged = true;
					while(customer_logged) {
								
						if(option == 1) {	
							current_customers.get(place_on_list).view_all_accounts();
						}
						else if(option == 2) {
							System.out.println("What is your initial deposit in this account?");
							double init = myObj.nextDouble();
							
							current_customers.get(place_on_list).create_an_account(init);
						}
						else if(option == 3) {
							System.out.println("How many accounts do you want to create?");
							int total = myObj.nextInt();
							for (int x = 0; x < total; x++) {
								System.out.println("This is account " + x + " of " + total + ". How much do you want to put into it?");
									double deposit = myObj.nextDouble();
									current_customers.get(place_on_list).create_an_account(deposit);
							}
						}
						else if(option > 3 && option < 8) {
							current_customers.get(place_on_list).view_all_accounts();
							System.out.println("Which one do you want to look at?");
							int thebank = in.nextInt() - 1;
									
							if (option == 4) {
								System.out.println("How much do you want to take out?");
								double withdraw = in.nextDouble();
								current_customers.get(place_on_list).all_accounts().get(thebank).withdraw(withdraw);
							}
							else if(option == 5) {
								System.out.println("How much do you want to take out?");
								double deposit = in.nextDouble();
								current_customers.get(place_on_list).all_accounts().get(thebank).deposit(deposit);
							}
							else if(option == 6) {
								current_customers.get(place_on_list).view_all_accounts();
								System.out.println("What is the other bank you would like to transfer to?");
								int otherbank = in.nextInt() - 1;
								if(otherbank == thebank) {
									System.out.println("You cannot transfer money into the same account");
								}
								else {
									double transfer = in.nextDouble();
									current_customers.get(place_on_list).all_accounts().get(thebank).transfer_to(current_customers.get(place_on_list).all_accounts().get(thebank), transfer);
									}
								}
							else if(option == 7) {
								current_customers.get(place_on_list).remove_account(thebank);
							}
						else if(option == 8) {
							System.out.println("Goodbye.");
							customer_logged = false;
						}
						else if(option <= 0 || option > 8) {
							throw new ArithmeticException("Please input a valid number");
						}
									
					}
				else if(logornew == 2) {
					signup(1);
				}
			}
}

				
else if(person_type == 2) {
				logornew = logornew();
				
				
				if(logornew == 1) {
					int place = login(employees);
					
					System.out.println("Whose account do you want to see?");
					viewallcustomers(current_customers);
					
					int chosencustomer = myObj.nextInt();
					current_customers.get(chosencustomer).view_all_accounts();
				}
				
				else if(logornew == 2) {
					signup(2);
				}
}



else if(person_type == 3) {
				logornew = logornew();
				
				if(logornew == 1) {
					int place = login(admins);
				}
				
				else if(logornew == 2) {
					Admin.general_options();
					int main_option = myObj.nextInt();
					if(main_option == 1) {
						viewallcustomers(current_customers);
						int customer_no = gotocustomer(current_customers);
						
						Admin.current_customer_options();
						int cust_option = myObj.nextInt();
						boolean cust_exit = false;
						while(!cust_exit) {
							if(cust_option == 1) {
								current_customers.get(customer_no).toString();
							}
							else if(cust_option == 2) {
								System.out.println("Which account do you want to look at?");
								current_customers.get(customer_no).all_accounts();
								int account_seen = myObj.nextInt() - 1;
								Admin.current_account_options();
								
								
								
								int account_action = myObj.nextInt();
								boolean exit_account = false;
								while(!exit_account) {
									if(account_action == 1) {
										// - View bank information");
										current_customers.get(customer_no).all_accounts().get(account_seen);
									}
									else if(account_action == 2) {
										// -Take a payment from this account
										System.out.println("How much do you want to take out?");
										double withdraw = myObj.nextDouble();
										Admin.take_payment(current_customers.get(customer_no).all_accounts().get(account_seen), withdraw);
									}
									else if(account_action == 3) {
										// - Remove this account"
										Admin.delete_one_account(current_customers.get(customer_no), account_seen);
										exit_account = true;
									}
									else if(account_action == 4) {
										// - Look at a different account
										exit_account = true;
									}
									else {
										// User did not input an appropriate option
										System.out.println("Please pick an appropriate option.");
									}	
								}
							}
							else if(cust_option == 3) {
								// Completely remove customer
								Admin.remove_customer(current_customers.get(customer_no));
								cust_exit = true;
							}
							else if(cust_option == 4) {
								// Leave and look at other account
								System.out.println("");
								cust_exit = true;
							}
							else {
								System.out.println("That is not a valid option");
							}
						}

					}
					else if(main_option == 2) {
						viewallcustomers(pending_customers);
						int customer_no = gotocustomer(pending_customers);
						
						Admin.remove_or_approve();
						int remove_or_approve = myObj.nextInt();
						if(remove_or_approve == 1) {
							Admin.approve_customer(customer_no);
						}
						else if(remove_or_approve == 2) {
							Admin.deny_customer(customer_no);
						}
						else if(remove_or_approve == 3) {
							System.out.println("You decided to leave this pending account alone for now");
						}
					}
					
					
				}
}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Sorry. No connection available.");
				e.printStackTrace();
			}
		}
				
	}
	public static int logornew() {
		int choice = 0;
		
		while(choice == 0) {
			// Customer info
			System.out.println("Enter options");
			System.out.println("1: login");
			System.out.println("2: new account");
			choice = myObj.nextInt();
		}
		
		return choice;
	}
	
	public static int gotocustomer(ArrayList<Customer> customers) {
		String first_name = myObj.next();
		String last_name = myObj.next();
		
		int place = 0;
		try {
			for (int i = 0; i < customers.size(); i++) {
				if(customers.get(i).getFirst() == first_name && customers.get(place).getLast() == last_name	) {
					place = i;
					break;
				}
			}
			return place;
		}
		catch (NumberFormatException e){
			System.out.println("Sorry that name cannot be found.");
			return (Integer) null;
		}
	}
					
	
	public static <T> int login(ArrayList<T> people){
		
		int place = -5;
		while(place < 0) {
			System.out.print("Username: ");
			String username = myObj.next();
			System.out.print("Password: ");
			String password = myObj.next();
			for (int i = 0; i < people.size(); i++) {
				if(((Person) people.get(place)).getUsername() == username && ((Person) people.get(place)).getPassword() == password	) {
					place = i;
					break;
				}
			}
		}
						
		return place;
	}	
	
	public static void signup(int option) throws SQLException {
		login = new Scanner(System.in);

		System.out.println("What is your first name?");
		String first_name = login.next();
		System.out.println("What is your last name?");
		String last_name = login.next();
		System.out.println("What username will you be using?");
		String username = login.next();
		System.out.println("What password will you use?");
		String password1 = login.next();
		System.out.println("Confirm your password:");
		String password2 = login.next();
		
		boolean userrepeat = false;
		boolean passwordsame = false;
		
		for(int i = 0; i < ScannerMain.allpeople.size(); i++) {
			if( ScannerMain.allpeople.get(i).getUsername() == username) {
				userrepeat = true;
			}
		}
		if(password1 == password2) {
			passwordsame = true;
		}
		
		if(!userrepeat && passwordsame) {
			if(option == 1){
				Customer signedup = new Customer(pending_customers.size(), first_name, last_name, username, password1);
				try {
					persdi.insertPerson(first_name, last_name, username, password1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pending_customers.add(signedup);
			}
			else if(option == 2) {
				Employee signedup = new Employee(employees.size(), first_name, last_name, username, password1);
				try {
					persdi.insertPerson(first_name, last_name, username, password1);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				employees.add(signedup);
				
			}
			else if(option == 3) {
				Admin signedup = new Admin(first_name, last_name, username, password1);
				try {
					persdi.insertPerson(first_name, last_name, username, password1);
				}
				catch(SQLException e) {
					e.printStackTrace();
					System.out.println("Cannot find file.");
				}
				admins.add(signedup);
				
			}
		}
		else {
			if(userrepeat) {
				System.out.println("This username already exists. Choose another one.");
			}
			if(!passwordsame) {
				System.out.println("The two passwords are not the same. Try again");
			}
		}
	}
	
	public static void viewallcustomers(ArrayList<Customer> customers) {
		System.out.println("Who do you wnt to look at?");
		for(Customer customer : customers) {
			int i = 1;
			String first = customer.getFirst();
			String last = customer.getLast();
			System.out.println(i + ")" + first + " " + last);
		}
	login.close();
	}
}