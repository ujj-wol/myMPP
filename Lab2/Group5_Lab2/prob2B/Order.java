package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	int orderNumber;
	List<OrderLine> orderlines = new ArrayList<>();
	
	public Order(int orderNumber, String item, double rate, int quantity) {
		this.orderNumber = orderNumber;
		this.addOrderLine(item, rate, quantity);
	}
	
	public void addOrderLine(String item, double rate, int quantity) {
		orderlines.add(new OrderLine(item, rate, quantity, this));
	}

	@Override
	public String toString() {
		String s = "Orderlines:\n";
		for (OrderLine orderLine : orderlines) {
			s = s + "\t" + orderLine.toString() + "\n";
		}
		return "orderNumber " + orderNumber +"\n" + s;
	}
	
	
}
