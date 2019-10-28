package driver;

import java.sql.SQLException;

import DAOImpl.Implement;
import options.Options;
import users.Customer;
import users.bAdmin;

public class Driver {

	private static int s = 0;
	private static boolean t = true;
	// private static String c = null;

	public static void main(String[] args) throws SQLException {

		do {
			switch (Options.startOption(s)) {

			case 1: // Create Account
				Customer.accountCreation();
				t = true;
				break;
			case 2: // Customer Login
				if (Customer.customerLogin(t)) {
					switch (Options.cOption(s, Customer.uName)) {
					case 1: // view account
						Implement.viewAccount(Customer.uName);
						t = true;
						break;
					case 2: // call withdraw
						t = true;
						break;
					case 3: // call deposit
						t = true;
						break;
					case 4: // close account if balance = 0
						t = false;
						break;
					case 5: // exit
						t = false;
						break;
					default:
						break;
					}
				} else {
					System.out.println("Too many incorrect password. Back to the main menu\n");
				}
				break;
			case 3: // Admin Login
				if (bAdmin.adminLogin(t)) {
					switch (Options.aOption(s, bAdmin.uName)) {
					case 1: // view an account

						t = true;
						break;
					case 2: // open a new account
						Implement.newAccount();
						t = true;
						break;
					case 3: // withdraw from account

						t = true;
						break;
					case 4: // deposit from account

						t = true;
						break;
					case 5: // terminate an account

						t = false;
						break;
					case 6: // exit

						t = false;
						break;
					default:
						break;
					}
				} else {
					System.out.println("Too many incorrect password. Back to the main menu\n");
				}
				break;
			case 4: // Quit/close DB
				System.out.println("Exiting...");
				t = false;
				break;
			default:
				t = true;
				break;
			}
		} while (t);
	}
}
