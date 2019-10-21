package yourworkhere;

public class SavingsAccount extends Account {
	// why should I not use this field in this class
	double minBalance;

	public double getMinBalance() {
		return this.minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	double currentMonthlyWithdrawals;

	public double getCurrentMonthlyWithdrawals() {
		return this.currentMonthlyWithdrawals;
	}

	public void setcurrentMonthlyWithdrawals(double currentMonthlyWithdrawals) {
		this.currentMonthlyWithdrawals = currentMonthlyWithdrawals;
	}

	double maxMonthlyWithdrawals;

	public double getMaxMonthlyWithdrawals() {
		return this.maxMonthlyWithdrawals;
	}

	public void setMaxMonthlyWithdrawals(double maxMonthlyWithdrawals) {
		this.maxMonthlyWithdrawals = maxMonthlyWithdrawals;
	}

	public SavingsAccount() {
		//FINISHED! 
		this.firstName = "John";
		this.lastName = "lastName";
		this.accountID = "accountID";
		minBalance = 10d;
		accountType = "Savings Account";
		balance = 30000d;
		currentMonthlyWithdrawals = 0d;
		maxMonthlyWithdrawals = 5000;
	}

	public SavingsAccount(String accountID, String firstName, String lastName) {
		//FINISHED!
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.minBalance = 10d;
		accountType = "Savings Account";
		balance = 30000d;
		currentMonthlyWithdrawals = 0d;
		maxMonthlyWithdrawals = 5000;
	}

	public String toString() {
		return "accountType" + accountType + "accountID" + accountID + "firstName" + firstName + "lastName" + lastName
				+ "balance" + balance + "currentMonthlyWithdrawals" + currentMonthlyWithdrawals
				+ "maxMonthlyWithdrawals" + maxMonthlyWithdrawals + "minBalance" + minBalance;
	}

	@Override
	public IAccountManager getAccountManager() {
		//FINISHED!
		return new SavingsAccountManager(this);
	}

}
