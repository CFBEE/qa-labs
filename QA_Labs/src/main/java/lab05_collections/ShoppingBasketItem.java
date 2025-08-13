package main.java.lab05_collections;

public class ShoppingBasketItem {
	private String productName;
	private int quantity;
	private double price;

	public ShoppingBasketItem(String productName, int quantity, double price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getDetails() {
		return String.format("Product: %s, Quantity: %d, Price: £%.2f", productName, quantity, price);
	}
}
