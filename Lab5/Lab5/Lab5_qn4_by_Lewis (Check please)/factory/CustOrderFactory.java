package lesson2.lecture.unidirectional.onemany.factory;

import java.time.LocalDate;

public final class CustOrderFactory {	
	
	public static Customer createCustomer(String name) {
		Customer customer = new Customer(name);
		return customer;
	}
	
	public static Order createOrder() {
		return new Order(LocalDate.now());	
	}
	
	public static Item createItem(String name) {
		Item item = new Item(name);
		return item;	
	}
}
