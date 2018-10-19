package lesson9.labs.prob8;

import java.util.Optional;

public class Product {
	private String productId;
	private String productName;
	private double unitPrice;
	public Product(String prodId, String prodName, double price) {
		this.productId = prodId;
		this.productName = prodName;
		this.unitPrice = price;
	}
	
	public Optional<String> getProductId() {
		return Optional.ofNullable(productId);
	}
	
	public Optional<String> getProductName() {
		return Optional.ofNullable(productName);
	}
	
	public Optional<Double> getUnitPrice() {
		return Optional.ofNullable(unitPrice);
	}
}
