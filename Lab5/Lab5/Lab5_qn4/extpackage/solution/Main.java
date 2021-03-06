package lesson5.labs.prob4.extpackage.solution;

import java.time.LocalDate;

import lesson5.labs.prob4.solution.Customer;
import lesson5.labs.prob4.solution.Order;
import lesson5.labs.prob4.solution.CustOrderFactory;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustOrderFactory.createOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
