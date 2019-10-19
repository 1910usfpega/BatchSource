package yourworkhere;

	
public abstract class Account {
	
	//Getters first then Setters
	protected String accountID;
		//Getter
		public String getAccountID() {
			return this.accountID;
		}
		//setter
		public void setAccountID(String accountID) {
			this.accountID = accountID;
		}
	
	protected double balance;
		public double getBalance() {
			return this.balance;
		}
		
		public void setBalance(double balance) {
			this.balance = balance;
		}
	
	protected String accountType;
		public String getAccountType() {
			return this.accountType;
		}
		
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
	
	protected String firstName;
		public String getFirstNane() {
			return this.firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
	
	protected String lastName;
		public String getLastName() {
			return this.lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
	public abstract IAccountManager getAccountManager();
	
	
}
