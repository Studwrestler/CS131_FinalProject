
public class Electronics extends Product {
	private String manufacturer;
	private String model;
	private int warranty;

	public Electronics() {
		this.name = "";
		this.price = 0;
		this.manufacturer = "";
		this.model = "";
		this.warranty = 0;
	}

	public Electronics(String name, double price, String manufacturer, String model, int warranty) {
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
		this.model = model;
		this.warranty = warranty;

	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
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
