package prob4;

public class Salaried extends Employee {
	private double salary;
	
	public Salaried(int id, double salary) {
		super(id);
		this.salary = salary;
	}
	
	public double calcGrossPay(int month, int year) {
		return salary;
	}
}
