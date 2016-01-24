
public class Seats {
	int price;
	String material;
	int quantity;

	public Seats(int price, String material, int quantity) {
		this.price = price;
		this.material = material;
		this.quantity = quantity;
	}

	public int getPrice() {
		return price * quantity;
	}

	public String getMaterial() {
		return material;
	}

	public int getQuantity() {
		return quantity;
	}
}
