
public class Car {

	private Tyre tyre;
	private Chassis chassis;
	private Seats seats;
	private Engine engine;
	private Windows windows;
	private Door door;
	private Drivetrain drivetrain;
	private Lights lights;

	public Car(Tyre tyre, Chassis chassis, Seats seats, Engine engine, Windows windows, Door door,
			Drivetrain drivetrain, Lights lights) {
		this.tyre = tyre;
		this.chassis = chassis;
		this.seats = seats;
		this.engine = engine;
		this.windows = windows;
		this.door = door;
		this.drivetrain = drivetrain;
		this.lights = lights;
	}

	public int getPrice() {
		return tyre.getPrice() + chassis.getPrice() + seats.getPrice() + engine.getPrice() + windows.getPrice()
				+ door.getPrice() + drivetrain.getPrice() + lights.getPrice();
	}

	void getDetails() {
		System.out.println("  Engine");
		System.out.println("Cylinders :" + engine.getCylinders());
		System.out.println("Horsepower :" + engine.getHorsepower());
		System.out.println("  Drivetrain");
		System.out.println("Gears :" + drivetrain.getGears());
		System.out.println("  Doors");
		System.out.println("Number :" + door.getQuantity());
		System.out.println("  Windows");
		System.out.println("Number :" + windows.getQuantity());
		System.out.println("  Seats");
		System.out.println("Number :" + seats.getQuantity());
		System.out.println("Material :" + seats.getMaterial());
	}

}