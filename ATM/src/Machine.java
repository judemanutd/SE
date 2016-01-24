
public class Machine {

	float total;
	int thousand;
	int fiveHundred;
	int hundred;
	int ten;
	Display display;

	public Machine(Display display, float total, int thousand, int fiveHundred, int hundred, int ten) {
		this.total = total;
		this.thousand = thousand;
		this.hundred = hundred;
		this.fiveHundred = fiveHundred;
		this.ten = ten;
		this.display = display;
	}

	public float getTotal() {
		return total;
	}

	public void dispense(int amount) {
		int rem = 0;
		total =total- amount;

		if (amount / 1000 <= thousand) {
			rem = amount % 1000;
			amount = amount / 1000;
			thousand -= amount;
			display.out("1000 x " + amount);
		}

		if (amount / 500 <= fiveHundred) {
			amount = rem / 500;
			rem = rem % 500;
			hundred -= amount;
			display.out("500 x " + amount);
		}

		if (amount / 100 <= hundred) {
			amount = rem / 100;
			rem = rem % 100;
			hundred -= amount;
			display.out("100 x " + amount);
		}

		if (amount / 10 <= ten) {
			amount = rem / 10;
			rem = rem % 10;
			ten -= amount;
			display.out("10 x " + amount);
		}

		display.out("Machine Total is :" + total);
	}
}
