package lab4.partB;

public class SavingsAccount extends Account{
	private double interestRate;
	private String acctID;
	private double balance;
	
	public SavingsAccount(String acctID, double interestRate, double startBalance) {
		this.acctID = acctID;
		this.balance = startBalance;
		this.interestRate = interestRate;
	}
	@Override
	public String getAcctID() {		
		return acctID;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public double computeUpdatedBalance() {
		return balance + (balance * interestRate);
	}

}
