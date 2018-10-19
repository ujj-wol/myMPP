package prob4;

public class Paycheck {
	private double grossPay;
	private final double fica = 0.23;
	private final double state = 0.05;
	private final double local = 0.01;
	private final double medicare = 0.03;
	private final double socialSecurity = 0.075;
	
	public Paycheck(Employee emp, int month, int year) {
		grossPay = emp.calcGrossPay(month, year);
	}
	
	private double totalTaxPercent = fica + state + local + medicare + socialSecurity;
	
	public void print() {
		System.out.printf("\nEmployee: \nGross Pay: \t$%.2f \nTotal Tax: \t$%.2f\nNet Pay : \t$%.2f \n", grossPay, grossPay*totalTaxPercent, getNetPay());
	}
	
	public double getNetPay() {
		return grossPay - grossPay * totalTaxPercent;
	}
}
