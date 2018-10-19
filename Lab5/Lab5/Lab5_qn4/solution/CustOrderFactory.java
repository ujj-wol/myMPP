package lesson5.labs.prob4.solution;

import java.time.LocalDate;

public class CustOrderFactory {
	private CustOrderFactory() {
	}
	
	public static Customer createCustomer(String name) {
		return Customer.newCustomer(name);
	}
	
	public static Order createOrder(Customer cust, LocalDate date) {		
		return Order.newOrder(cust, date);
	}
	
	public static Item createItem(String name){
		return Item.newItem(name);
	}
	
}
