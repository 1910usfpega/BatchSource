package yourworkhere;

import yourworkhere.SavingsAccount;

//TODO: use CheckingAccountManager as a guide 
public class SavingsAccountManager implements IAccountManager {
	SavingsAccount savingsAccount;


// declaring a no args constructor
	
	public SavingsAccountManager() {}

	public SavingsAccountManager(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public boolean deposit(double dAmount) {
		if (dAmount <= 0) {
			System.out.println("Deposit transaction cannot be completed.");
			return false;
		} else {
			savingsAccount.setBalance(dAmount += savingsAccount.getBalance());
			System.out.println("Depsosit recieved in the dAmount of:" + dAmount
			+ "\n" + "New Current Balance: " + savingsAccount.getBalance());
		}
		return true;
	}

	public boolean withdraw(double wAmount) {
		if (wAmount <= 0) {
			System.out.println("Withdraw amount not valid");
			return false;
		} else if (savingsAccount.getCurrentMonthlyWithdrawals() >= savingsAccount.getMaxMonthlyWithdrawals()) {
			System.out.println("Max Monthly withdrawal ahcieved:" + savingsAccount.getCurrentMonthlyWithdrawals());
			return false;
		} else if ((savingsAccount.getBalance() - wAmount) < (savingsAccount.getMinBalance())) {
			System.out.println("Withdrawal amount will result a balance under the required minimum");
				return false;
		}else if (wAmount > 0) {
			savingsAccount.setBalance(savingsAccount.getBalance() - wAmount);
			savingsAccount.currentMonthlyWithdrawals += wAmount;
		}
			System.out.println("Withdrwal complete. Current number of Withdrawals is:" 
				+ savingsAccount.currentMonthlyWithdrawals 
				+ "\n" + "Max withdrawals per month:" + savingsAccount.maxMonthlyWithdrawals);
			return true;

	}

}
