
public class Client {

	public static void main(String[] args) {

		/******
		 * creation of each tyre
		 */
		FrontLeftTyre frontLeftTyre = new FrontLeftTyre(1000, 32);
		FrontRightTyre frontRightTyre = new FrontRightTyre(1000, 32);
		RearRightTyre rearRightTyre = new RearRightTyre(1000, 32);
		RearLeftTyre rearleftTyre = new RearLeftTyre(1000, 32);

		// All tyres
		Tyre tyre = new Tyre(frontLeftTyre, frontRightTyre, rearleftTyre, rearRightTyre);

		// chassis
		Chassis chassis = new Chassis(25000);

		// seats
		Seats seats = new Seats(2000, "Leather", 4);

		// engine
		Engine engine = new Engine(1200, 50000, 6);

		// windows
		Windows windows = new Windows(2000, 4);

		// door
		Door door = new Door(1500, 4);

		// drivetrain
		Drivetrain drivetrain = new Drivetrain(6, 50000);

		// headlights
		HeadLights headLights = new HeadLights(500, "White");
		// rearLights
		RearLights rearLights = new RearLights(200, "Red");

		Lights lights = new Lights(headLights, rearLights);

		Car myCar = new Car(tyre, chassis, seats, engine, windows, door, drivetrain, lights);
		System.out.println("Car Price: " + myCar.getPrice());
		System.out.println();
		myCar.getDetails();
	}

}
