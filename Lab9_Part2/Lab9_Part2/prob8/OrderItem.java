package lesson9.labs.prob8;

import java.util.Optional;

public class OrderItem {
	private Product product;
	private int quantityRequested;
	private double totalPrice;
	public int cnt= 0;
	//package level constructor
	OrderItem(Product product, int quantity) {
		cnt++;
		this.product = product;
		this.quantityRequested = quantity;
		totalPrice = product.getUnitPrice().orElse(0.0) * quantity;
	}
	@Override
	public String toString() {
		return "   " + product.getProductId() + ": " + quantityRequested + ", " + product.getUnitPrice();
	}
	public Optional<Product> getProduct() {
		return Optional.ofNullable(product);
	}
	public int getQuantityRequested() {
		return quantityRequested;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	
}
