package com.revature.bean;

public class Transaction {
	
	private int trans_ID;
	private int user_ID; 
    private int bank_Acc_ID; 
    private int trans_Typ;  
    private double trans_Amt;
    
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int trans_ID, int user_ID, int bank_Acc_ID, int trans_Typ, double trans_Amt) {
		super();
		this.trans_ID = trans_ID;
		this.user_ID = user_ID;
		this.bank_Acc_ID = bank_Acc_ID;
		this.trans_Typ = trans_Typ;
		this.trans_Amt = trans_Amt;
	}

	public int getTrans_ID() {
		return trans_ID;
	}

	public void setTrans_ID(int trans_ID) {
		this.trans_ID = trans_ID;
	}

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public int getBank_Acc_ID() {
		return bank_Acc_ID;
	}

	public void setBank_Acc_ID(int bank_Acc_ID) {
		this.bank_Acc_ID = bank_Acc_ID;
	}

	public int getTrans_Typ() {
		return trans_Typ;
	}

	public void setTrans_Typ(int trans_Typ) {
		this.trans_Typ = trans_Typ;
	}

	public double getTrans_Amt() {
		return trans_Amt;
	}

	public void setTrans_Amt(double trans_Amt) {
		this.trans_Amt = trans_Amt;
	}

	@Override
	public String toString() {
		return "Transaction [trans_ID=" + trans_ID + ", user_ID=" + user_ID + ", bank_Acc_ID=" + bank_Acc_ID
				+ ", trans_Typ=" + trans_Typ + ", trans_Amt=" + trans_Amt + "]";
	}  
    
	
	
    
    
    

}
