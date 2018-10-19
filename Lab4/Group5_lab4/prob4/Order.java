package prob4;

import java.time.LocalDate;

public class Order {
	private String orderNum;
	private LocalDate orderDate;
	private double orderAmount;
	
	public Order(String orderNum, double orderAmount) {
		this.orderNum = orderNum;
		this.orderDate = LocalDate.now();
		this.orderAmount = orderAmount;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}
}
