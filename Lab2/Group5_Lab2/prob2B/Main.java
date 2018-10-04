package prob2B;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(2, "Mug", 5.0, 2);
		order.addOrderLine("Coffee Maker", 10, 1);
		order.addOrderLine("plate", 1, 1);
		
		System.out.println(order);

	}

}
