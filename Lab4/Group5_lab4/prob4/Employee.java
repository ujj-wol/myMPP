package prob4;

public abstract class Employee {
	private int empid;
	
	protected Employee(int empid) {
		this.empid = empid;
	}
	
	protected abstract double calcGrossPay(int month, int year);
	
	public void print() {
		System.out.printf("I am the employee with id %d", empid);
	}
	
	public Paycheck calcCompensation(int month, int year) {
		Paycheck p = new Paycheck(this, month, year);
		return p;
	}
}
