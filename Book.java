
public class Book extends Product {
	private String author;
	private String model;
	private int warranty;

	public Book() {
		this.name = "";
		this.price = 0;
		this.author = "";
		this.model = "";
		this.warranty = 0;
	}

	public Book(String name, double price, String author, String model, int warranty) {
		this.name = name;
		this.price = price;
		this.author = author;
		this.model = model;
		this.warranty = warranty;

	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
}
