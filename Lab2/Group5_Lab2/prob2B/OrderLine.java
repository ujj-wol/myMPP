package prob2B;

public class OrderLine {
	private String item;
	private double rate;
	private int quantity;
	Order order;

	public OrderLine(String item, double rate, int quantity, Order order) {
		this.item = item;
		this.rate = rate;
		this.quantity = quantity;
		this.order = order;
	}

	public String getItem() {
		return item;
	}

	public double getRate() {
		return rate;
	}

	public int getQuantity() {
		return quantity;
	}

	public Order getOrder() {
		return order;
	}

	@Override
	public String toString() {
		return "[item=" + item + ", rate=" + rate + ", quantity=" + quantity + "]";
	}

}
