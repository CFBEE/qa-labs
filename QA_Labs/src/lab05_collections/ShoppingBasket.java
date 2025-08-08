package lab05_collections;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
	private List<ShoppingBasketItem> items = new ArrayList<>();

	public void add(ShoppingBasketItem item) {
		items.add(item);
	}

	public String getBasketDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("Shopping Basket: \n");
		for (ShoppingBasketItem item : items) {
			sb.append(" - ").append(item.getDetails()).append("\n");
		}
		return sb.toString();
	}

}
