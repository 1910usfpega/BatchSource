package yourworkhere;

public class TestApp {
	public static void main(String[] args) {
		Account account = new CheckingAccount("01", "Bryn", "Portella");
		Account account2 = new CheckingAccount(); 
		IAccountManager manageAccount = account.getAccountManager();
		System.out.println(account2.firstName);
		IAccountManager account2Man = account2.getAccountManager();
	}
}
