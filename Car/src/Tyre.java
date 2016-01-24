
public class Tyre {
	int price;
	int size;
	FrontLeftTyre frontLeftTyre;
	FrontRightTyre frontRightTyre;
	RearLeftTyre rearleftTyre;
	RearRightTyre rearRightTyre;

	public Tyre(FrontLeftTyre frontLeftTyre, FrontRightTyre frontRightTyre, RearLeftTyre leftTyre,
			RearRightTyre rearRightTyre) {
		this.frontLeftTyre = frontLeftTyre;
		this.frontRightTyre = frontRightTyre;
		this.rearleftTyre = leftTyre;
		this.rearRightTyre = rearRightTyre;
	}

	public Tyre(int price, int size) {
		this.price = price;
		this.size = size;
	}

	public int getPrice() {
		return frontLeftTyre.getPrice() + frontRightTyre.getPrice() + rearleftTyre.getPrice()
				+ rearRightTyre.getPrice();
	}
}
