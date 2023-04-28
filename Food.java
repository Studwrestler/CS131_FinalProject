
public class Food extends Product {
	private String type;
	private String experationDate;
	private int quantity;

	public Food() {
		this.name = "";
		this.price = 0;
		this.type = "";
		this.experationDate = "";
		this.quantity = 0;
	}

	public Food(String name, double price, String type, String experationDate, int quantity) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.experationDate = experationDate;
		this.quantity = quantity;

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExperationDate() {
		return experationDate;
	}

	public void setExperationDate(String experationDate) {
		this.experationDate = experationDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
