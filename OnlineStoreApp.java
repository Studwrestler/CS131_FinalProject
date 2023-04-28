import java.util.List;
import java.util.Scanner;

public class OnlineStoreApp {
	public static void main(String[] args) {
		OnlineStore store = new OnlineStore();
		ShoppingCart cart = new ShoppingCart(store);
		Scanner scan = new Scanner(System.in);

		store.addProduct(new Book("The Great Gatsby", 9.99, "F. Scott Fitzgerald", "Paperback", 0));
		store.addProduct(new Book("To Kill a Mockingbird", 8.99, "Harper Lee", "Paperback", 0));
		store.addProduct(new Clothing("T-Shirt", 19.99, "M", "Red", "Cotton"));
		store.addProduct(new Clothing("Jeans", 39.99, "32x30", "Blue", "Denim"));
		store.addProduct(new Electronics("iPhone X", 799.99, "Apple", "iPhone X", 1));
		store.addProduct(new Electronics("Samsung Galaxy S10", 699.99, "Samsung", "Galaxy S10", 2));
		store.addProduct(new Food("Apple", 1.99, "Red", "4/30/23", 3));
		store.addProduct(new Food("Milk", 6.99, "2%", "4/30/23", 1));

		while (true) {
			System.out.println("Welcome to OneStopShop!");
			System.out.println("1. Display store items");
			System.out.println("2. Search for an item");
			System.out.println("3. Add an item");
			System.out.println("4. View cart");
			System.out.println("5. Remove item");
			System.out.println("6. Checkout");
			System.out.println("7. Quit");

			int choice = scan.nextInt();
			scan.nextLine();

			switch (choice) {
			case 1:
				store.displayInventory();
				break;
			case 2:
				System.out.println("Please enter what you are looking for: ");
				store.inventorySearch(scan.nextLine());
				break;

			case 3:
				System.out.println("Please enter the name of the product:");
				String name = scan.nextLine();

				// search for the product(s) in the inventory
				List<Product> products = store.search(name);

				if (products.isEmpty()) {
					System.out.println(name + " is not available in the store.");
				} else if (products.size() == 1) {
					// add the single product to the cart
					cart.addItem(products.get(0));
					System.out.println(name + " has been added to your cart.");
				} else {
					// prompt the user to choose which product to add to the cart
					System.out.println("Multiple products found. Please choose one:");
					for (int i = 0; i < products.size(); i++) {
						System.out.println((i + 1) + ". " + products.get(i));
					}
					int choice1 = scan.nextInt();
					scan.nextLine();

					if (choice1 < 1 || choice1 > products.size()) {
						System.out.println("Invalid choice.");
					} else {
						cart.addItem(products.get(choice1 - 1));
						System.out.println(products.get(choice1 - 1).getName() + " has been added to your cart.");
					}
				}
				break;

			case 4:
				cart.showCart();
				break;

			case 5:
				System.out.println("Please enter the name of the product:");
				String itemName = scan.nextLine();

				// search for the product(s) in the cart
				List<Product> items = cart.search(itemName);

				if (items.isEmpty()) {
					System.out.println(itemName + " is not in your cart.");
				} else if (items.size() == 1) {
					// remove the single item from the cart
					cart.removeItem(items.get(0));
					System.out.println(itemName + " has been removed from your cart.");
				} else {
					// prompt the user to choose which item to remove from the cart
					System.out.println("Multiple items found. Please choose one:");
					for (int i = 0; i < items.size(); i++) {
						System.out.println((i + 1) + ". " + items.get(i));
					}
					int choice1 = scan.nextInt();
					scan.nextLine();

					if (choice1 < 1 || choice1 > items.size()) {
						System.out.println("Invalid choice.");
					} else {
						cart.removeItem(items.get(choice1 - 1));
						System.out.println(items.get(choice1 - 1).getName() + " has been removed from your cart.");
					}
				}
				break;

			case 6:
			    double totalCost = cart.getTotalCost();
			    System.out.println("Total cost: $" + totalCost);
			    System.out.println("Please enter the amount of cash you have:");

			    double cash = scan.nextDouble();
			    scan.nextLine();

			    if (cash < totalCost) {
			        System.out.println("Insufficient funds. Transaction canceled.");
			        break;
			    }

			    double change = cash - totalCost;
			    String formattedChange = String.format("%.2f", change);
			    System.out.println("Thank you for your purchase! Your change is: $" + formattedChange);
			    cart.checkout();
			    break;

			case 7:
				System.out.println("Thank you for shopping with us. Goodbye!");
				scan.close();
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}

		}
	}
}