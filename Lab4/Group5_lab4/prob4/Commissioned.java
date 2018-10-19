package prob4;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	private double baseSalary;
	private double commissionPercentage;
	private List<Order> orders;
	
	public Commissioned(int id, double baseSalary, double commissionPercentage) {
		this(id, baseSalary, commissionPercentage, new ArrayList<>());
	}
	
	public Commissioned(int id, double baseSalary, double commissionPercentage, List<Order> orders) {
		super(id);
		this.baseSalary = baseSalary;
		this.commissionPercentage = commissionPercentage;
		this.orders = orders;
	}
	
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public void addOrder(Order newOrder) {
		orders.add(newOrder);
	}

	public double calcGrossPay(int month, int year) {
		double amount = baseSalary;
		double commission = 0;
		for(Order o : orders) {
			commission += o.getOrderAmount();  //we assume all orders are from the same month for the sake of simplicity
		}
		commission *= (commissionPercentage/100);
		return amount + commission;
	}
}
