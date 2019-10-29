package com.revature.driver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.revature.beans.ConfirmUser;
import com.revature.daoimpl.BankDaoImpl;


public class Switch {
	public static Scanner sc = new Scanner(System.in);
	public static void input() throws SQLException {
	String Input = "", Username = "", Password = "", Data = "";
	int User_id = 0;
	double Balance = 0;
	BankDaoImpl bdi = new BankDaoImpl();
	Map<String, String> hMap = new HashMap<>();
	hMap = bdi.confirmUser();
	Map<Integer, Double> hMap2 = new HashMap<>();
	hMap2 = bdi.accountBalance();
	Map<String, ArrayList<Integer>> hMap3 = new HashMap<>();
	//ArrayList<Integer> id = new ArrayList<Integer>();
	hMap3 = bdi.userAccounts();
	Map<Integer, String> hMap4 = new HashMap<>();

	do {
		System.out.println("R- Register, L-Login, Q-Quit: ");
		Input = sc.nextLine();

		switch (Input) {
		case "R":
			System.out.println("Username:");
			Username = sc.nextLine();
			// Checks hMap to see if contains Username.
			if (hMap.containsKey(Username)) {
			//if (Username.ge)
				do {
					System.out.println("Already Exists");
					Username = sc.nextLine();
				} while (hMap.containsKey(Username));
			}
			// else{hMap.put(Username, Password);}

			System.out.println("Password:");
			Password = sc.nextLine();
			bdi.insertUser(Username, Password);
			hMap = bdi.confirmUser();
			System.out.println("New Account Registered!");

			break;
		case "L":
			System.out.println("Username:");
			Username = sc.nextLine();
			System.out.println("Password:");
			Password = sc.nextLine();
			hMap = bdi.confirmUser();
			if(Username.equals("Admin") && Password.equals("Password"))
			{
				String MInput = "";
				do {
					System.out.println("V - view all users, C - create users, U - update users, D - delete user, Q - Quit");
					MInput = sc.nextLine();
					switch(MInput)
					{
					case "V":
						System.out.println(hMap.keySet());
						break;
					case "C":
						System.out.println("Username:");
						Username = sc.nextLine();
						if (hMap.containsKey(Username)) {
							do {
								System.out.println("Already Exists");
								Username = sc.nextLine();
							} while (hMap.containsKey(Username));
						}
						System.out.println("Password:");
						Password = sc.nextLine();
						bdi.insertUser(Username, Password);
						hMap = bdi.confirmUser();
						System.out.println("New Account Registered!");
						break;
					case "U":
						System.out.println("Username:");
						Username = sc.nextLine();
						System.out.println("Password:");
						Password = sc.nextLine();
						if(hMap.containsKey(Username) && hMap.get(Username).equals(Password))
						{
						String Input1 = "";
						do {						
						System.out.println("C - Create an account, R - Remove an account, W- Withdraw, D- Deposit, Q-Quit");
						Input1 = sc.nextLine();
						switch (Input1)
						{
						case "C":
							System.out.println("Balance?");
							Balance = sc.nextDouble();
							bdi.insertInfo(Username, Balance);
							hMap2 = bdi.accountBalance();
							break;
						case "R":
							System.out.println("Account_id?");
							System.out.println(hMap2);
							System.out.println(hMap3.get(Username));
//							for(int i = 0; i < hMap4.size(); i++)

							User_id = sc.nextInt();
							if(hMap2.containsKey(User_id) && hMap2.get(User_id) <= 0)
							{
							bdi.deleteAccount(User_id);
							System.out.println("Deleted!");
							hMap2 = bdi.accountBalance();
							}
							else {System.out.println("Incorrect user_id or balance greater than 0");}
							
							break;
						case "W":
							System.out.println("Account_id?");
							System.out.println(hMap2);
							User_id = sc.nextInt();
							if(hMap2.containsKey(User_id) && hMap2.get(User_id) > 0)
							{
							System.out.println("How much do you wish to withdraw?");
							Balance = sc.nextDouble();
							bdi.withdrawAccount(Balance, User_id);
							hMap2 = bdi.accountBalance();
							System.out.println("New balance: " + hMap2.get(User_id));
							}
							else {System.out.println("Incorrect user_id or no balance");}
						
							break;
						case "D":
							System.out.println("Account_id?");
							System.out.println(hMap2);
							User_id = sc.nextInt();
							if(hMap2.containsKey(User_id))
							{
							System.out.println("How much do you wish to deposit?");
							Balance = sc.nextDouble();
							bdi.depositAccount(Balance);
							hMap2 = bdi.accountBalance();
							System.out.println("New balance: " + hMap2.get(User_id));
							}
							else {System.out.println("Incorrect user_id");}
							break;
						} 
						}while(!Input1.equals("Q"));
						}
						break;
					case "D":
						bdi.deleteUser(Username);
						break;
					}
				}while(!MInput.equals("Q"));
			}
			else if(hMap.containsKey(Username) && hMap.get(Username).equals(Password))
			{

				String Input1 = "";
				do {						
				System.out.println("C - Create an account, R - Remove an account, W- Withdraw, D- Deposit, Q-Quit");
				Input1 = sc.nextLine();
				switch (Input1)
				{
				case "C":
					System.out.println("Balance?");
					Balance = sc.nextDouble();
					bdi.insertInfo(Username, Balance);
					hMap2 = bdi.accountBalance();
					break;
				case "R":
					System.out.println("Account_id?");
					System.out.println(hMap2);
					System.out.println(hMap3.get(Username));
//					for(int i = 0; i < hMap4.size(); i++)

					User_id = sc.nextInt();
					if(hMap2.containsKey(User_id) && hMap2.get(User_id) <= 0)
					{
					bdi.deleteAccount(User_id);
					System.out.println("Deleted!");
					hMap2 = bdi.accountBalance();
					}
					else {System.out.println("Incorrect user_id or balance greater than 0");}
					
					break;
				case "W":
					System.out.println("Account_id?");
					System.out.println(hMap2);
					User_id = sc.nextInt();
					if(hMap2.containsKey(User_id) && hMap2.get(User_id) > 0)
					{
					System.out.println("How much do you wish to withdraw?");
					Balance = sc.nextDouble();
					bdi.withdrawAccount(Balance, User_id);
					hMap2 = bdi.accountBalance();
					System.out.println("New balance: " + hMap2.get(User_id));
					}
					else {System.out.println("Incorrect user_id or no balance");}
					
					break;
				case "D":
					System.out.println("Account_id?");
					System.out.println(hMap2);
					User_id = sc.nextInt();
					if(hMap2.containsKey(User_id))
					{
					System.out.println("How much do you wish to deposit?");
					Balance = sc.nextDouble();
					bdi.depositAccount(Balance);
					hMap2 = bdi.accountBalance();
					System.out.println("New balance: " + hMap2.get(User_id));
					}
					else {System.out.println("Incorrect user_id");}
					break;
				} 
				}while(!Input1.equals("Q"));
				
			}
				
			}
		
	} while (!Input.equals("Q"));
	}
}