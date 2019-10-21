package yourworkhere;
import yourworkhere.CheckingAccount;
public class CheckingAccountManager implements IAccountManager {
	//my field
	CheckingAccount checkingAccount;

	// default no args constructor
	public CheckingAccountManager() {}

	//declaring a constructor with the parameter Checking Account
	public CheckingAccountManager(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	// do I need another constructor?Nope! This is good

	public boolean deposit(double dAmount) {

		if (dAmount <= 0) {
			System.out.println("Deposit transaction cannot be completed.");
			return false;
		} else {
			checkingAccount.setBalance(checkingAccount.getBalance() + dAmount);
			System.out.println("Desposit successful" + checkingAccount.getBalance());
			return true;
		}
	}
	
	public boolean withdraw(double wAmount) throws OverDraftException {
		double overDraftFee = 50;
		if (wAmount <= 0) {
			System.out.println("Withdrawal amount is invalid");
			return false;
	
		} else if (wAmount > checkingAccount.getBalance()) {
	try {	checkingAccount.balance -= (wAmount + overDraftFee);
			System.out.println("OverDraftFeeApplied!" + " A fee of $50 has been applied.");
			System.out.println("OverDraft Exception made.");
	}
	catch (RuntimeException e) {
		e.printStackTrace();
	}
	
		} else if (wAmount <= checkingAccount.getBalance()) {
			checkingAccount.balance -= wAmount;
			System.out.println("Current Balance:" + checkingAccount.getBalance());
		}
		return true;
	}
			

}
