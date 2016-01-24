
public class Engine {

	int horsepower;
	int price;
	int cylinders;

	public Engine(int horsepower, int price, int cylinders) {
		this.horsepower = horsepower;
		this.price = price;
		this.cylinders = cylinders;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public int getPrice() {
		return price;
	}

	public int getCylinders() {
		return cylinders;
	}
}
