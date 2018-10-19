package lab4.partB;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	
	public Employee(String name) {
		this.name = name;
		accounts = new ArrayList<>();
	}
	
	public void addAccount(Account acct) {
		accounts.add(acct);
	}
	
	
	public String getName() {
		return name;
	}

	public double computeUpdatedBalanceSum() {
		double sum = 0;
		for (Account account : accounts) {
			sum += account.computeUpdatedBalance();
		}
		return sum;
	}
}
