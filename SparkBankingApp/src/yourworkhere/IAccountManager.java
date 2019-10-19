package yourworkhere;

public interface IAccountManager {
	//double deposit = 0;
	//double withdraw = 0;
	//interface is like a contract of methods that upon implementation 
	//the class must inherit all methods
	//this will be used to contract Savings and Checking Account Manager Classes
	public boolean deposit(double deposit);
	public boolean withdraw(double withdraw);
	
}
