package prob4;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;
	
	public Hourly(int empid, double hourlyWage, double hoursPerWeek) {
		super(empid);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	public double calcGrossPay(int month, int year) {
		return hourlyWage * hoursPerWeek * 4;
	}
}
