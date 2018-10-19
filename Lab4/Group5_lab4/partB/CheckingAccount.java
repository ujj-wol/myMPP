package lab4.partB;

public class CheckingAccount extends Account{
	private double monthlyFee;
	private String acctID;
	private double balance;
	
	public CheckingAccount(String acctID, double monthlyFee, double startBalance) {
		this.acctID = acctID;
		this.balance = startBalance;
		this.monthlyFee = monthlyFee;
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
		return balance - monthlyFee;
	}

}
