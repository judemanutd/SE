
public class Windows {
	int price;
	int quantity;

	public Windows(int price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}

	public int getPrice() {
		return price * quantity;
	}

	public int getQuantity() {
		return quantity;
	}
}
