
public class Clothing extends Product {

	private String size;
	private String color;
	private String material;

	public Clothing() {
		this.name = "";
		this.price = 0;
		this.size = "";
		this.color = "";
		this.material = "";
	}

	public Clothing(String name, double price, String size, String color, String material) {
		this.name = name;
		this.price = price;
		this.size = size;
		this.color = color;
		this.material = material;

	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
