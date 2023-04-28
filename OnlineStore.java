import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
	private List<Product> inventory;

	public OnlineStore() {
		inventory = new ArrayList<>();
	}

	public void addProduct(Product product) {
		inventory.add(product);
	}

	public List<Product> search(String name) {
		List<Product> matchingProducts = new ArrayList<>();
		for (Product product : inventory) {
			if (product.getName().equals(name)) {
				matchingProducts.add(product);
			}
		}
		return matchingProducts;
	}
	public boolean inventorySearch(String name) {
	    for (Product p : inventory) {
	        if (p.getName().equalsIgnoreCase(name)) {
	            System.out.println(name + " is in stock.");
	            return true;
	        }
	    }
	    System.out.println(name + " is not in stock.");
	    return false;
	}


	public boolean buy(Product item) {
		if (inventory.contains(item)) {
			inventory.remove(item);
			return true;
		}
		return false;
	}

	public List<Product> getInventory() {
		return inventory;
	}
	public void displayInventory() {
	    System.out.println("Current Inventory:");
	    for (Product product : inventory) {
	        System.out.println("- " + product.getName() + " (" + product.getClass().getSimpleName() + ") - $" + product.getPrice());
	    }
	}




}
