package lesson2.lecture.unidirectional.onemany.factory;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders;
	
	Customer(String name) {
		this.name = name;
		orders = new ArrayList<Order>();	
	}
	public String getName() {
		return name;
	}
	public List<Order> getOrders() {
		return orders;
	}
}
