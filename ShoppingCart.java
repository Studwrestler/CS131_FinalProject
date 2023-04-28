import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> items;
	private OnlineStore store;

	public ShoppingCart(OnlineStore store) {
		items = new ArrayList<>();
		this.store = store;
	}

	public void addItem(Product product) {
		items.add(product);
	}

	public boolean removeItem(Product item) {
		return items.remove(item);
	}

	public boolean checkout() {
		for (Product item : items) {
			if (!store.buy(item)) {
				return false;
			}
		}
		items.clear();
		return true;
	}

	public double getTotalCost() {
		double total = 0;
		for (Product item : items) {
			total += item.getPrice();
		}
		return total;
	}

	public void clear() {
		items.clear();
	}
	public void showCart() {
		   if (items.isEmpty()) {
		      System.out.println("Your cart is empty.");
		   } else {
		      System.out.println("Items in your cart:");
		      for (Product item : items) {
		         System.out.println("- " + item.getName() + " $" + item.getPrice());
		      }
		   }
		}
	public List<Product> search(String name) {
	    List<Product> results = new ArrayList<>();

	    for (Product item : items) {
	        if (item.getName().equalsIgnoreCase(name)) {
	            results.add(item);
	        }
	    }

	    return results;
	}


}
