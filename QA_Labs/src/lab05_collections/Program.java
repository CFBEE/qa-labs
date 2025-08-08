package lab05_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Program {

	private static Queue<ShoppingBasket> baskets = new LinkedList<>();

	public static void main(String[] args) {
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.add(new ShoppingBasketItem("Apples", 4, 0.50));
		basket1.add(new ShoppingBasketItem("Bread", 2, 1.20));

		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.add(new ShoppingBasketItem("Milk", 1, 0.99));
		basket2.add(new ShoppingBasketItem("Chocolate", 3, 1.50));
		basket2.add(new ShoppingBasketItem("Eggs", 6, 0.10));

		baskets.add(basket1);
		baskets.add(basket2);

		processBaskets();

	}

	private static void processBaskets() {
		System.out.println("Processing shopping baskets...\n");
		while (!baskets.isEmpty()) {
			ShoppingBasket current = baskets.poll();
			System.out.println(current.getBasketDetails());
			System.out.println("=> Basket processed.\n");
		}
		System.out.println("All baskets have been processed.");
	}

}
