package lesson5.labs.prob4.solution;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders;
	private Customer(String name) {
		this.name = name;
		orders = new ArrayList<Order>();	
	}
	public static Customer newCustomer(String name) {
		return new Customer(name);
	}
	public void addOrder(Order order) {
		orders.add(order);
	}
	public String getName() {
		return name;
	}
	public List<Order> getOrders() {
		return orders;
	}
}
