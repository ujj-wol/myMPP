package lesson9.labs.prob8;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	private static List<OrderItem> orderItems = new ArrayList<>();
	private static List<Optional<OrderItem>>  items;
	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderItemData();
		
		//Converting a list of orderitems to a list of optional orderItems
		items = orderItems.stream()
				.map(Optional::ofNullable)
				.collect(Collectors.toList());
		
		System.out.println("Do any of these Order Items have an order of flowers? " + 
		   m.findProductByOptional("Flowers"));
	}
	
	//New method using optionals
	private boolean findProductByOptional(String prodName) {
		for(Optional<OrderItem> item : items) {
			String ipName = item.flatMap(OrderItem::getProduct)
					.flatMap(Product::getProductName)
					.orElse("");
			
			if(ipName.equals(prodName)) {
				return true;
			}
		}
		return false;
	}
	
	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
