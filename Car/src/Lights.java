
public class Lights {
	int price;
	String color;
	HeadLights headLights;
	RearLights rearlights;

	public Lights(int price, String color) {
		this.price = price;
		this.color = color;
	}

	public Lights(HeadLights headLights, RearLights lights) {
		this.headLights = headLights;
		this.rearlights = lights;
	}

	int getPrice() {
		return headLights.getPrice() + rearlights.getPrice();
	}

}
